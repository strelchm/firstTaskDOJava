package ru.dojava.strelchm.firstTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
public class FirstTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstTaskApplication.class, args);
	}

}