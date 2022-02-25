package com.farmacia.Farmacos.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "pedidos")
public class pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id_pedido;

    @ManyToOne
    farmacos producto;
    
    int cantidad;
    Date fecha;
    double valortotal;

    @ManyToOne
    cliente cliente;
    
    
    public Long getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }
    public farmacos getProducto() {
        return producto;
    }
    public void setProducto(farmacos producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getValortotal() {
        return valortotal;
    }
    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
    public cliente getCliente() {
        return cliente;
    }
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
   

}
