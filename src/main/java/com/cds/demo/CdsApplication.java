package com.cds.demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CdsApplication {

	@Autowired
	JobLauncher jobLauncher;
	@Autowired
	Job job;

	public static void main(String[] args) {
		SpringApplication.run(CdsApplication.class, args);
	}

	@PostConstruct
	public void perform() throws Exception {
		JobParameters params = new JobParametersBuilder().addString("JobID", String.valueOf(System.currentTimeMillis())).toJobParameters();
		jobLauncher.run(job, params);
	}
}


