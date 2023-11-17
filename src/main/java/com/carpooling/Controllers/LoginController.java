package com.carpooling.Controllers;

import com.carpooling.Models.LoginModel;
import com.carpooling.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Controlador para gestionar operaciones de inicio de sesión en la aplicación de carpooling.
 */



@RestController
@RequestMapping("/login")
class LoginController {
    @Autowired
    LoginService loginService;


    /**
     * Verifica las credenciales de inicio de sesión.
     *
     * @param login El objeto LoginModel que contiene el nombre y la contraseña del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */

    @GetMapping
    public boolean ingresar(@RequestBody LoginModel login){
        return this.loginService.ingresar(login.getName(), login.getContraseña());
    }
}
