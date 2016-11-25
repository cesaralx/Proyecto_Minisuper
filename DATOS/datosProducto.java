/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DATOS;

import MODELO.Categoria;
import MODELO.Producto;
import VISTA.frmUsuario;
import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public abstract class datosProducto {
    private frmUsuario user;
   private Producto pro; Categoria r;
    

     public static void insertarDatos(frmUsuario b ) {
        
    Categoria r = new Categoria();
       b.aProd[b.cProd]= new Producto(1, "Cocacola" ,9, b.aCat[b.cProd], 75, "c:");b.cProd++;
        b.aProd[b.cProd]= new Producto(1, "Leche" ,14, r, 75, "c:");b.cProd++;
         b.aProd[b.cProd]= new Producto(1, "Pan Dulce" ,85, r, 75, "c:");b.cProd++;

      } 
    
    public static Producto insertarProducto(Producto p)  {
        frmUsuario user = new frmUsuario();

         user.aProd[user.cProd].setCategoria(p.getCategoria());
         user.aProd[user.cProd].setIdProducto(p.getIdProducto());
         user.aProd[user.cProd].setImagen(p.getImagen());
         user.aProd[user.cProd].setNombre(p.getNombre());
         user.aProd[user.cProd].setPreciounidad(p.getPreciounidad());
         user.aProd[user.cProd].setStock(p.getStock());
         user.cProd++;

        return p;
    }

    public static Producto buscarProducto(int idprod)  {
        return buscarProducto(idprod, null);
    }

    public static Producto buscarProducto(int idprod, Producto p)  {
        frmUsuario user = new frmUsuario();
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cUser; i++) {
                if (idprod == user.aProd[i].getIdProducto()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (p == null) {
                    p = new Producto() {
                    };
                }
                p.setIdProducto(user.aProd[pos].getIdProducto());
                 p.setCategoria(user.aProd[pos].getCategoria());
                  p.setImagen(user.aProd[pos].getImagen());
                   p.setNombre(user.aProd[pos].getNombre());
                    p.setPreciounidad(user.aProd[pos].getPreciounidad());
                     p.setStock(user.aProd[pos].getStock());
         return p;
    }

     public static Producto buscarProductoNombre(String nom)  {
        return buscarProductoNombre(nom, null);
    }

    public static Producto buscarProductoNombre(String nom, Producto p)  {
       frmUsuario user = new frmUsuario();
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cUser; i++) {
                if (nom == user.aProd[i].getNombre()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (p == null) {
                    p = new Producto() {
                    };
                }
                p.setIdProducto(user.aProd[pos].getIdProducto());
                 p.setCategoria(user.aProd[pos].getCategoria());
                  p.setImagen(user.aProd[pos].getImagen());
                   p.setNombre(user.aProd[pos].getNombre());
                    p.setPreciounidad(user.aProd[pos].getPreciounidad());
                     p.setStock(user.aProd[pos].getStock());
         return p;
    }


    public static Producto buscarProductoSinIm(int idprod)   {
        return buscarProductoSinIm(idprod, null);
    }

    public static Producto buscarProductoSinIm(int idprod, Producto p)  {
       frmUsuario user = new frmUsuario();
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cUser; i++) {
                if (idprod == user.aProd[i].getIdProducto()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (p == null) {
                    p = new Producto() {
                    };
                }
                p.setIdProducto(user.aProd[pos].getIdProducto());
                 p.setCategoria(user.aProd[pos].getCategoria());
//                  p.setImagen(user.aProd[pos].getImagen());
                   p.setNombre(user.aProd[pos].getNombre());
                    p.setPreciounidad(user.aProd[pos].getPreciounidad());
                     p.setStock(user.aProd[pos].getStock());
         return p;
    }

    public static Producto buscarProductoCateg(int codcateg)   {
        return buscarProductoCateg(codcateg, null);
    }

    public static Producto buscarProductoCateg(int codcateg, Producto p)  {
        frmUsuario user = new frmUsuario();
        int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cUser; i++) {
                if (codcateg == user.aProd[i].getCategoria().getCodcateg()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (p == null) {
                    p = new Producto() {    
                    };
                }
                p.setIdProducto(user.aProd[pos].getIdProducto());
                 p.setCategoria(user.aProd[pos].getCategoria());
                  p.setImagen(user.aProd[pos].getImagen());
                   p.setNombre(user.aProd[pos].getNombre());
                    p.setPreciounidad(user.aProd[pos].getPreciounidad());
                     p.setStock(user.aProd[pos].getStock());
         return p;
    }

    public static boolean eliminarProducto(int idprod)   {
              frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cProd ; i++) {
            if (idprod == user.aProd[i].getIdProducto() ) {
                    encontrado = true;
                    pos = i;
                    break;
                }
            for (int j = pos; j < user.cUser; j++) {
                while (user.aProd[j] != null) {  
                    user.aProd[j].equals(user.aProd[j+1]); user.cProd--;
                } 
            } 
        }  
        
        if (encontrado == true ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean actualizarProducto(Producto p) {
        frmUsuario user = new frmUsuario();
        boolean encontrado = false;
        int pos=0;
        int idP = p.getIdProducto();
        
        for (int i = 0; i < user.cProd ; i++) {
            if (idP == user.aProd[i].getIdProducto()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aProd[pos].setCategoria(p.getCategoria());
        user.aProd[pos].setIdProducto(p.getIdProducto());
        user.aProd[pos].setImagen(p.getImagen());
        user.aProd[pos].setNombre(p.getNombre());
        user.aProd[pos].setPreciounidad(p.getPreciounidad());
        user.aProd[pos].setStock(p.getStock());
  
        if (encontrado == true) 
            return true;
         else 
            return false;
        
    }

     public static ArrayList<Producto> mostrarProducto()   {
       
        ArrayList<Producto> lista = new ArrayList<Producto>();
        frmUsuario user = new frmUsuario();
 
        for (int i = 0; i < user.cProd; i++) {
             if (user.aProd[i] != null) {  
               Producto e = new Producto() {};
               e.setCategoria(user.aProd[i].getCategoria());
                e.setIdProducto(user.aProd[i].getIdProducto());
                 e.setImagen(user.aProd[i].getImagen());
                  e.setNombre(user.aProd[i].getNombre());
                   e.setPreciounidad(user.aProd[i].getPreciounidad());
                    e.setStock(user.aProd[i].getStock());
            lista.add(e);
            }
        }
      
        return lista;
    }
}
