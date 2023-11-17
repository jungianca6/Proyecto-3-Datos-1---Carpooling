package com.carpooling.Controllers;

import com.carpooling.Models.ChoferModel;
import com.carpooling.Services.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


/**
 * Controlador para gestionar operaciones relacionadas con choferes en la aplicación de carpooling.
 */


@RestController
@RequestMapping("/chofer")
public class ChoferController {
    @Autowired
    ChoferService choferService;


    /**
     *
     *  Obtiene la lista de choferes.
     *
     * @return  Lista de objetos ChoferModel que representan a los choferes.
     */

    @GetMapping
    public ArrayList<ChoferModel> obtenerChoferes(){
        return choferService.obtenerChoferes();
    }

    /**
     *
     * Guarda un nuevo chofer.
     *
     *
     * @param chofer El objeto ChoferModel que representa al chofer a guardar.
     * @return El objeto ChoferModel guardado.
     */

    @PostMapping
    public ChoferModel guardarChofer(@RequestBody ChoferModel chofer){
        return this.choferService.guardarChofer(chofer);
    }
}
