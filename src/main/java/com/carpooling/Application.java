package com.carpooling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *  La clase principal que inicia la aplicación Spring Boot
 *
 * @autor
 *
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * El método principal que inicia la aplicación Spring Boot.
	 *
	 * @param args  Los argumentos de la línea de comandos
	 *                 proporcionados al iniciar la aplicación.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
