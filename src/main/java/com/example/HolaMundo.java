package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador que maneja las solicitudes relacionadas con el saludo en la aplicación.
 */


@RestController
class HolaMundo {

    /**
     * Maneja las solicitudes a la ruta "/" y devuelve un saludo simple.
     *
     * @return Un mensaje de saludo para la ruta "/".
     */

    @RequestMapping("/")
    public String hello() {
        return "project test";
    }
}
