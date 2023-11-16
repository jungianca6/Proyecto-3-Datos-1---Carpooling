package com.carpooling.Services;

import org.springframework.stereotype.Service;
import com.carpooling.Repositories.LoginRepository;

@Service
public class LoginService {
    public boolean ingresar(String nombre, String contraseña) {
        return LoginRepository.ingresar(nombre, contraseña);
    }
}
