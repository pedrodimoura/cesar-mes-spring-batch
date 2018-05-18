package com.github.pedrodimoura.cesarmesspringbatch.model.dao;

import java.util.Collection;
import java.util.Iterator;

public interface IDAO<T> {

	void create(T t);

	void update(T t);

	void delete(T t);

	void deleteAll(Collection<T> collection);

	T findById(T t);

	Iterator<T> findAll();

}
