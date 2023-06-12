package com.example.simonapi.services;

import com.example.simonapi.modelos.Alumno;

public interface AlumnoService {

    Alumno GetAlumnoById(String dni);
    void SaveAlumno(Alumno alumno);


}
