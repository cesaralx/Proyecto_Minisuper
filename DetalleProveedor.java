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
public class DetalleProveedor {
    
     private Proveedor proveedor;
    private Producto producto;
    private int cantidad;
    private float preciocompra;
    private float precioventa;
    private String nroFactura;

    public DetalleProveedor() {
    }

    public DetalleProveedor(Proveedor proveedor, Producto producto, int cantidad, float preciocompra, float precioventa, String nroFactura) {
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.nroFactura = nroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }
    
    
    
}
