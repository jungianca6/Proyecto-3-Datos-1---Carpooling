package com.carpooling;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Clase que extiende SpringBootServletInitializer para configurar la inicialización de servlets.
 */


public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * Configura la aplicación Spring Boot para la inicialización del servlet.
     *
     * @param application La aplicación Spring Boot.
     * @return El constructor de la aplicación configurada para la inicialización del servlet.
     */




    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}