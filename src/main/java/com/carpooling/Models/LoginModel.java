package com.carpooling.Models;

public class LoginModel {
    String ID;
    String contraseña;

    public String getName() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.ID = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}