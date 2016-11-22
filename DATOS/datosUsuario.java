/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import MODELO.Usuario;
import VISTA.frmRegUsuario;
import VISTA.frmUsuario;
import java.util.ArrayList;

/**
 *
 * @author cesaralx
 */
public abstract class datosUsuario {
    frmUsuario user;
     
     public static void insertarDatos(frmUsuario b ) {

       b.aUser[b.cUser]= new Usuario("Admin", "123", b.cUser);b.cUser++;
       b.aUser[b.cUser]= new Usuario("Ventas", "123", b.cUser);b.cUser++;
       b.aUser[b.cUser]= new Usuario("Supervisor", "123", b.cUser);b.cUser++;
    
      } 
     
     public static void insertarUsuario(frmUsuario b, frmRegUsuario u) {
         
             b.aUser[b.cUser]= new Usuario(u.cboEmpleadoU1.getSelectedItem().toString(), u.jtbPass1.getText(), Integer.parseInt(u.jtbId.getText()));b.cUser++;
         
//              u.setNumUsr(Integer.parseInt(idusuario));
//                u.setContrasena(m.aUser[pos].getContrasena());
//                u.setCuenta(m.aUser[pos].getCuenta());
           
       
    }
     
     public static Usuario buscarUsuario(String idusuario, frmUsuario m)  {
        return buscarUsuario(idusuario, m, null);
    }

    public static Usuario buscarUsuario(String idusuario, frmUsuario m, Usuario u)   {
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i   < m.cUser; i++) {
                if (idusuario.equals(m.aUser[i].getNumUsr())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            
        }
                if (u == null) {
                    u = new Usuario() {
                    };
                }
                u.setNumUsr(Integer.parseInt(idusuario));
                u.setContrasena(m.aUser[pos].getContrasena());
                u.setCuenta(m.aUser[pos].getCuenta());
            
            
            return u; 
        
    }
     
    public static boolean eliminarUsuario(String iduser)  {
         frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cUser ; i++) {
            if (iduser.equals(user.aUser[i].getNumUsr()) ) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j < user.cUser; j++) {
                while (user.aUser[j] != null) {
//                    user.aUser[pos].setApellido(user.aEmp[pos+1].getApellido()); user.cEmp--;       
                    user.aUser[j].equals(user.aUser[j+1]); user.cUser--;
                } 
            } 
        }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean actualizarUsuario(Usuario u)  {
       
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        int numBuscar = u.getNumUsr();
        for (int i = 0; i < user.cUser ; i++) {
            if (numBuscar == user.aUser[i].getNumUsr()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aUser[pos].setContrasena(u.getContrasena());
             user.aUser[pos].setCuenta(u.getCuenta());
                  user.aUser[pos].setNumUsr(u.getNumUsr());
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Usuario> mostrarUsuario()  {
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
 frmUsuario user = new frmUsuario();

        for (int i = 0; i < user.cUser; i++) {
             Usuario e = new Usuario() {};
             e.setContrasena(user.aUser[i].getContrasena());
             e.setCuenta(user.aUser[i].getCuenta());
             e.setNumUsr(user.aUser[i].getNumUsr());
 
            lista.add(e);
        }
       
        return lista;
    }
}
