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

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Remuneracao;

public class ReaderRemuneracao {
	
	public FlatFileItemReader<Remuneracao> read() {
		return new FlatFileItemReaderBuilder<Remuneracao>()
				.name("flatFileItemReaderRemuneracao")
				.resource(new ClassPathResource("data/20180531_Remuneracao.csv"))
				.linesToSkip(1)
				.lineMapper(lineMapper())
				.build();
	}
	
	private LineMapper<Remuneracao> lineMapper() {
		DefaultLineMapper<Remuneracao> defaultLineMapper = new DefaultLineMapper<>();

		LineTokenizer lineTokenizer = createLineTokenizer();
		defaultLineMapper.setLineTokenizer(lineTokenizer);

		FieldSetMapper<Remuneracao> fieldSetMapper = createFieldSetMapper();
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);

		return defaultLineMapper;
	}

	private LineTokenizer createLineTokenizer() {
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(";");
		delimitedLineTokenizer.setNames(Remuneracao.NAMES);
		return delimitedLineTokenizer;
	}

	private FieldSetMapper<Remuneracao> createFieldSetMapper() {
		BeanWrapperFieldSetMapper<Remuneracao> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Remuneracao.class);
		return beanWrapperFieldSetMapper;
	}

}
