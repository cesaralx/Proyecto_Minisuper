/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmCliente.java
 *
 * Created on 24/11/2016, 12:06:49 AM
 */
package VISTA;

import java.awt.Toolkit;
import MODELO.Cliente;
import DATOS.datosCliente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DANY
 */
public class frmRegCliente extends javax.swing.JFrame {

    /** Creates new form FrmCliente */
    public frmRegCliente() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    /*
     * Buscar Cliente
     */
    public void buscarCliente() {
        Cliente c = null;
        try {
            c = datosCliente.buscarCliente(jtfCodigoCl.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (c != null) {
            jtfCodigoCl.setText(String.valueOf(c.getCodCliente()));
            jtfNombreC.setText(c.getNombre());
//            jtfNomDocumentoC.setText(c.get());
//            jtfNumDocumentoC.setText(String.valueOf(c.getNumDocumento()));
            jtfTelefonoC.setText(Integer.toString(c.getTelefono()));
            jbnEditarC.setEnabled(true);
            jbnCancelarC.setEnabled(true);
            if (jtfNomDocumentoC.getText().equalsIgnoreCase("RUC")) {
                jlbJuridico.setSelected(true);
            } else {
                jlbNatural.setSelected(true);
            }
        } else {
            jbnEditarC.setEnabled(false);
            jbnEliminarC.setEnabled(false);
            jbnCancelarC.setEnabled(false);
            jtfCodigoCl.setEditable(true);
            JOptionPane.showMessageDialog(null, "No exite");
        }
        jbnMostrarC.setEnabled(true);
        jbnCancelarC.setEnabled(true);
        jtfCodigoCl.setEditable(false);
        jbnBuscarC.setEnabled(false);
    }
    /*
     *
     */

    public void limpiarTextos() {
        jtfCodigoCl.setText("");
        jtfNombreC.setText("");
        jtfNomDocumentoC.setText("Nombre del Documento");
        jtfNumDocumentoC.setText("");
        jtfTelefonoC.setText("");
        jlbJuridico.setSelected(false);
        jlbNatural.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbngTipoCliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlbCodigo = new javax.swing.JLabel();
        jtfNombreC = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        jlbNatural = new javax.swing.JRadioButton();
        jlbTipoC = new javax.swing.JLabel();
        jlbJuridico = new javax.swing.JRadioButton();
        jlbNomDoc = new javax.swing.JLabel();
        jtfNomDocumentoC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfNumDocumentoC = new javax.swing.JTextField();
        jbnBuscarC = new javax.swing.JButton();
        jlbTel = new javax.swing.JLabel();
        jtfTelefonoC = new javax.swing.JFormattedTextField();
        jbnNuevoC = new javax.swing.JButton();
        jbntAgregarC = new javax.swing.JButton();
        jbnEliminarC = new javax.swing.JButton();
        jbnEditarC = new javax.swing.JButton();
        jbnCancelarC = new javax.swing.JButton();
        jbnMostrarC = new javax.swing.JButton();
        jbnSalirC = new javax.swing.JButton();
        jtfCodigoCl = new javax.swing.JTextField();
        jlbRegTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 99, 138));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(247, 254, 255));

        jlbCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbCodigo.setText("Codigo:");

        jtfNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreCKeyTyped(evt);
            }
        });

        jlbNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbNombre.setText("Nombre:");

        jlbNatural.setBackground(new java.awt.Color(247, 254, 255));
        jbngTipoCliente.add(jlbNatural);
        jlbNatural.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbNatural.setText("C.Natural");
        jlbNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbNaturalActionPerformed(evt);
            }
        });

        jlbTipoC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbTipoC.setText("Tipo de Cliente:");

        jlbJuridico.setBackground(new java.awt.Color(247, 254, 255));
        jbngTipoCliente.add(jlbJuridico);
        jlbJuridico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbJuridico.setText("C.Juridico");
        jlbJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbJuridicoActionPerformed(evt);
            }
        });

        jlbNomDoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbNomDoc.setText("Nombre del Documento:");

        jtfNomDocumentoC.setEditable(false);
        jtfNomDocumentoC.setBackground(new java.awt.Color(247, 254, 255));
        jtfNomDocumentoC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNomDocumentoC.setText("Nombre del Documento");
        jtfNomDocumentoC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Numero de Documento:");

        jtfNumDocumentoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumDocumentoCActionPerformed(evt);
            }
        });

        jbnBuscarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnBuscarC.setText(".....");
        jbnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBuscarCActionPerformed(evt);
            }
        });

        jlbTel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbTel.setText("Telefono:");

        try {
            jtfTelefonoC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbnNuevoC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnNuevoC.setText("Nuevo");
        jbnNuevoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnNuevoCActionPerformed(evt);
            }
        });

        jbntAgregarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbntAgregarC.setText("Agregar");
        jbntAgregarC.setEnabled(false);
        jbntAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntAgregarCActionPerformed(evt);
            }
        });

        jbnEliminarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnEliminarC.setText("Eliminar");
        jbnEliminarC.setEnabled(false);
        jbnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarCActionPerformed(evt);
            }
        });

        jbnEditarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnEditarC.setText("Editar");
        jbnEditarC.setEnabled(false);
        jbnEditarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEditarCActionPerformed(evt);
            }
        });

        jbnCancelarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnCancelarC.setText("Cancelar");
        jbnCancelarC.setEnabled(false);
        jbnCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCancelarCActionPerformed(evt);
            }
        });

        jbnMostrarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnMostrarC.setText("Mostrar");
        jbnMostrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnMostrarCActionPerformed(evt);
            }
        });

        jbnSalirC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbnSalirC.setText("Salir");
        jbnSalirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbNomDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNomDocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbTipoC)
                                .addGap(18, 18, 18)
                                .addComponent(jlbJuridico)
                                .addGap(18, 18, 18)
                                .addComponent(jlbNatural))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbnNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbntAgregarC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbnCancelarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbnMostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jlbNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfNombreC))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfNumDocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jlbTel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCodigoCl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbnBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbnSalirC, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigoCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnBuscarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jtfNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTipoC)
                    .addComponent(jlbJuridico)
                    .addComponent(jlbNatural))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomDoc)
                    .addComponent(jtfNomDocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlbTel)
                    .addComponent(jtfTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumDocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbnMostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbntAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnSalirC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jlbRegTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jlbRegTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbRegTitulo.setText("REGISTRO DE CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jlbRegTitulo)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRegTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumDocumentoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumDocumentoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumDocumentoCActionPerformed

    private void jtfNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreCKeyTyped
        // TODO add your handling code here:
        if (!String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreCKeyTyped

    private void jbnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnBuscarCActionPerformed
        // TODO add your handling code here:
        if (jtfCodigoCl.getText().compareTo("") != 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "Deseas Buscar al Cliente para Modificarlo?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                buscarCliente();
                jbnEditarC.setEnabled(true);
            }
            if (result == JOptionPane.NO_OPTION) {
                buscarCliente();
                jbnEliminarC.setEnabled(true);
                jbnEditarC.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Codigo del Cliente a Buscar");
        }
    }//GEN-LAST:event_jbnBuscarCActionPerformed

    private void jbntAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntAgregarCActionPerformed
        // TODO add your handling code here:

        if (jtfCodigoCl.getText().compareTo("") != 0 && jtfNombreC.getText().compareTo("") != 0
                && (jlbJuridico.isSelected() == true || jlbNatural.isSelected() == true)
                && jtfNumDocumentoC.getText().compareTo("") != 0 && jtfTelefonoC.getText().compareTo("") != 0) {
            Cliente c = new Cliente() {
            };
            c.setCodCliente(Integer.parseInt(jtfCodigoCl.getText()));
            c.setNombre(jtfNombreC.getText());
//            c.setNomDocumento(jtfNomDocumentoC.getText());
//            c.setNumDocumento(jtfNumDocumentoC.getText());
            c.setTelefono(Integer.parseInt(jtfTelefonoC.getText()));
            try {
                datosCliente.insertarCliente(c);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            limpiarTextos();
        } else {
            JOptionPane.showMessageDialog(null, "Llene Todos Los Campos..OKz");
        }
    }//GEN-LAST:event_jbntAgregarCActionPerformed

    private void jbnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarCActionPerformed
        // TODO add your handling code here:
        try {
            Cliente d = datosCliente.buscarCliente(jtfCodigoCl.getText());
            if (d == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                datosCliente.eliminarCliente(Integer.toString(d.getCodCliente()));
                JOptionPane.showMessageDialog(null, "Se elimino Exitosamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        limpiarTextos();
    }//GEN-LAST:event_jbnEliminarCActionPerformed

    private void jbnEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEditarCActionPerformed
        // TODO add your handling code here
        Cliente c;
        try {
            c = datosCliente.buscarCliente(jtfCodigoCl.getText());
            c.setNombre(jtfNombreC.getText());
//            c.setNomDocumento(jtfNomDocumentoC.getText());
//            c.setNumDocumento(jtfNumDocumentoC.getText());
            c.setTelefono(Integer.parseInt(jtfTelefonoC.getText()));
            datosCliente.actualizarCliente(c);
            JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
        limpiarTextos();
    }//GEN-LAST:event_jbnEditarCActionPerformed

    private void jbnCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCancelarCActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        jtfCodigoCl.setEditable(true);
        jbntAgregarC.setEnabled(false);
        jbnCancelarC.setEnabled(false);
        jbnBuscarC.setEnabled(true);
        jbnNuevoC.setEnabled(true);
    }//GEN-LAST:event_jbnCancelarCActionPerformed

    private void jbnMostrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnMostrarCActionPerformed
        // TODO add your handling code here:
        JDListaClientes lc = new JDListaClientes(this, true);
        lc.setVisible(true);
    }//GEN-LAST:event_jbnMostrarCActionPerformed

    private void jbnNuevoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnNuevoCActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        jtfCodigoCl.setEditable(true);
        jbntAgregarC.setEnabled(true);
        jbnCancelarC.setEnabled(true);
        jbnBuscarC.setEnabled(false);
        jbnNuevoC.setEnabled(false);
    }//GEN-LAST:event_jbnNuevoCActionPerformed

    private void jbnSalirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirCActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbnSalirCActionPerformed

    private void jlbJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbJuridicoActionPerformed
        // TODO add your handling code here:
        if (jlbJuridico.isSelected()) {
            jtfNomDocumentoC.setText("RUC");
        }
    }//GEN-LAST:event_jlbJuridicoActionPerformed

    private void jlbNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbNaturalActionPerformed
        // TODO add your handling code here:
        if (jlbNatural.isSelected()) {
            jtfNomDocumentoC.setText("DNI");
        }
    }//GEN-LAST:event_jlbNaturalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmRegCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbnBuscarC;
    private javax.swing.JButton jbnCancelarC;
    private javax.swing.JButton jbnEditarC;
    private javax.swing.JButton jbnEliminarC;
    private javax.swing.JButton jbnMostrarC;
    private javax.swing.JButton jbnNuevoC;
    private javax.swing.JButton jbnSalirC;
    private javax.swing.ButtonGroup jbngTipoCliente;
    private javax.swing.JButton jbntAgregarC;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JRadioButton jlbJuridico;
    private javax.swing.JRadioButton jlbNatural;
    private javax.swing.JLabel jlbNomDoc;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbRegTitulo;
    private javax.swing.JLabel jlbTel;
    private javax.swing.JLabel jlbTipoC;
    private javax.swing.JTextField jtfCodigoCl;
    private javax.swing.JTextField jtfNomDocumentoC;
    private javax.swing.JTextField jtfNombreC;
    private javax.swing.JTextField jtfNumDocumentoC;
    private javax.swing.JFormattedTextField jtfTelefonoC;
    // End of variables declaration//GEN-END:variables
}