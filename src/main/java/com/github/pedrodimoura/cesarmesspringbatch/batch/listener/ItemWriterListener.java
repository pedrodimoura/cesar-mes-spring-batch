package com.github.pedrodimoura.cesarmesspringbatch.batch.listener;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;

import com.github.pedrodimoura.cesarmesspringbatch.model.entity.impl.Cadastro;

public class ItemWriterListener implements ItemWriteListener<Cadastro> {
	
	@Override
	public void afterWrite(List<? extends Cadastro> items) {
		System.out.println("After Write: " + items.size());
	}
	
	@Override
	public void beforeWrite(List<? extends Cadastro> items) {
		System.out.println("Before Write: " + items.size());
	}

	@Override
	public void onWriteError(Exception exception, List<? extends Cadastro> items) {
		exception.printStackTrace();
	}

}
