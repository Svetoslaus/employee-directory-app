package com.example.personaldirectoryapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalDirectoryAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonalDirectoryAppApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {

	}
}
