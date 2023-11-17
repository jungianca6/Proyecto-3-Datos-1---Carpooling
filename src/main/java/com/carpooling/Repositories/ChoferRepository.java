package com.carpooling.Repositories;


import com.carpooling.manejadorXML;
import com.carpooling.Models.ChoferModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

/**
 * Repositorio que gestiona la persistencia de datos relacionados con choferes en la aplicación de carpooling.
 */


@Repository
public class ChoferRepository {
    ArrayList<ChoferModel> Lista = new ArrayList<ChoferModel>();


    /**
     * Obtiene la lista de choferes desde el archivo XML.
     *
     * @return Lista de objetos ChoferModel que representan a los choferes.
     */



    public static ArrayList<ChoferModel> obtenerChoferes() {
        ChoferModel choferModel = new ChoferModel();
        ArrayList<ChoferModel> Lista_de_choferes = new ArrayList<ChoferModel>();
        Lista_de_choferes.add(choferModel);
        manejadorXML.leerXML("chofer");
        return Lista_de_choferes;
    }

    /**
     * Guarda un nuevo chofer en el archivo XML.
     *
     * @param chofer El objeto ChoferModel que representa al chofer a guardar.
     * @return El objeto ChoferModel guardado.
     */



    public static ChoferModel guardarChofer(ChoferModel chofer) {
        String nomArchivo = "usuarios";
        try {
            manejadorXML.crearXMLchofer(nomArchivo, chofer);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return chofer;
    }
}
