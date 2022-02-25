package com.farmacia.Farmacos.repositories;

import com.farmacia.Farmacos.models.administrador;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface administradorRepository extends CrudRepository<administrador, Long>{
    
}
