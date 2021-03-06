/*
 * Esta clase maneja todas las consultas para empleado
 * en algunas retorna un objeto empleado para usarse en una lista y en otra retorna una lista con los usuarios.
 */
package DATOS;

import MODELO.Empleado;
import MODELO.Usuario;
import VISTA.frmEmpleado;
import VISTA.frmUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesaralx
 */
public abstract class datosEmpleado {
   private Empleado emp;
   private frmUsuario user;
    
    public static void insertarDatos(frmUsuario b ) {

       b.aEmp[b.cEmp]= new Empleado( 1, 21 , "Luis", "Estrada", "Luis@g.com", "Hombre", 33, "332233", "3939844", "Calle loca 3332", "Luis1", "C:");b.cEmp++;
       b.aEmp[b.cEmp]= new Empleado( 2, 41 , "Gabriel", "Estrada", "Luis@g.com", "Hombre", 33, "332233", "3939844", "Calle loca 3332", "Luis1", "C:");b.cEmp++;
       b.aEmp[b.cEmp]= new Empleado( 3, 35 , "MAria", "Estrada", "Luis@g.com", "Hombre", 33, "332233", "3939844", "Calle loca 3332", "Luis1", "C:");b.cEmp++;

      } 

    public static void  insertarEmpleado(Empleado e, frmUsuario us)  {
        Empleado emp = new Empleado();
        
        emp.setApellido(e.getApellido());
        emp.setCelular(e.getCelular());
        emp.setDireccion(e.getDireccion());
        emp.setDni(e.getDni());
        emp.setEdad(e.getEdad());
        emp.setEmail(e.getEmail());
        emp.setImagen(e.getImagen());
        emp.setNombre(e.getNombre());
        emp.setNroEmpleado(e.getDni());
        emp.setSexo(String.valueOf(e.getSexo()));
        emp.setTelefono(e.getTelefono());
        emp.setUser(e.getUser());
        

//        return emp;
        us.aEmp[us.cEmp]= emp ;us.cEmp++;
    }
    
    

    public static Empleado buscarEmpleado(int nroemp)  {
        return buscarEmpleado(nroemp, null);
    }

    public static Empleado buscarEmpleado(int nroemp, Empleado e)  {

//        validar si se encontro un usuario comparar si se retorno null, 
//            es que no se encontro de lo contrario
//                retorna todos los valores en un obejto empleado

        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (e == null) {
                e = new Empleado() {};
            }
            for (int i = 0; i < user.cEmp ; i++) {
            if (nroemp == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            e.setNroEmpleado(nroemp);
            e.setApellido(user.aEmp[pos].getApellido());
            e.setCelular(user.aEmp[pos].getCelular());
            e.setDireccion(user.aEmp[pos].getDireccion());
            e.setDni(user.aEmp[pos].getDni());
            e.setEdad(user.aEmp[pos].getEdad());
            e.setEmail(user.aEmp[pos].getEmail());
            e.setImagen(user.aEmp[pos].getImagen());
            e.setNombre(user.aEmp[pos].getNombre());
//            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setSexo(user.aEmp[pos].getSexo());
            e.setTelefono(user.aEmp[pos].getTelefono());
            e.setUser(user.aEmp[pos].getUser());

            return e; 
    }


     public static Empleado buscarEmpleadoSinIM(int nroemp)  {
        return  buscarEmpleadoSinIM(nroemp, null);
    }

    public static Empleado  buscarEmpleadoSinIM(int nroemp, Empleado e) {
       frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (e == null) {
                e = new Empleado() {};
            }
            for (int i = 0; i < user.cEmp ; i++) {
            if (nroemp == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            e.setNroEmpleado(nroemp);
            e.setApellido(user.aEmp[pos].getApellido());
            e.setCelular(user.aEmp[pos].getCelular());
            e.setDireccion(user.aEmp[pos].getDireccion());
            e.setDni(user.aEmp[pos].getDni());
            e.setEdad(user.aEmp[pos].getEdad());
            e.setEmail(user.aEmp[pos].getEmail());
            e.setImagen(user.aEmp[pos].getImagen());
            e.setNombre(user.aEmp[pos].getNombre());
//            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setSexo(user.aEmp[pos].getSexo());
            e.setTelefono(user.aEmp[pos].getTelefono());
            e.setUser(user.aEmp[pos].getUser());
            
        return e;
    }

    public static Empleado buscarEmpleadoDNI(int dni) {
        return buscarEmpleadoDNI(dni, null);
    }

    public static Empleado buscarEmpleadoDNI(int dni, Empleado e)  {
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (e == null) {
                e = new Empleado() {};
            }
            for (int i = 0; i < user.cEmp ; i++) {
            if (dni == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setApellido(user.aEmp[pos].getApellido());
            e.setCelular(user.aEmp[pos].getCelular());
            e.setDireccion(user.aEmp[pos].getDireccion());
            e.setDni(dni);
            e.setEdad(user.aEmp[pos].getEdad());
            e.setEmail(user.aEmp[pos].getEmail());
            e.setImagen(user.aEmp[pos].getImagen());
            e.setNombre(user.aEmp[pos].getNombre());
//            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setSexo(user.aEmp[pos].getSexo());
            e.setTelefono(user.aEmp[pos].getTelefono());
            e.setUser(user.aEmp[pos].getUser());
        return e;
    }

    public static Empleado buscarEmpleadoApe(String ape)  {
        return buscarEmpleadoApe(ape, null);
    }

    public static Empleado buscarEmpleadoApe(String ape, Empleado e) {
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (e == null) {
                e = new Empleado() {};
            }
            for (int i = 0; i < user.cEmp ; i++) {
            if (ape.equals(user.aEmp[i].getApellido())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setApellido(ape);
            e.setCelular(user.aEmp[pos].getCelular());
            e.setDireccion(user.aEmp[pos].getDireccion());
            e.setDni(user.aEmp[pos].getDni());
            e.setEdad(user.aEmp[pos].getEdad());
            e.setEmail(user.aEmp[pos].getEmail());
            e.setImagen(user.aEmp[pos].getImagen());
            e.setNombre(user.aEmp[pos].getNombre());
//            e.setNroEmpleado(user.aEmp[pos].getNroEmpleado());
            e.setSexo(user.aEmp[pos].getSexo());
            e.setTelefono(user.aEmp[pos].getTelefono());
            e.setUser(user.aEmp[pos].getUser());
            
        return e;
    }

    public static void eliminarEmpleado(int nroemp) {
       frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cEmp ; i++) {
            if (nroemp == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j < user.cEmp; j++) {
                while (user.aEmp[j] != null) {
                    user.aEmp[pos].setApellido(user.aEmp[pos+1].getApellido()); user.cEmp--;                  
                } 
            } 
        }  
    }

    public static void eliminarEmpleadoDNI(int id)  {
       frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cEmp ; i++) {
            if (id == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j < user.cEmp; j++) {
                while (user.aEmp[j] != null) {
                    user.aEmp[pos].setApellido(user.aEmp[pos+1].getApellido()); user.cEmp--;                  
                } 
            } 
        }  
    }

    public static void actualizarEmpleado(Empleado e)  {
       
frmUsuario user = new frmUsuario();
int pos=0;
boolean encontrado=false;
        int numBuscar = e.getNroEmpleado();
        for (int i = 0; i < user.cEmp ; i++) {
            if (numBuscar == user.aEmp[i].getNroEmpleado()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aEmp[pos].setDni(e.getDni()); 
        user.aEmp[pos].setApellido(e.getApellido()); 
        user.aEmp[pos].setCelular(e.getCelular()); 
        user.aEmp[pos].setDireccion(e.getDireccion()); 
        user.aEmp[pos].setEdad(e.getEdad()); 
        user.aEmp[pos].setEmail(e.getEmail()); 
        user.aEmp[pos].setImagen(e.getImagen()); 
        user.aEmp[pos].setNombre(e.getNombre()); 
        user.aEmp[pos].setNroEmpleado(e.getNroEmpleado()); 
        user.aEmp[pos].setSexo(e.getSexo()); 
        user.aEmp[pos].setTelefono(e.getTelefono()); 
        user.aEmp[pos].setUser(e.getUser()); 

    }

    public static ArrayList<Empleado> mostrarEmpleado( ) {
       
        ArrayList<Empleado> lista = new ArrayList<Empleado>();
         frmUsuario user = new frmUsuario();
        try {

        for (int i = 0; i < user.cEmp; i++) {
             Empleado e = new Empleado() {};
            e.setApellido(user.aEmp[i].getApellido());
            e.setCelular(user.aEmp[i].getCelular());
            e.setDireccion(user.aEmp[i].getDireccion());
            e.setDni(user.aEmp[i].getDni());
            e.setEdad(user.aEmp[i].getEdad());
            e.setEmail(user.aEmp[i].getEmail());
            e.setNombre(user.aEmp[i].getNombre());
            e.setNroEmpleado(user.aEmp[i].getNroEmpleado());
            e.setSexo(user.aEmp[i].getSexo());
            e.setTelefono(user.aEmp[i].getTelefono());
            e.setUser(user.aEmp[i].getUser());
//            e.setImagen(u.aEmp[i].getImagen());
            lista.add(e);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lista;
    }
}
