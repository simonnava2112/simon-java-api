package com.example.simonapi.controller;


import com.example.simonapi.modelos.Alumno;
import com.example.simonapi.services.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController // esto define esta clase como un rest controller
@RequestMapping("/alumnos") //esto define el path del request
@AllArgsConstructor // esto es para que inicialize todos los servicios definidos
public class AlumnosController {


    private AlumnoService alumnoService;


    @PostMapping // esto es para definir la naturaleza del metodo
    // @GetMapping <- esto es un ejemplo si fuese un get logicamente un get tendria que devolver un objet
    // requestBody
    public void NewAlumno(@RequestBody Alumno alumno) {
        System.out.println(alumno);
    }


    @GetMapping
    public ResponseEntity<?> GetAlumnoByID(@RequestParam String dni) {
        var alumno = alumnoService.GetAlumnoById(dni);

        return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
    }

    @GetMapping("/trycatch")
    public ResponseEntity<?> GetAlumnoByIDConTryCatch() {
        try {
            // si tu consulta de base de datos se jodio o hay algun error va a ir directo al catch
            // aqui tiene que ir tu intento a consulta de base de datos y logica de negocios
            throw new Exception("una exception terrible");
          //  return new ResponseEntity<String>("good request :D", HttpStatus.BAD_REQUEST);
        } catch (Exception exception) {
            return new ResponseEntity<Exception>(exception, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


}
