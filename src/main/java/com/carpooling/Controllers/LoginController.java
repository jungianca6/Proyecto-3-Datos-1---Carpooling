package com.carpooling.Controllers;

import com.carpooling.Models.LoginModel;
import com.carpooling.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
class LoginController {
    @Autowired
    LoginService loginService;
    @GetMapping
    public boolean ingresar(@RequestBody LoginModel login){
        return this.loginService.ingresar(login.getName(), login.getContraseña());
    }
}
