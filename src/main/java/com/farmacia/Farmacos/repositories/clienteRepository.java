package com.farmacia.Farmacos.repositories;
import com.farmacia.Farmacos.models.cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends CrudRepository<cliente, Long>{
    
}
