package com.github.pedrodimoura.cesarmesspringbatch.batch.processor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl.CadastroDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class Processor implements ItemProcessor<Cadastro, Cadastro> {

	@Autowired
	private CadastroDAO cadastroDAO;
	
	List<Cadastro> cadastros = new ArrayList<>();
	
	@Override
	public Cadastro process(Cadastro cadastro) throws Exception {

		cadastros.add(cadastro);
		
		if (cadastros.size() == 1000) {
			System.out.println("Adicionou esse tanso pqp...");
			cadastroDAO.saveAll(cadastros);
			cadastros.clear();
		}
		
		return cadastro;
	}
	
}
