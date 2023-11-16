package com.carpooling.Repositories;

import com.carpooling.manejadorXML;
import com.carpooling.Models.EmpleadoModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class EmpleadoRepository {
    ArrayList<EmpleadoModel> Lista = new ArrayList<EmpleadoModel>();

    public static ArrayList<EmpleadoModel> obtenerEmpleado() {
        EmpleadoModel usuarioModel = new EmpleadoModel();
        ArrayList<EmpleadoModel> Lista_de_usuarios = new ArrayList<EmpleadoModel>();
        Lista_de_usuarios.add(usuarioModel);
        manejadorXML.leerXML("empleado");
        return Lista_de_usuarios;
    }

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
