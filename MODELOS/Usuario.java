
package MODELO;

public class Usuario {
    //Attibutos
//    private Empleado empleado;
    private String cuenta;
    private String contrasena;
    private int numUsr;
    private Empleado empleado;

    public Usuario() {
//        Empleado m = new Empleado() ;
//       m.setUser("admin");
        this.setNumUsr(0);
//       this.setEmpleado(m);
        this.setCuenta("admin");
        this.setContrasena("123");
    }

    public Usuario(String cuenta, String contrasena, int numUsr, Empleado empleado) {
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.numUsr = numUsr;
        this.empleado = empleado;
    }

  

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNumUsr() {
        return numUsr;
    }

    public void setNumUsr(int numUsr) {
        this.numUsr = numUsr;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    

 
    
    
    
}
