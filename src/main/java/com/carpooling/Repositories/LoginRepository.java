package com.carpooling.Repositories;

import com.carpooling.manejadorXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Repositorio que gestiona la autenticación de usuarios en la aplicación de carpooling.
 */

@Repository
public class LoginRepository {


    /**
     * Verifica las credenciales de inicio de sesión.
     *
     * @param nombre      El nombre (ID) del usuario.
     * @param contraseña  La contraseña del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */


    public static boolean ingresar(String nombre, String contraseña){
        return manejadorXML.ingresar(nombre, contraseña);
    }
}