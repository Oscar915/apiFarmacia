package com.farmacia.Farmacos.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.farmacia.Farmacos.models.cliente;
import com.farmacia.Farmacos.services.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    clienteService ClienteService;


    @GetMapping
    public ArrayList<cliente> getData(){
        return ClienteService.getClientes();
    }

    @PostMapping//Define la petición HTTP con la que ejecutará el método (POST) y El path (/api/partidos)
    public ResponseEntity<Map<String, String>> guardar (@RequestBody cliente c){
       //Verificamos si existe un error
        
        //Recibimos los datos por el body de la petición
        this.ClienteService.guardarcliente(c); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó el cliente correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }
}
