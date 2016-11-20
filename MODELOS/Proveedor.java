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
public class Proveedor {
    
    private String rfc;
    private String razonSocial;
    private int telefono;
    private int celular;
    private String email;
    private String lugar;
    private String direccion;
    private String giro;

    public Proveedor() {
        this.setRfc("RTER4534");
        this.setRazonSocial("Coca");
        this.setTelefono(335874);
        this.setCelular(4434785);
        this.setEmail("ju@lo.com");
        this.setLugar("Guadalajara");
        this.setDireccion("Calle roja #474");
        this.setGiro("Bebidas");
        
    }

    public Proveedor(String ruc, String razonSocial, int telefono, int celular, String email, String lugar, String direccion, String tipo) {
        this.rfc = ruc;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.lugar = lugar;
        this.direccion = direccion;
        this.giro = tipo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }
    
    
    
}
