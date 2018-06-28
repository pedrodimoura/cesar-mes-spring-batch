package com.github.pedrodimoura.cesarmesspringbatch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourceArrayPropertyEditor;

import com.github.pedrodimoura.cesarmesspringbatch.batch.listener.Listener;
import com.github.pedrodimoura.cesarmesspringbatch.batch.processor.Processor;
import com.github.pedrodimoura.cesarmesspringbatch.batch.writer.Writer;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

@Configuration
public class BatchConfiguration {

	@Autowired
	StepBuilderFactory stepBuilderFactory;

	@Autowired
	JobBuilderFactory jobBuilderFactory;
	
	public MultiResourceItemReader<Cadastro> multiResourceItemReader() {
		MultiResourceItemReader<Cadastro> multiResourceItemReader = new MultiResourceItemReader<>();
		
		ResourceArrayPropertyEditor resourceLoader = new ResourceArrayPropertyEditor();
		resourceLoader.setAsText("classpath:data/*20171130*.csv");
		
		Resource[] resources = (Resource[]) resourceLoader.getValue();
		
		multiResourceItemReader.setResources(resources);
		multiResourceItemReader.setDelegate(reader());
		multiResourceItemReader.setName("multiReaderItemReader");
		return multiResourceItemReader;
	}
	
	@Bean
	public FlatFileItemReader<Cadastro> reader() {
		return new FlatFileItemReaderBuilder<Cadastro>()
				.name("cadastroFlatFileItemReader")
				.resource(new ClassPathResource("20171130_Cadastro.csv"))
				.linesToSkip(1)
				.lineMapper(lineMapper())
				.build();
	}
	
	private LineMapper<Cadastro> lineMapper() {
		DefaultLineMapper<Cadastro> defaultLineMapper = new DefaultLineMapper<>();
		
		LineTokenizer lineTokenizer = createLineTokenizer();
		defaultLineMapper.setLineTokenizer(lineTokenizer);
		
		FieldSetMapper<Cadastro> fieldSetMapper = createFieldSetMapper();
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);
		
		return defaultLineMapper;
	}
	
	private LineTokenizer createLineTokenizer() {
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(DelimitedLineTokenizer.DELIMITER_TAB);
		delimitedLineTokenizer.setNames(Cadastro.NAMES);
		return delimitedLineTokenizer;
	}
	
	private FieldSetMapper<Cadastro> createFieldSetMapper() {
		BeanWrapperFieldSetMapper<Cadastro> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Cadastro.class);
		return beanWrapperFieldSetMapper;
	}
	
	@Bean
	public Processor processor() {
		return new Processor();
	}
	
	@Bean
	public Writer writer() {
		return new Writer();
	}

	@Bean
	public Step step() {
		return stepBuilderFactory
				.get("step1")
				.<Cadastro, Cadastro> chunk(50000)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory
				.get("job1")
				.incrementer(new RunIdIncrementer())
				.listener(new Listener())
				.flow(step())
				.end()
				.build();
	}

}
