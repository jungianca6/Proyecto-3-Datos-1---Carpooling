package com.carpooling.Controllers;

import com.carpooling.Models.ChoferModel;
import com.carpooling.Services.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/chofer")
public class ChoferController {
    @Autowired
    ChoferService choferService;

    @GetMapping
    public ArrayList<ChoferModel> obtenerChoferes(){
        return choferService.obtenerChoferes();
    }

    @PostMapping
    public ChoferModel guardarChofer(@RequestBody ChoferModel chofer){
        return this.choferService.guardarChofer(chofer);
    }
}
