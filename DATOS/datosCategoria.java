/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import MODELO.Categoria;
import VISTA.frmUsuario;
import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public abstract class datosCategoria {
    frmUsuario user;
    Categoria cat;
    
    public static void insertarDatos(frmUsuario b ) {
        
    Categoria cat = new Categoria();
       b.aCat[b.cCat]= new Categoria(1, "Bebidas" ,"c:");b.cCat++;
        b.aCat[b.cCat]= new Categoria(2, "Comida" ,"c:");b.cCat++;
         b.aCat[b.cCat]= new Categoria(5, "cuidado Personal" ,"c:");b.cCat++;

      } 

    public static void insertarCategoria(Categoria cat)  {
        
           frmUsuario user = new frmUsuario();

         user.aCat[user.cCat].setCodcateg(cat.getCodcateg());
         user.aCat[user.cCat].setImagen(cat.getImagen());
         user.aCat[user.cCat].setNomcateg(cat.getNomcateg());
         user.cProd++;
    }

    public static Categoria buscarCategoria(int codcateg)  {
      frmUsuario user = new frmUsuario();
        Categoria cat = null;
         int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cCat; i++) {
                if (codcateg == user.aCat[i].getCodcateg()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (cat == null) {
                    cat = new Categoria() {
                    };
                }
             cat.setCodcateg(user.aCat[pos].getCodcateg());
             cat.setImagen(user.aCat[pos].getImagen());
             cat.setNomcateg(user.aCat[pos].getNomcateg());
        return cat;
    }

    public static Categoria buscarCategoriaNomCM(String nomcat)  {
      frmUsuario user = new frmUsuario();
        Categoria cat = null;
         int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cCat; i++) {
                if (nomcat.equals(user.aCat[i].getNomcateg())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (cat == null) {
                    cat = new Categoria() {
                    };
                }
             cat.setCodcateg(user.aCat[pos].getCodcateg());
             cat.setImagen(user.aCat[pos].getImagen());
             cat.setNomcateg(user.aCat[pos].getNomcateg());
        return cat;
    }

    public static Categoria buscarCategoriaNom(String nomcat)  {
         frmUsuario user = new frmUsuario();
        Categoria cat = null;
         int pos=0;
           boolean encontrado  = false;
            
            for (int i = 0;i < user.cCat; i++) {
                if (nomcat.equals(user.aCat[i].getNomcateg())) {
                    encontrado = true;
                    pos = i;
                    break;
                }
           }   
                if (cat == null) {
                    cat = new Categoria() {
                    };
                }
             cat.setCodcateg(user.aCat[pos].getCodcateg());
//             cat.setImagen(user.aCat[pos].getImagen());
             cat.setNomcateg(user.aCat[pos].getNomcateg());
        return cat;
    }

    public static boolean eliminarCategoria(int codcateg)   {
        frmUsuario user = new frmUsuario();
        int pos=0;
        boolean encontrado=false;

        for (int i = 0; i < user.cCat ; i++) {
            if (codcateg == user.aCat[i].getCodcateg()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
      
            
            for (int j = pos; j < user.cCat; j++) {
                 if (user.aCat[j] != null) {  
               
                    user.aCat[j].equals(user.aCat[j+1]); user.cCat--;
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

   /* public static boolean eliminarCategNom(String nombre) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("delete from CATEGORIA WHERE nombre=?");
        ps.setString(1, nombre);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }*/

    public static boolean actualizarCategoria(Categoria cat) {
        
        frmUsuario user = new frmUsuario();
        boolean encontrado = false;
        int pos=0;
        int idC = cat.getCodcateg();
        
        for (int i = 0; i < user.cCat ; i++) {
            if (idC == user.aCat[i].getCodcateg()) {
                    encontrado = true;
                    pos = i;
                    break;
                }
        }
        
        user.aCat[pos].setCodcateg(cat.getCodcateg());
        user.aCat[pos].setImagen(cat.getImagen());
        user.aCat[pos].setNomcateg(cat.getNomcateg());
     
        if (encontrado == true) 
            return true;
         else 
            return false;
    }

    public static ArrayList<Categoria> mostrarCategoria() {
   
        ArrayList<Categoria> lista = new ArrayList<Categoria>();

 
          frmUsuario user = new frmUsuario();
 
        for (int i = 0; i < user.cCat; i++) {
             if (user.aCat[i] != null) {  
               Categoria e = new Categoria() {};
               e.setCodcateg(user.aCat[i].getCodcateg());
                e.setImagen(user.aCat[i].getImagen());
                 e.setNomcateg(user.aCat[i].getNomcateg());
                  
            lista.add(e);
            }
        }
      
        return lista;
    }
}
