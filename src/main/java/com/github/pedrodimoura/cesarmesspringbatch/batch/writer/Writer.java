package com.github.pedrodimoura.cesarmesspringbatch.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl.CadastroDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class Writer implements ItemWriter<Cadastro> {

	@Autowired
	CadastroDAO cadastroDAO;

	@Override
	public void write(List<? extends Cadastro> cadastros) throws Exception {
		try {
			System.out.println(cadastros.size());
			cadastros.stream().forEach(cadastroDAO::save);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
