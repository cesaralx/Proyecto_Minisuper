/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import MODELO.Cliente;
import VISTA.frmUsuario;
import java.util.ArrayList;

/**
 *
 * @author Cesaralx
 */
public abstract class datosCliente {
     frmUsuario user;
     Cliente cli;
     
     public static void insertarDatos(frmUsuario b ) {

       b.aCli[b.cCli]= new Cliente( 001, "Luis" , 22322, "Efectivo");b.cCli++;
       b.aCli[b.cCli]= new Cliente( 004, "Eliza" , 344567, "Efectivo");b.cCli++;
       b.aCli[b.cCli]= new Cliente( 005, "Maria" , 23456, "Credito");b.cCli++;


      } 

    public static void insertarCliente(Cliente c) {
          Cliente emp = new Cliente();
          frmUsuario user = new frmUsuario();
       
emp.setCodCliente(c.getCodCliente());
emp.setNombre(c.getNombre());
emp.setTelefono(c.getTelefono());
emp.setTipoPago(c.getTipoPago());


        user.aCli[user.cEmp]= emp ;user.cCli++;
//        return c;
    }

    public static Cliente buscarCliente(String cod) {
        return buscarCliente(cod, null);
    }

     public static Cliente buscarCliente(String codcliente, Cliente c) {
           frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (c == null) {
                c = new Cliente() {};
            }
            for (int i = 0; i < user.cCli ; i++) {
            if (codcliente.equals(user.aCli[i].getCodCliente()) ) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            c.setCodCliente(user.aCli[pos].getCodCliente());
             c.setNombre(user.aCli[pos].getNombre());
              c.setTelefono(user.aCli[pos].getTelefono());
               c.setTipoPago(user.aCli[pos].getTipoPago());
               
            
            
        return c;
    }

    public static Cliente buscarClienteCodCliente(String numdoc) {
        return buscarClienteCodCliente(numdoc, null);
    }

     public static Cliente buscarClienteCodCliente(String numdoc, Cliente c) {
       frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (c == null) {
                c = new Cliente() {};
            }
            for (int i = 0; i < user.cCli ; i++) {
            if (numdoc.equals(user.aCli[i].getCodCliente())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            c.setCodCliente(user.aCli[pos].getCodCliente());
            c.setNombre(user.aCli[pos].getNombre());
            c.setTelefono(user.aCli[pos].getTelefono());
            c.setTipoPago(user.aCli[pos].getTipoPago());
           

        return c;
    }


    public static Cliente buscarClienteNombre(String nombre)  {
        return buscarClienteNombre(nombre, null);
    }

    public static Cliente buscarClienteNombre(String nombre, Cliente cliente)  {
         frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        
            if (cliente == null) {
                cliente = new Cliente() {};
            }
            for (int i = 0; i < user.cCli ; i++) {
            if (nombre.equals(user.aCli[i].getNombre())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }
            if (encontrado=false) {
                    return null;
                }

            cliente.setCodCliente(user.aCli[pos].getCodCliente());
            cliente.setNombre(user.aCli[pos].getNombre());
            cliente.setTelefono(user.aCli[pos].getTelefono());
            cliente.setTipoPago(user.aCli[pos].getTipoPago());
           

        return cliente;
    }

    public static boolean eliminarCliente(String codcliente)  {
        
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cCli ; i++) {
            if (codcliente.equals(user.aCli[i].getCodCliente())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j < user.cCli; j++) {
                while (user.aCli[j] != null) {
//                    user.aCli[pos].setApellido(user.aEmp[pos+1].getApellido()); user.cEmp--;        
                 user.aCli[j].equals(user.aCli[j+1]); user.cCli--;
                } 
            } 
        }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarCliente(Cliente c)  {
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        int numBuscar = c.getCodCliente();
        for (int i = 0; i < user.cCli ; i++) {
            if (numBuscar == user.aCli[i].getCodCliente()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aCli[pos].setCodCliente(c.getCodCliente());
             user.aCli[pos].setNombre(c.getNombre());
              user.aCli[pos].setTelefono(c.getTelefono());
               user.aCli[pos].setTipoPago(c.getTipoPago());
                 
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<Cliente> mostrarCliente()  {
          ArrayList<Cliente> lista = new ArrayList<Cliente>();
         frmUsuario user = new frmUsuario();
        
         
         for (int i = 0; i < user.cCli; i++) {
             if (user.aCli[i] != null) {
             Cliente cli = new Cliente();
             cli.setCodCliente(user.aCli[i].getCodCliente());
             cli.setNombre(user.aCli[i].getNombre());
             cli.setTelefono(user.aCli[i].getTelefono());
              cli.setTipoPago(user.aCli[i].getTipoPago());
 
            lista.add(cli);
             }
        }
       
        return lista;
    }
}
