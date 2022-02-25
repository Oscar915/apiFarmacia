package com.farmacia.Farmacos.services;

import java.util.ArrayList;

import com.farmacia.Farmacos.models.farmacos;
import com.farmacia.Farmacos.repositories.farmacosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class farmacosService {
    @Autowired
    farmacosRepository FarmacosRepository;


    public ArrayList<farmacos> getFarmacos() {
        return (ArrayList<farmacos>) FarmacosRepository.findAll();
    }

    public void guardarFarmaco(farmacos f){
        this.FarmacosRepository.save(f);
    }
}
