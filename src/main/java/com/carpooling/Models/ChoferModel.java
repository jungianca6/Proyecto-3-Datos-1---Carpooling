package com.carpooling.Models;

import java.util.*;

/**
 * Clase que representa un modelo de chofer en la aplicación de carpooling.
 */


public class ChoferModel {
    private String name;
    private int ID;
    private String contraseña;
    private Double calificacion;
    private ArrayList<EmpleadoModel> amigos;


    /**
     * Obtiene la contraseña del chofer.
     *
     * @return La contraseña del chofer.
     */


    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del chofer.
     *
     * @param contraseña La nueva contraseña del chofer.
     */

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el nombre del chofer.
     *
     * @return El nombre del chofer.
     */

    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del chofer.
     *
     * @param name El nuevo nombre del chofer.
     */

    public void setName(String name) {
        this.name = name;
    }



    /**
     * Obtiene la calificación del chofer.
     *
     * @return La calificación del chofer.
     */

    public Double getCalificacion() {
        return calificacion;
    }


    /**
     * Establece la calificación del chofer.
     *
     * @param calificacion La nueva calificación del chofer.
     */

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

   /**
     * Obtiene el ID del chofer.
     *
     * @return El ID del chofer.
     */

    public int getID() {
        return ID;
    }

    /**
     * Establece el ID del chofer.
     *
     * @param ID El nuevo ID del chofer.
     */

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Obtiene la lista de amigos del chofer.
     *
     * @return La lista de amigos del chofer.
     */

    public ArrayList<EmpleadoModel> getAmigos() {
        return amigos;
    }

    /**
     * Establece la lista de amigos del chofer.
     *
     * @param amigos La nueva lista de amigos del chofer.
     */

    public void setAmigos(ArrayList<EmpleadoModel> amigos) {
        this.amigos = amigos;
    }
}
