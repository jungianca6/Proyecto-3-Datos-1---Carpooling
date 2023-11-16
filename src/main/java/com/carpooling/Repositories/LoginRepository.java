package com.carpooling.Repositories;

import com.carpooling.manejadorXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {
    public static boolean ingresar(String nombre, String contraseña){
        return manejadorXML.ingresar(nombre, contraseña);
    }
}