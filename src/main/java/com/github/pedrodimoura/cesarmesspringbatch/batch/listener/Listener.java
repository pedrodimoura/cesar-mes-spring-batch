package com.github.pedrodimoura.cesarmesspringbatch.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class Listener implements JobExecutionListener {

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("After Job: " + jobExecution.getStatus());
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Before Job: " + jobExecution.getStatus());
	}

}
