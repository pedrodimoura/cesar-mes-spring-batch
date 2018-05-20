package com.github.pedrodimoura.cesarmesspringbatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;
import com.github.pedrodimoura.cesarmesspringbatch.model.repository.CadastroRepository;

@Controller
public class UserController {
	
	@Autowired
	private CadastroRepository cadastroRepository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Cadastro> getCadastro(@RequestBody Cadastro cadastro) {

		try {
			cadastro.validate();
			cadastroRepository.save(cadastro);
			return new ResponseEntity<Cadastro>(cadastro, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Cadastro>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
