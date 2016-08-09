package com.cliff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebbaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebbaseApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		System.err.println(this.repository.findAll());
	}
}
