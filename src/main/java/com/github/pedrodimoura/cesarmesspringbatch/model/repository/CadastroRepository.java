package com.github.pedrodimoura.cesarmesspringbatch.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, Long> {

}
