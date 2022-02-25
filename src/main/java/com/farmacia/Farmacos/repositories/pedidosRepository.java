package com.farmacia.Farmacos.repositories;
import com.farmacia.Farmacos.models.pedidos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pedidosRepository extends CrudRepository<pedidos, Long>{
    
}
