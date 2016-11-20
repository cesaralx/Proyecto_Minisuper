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
public class Cliente {
    private int codCliente;
    private String nombre;
    private int telefono;
    private String tipoPago;

    public Cliente() {
        this.setCodCliente(1);
        this.setNombre("Luis");
        this.setTelefono(3344471);
        this.setTipoPago("Efectivo");
    }

    public Cliente(int codCliente, String nombre, int telefono, String tipoPago) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoPago = tipoPago;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
    
    
    
}
