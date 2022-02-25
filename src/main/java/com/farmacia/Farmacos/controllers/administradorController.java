package com.farmacia.Farmacos.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.farmacia.Farmacos.models.administrador;
import com.farmacia.Farmacos.services.administradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class administradorController {
    @Autowired
    administradorService admin;


    @GetMapping
    public ArrayList<administrador> getData(){
        return admin.getAdminist();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody administrador a){
       //Verificamos si existe un error
        
        //Recibimos los datos por el body de la petición
        this.admin.guardarAdmin(a); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó el administrador correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }
}
