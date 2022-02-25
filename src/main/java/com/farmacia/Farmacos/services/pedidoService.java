package com.farmacia.Farmacos.services;

import java.util.ArrayList;

import com.farmacia.Farmacos.models.pedidos;
import com.farmacia.Farmacos.repositories.pedidosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pedidoService {
    @Autowired
    pedidosRepository PedidoRepository;

    public ArrayList<pedidos> gPedidos() {
        return (ArrayList<pedidos>) PedidoRepository.findAll();
    }

    public void guardarPedido(pedidos c){
        this.PedidoRepository.save(c);
    }
}
