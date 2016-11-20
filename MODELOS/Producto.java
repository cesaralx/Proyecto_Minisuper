/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author cesaralx
 */
public class Producto {
    
    private int idProducto;
    private String nombre;
    private int stock;
    private Categoria categoria;
    private float preciounidad;

    public Producto() {
        this.setIdProducto(441);
        this.setNombre("Cocacola");
        this.setPreciounidad(9);
        this.setStock(41);
    }

    public Producto(int idProducto, String nombre, int stock, Categoria categoria, float preciounidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.preciounidad = preciounidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(float preciounidad) {
        this.preciounidad = preciounidad;
    }

    
    
}
