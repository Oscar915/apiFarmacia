package com.farmacia.Farmacos.services;

import java.util.ArrayList;

import com.farmacia.Farmacos.models.gestion;
import com.farmacia.Farmacos.repositories.gestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class gestionService {
    @Autowired
    gestionRepository GestionRep;


    public ArrayList<gestion> getGestions() {
        return (ArrayList<gestion>) GestionRep.findAll();
    }

    public void guardarGestion(gestion g){
        this.GestionRep.save(g);
    }
}
