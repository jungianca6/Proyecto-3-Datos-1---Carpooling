package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia la aplicación Spring Boot.
 */

@SpringBootApplication
public class Application {

	/**
	 * Método principal que inicia la aplicación Spring Boot.
	 *
	 * @param args Los argumentos de línea de comandos proporcionados al iniciar la aplicación.
	 */


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
