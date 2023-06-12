package com.example.simonapi.services;

import com.example.simonapi.modelos.Alumno;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Override
    public Alumno GetAlumnoById(String dni) {
        var alumno = new Alumno();
        alumno.setApellido("Navas");
        alumno.setDni("93284");
        alumno.setNombre("Simon");
        return alumno;
    }

    @Override
    public void SaveAlumno(Alumno alumno) {

    }
}
