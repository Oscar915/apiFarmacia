package com.farmacia.Farmacos.models;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "administradores")
public class administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id_administrador;
    
    String nombre;
    String direccion;
    BigInteger telefono;

    
    public Long getId_administrador() {
        return id_administrador;
    }
    public void setId_administrador(Long id_administrador) {
        this.id_administrador = id_administrador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigInteger getTelefono() {
        return telefono;
    }
    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }
}
