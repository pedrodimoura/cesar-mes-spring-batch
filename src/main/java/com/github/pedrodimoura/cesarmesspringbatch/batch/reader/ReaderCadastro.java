package com.github.pedrodimoura.cesarmesspringbatch.batch.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.core.io.ClassPathResource;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class ReaderCadastro {
	
	public FlatFileItemReader<Cadastro> read() {
		return new FlatFileItemReaderBuilder<Cadastro>()
				.name("flatFileItemReaderCadastro")
				.resource(new ClassPathResource("data/20180531_Cadastro.csv"))
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
		delimitedLineTokenizer.setDelimiter(";");
		delimitedLineTokenizer.setNames(Cadastro.NAMES);
		return delimitedLineTokenizer;
	}

	private FieldSetMapper<Cadastro> createFieldSetMapper() {
		BeanWrapperFieldSetMapper<Cadastro> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Cadastro.class);
		return beanWrapperFieldSetMapper;
	}

}
