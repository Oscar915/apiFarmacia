package com.farmacia.Farmacos.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.farmacia.Farmacos.models.gestion;
import com.farmacia.Farmacos.services.gestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gestion")
public class gestionController {
    @Autowired 
    gestionService gestion;


    @GetMapping
    public ArrayList<gestion> getData(){
        return gestion.getGestions();
    }

    @PostMapping//Define la petición HTTP con la que ejecutará el método (POST) y El path (/api/partidos)
    public ResponseEntity<Map<String, String>> guardar (@RequestBody gestion g){
       //Verificamos si existe un error
        
        //Recibimos los datos por el body de la petición
        this.gestion.guardarGestion(g); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó la gestion correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }
}
