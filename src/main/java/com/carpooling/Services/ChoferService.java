package com.carpooling.Services;

import com.carpooling.Models.ChoferModel;
import com.carpooling.Repositories.ChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ChoferService {

    public ArrayList<ChoferModel> obtenerChoferes() {
        return ChoferRepository.obtenerChoferes();
    }

    public ChoferModel guardarChofer(ChoferModel chofer) {
        return ChoferRepository.guardarChofer(chofer);
    }
}