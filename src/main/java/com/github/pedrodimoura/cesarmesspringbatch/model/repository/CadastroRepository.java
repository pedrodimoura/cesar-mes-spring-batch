package com.github.pedrodimoura.cesarmesspringbatch.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public interface CadastroRepository extends CrudRepository<Cadastro, Long> {

}
