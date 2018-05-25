package com.github.pedrodimoura.cesarmesspringbatch.model.dao;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public interface IDAO<T> {

	void save(T t);
	
	void saveAll(List<? extends T> collection);

	void update(T t);

	void delete(T t);

	void deleteAll(Collection<T> collection);

	T findById(T t);

	Iterator<T> findAll();

}
