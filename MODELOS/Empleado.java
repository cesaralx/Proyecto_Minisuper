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
public class Empleado {
    private int nroEmpleado;
    private int dni;
    private String nombre;
    private String Apellido;
    private String email;
    private String sexo;
    private int edad;
    private String telefono;
    private String celular;
    private String direccion;
    private String user;
    private String imagen;//Foto del Empleado guardare la Ruta de la Imagen!!

    public Empleado() {
    }

    public Empleado(int nroEmpleado, int dni, String nombre, String Apellido, String email, String sexo, int edad, String telefono, String celular, String direccion, String user, String imagen) {
        this.nroEmpleado = nroEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.user = user;
        this.imagen = imagen;
    }

    public int getNroEmpleado() {
        return nroEmpleado;
    }

    public void setNroEmpleado(int nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
    
}
