package com.always.postgretest.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PostgreTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreTestApplication.class, args);
	}

}
