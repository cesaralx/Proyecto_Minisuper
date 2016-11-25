/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import MODELO.Compra;
import VISTA.frmUsuario;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public abstract class datosCompra {
    frmUsuario user;
    Compra compra;

    public static void insertarCompra(Compra comp)  {
        
         frmUsuario user = new frmUsuario();

         user.aCom[user.cCom].setCliente(comp.getCliente());
         user.aCom[user.cCom].setEmpleado(comp.getEmpleado());
         user.aCom[user.cCom].setFechaCompra(comp.getFechaCompra());
         user.aCom[user.cCom].setIdCompra(comp.getIdCompra());
         user.aCom[user.cCom].setTipoComprobante(comp.getTipoComprobante());
        
         user.cProd++;

//        return comp;

    }

    public static Compra buscarCompra(int idcompra) {
        frmUsuario user = new frmUsuario();
        Compra cat = null;
         int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cCom; i++) {
                if (idcompra == user.aCom[i].getIdCompra()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (cat == null) {
                    cat = new Compra() {
                    };
                }
             cat.setCliente(user.aCom[pos].getCliente());
             cat.setEmpleado(user.aCom[pos].getEmpleado());
             cat.setFechaCompra(user.aCom[pos].getFechaCompra());
             cat.setIdCompra(user.aCom[pos].getIdCompra());
             cat.setTipoComprobante(user.aCom[pos].getTipoComprobante());
        return cat;
    }

    public static boolean eliminarCompra(int idCompra)  {
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;
        int numBuscar = idCompra;
        for (int i = 0; i < user.cCom ; i++) {
            if (numBuscar == user.aCom[i].getIdCompra()) {
                    encontrado = true;
                    pos = i;
                    }
            for (int j = pos; j < user.cCom; j++) {
                if (user.aCom[j] != null) {       
                 user.aCom[j].equals(user.aCom[j+1]); user.cCom--;
                } 
            } 
        }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Compra> mostrarCompra() {
       
        ArrayList<Compra> lista = new ArrayList<Compra>();

        frmUsuario user = new frmUsuario();
        
         
         for (int i = 0; i < user.cCom; i++) {
             if (user.aCom[i] != null) {
             Compra cli = new Compra();
             cli.setCliente(user.aCom[i].getCliente());
             cli.setEmpleado(user.aCom[i].getEmpleado());
             cli.setFechaCompra(user.aCom[i].getFechaCompra());
              cli.setIdCompra(user.aCom[i].getIdCompra());
               cli.setTipoComprobante(user.aCom[i].getTipoComprobante());
 
            lista.add(cli);
             }
        }
       
        return lista;
    }
}
