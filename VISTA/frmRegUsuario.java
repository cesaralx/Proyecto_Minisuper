
package VISTA;

import DATOS.datosEmpleado;
import DATOS.datosUsuario;
import MODELO.Empleado;
import MODELO.Usuario;
import javax.swing.JOptionPane;

/**Created on 24/11/2016, 12:06:49 AM
 *
 * @author cesaralx
 */
public class frmRegUsuario extends javax.swing.JFrame {

      //OBJETOS PARA LLAMAR A OTRA VENTANA
     private frmUsuario usr;
     
     
    public frmRegUsuario() {
        initComponents();
        frmUsuario usr = new frmUsuario();
    }

    public void BuscarUsuario() {
        Usuario u = null;
        try {
            u = datosUsuario.buscarUsuario(jtbId.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (u != null) {
            jtbPass1.setText(u.getContrasena());
            cboEmpleadoU1.setSelectedItem(u.getEmpleado().getApellido());
            jtbId.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "No exite");
        }
    }
  public void limpiarTextos()
    {
        jtbId.setText("");
        jtbPass1.setText("");
        jtbnewPassU1.setText("");
         cboEmpleadoU1.setSelectedItem("Elegir Empleado");
       
    }
    public void activarTextos(boolean t)
    {
        jtbId.setEditable(t);
        jtbPass1.setEditable(t);
        jtbnewPassU1.setEditable(t);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jtbPass1 = new javax.swing.JPasswordField();
        jtbId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboEmpleadoU1 = new javax.swing.JComboBox();
        jtbnewPassU1 = new javax.swing.JPasswordField();
        jlbIngresoPass1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jbnAgregar = new javax.swing.JButton();
        jbnNuevo = new javax.swing.JButton();
        jbnCancelar = new javax.swing.JButton();
        jbnMostrar = new javax.swing.JButton();
        jbnEditar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jbnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRAR USUARIO");

        jPanel4.setBackground(new java.awt.Color(247, 254, 255));

        jtbPass1.setEditable(false);
        jtbPass1.setText("jPasswordField1");
        jtbPass1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbPass1.setSelectionEnd(18);
        jtbPass1.setSelectionStart(6);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("EMPLEADO :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("PASSWORD :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ID :");

        cboEmpleadoU1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Empleado" }));
        cboEmpleadoU1.setToolTipText("");
        cboEmpleadoU1.setEnabled(false);
        cboEmpleadoU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpleadoU1ActionPerformed(evt);
            }
        });

        jtbnewPassU1.setEditable(false);
        jtbnewPassU1.setText("jPasswordField1");
        jtbnewPassU1.setSelectionEnd(18);
        jtbnewPassU1.setSelectionStart(6);
        jtbnewPassU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnewPassU1ActionPerformed(evt);
            }
        });

        jlbIngresoPass1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlbIngresoPass1.setText("Nuevo Password:");

        jPanel5.setBackground(new java.awt.Color(81, 105, 138));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbnAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnAgregar.setText("Agregar");
        jbnAgregar.setEnabled(false);
        jbnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAgregarActionPerformed(evt);
            }
        });

        jbnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnNuevo.setText("Nuevo");
        jbnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnNuevoActionPerformed(evt);
            }
        });

        jbnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnCancelar.setText("Cancelar");
        jbnCancelar.setEnabled(false);
        jbnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCancelarActionPerformed(evt);
            }
        });

        jbnMostrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnMostrar.setText("Mostrar");
        jbnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnMostrarActionPerformed(evt);
            }
        });

        jbnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnEditar.setText("Editar");
        jbnEditar.setEnabled(false);
        jbnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEditarActionPerformed(evt);
            }
        });

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setEnabled(false);
        jbnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarActionPerformed(evt);
            }
        });

        jbnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jbnBuscar.setText("Buscar");
        jbnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(17, 17, 17))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jlbIngresoPass1)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEmpleadoU1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtbPass1)
                                    .addComponent(jtbnewPassU1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtbId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbnBuscar)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtbPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtbnewPassU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbIngresoPass1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(cboEmpleadoU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jbnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboEmpleadoU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpleadoU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpleadoU1ActionPerformed

    private void jtbnewPassU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnewPassU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbnewPassU1ActionPerformed

    private void jbnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAgregarActionPerformed
        // TODO add your handling code here:
        if (jtbId.getText().compareTo("") != 0 && jtbPass1.getText().compareTo("") != 0) {
            Usuario u = new Usuario() {
            };
            u.setNumUsr(Integer.parseInt(jtbId.getText()));
            String pass = new String(jtbnewPassU1.getPassword());
            u.setContrasena(pass);
                datosUsuario.insertarUsuario(u );

            try {
                Empleado e = datosEmpleado.buscarEmpleadoApe((String) cboEmpleadoU1.getSelectedItem());
                u.setEmpleado(e);
                datosUsuario.insertarUsuario(u );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "[ DATOS AGREGADOS ]");
        }
    }//GEN-LAST:event_jbnAgregarActionPerformed

    private void jbnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnNuevoActionPerformed
        // TODO add your handling code here:
        jbnAgregar.setEnabled(true);
        jbnCancelar.setEnabled(true);
        jbnMostrar.setEnabled(false);
        jbnNuevo.setEnabled(false);
        jbnBuscar.setEnabled(false);
        activarTextos(true);
    }//GEN-LAST:event_jbnNuevoActionPerformed

    private void jbnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        activarTextos(false);
        jtbId.setEditable(true);
        jbnCancelar.setEnabled(false);
        jbnEliminar.setEnabled(false);
        jbnNuevo.setEnabled(true);
        jbnMostrar.setEnabled(true);
        jbnBuscar.setEnabled(true);
        jbnBuscar.setEnabled(false);
        jbnEditar.setEnabled(false);
        jlbIngresoPass1.setVisible(false);
        jtbPass1.setVisible(false);
    }//GEN-LAST:event_jbnCancelarActionPerformed

    private void jbnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnMostrarActionPerformed
        // TODO add your handling code here:
        JDListaUsuarios LU = new JDListaUsuarios(this, true);
        LU.setVisible(true);
    }//GEN-LAST:event_jbnMostrarActionPerformed

    private void jbnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEditarActionPerformed
        // TODO add your handling code here:
        Usuario u;
        
        try {
            u = datosUsuario.buscarUsuario(jtbId.getText());
            String newpass = new String(jtbnewPassU1.getPassword());
            u.setContrasena(newpass);
            System.out.print(u.getNumUsr());
            Empleado emp = datosEmpleado.buscarEmpleadoApe((String) cboEmpleadoU1.getSelectedItem());
            u.setEmpleado(emp);
            System.out.print(emp.getApellido());
            datosUsuario.actualizarUsuario(u);
            System.out.print(u.getNumUsr());
            JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
        limpiarTextos();
        jlbIngresoPass1.setVisible(false);
        jtbnewPassU1.setVisible(false);
        jbnEditar.setEnabled(false);
    }//GEN-LAST:event_jbnEditarActionPerformed

    private void jbnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Usuario u = datosUsuario.buscarUsuario(jtbId.getText() );
            if (u == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                datosUsuario.eliminarUsuario(Integer.toString(u.getNumUsr()));
                JOptionPane.showMessageDialog(null, "Se elimino Exitosamente..Okz!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        limpiarTextos();
    }//GEN-LAST:event_jbnEliminarActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        // TODO add your handling code here:
        frmMainMenu LU = new frmMainMenu(usr);
        dispose();
        LU.setVisible(true);
        
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnBuscarActionPerformed
        // TODO add your handling code here:
        if (jtbId.getText().compareTo("") != 0) {
            int result = JOptionPane.showConfirmDialog(
                this, "Deseas Buscar para Modificar \n"
                + "los Datos del Usuario?",
                "Mensaje..!!",
                JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                jlbIngresoPass1.setVisible(true);
                jtbnewPassU1.setVisible(true);
                BuscarUsuario();
                jbnEditar.setEnabled(true);
                jbnMostrar.setEnabled(false);
                jbnCancelar.setEnabled(true);
                jtbId.setEditable(false);
                jtbPass1.setEditable(false);
                jtbnewPassU1.setEditable(true);
                cboEmpleadoU1.setEnabled(false);

            }
            if (result == JOptionPane.NO_OPTION) {
                BuscarUsuario();
                jbnEliminar.setEnabled(true);
                jbnCancelar.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese ID que desea Buscar");
        }
    }//GEN-LAST:event_jbnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cboEmpleadoU1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbnAgregar;
    private javax.swing.JButton jbnBuscar;
    private javax.swing.JButton jbnCancelar;
    private javax.swing.JButton jbnEditar;
    private javax.swing.JButton jbnEliminar;
    private javax.swing.JButton jbnMostrar;
    private javax.swing.JButton jbnNuevo;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbIngresoPass1;
    public javax.swing.JTextField jtbId;
    public javax.swing.JPasswordField jtbPass1;
    private javax.swing.JPasswordField jtbnewPassU1;
    // End of variables declaration//GEN-END:variables
}
