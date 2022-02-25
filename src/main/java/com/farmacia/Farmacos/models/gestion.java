package com.farmacia.Farmacos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gestiones")
public class gestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;
    @ManyToOne
    administrador admin;

    @ManyToOne
    pedidos pedido;


    public administrador getAdmin() {
        return admin;
    }
    public void setAdmin(administrador admin) {
        this.admin = admin;
    }
    public pedidos getPedido() {
        return pedido;
    }
    public void setPedido(pedidos pedido) {
        this.pedido = pedido;
    }
}
