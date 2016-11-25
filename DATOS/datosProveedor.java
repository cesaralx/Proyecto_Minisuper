/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import MODELO.Proveedor;
import VISTA.frmUsuario;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public abstract class datosProveedor {
    private frmUsuario user;
    private Proveedor cli;
    frmUsuario login;
    
     public static void insertarDatos(frmUsuario b ) {
        
//        Proveedor r = new Proveedor();
    b.aProv[b.cProv]= new Proveedor("1DF1Y54", "Panaderias bimbo SA de CV" ,955478, 54877, 
            "ventas@bimbo.com", "Mexico" ,"Calle panadera #223", "Comida", "BIMBO", "12" );b.cProv++;
            
     b.aProv[b.cProv]= new Proveedor("RET%$G", "Embotelladora la favorita" ,7841265, 805848, 
            "ventas@coca.com", "Mexico" ,"Calle refresquera #253", "Bebidas", "COCACOLA", "41" );b.cProv++;
            
     b.aProv[b.cProv]= new Proveedor("P45RER", "Carnes Finas" ,2468545, 2255545, 
            "ventas@carne.com", "Mexico" ,"Calle carniceria #5587", "Comida", "Carnes Finas", "11" );b.cProv++;
       

      } 

    public static Proveedor insertarProveedor(Proveedor prv)  {
        frmUsuario login = new frmUsuario();
//        login = u;      

         login.aProv[login.cProv].setCelular(prv.getCelular());
         login.aProv[login.cProv].setDireccion(prv.getDireccion());
         login.aProv[login.cProv].setEmail(prv.getEmail());
         login.aProv[login.cProv].setGiro(prv.getGiro());
         login.aProv[login.cProv].setLugar(prv.getLugar());
         login.aProv[login.cProv].setRazonSocial(prv.getRazonSocial());
         login.aProv[login.cProv].setRfc(prv.getRfc());
         login.aProv[login.cProv].setTelefono(prv.getTelefono());
         login.aProv[login.cProv].setNombre(prv.getNombre());
         login.aProv[login.cProv].setId(prv.getId());
         login.cProv++;
//        ps = cnn.prepareStatement("INSERT INTO PROVEEDOR (ruc, razonsocial, telefono,celular,email, lugar, direccion, tipo) VALUES (?,?,?,?,?,?,?,?)");
        return prv;
    }

    public static Proveedor buscarProveedor(String id)   {
        return buscarProveedor(id, null);
    }

    public static Proveedor buscarProveedor(String id, Proveedor prv)   {
         frmUsuario user = new frmUsuario();
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cProv; i++) {
                if (id.equals(user.aProv[i].getId()) ) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (prv == null) {
                    prv = new Proveedor() {
                    };
                }
                prv.setCelular(user.aProv[pos].getCelular());
                 prv.setDireccion(user.aProv[pos].getDireccion());
                  prv.setEmail(user.aProv[pos].getEmail());
                   prv.setGiro(user.aProv[pos].getGiro());
                    prv.setId(user.aProv[pos].getId());
                     prv.setLugar(user.aProv[pos].getLugar());
                      prv.setNombre(user.aProv[pos].getNombre());
                       prv.setRazonSocial(user.aProv[pos].getRazonSocial());
                        prv.setRfc(user.aProv[pos].getRfc());
                         prv.setTelefono(user.aProv[pos].getTelefono());
                 
    
        return prv;
    }

    public static boolean eliminarProveedor(String id)   {
              frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i <= user.cProv ; i++) {
            if (id.equals(user.aProv[i].getId())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j <= user.cProv; j++) {
                if (user.aProv[j].getId() != null) {  
                    user.aProv[j].equals(user.aProv[j+1]); user.cProv--;
                } 
            } 
        }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean actualizarProveedor(Proveedor p)   {
          frmUsuario user = new frmUsuario();
        boolean encontrado = false;
        int pos=0;
        String idP = p.getId();
        
        for (int i = 0; i < user.cProv ; i++) {
            if (idP.equals(user.aProv[i].getId())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aProv[pos].setCelular(p.getCelular());
        user.aProv[pos].setDireccion(p.getDireccion());
        user.aProv[pos].setEmail(p.getEmail());
        user.aProv[pos].setGiro(p.getGiro());
        user.aProv[pos].setId(p.getId());
        user.aProv[pos].setLugar(p.getLugar());
        user.aProv[pos].setNombre(p.getNombre());
        user.aProv[pos].setRazonSocial(p.getRazonSocial());
        user.aProv[pos].setRfc(p.getRfc());
        user.aProv[pos].setTelefono(p.getTelefono());
 
        
  
        if (encontrado == true) 
            return true;
         else 
            return false;

    }

    public static ArrayList<Proveedor> mostrarProveedor()   {
        
        ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
        frmUsuario user = new frmUsuario();
 
        for (int i = 0; i < user.cProv; i++) {
             if (user.aProv[i] != null) {  
               Proveedor e = new Proveedor() {};
                e.setCelular(user.aProv[i].getCelular());
                e.setDireccion(user.aProv[i].getDireccion());
                e.setEmail(user.aProv[i].getEmail());
                e.setGiro(user.aProv[i].getGiro());
                e.setId(user.aProv[i].getId());
                e.setLugar(user.aProv[i].getLugar());
                e.setNombre(user.aProv[i].getNombre());
                e.setRazonSocial(user.aProv[i].getRazonSocial());
                e.setRfc(user.aProv[i].getRfc());
                e.setTelefono(user.aProv[i].getTelefono());
               
            lista.add(e);
            }
        }
      
        return lista;

    }
}
