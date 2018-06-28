package com.github.pedrodimoura.cesarmesspringbatch.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class Processor implements ItemProcessor<Cadastro, Cadastro> {

	@Override
	public Cadastro process(Cadastro cadastro) throws Exception {
		return cadastro;
	}

}
