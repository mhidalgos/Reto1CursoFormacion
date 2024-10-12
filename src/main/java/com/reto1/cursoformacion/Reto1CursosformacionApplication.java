package com.reto1.cursoformacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Reto1CursosformacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto1CursosformacionApplication.class, args);
	}

}
