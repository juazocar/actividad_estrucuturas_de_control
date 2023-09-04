/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.entidades;

/**
 *
 * @author jazocar
 */
public class Producto {
    
    private int    codigo;
    private String subCategoria;
    private String descripcion;
    private int    precio;
    private String unidadGramos;

    public Producto() {
    }

    public Producto(int codigo, String subCategoria, String descripcion, int precio, String unidadGramos) {
        this.codigo = codigo;
        this.subCategoria = subCategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadGramos = unidadGramos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidadGramos() {
        return unidadGramos;
    }

    public void setUnidadGramos(String unidadGramos) {
        this.unidadGramos = unidadGramos;
    }


    
    
}
