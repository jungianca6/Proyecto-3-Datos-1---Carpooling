package com.carpooling.Models;

import java.util.*;




/**
 * Clase que representa un modelo de empleado en la aplicación de carpooling.
 */



public class EmpleadoModel {
    private String name;
    private Double calificacion;
    private int ID;
    private ArrayList<ChoferModel> amigos;
    private String contraseña;

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */

    public String getName() {
        return name;
    }


    /**
     * Establece el nombre del empleado.
     *
     * @param name El nuevo nombre del empleado.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la calificación del empleado.
     *
     * @return La calificación del empleado.
     */

    public Double getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación del empleado.
     *
     * @param calificacion La nueva calificación del empleado.
     */

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }


    /**
     * Obtiene el ID del empleado.
     *
     * @return El ID del empleado.
     */

    public int getID() {
        return ID;
    }

    /**
     * Establece el ID del empleado.
     *
     * @param ID El nuevo ID del empleado.
     */

    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Obtiene la lista de amigos del empleado.
     *
     * @return La lista de amigos del empleado.
     */

    public ArrayList<ChoferModel> getAmigos() {
        return amigos;
    }

    /**
     * Establece la lista de amigos del empleado.
     *
     * @param amigos La nueva lista de amigos del empleado.
     */

    public void setAmigos(ArrayList<ChoferModel> amigos) {
        this.amigos = amigos;
    }

    /**
     * Obtiene la contraseña del empleado.
     *
     * @return La contraseña del empleado.
     */

    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del empleado.
     *
     * @param contraseña La nueva contraseña del empleado.
     */

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
