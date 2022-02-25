package com.farmacia.Farmacos.repositories;
import com.farmacia.Farmacos.models.gestion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gestionRepository extends CrudRepository<gestion, Long>{
    
}
