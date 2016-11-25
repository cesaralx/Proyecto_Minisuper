/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DATOS;

import MODELO.Transaccion;
import VISTA.frmUsuario;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public abstract class datosTransaccion {
    frmUsuario user;
    Transaccion tra;


     public static void insertarTransaccion(Transaccion t)  {
      Transaccion tra = new Transaccion();
          frmUsuario user = new frmUsuario();
   
        tra.setCantidad(t.getCantidad());
        tra.setCompra(t.getCompra());
        tra.setProducto(t.getProducto());

        user.aTran[user.cTran]= tra ;user.cTran++;

    }

    public static boolean eliminarTransaccion(int idcomp,int idprod)  {
           frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cTran ; i++) {
            if (idcomp == user.aTran[i].getCompra().getIdCompra()&& idprod == user.aTran[i].getProducto().getIdProducto()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
      
            
            for (int j = pos; j < user.cTran; j++) {
                 if (user.aTran[j] != null) {  
               
                    user.aTran[j].equals(user.aTran[j+1]); user.cTran--;
                }else
                     break;
            }
        
    }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Transaccion> mostrarTransaccion()  {
    
        ArrayList<Transaccion> lista = new ArrayList<Transaccion>();
frmUsuario user = new frmUsuario();
        
         
         for (int i = 0; i < user.cCli; i++) {
             if (user.aCli[i] != null) {
             Transaccion tran = new Transaccion();
             tran.setCantidad(user.aTran[i].getCantidad());
              tran.setCompra(user.aTran[i].getCompra());
               tran.setProducto(user.aTran[i].getProducto());
             
 
            lista.add(tran);
             }
        }
       
        return lista;
    }
}
