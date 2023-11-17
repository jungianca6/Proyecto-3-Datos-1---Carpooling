package com.carpooling.Models;


/**
 * Clase que representa un modelo de datos para el inicio de sesión en la aplicación de carpooling.
 */


public class LoginModel {
    String ID;
    String contraseña;

    /**
     * Obtiene el nombre (ID) del usuario para el inicio de sesión.
     *
     * @return El nombre (ID) del usuario.
     */

    public String getName() {
        return ID;
    }

    /**
     * Establece el nombre (ID) del usuario para el inicio de sesión.
     *
     * @param nombre El nuevo nombre (ID) del usuario.
     */

    public void setNombre(String nombre) {
        this.ID = nombre;
    }

    /**
     * Obtiene la contraseña del usuario para el inicio de sesión.
     *
     * @return La contraseña del usuario.
     */

    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del usuario para el inicio de sesión.
     *
     * @param contraseña La nueva contraseña del usuario.
     */

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}