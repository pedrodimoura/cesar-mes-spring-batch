package com.github.pedrodimoura.cesarmesspringbatch.model.dao.impl;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.github.pedrodimoura.cesarmesspringbatch.model.dao.IDAO;
import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.User;
import com.github.pedrodimoura.cesarmesspringbatch.model.repository.UserRepository;

@Configuration
public class UserDAO implements IDAO<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(User t) {
		userRepository.save(t);
	}

	@Override
	public void update(User t) {
		userRepository.save(t);
	}

	@Override
	public void delete(User t) {
		userRepository.delete(t);
	}

	@Override
	public void deleteAll(Collection<User> collection) {
		userRepository.deleteAll(collection);
	}

	@Override
	public User findById(User t) {
		return userRepository.findById(t.getId()).get();
	}

	@Override
	public Iterator<User> findAll() {
		return userRepository.findAll().iterator();
	}

}
