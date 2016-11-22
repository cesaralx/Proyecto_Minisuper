
package VISTA;


import DATOS.*;
import MODELO.*;
import javax.swing.JOptionPane;

public class frmUsuario extends javax.swing.JFrame {

    //ARREGLOS DE OBJETOS

    public Usuario aUser[] = new Usuario[100];
    public Cliente aCli[] = new Cliente[100];
    public Producto aProd[] = new Producto[100];
     public Proveedor aProv[] = new Proveedor[100];
     public Empleado aEmp[] = new Empleado[100];
    
    //VARIABLES CONTROLADORAS
    public int cCli=0;
    public int cProd=0;
    public int cUser=0;
     public int cProv=0;
     public int cEmp=0;
    
    //VARIABLES DE USO LOCAL
     
     //OBJETOS PARA LLAMAR A OTRA VENTANA
     private frmMainMenu menu;

     
    public frmUsuario() {
        initComponents();
        //INICIALIZAR ARREGLOS
        for (int i = 0; i < 100; i++) {
            aUser[i] = new Usuario();
            aCli[i] = new Cliente();
            aProd[i] = new Producto();     
            aProv[i] = new Proveedor(); 
            aEmp[i] = new Empleado(); 
        }
      datosUsuario.insertarDatos(this); 
      datosEmpleado.insertarDatos(this);
//cargaDatos();
    
    }
    
//    private void cargaDatos(){
//        aUser[0]= new Usuario("Admin", "123", cUser);cUser++;
//        aUser[1]= new Usuario("Ventas", "123", cUser);cUser++;
//        aUser[2]= new Usuario("Supervisor", "123", cUser);cUser++;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlbContrasena = new javax.swing.JLabel();
        jpfContrasena = new javax.swing.JPasswordField();
        jbnAceptar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jlbUsuario.setText("Usuario:");

        jtfUsuario.setText("Admin");
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });

        jlbContrasena.setText("Contraseña:");

        jpfContrasena.setText("123");
        jpfContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfContrasenaKeyTyped(evt);
            }
        });

        jbnAceptar.setText("Aceptar");
        jbnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAceptarActionPerformed(evt);
            }
        });
        jbnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbnAceptarKeyPressed(evt);
            }
        });

        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbContrasena)
                            .addComponent(jlbUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfUsuario)
                            .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbContrasena)
                    .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAceptarActionPerformed
     //  JOptionPane.showConfirmDialog(this, "Saludos");
       //VALIDAR CUENTA DE USUARIO 
       
       boolean encontrado = false;
        if (!jtfUsuario.getText().isEmpty()) {
            for (int i = 0; i < cUser; i++) {
                if (aUser[i].getCuenta().equals(jtfUsuario.getText()) &&
                        aUser[i].getContrasena().equals(jpfContrasena.getText())) {
                    //EXISTIENDO USUARIO ENE L ARREGLO SE DA ACCESO AL SISTEMA
                    menu = new frmMainMenu(this);
                    menu.userLogeado = jtfUsuario.getText();
                    //Asignamos usuario a la etiqueta
                    menu.jlbUsuarios.setText("Usuario: "+jtfUsuario.getText());
                    menu.setVisible(true);
                    this.setVisible(false);
                    encontrado = true;
                    break;
                }//if-aUsr
            }//for
            if (!encontrado) 
               JOptionPane.showMessageDialog(this, "Datos incorrectos: verifique su Nombre de usuario y contraseña\n"
//                                                            +"Para conectarse use los siguientes datos de Prueba:\n"
//                                                            +"Usuario: ADMINISTRADOR\n"
//                                                            +"Contraseña: 12345678", 
                                          , "Error: Datos no Validos",JOptionPane.ERROR_MESSAGE);  
        }//if-empy
        else
            JOptionPane.showMessageDialog(this, "Datos incompletos: verifique su Nombre de usuario y contraseña\n"
//                                                            +"Para conectarse use los siguientes datos de Prueba:\n"
//                                                            +"Usuario: ADMINISTRADOR\n"
//                                                            +"Contraseña: 12345678", 
                                          , "Error: Datos no Validos",JOptionPane.ERROR_MESSAGE);  
        //else
    }//GEN-LAST:event_jbnAceptarActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbnAceptarKeyPressed
      
       boolean encontrado = false;
        if (!jtfUsuario.getText().isEmpty()) {
            for (int i = 0; i < cUser; i++) {
                if (aUser[i].getCuenta().equals(jtfUsuario.getText()) &&
                        aUser[i].getContrasena().equals(jpfContrasena.getText())) {
                    //EXISTIENDO USUARIO ENE L ARREGLO SE DA ACCESO AL SISTEMA
                    menu = new frmMainMenu(this);
                    menu.setVisible(true);
                    this.setVisible(false);
                    encontrado = true;
                    break;
                }//if-aUsr
            }//for
            if (!encontrado) 
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorectos");
        }//if-empy
        else
            JOptionPane.showMessageDialog(this, "Falta ingresar usuario");
        //else
     
    }//GEN-LAST:event_jbnAceptarKeyPressed

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
        char letra = evt.getKeyChar();
        int t = 10; //Variable que define el tamaño de la cadena
        
        if (letra == java.awt.event.KeyEvent.VK_ENTER)
            jpfContrasena.requestFocus();
            
        if(jtfUsuario.getText().length() > t)
        evt.consume();
    }//GEN-LAST:event_jtfUsuarioKeyTyped

    private void jpfContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContrasenaKeyTyped
        char letra = evt.getKeyChar();
        
        if (letra == java.awt.event.KeyEvent.VK_ENTER)
            jbnAceptar.requestFocus();
    }//GEN-LAST:event_jpfContrasenaKeyTyped

    public void limpiarCajas(){
        jtfUsuario.setText(null);
        jpfContrasena.setText(null);
    }
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbnAceptar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPasswordField jpfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
