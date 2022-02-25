package com.farmacia.Farmacos.services;

import java.util.ArrayList;

import com.farmacia.Farmacos.models.administrador;
import com.farmacia.Farmacos.repositories.administradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class administradorService {
    @Autowired
    administradorRepository AdministradorRepository;


    public ArrayList<administrador> getAdminist() {
        return (ArrayList<administrador>) AdministradorRepository.findAll();
    }

    public void guardarAdmin(administrador a){
        this.AdministradorRepository.save(a);
    }
}
