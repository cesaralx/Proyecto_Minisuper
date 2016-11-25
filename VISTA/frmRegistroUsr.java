
package VISTA;

import javax.swing.JOptionPane;


public class frmRegistroUsr extends javax.swing.JFrame {

    //Creacion objeto menu
    frmMenu menu;
    frmUsuario login;
   
    public frmRegistroUsr(frmMenu m, frmUsuario l) {
        initComponents();
        menu = m;
        login = l; 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbCuenta = new javax.swing.JLabel();
        jlbContrasena = new javax.swing.JLabel();
        jlbNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jtfContrasena = new javax.swing.JTextField();
        jtfcuenta = new javax.swing.JTextField();
        jbnRegresar = new javax.swing.JButton();
        jbnRegistrar = new javax.swing.JButton();
        jbnActualizar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();
        jbnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbCuenta.setText("Cuenta");

        jlbContrasena.setText("Contraseña");

        jlbNumero.setText("Numero Usuario");

        jtfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroKeyTyped(evt);
            }
        });

        jbnRegresar.setText("Regresar");
        jbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegresarActionPerformed(evt);
            }
        });

        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jbnActualizar.setText("Actualizar");

        jbnEliminar.setText("Eliminar");
        jbnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarActionPerformed(evt);
            }
        });

        jbnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbNumero)
                            .addComponent(jlbCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbContrasena, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcuenta)
                            .addComponent(jtfContrasena)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbnActualizar)
                            .addComponent(jbnRegistrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbnRegresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCuenta)
                    .addComponent(jtfcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbContrasena)
                    .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNumero)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnBuscar)
                    .addComponent(jbnRegistrar)
                    .addComponent(jbnRegresar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnActualizar)
                    .addComponent(jbnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegresarActionPerformed
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbnRegresarActionPerformed

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        if (!jtfcuenta.getText().isEmpty() && !jtfContrasena.getText().isEmpty()
               && !jtfNumero.getText().isEmpty()){
            login.aUser[login.cUser].setCuenta(jtfcuenta.getText());
            login.aUser[login.cUser].setContrasena(jtfContrasena.getText());
            try {
                login.aUser[login.cUser].setNumUsr(Integer.parseInt(jtfNumero.getText()));
            } catch (Exception e){
                login.aUser[login.cUser].setNumUsr(0);
            }
            login.cUser++;
            JOptionPane.showMessageDialog(this, "Usuario  "+jtfcuenta.getText()+" registrado");
        }//if-valida empty
        else {
            JOptionPane.showMessageDialog(this, "Ingrese información en caja de texto");
        }
    }//GEN-LAST:event_jbnRegistrarActionPerformed

    private void jtfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroKeyTyped
        //Convertir la tecla presionada en tipo char
        char letra = evt.getKeyChar();
        //Validar si es numero 
        if (!Character.isDigit(letra)){
            getToolkit().beep();        //Emite un sonido de alerta
            evt.consume();              //Evita que el caracter aparezca en caja de texto
        }
    }//GEN-LAST:event_jtfNumeroKeyTyped

    private void jbnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmRegistroUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new frmRegistroUsr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbnActualizar;
    public javax.swing.JButton jbnBuscar;
    public javax.swing.JButton jbnEliminar;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbCuenta;
    private javax.swing.JLabel jlbNumero;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfcuenta;
    // End of variables declaration//GEN-END:variables
}