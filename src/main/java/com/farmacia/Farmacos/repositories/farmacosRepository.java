package com.farmacia.Farmacos.repositories;
import com.farmacia.Farmacos.models.farmacos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface farmacosRepository extends CrudRepository<farmacos, Long>{
    
}
