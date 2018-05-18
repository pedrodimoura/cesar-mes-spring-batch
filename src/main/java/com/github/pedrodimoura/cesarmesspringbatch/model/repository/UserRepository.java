package com.github.pedrodimoura.cesarmesspringbatch.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public void getUserById(User user);
	
}
