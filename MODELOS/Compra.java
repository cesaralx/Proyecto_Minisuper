/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.Date;

/**
 *
 * @author cesaralx
 */
public class Compra {
     private int idCompra;
    private Cliente cliente;
    private Empleado empleado;
    private Date fechaCompra;
    private String tipoComprobante;

    public Compra() {
    }

    public Compra(int idCompra, Cliente cliente, Empleado empleado, Date fechaCompra, String tipoComprobante) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fechaCompra = fechaCompra;
        this.tipoComprobante = tipoComprobante;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
    
    
    
}
