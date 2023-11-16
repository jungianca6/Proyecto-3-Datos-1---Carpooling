package com.carpooling.Services;

import com.carpooling.Models.EmpleadoModel;
import com.carpooling.Repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class EmpleadoService {

    public ArrayList<EmpleadoModel> obtenerEmpleados() {
        return EmpleadoRepository.obtenerEmpleado();
    }

    public EmpleadoModel guardarEmpleado(EmpleadoModel empleado) {
        return EmpleadoRepository.guardarUsuario(empleado);
    }
}
