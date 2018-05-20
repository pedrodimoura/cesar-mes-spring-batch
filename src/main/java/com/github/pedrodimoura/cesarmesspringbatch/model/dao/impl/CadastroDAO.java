package com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.IDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;
import com.github.pedrodimoura.cesarmesspringbatch.model.repository.CadastroRepository;

@Configuration
public class CadastroDAO implements IDAO<Cadastro> {

	@Autowired
	private CadastroRepository cadastroRepository;
	
	@Override
	public void create(Cadastro t) {
		cadastroRepository.save(t);
	}

	@Override
	public void update(Cadastro t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Cadastro t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Collection<Cadastro> collection) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cadastro findById(Cadastro t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Cadastro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
