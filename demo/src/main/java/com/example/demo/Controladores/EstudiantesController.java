package com.example.demo.Controladores;

import java.util.List;


import com.example.demo.Entidades.Estudiantes;
import com.example.demo.Servicios.EstudiantesServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    @Qualifier("servicioestudiantes")
    EstudiantesServicio servicio;

    @GetMapping("/getAll")
    public List<Estudiantes> getAllEstudiantes(){
        return servicio.obtenerAll();
    }

    @PutMapping("/crear")
    public boolean agregarEstudiantes(@RequestBody Estudiantes estudiante){
        return servicio.crear(estudiante);
    }
}
