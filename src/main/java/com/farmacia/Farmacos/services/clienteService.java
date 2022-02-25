package com.farmacia.Farmacos.services;

import java.util.ArrayList;

import com.farmacia.Farmacos.models.cliente;
import com.farmacia.Farmacos.repositories.clienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clienteService {
    @Autowired
    clienteRepository ClienteRepository;


    public ArrayList<cliente> getClientes() {
        return (ArrayList<cliente>) ClienteRepository.findAll();
    }

    public void guardarcliente(cliente c){
        this.ClienteRepository.save(c);
    }
}
