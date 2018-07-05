package com.github.pedrodimoura.cesarmesspringbatch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import com.github.pedrodimoura.cesarmesspringbatch.batch.listener.Listener;
import com.github.pedrodimoura.cesarmesspringbatch.batch.processor.ProcessorCadastro;
import com.github.pedrodimoura.cesarmesspringbatch.batch.processor.ProcessorRemuneracao;
import com.github.pedrodimoura.cesarmesspringbatch.batch.reader.ReaderCadastro;
import com.github.pedrodimoura.cesarmesspringbatch.batch.reader.ReaderRemuneracao;
import com.github.pedrodimoura.cesarmesspringbatch.batch.writer.WriterCadastro;
import com.github.pedrodimoura.cesarmesspringbatch.batch.writer.WriterRemuneracao;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Remuneracao;

@Configuration
public class BatchConfiguration {

	@Autowired
	StepBuilderFactory stepBuilderFactory;

	@Autowired
	JobBuilderFactory jobBuilderFactory;

	@Bean
	public Step stepCadastro() {
		return stepBuilderFactory
				.get("stepCadastro")
				.<Cadastro, Cadastro> chunk(50000)
				.reader(new ReaderCadastro().read())
				.processor(new ProcessorCadastro())
				.writer(writerCadastro())
				.build();
	}
	
	@Bean
	public ItemWriter<Cadastro> writerCadastro() {
		return new WriterCadastro();
	}
	
	@Bean
	public ItemWriter<Remuneracao> writerRemuneracao() {
		return new WriterRemuneracao();
	}
	
	@Bean
	public Flow flowCadastro() {
		return (Flow) new FlowBuilder<Cadastro>("flowCadastro")
				.start(stepCadastro())
				.build();
	}
	
	@Bean
	public Flow flowRemuneracao() {
		return (Flow) new FlowBuilder<Remuneracao>("flowRemuneracao")
				.start(stepRemuneracao())
				.build();
	}
	
	@Bean
	public Step stepRemuneracao() {
		return stepBuilderFactory
				.get("stepRemuneracao")
				.<Remuneracao, Remuneracao> chunk(50000)
				.reader(new ReaderRemuneracao().read())
				.processor(new ProcessorRemuneracao())
				.writer(writerRemuneracao())
				.build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory
				.get("job1")
				.incrementer(new RunIdIncrementer())
				.listener(new Listener())
				.start(flowCadastro())
				.split(new SimpleAsyncTaskExecutor())
				.add(flowRemuneracao())
				.end()
				.build();
	}

}
