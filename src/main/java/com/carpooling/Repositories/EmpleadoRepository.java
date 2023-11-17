package com.carpooling.Repositories;

import com.carpooling.manejadorXML;
import com.carpooling.Models.EmpleadoModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

/**
 * Repositorio que gestiona la persistencia de datos relacionados con empleados en la aplicación de carpooling.
 */


@Repository
public class EmpleadoRepository {
    ArrayList<EmpleadoModel> Lista = new ArrayList<EmpleadoModel>();


    /**
     * Obtiene la lista de empleados desde el archivo XML.
     *
     * @return Lista de objetos EmpleadoModel que representan a los empleados.
     */

    public static ArrayList<EmpleadoModel> obtenerEmpleado() {
        EmpleadoModel usuarioModel = new EmpleadoModel();
        ArrayList<EmpleadoModel> Lista_de_usuarios = new ArrayList<EmpleadoModel>();
        Lista_de_usuarios.add(usuarioModel);
        manejadorXML.leerXML("empleado");
        return Lista_de_usuarios;
    }


    /**
     * Guarda un nuevo empleado en el archivo XML.
     *
     * @param empleado El objeto EmpleadoModel que representa al empleado a guardar.
     * @return El objeto EmpleadoModel guardado.
     */



    public static EmpleadoModel guardarUsuario(EmpleadoModel empleado){
        String nomArchivo = "usuarios";
        try {
            manejadorXML.crearXMLempleado(nomArchivo, empleado);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return empleado;
    }
}
