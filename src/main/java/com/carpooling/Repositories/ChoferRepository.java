package com.carpooling.Repositories;


import com.carpooling.manejadorXML;
import com.carpooling.Models.ChoferModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class ChoferRepository {
    ArrayList<ChoferModel> Lista = new ArrayList<ChoferModel>();

    public static ArrayList<ChoferModel> obtenerChoferes() {
        ChoferModel choferModel = new ChoferModel();
        ArrayList<ChoferModel> Lista_de_choferes = new ArrayList<ChoferModel>();
        Lista_de_choferes.add(choferModel);
        manejadorXML.leerXML("chofer");
        return Lista_de_choferes;
    }

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
