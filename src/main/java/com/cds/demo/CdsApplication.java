package com.cds.demo;

import org.h2.tools.Server;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.sql.SQLException;

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

//	@Bean(initMethod = "start", destroyMethod = "stop")
//	public Server h2Server() throws SQLException {
//		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8090");
//	}
}


