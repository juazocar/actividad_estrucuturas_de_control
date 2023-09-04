/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.entidades;

import java.util.Date;

/**
 *
 * @author jazocar
 */
public class SolicitudCliente {
    
    private int     numero;
    private Date    fecha;
    private Cliente cliente;
    private int     total;
    private String  listadoProductos;

    public SolicitudCliente() {
    }

    public SolicitudCliente(int numero, Date fecha, Cliente cliente, int total, String listadoProductos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.listadoProductos = listadoProductos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getListadoProductos() {
        return listadoProductos;
    }

    public void setListadoProductos(String listadoProductos) {
        this.listadoProductos = listadoProductos;
    }
    
    
    
}
