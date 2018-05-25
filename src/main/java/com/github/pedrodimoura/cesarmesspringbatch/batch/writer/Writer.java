package com.github.pedrodimoura.cesarmesspringbatch.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl.CadastroDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class Writer implements ItemWriter<Cadastro> {

	@Autowired
	private CadastroDAO cadastroDAO;

	@Override
	public void write(List<? extends Cadastro> cadastros) throws Exception {
		cadastroDAO.saveAll(cadastros);
	}

}
