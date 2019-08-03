package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * Classe Principal da Aplicação.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {

	/***
	 * Método Principal da Aplicação.
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
