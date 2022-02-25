package com.farmacia.Farmacos.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.farmacia.Farmacos.models.pedidos;
import com.farmacia.Farmacos.services.pedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class pedidoController {
    @Autowired
    pedidoService pedido;


    @GetMapping
    public ArrayList<pedidos> getData(){
        return pedido.gPedidos();
    }

    @PostMapping//Define la petición HTTP con la que ejecutará el método (POST) y El path (/api/partidos)
    public ResponseEntity<Map<String, String>> guardar (@RequestBody pedidos p){
       //Verificamos si existe un error
        
        //Recibimos los datos por el body de la petición
        this.pedido.guardarPedido(p); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó el pedido correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }
}
