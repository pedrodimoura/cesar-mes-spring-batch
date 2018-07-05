package com.github.pedrodimoura.cesarmesspringbatch.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Remuneracao;

public class ProcessorRemuneracao implements ItemProcessor<Remuneracao, Remuneracao> {

	@Override
	public Remuneracao process(Remuneracao remuneracao) throws Exception {
		
		if (remuneracao.getIdServidorPortal() == null) remuneracao.setIdServidorPortal(-1L);
		
		remuneracao.setNome(remuneracao.getNome().toUpperCase());
		remuneracao.setRemuneracaoBasicaBrutaRs(remuneracao.getRemuneracaoBasicaBrutaRs().replace(',', '.'));
		
		return remuneracao;
	}
	
}
