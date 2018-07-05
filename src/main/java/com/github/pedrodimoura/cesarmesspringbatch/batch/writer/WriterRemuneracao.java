package com.github.pedrodimoura.cesarmesspringbatch.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl.RemuneracaoDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Remuneracao;

public class WriterRemuneracao implements ItemWriter<Remuneracao> {
	
	@Autowired
	RemuneracaoDAO remuneracaoDAO;
	
	@Override
	public void write(List<? extends Remuneracao> remuneracoes) throws Exception {
		try {
			System.out.println(remuneracoes.size());
			remuneracoes.stream().forEach(remuneracaoDAO::save);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
