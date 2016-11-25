
package VISTA;

import javax.swing.JOptionPane;


public class frmMenu extends javax.swing.JFrame {

 //OBJETOS PARA RELACIONAR CON ONTRAS VENTANAS
    private frmUsuario login;
    frmRegistroUsr regUsr;
    frmListaUser ListadoUser;
           
    //Variablesde clase
    public String userLogeado;
     
    public frmMenu(frmUsuario x) {
        initComponents();
        login = x;
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbUsuarios = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmeUsuarios = new javax.swing.JMenu();
        jmiRegistrarUsr = new javax.swing.JMenuItem();
        jmiBuscar = new javax.swing.JMenuItem();
        jmiListaUser = new javax.swing.JMenuItem();
        jmeLibros = new javax.swing.JMenu();
        jmiRegistrarLibro = new javax.swing.JMenuItem();
        jmePrestamos = new javax.swing.JMenu();
        jmeCerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jlbUsuarios.setText("Usuario:");

        jmeUsuarios.setText("Usuarios");

        jmiRegistrarUsr.setText("Registrar");
        jmiRegistrarUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarUsrActionPerformed(evt);
            }
        });
        jmeUsuarios.add(jmiRegistrarUsr);

        jmiBuscar.setText("Buscar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jmeUsuarios.add(jmiBuscar);

        jmiListaUser.setText("Usuarios");
        jmiListaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaUserActionPerformed(evt);
            }
        });
        jmeUsuarios.add(jmiListaUser);

        jMenuBar1.add(jmeUsuarios);

        jmeLibros.setText("Libros");

        jmiRegistrarLibro.setText("Registrar");
        jmeLibros.add(jmiRegistrarLibro);

        jMenuBar1.add(jmeLibros);

        jmePrestamos.setText("Prestamos");
        jMenuBar1.add(jmePrestamos);

        jmeCerrar.setText("Cerrar Sesion");
        jmeCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmeCerrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmeCerrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 360, Short.MAX_VALUE)
                .addComponent(jlbUsuarios))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbUsuarios)
                .addGap(0, 265, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmeCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmeCerrarMouseClicked
     login.setVisible(true);
     login.limpiarCajas();
        this.dispose();
    }//GEN-LAST:event_jmeCerrarMouseClicked

    private void jmiRegistrarUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarUsrActionPerformed
      frmRegistroUsr regUsr = new frmRegistroUsr(this, login);
      if (userLogeado.equals("Admin")|| userLogeado.equals("Supervisor")){
          /*regUsr.jbnActualizar.setVisible(true);
          regUsr.jbnEliminar.setVisible(true);*/
          regUsr.setVisible(true);
          this.setVisible(false);
      }else{
          regUsr.jbnActualizar.setVisible(false);
          regUsr.jbnEliminar.setVisible(false); 
          regUsr.jbnBuscar.setVisible(true);
          JOptionPane.showMessageDialog(this, "No cuentas con los permisos.");
      }
    }//GEN-LAST:event_jmiRegistrarUsrActionPerformed

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        frmRegistroUsr regUsr = new frmRegistroUsr(this, login);
      if (userLogeado.equals("Admin")|| userLogeado.equals("Supervisor")){
          /*regUsr.jbnActualizar.setVisible(true);
          regUsr.jbnEliminar.setVisible(true);*/
          
          regUsr.setVisible(true);
          this.setVisible(false);
      }else{
          regUsr.jbnActualizar.setVisible(false);
          regUsr.jbnEliminar.setVisible(false); 
          regUsr.jbnBuscar.setVisible(true);
          JOptionPane.showMessageDialog(this, "No cuentas con los permisos.");
      }
    }//GEN-LAST:event_jmiBuscarActionPerformed

    private void jmiListaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaUserActionPerformed
        ListadoUser = new frmListaUser(this, login);
        ListadoUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiListaUserActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel jlbUsuarios;
    private javax.swing.JMenu jmeCerrar;
    private javax.swing.JMenu jmeLibros;
    private javax.swing.JMenu jmePrestamos;
    private javax.swing.JMenu jmeUsuarios;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiListaUser;
    private javax.swing.JMenuItem jmiRegistrarLibro;
    private javax.swing.JMenuItem jmiRegistrarUsr;
    // End of variables declaration//GEN-END:variables
}
