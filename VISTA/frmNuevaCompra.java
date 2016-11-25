/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmNuevaCompra.java
 *
 * Created on 22/08/2010, 10:14:19 AM
 */
package VISTA;

import MODELO.Cliente;
import MODELO.Empleado;
import MODELO.Compra;
import DATOS.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Richard
 */
public class frmNuevaCompra extends javax.swing.JFrame {

    /** Creates new form FrmNuevaCompra */
    public frmNuevaCompra() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
         try {
           
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select max(idcompra) from COMPRA ");
            while (rs.next()) {
                int lastID = rs.getInt(1);
                jtbNroCompra.setText(String.valueOf(lastID + 1));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException error) {
            System.out.print(error);
        }
    }

    public void activarbotones(boolean b) {
        jbnNuevoComp.setEnabled(b);
        jbnAgregarProdComp.setEnabled(!b);
        jbnAgregarUsComp.setEnabled(!b);
        jbnBuscarCliente.setEnabled(!b);
        jbnCancelarComp.setEnabled(!b);
    }

    public void limpiartextos() {
        jtfCodCliente.setText("");
        jtfDatoClienteComp.setText("");
    }

    public void activartextos(boolean b) {
        jtfCodCliente.setEditable(b);
        jtfDatoClienteComp.setEditable(b);
    }

    public void AgregarCompra() {
        Compra c = new Compra() {
        };
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {

            fecha = formatoDelTexto.parse(jtfFechaActual.getText());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        c.setIdCompra(Integer.parseInt(jtbNroCompra.getText()));
        c.setFechaCompra((Date) fecha);
        c.setTipoComprobante((String) cboTipoComprobante.getSelectedItem());
        try {
            Empleado emp = datosEmpleado.buscarEmpleadoApe(lbldatosEmp.getText());
            c.setEmpleado(emp);
            Cliente cl = datosCliente.buscarCliente(jtfCodCliente.getText());
            c.setCliente(cl);
            datosCompra.insertarCompra(c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
    }

    public void buscarClienteCod(String Cod) {
        Cliente c = null;
        try {
            c = datosCliente.buscarCliente(Cod);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (c != null) {
            jtfCodCliente.setText(String.valueOf(c.getCodCliente()));
            jtfDatoClienteComp.setText(c.getNombre());
            jtfDocumentoC.setText(c.getTipoPago());
            jtfTelefComp.setText(Integer.toString(c.getTelefono()));
        } else {
            JOptionPane.showMessageDialog(null, "No exite");
        }
    }

    public void buscarClienteNombre(String numdoc) {
        Cliente c = null;
        try {
            c = datosCliente.buscarClienteNombre(numdoc);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (c != null) {
            jtfCodCliente.setText(String.valueOf(c.getCodCliente()));
            jtfDatoClienteComp.setText(c.getNombre());
            jtfDocumentoC.setText(c.getTipoPago());
            jtfTelefComp.setText(Integer.toString(c.getTelefono()));
        } else {
            JOptionPane.showMessageDialog(null, "No exite");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfFechaActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTipoComprobante = new javax.swing.JComboBox();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jtfCodCliente = new javax.swing.JTextField();
        jtfDatoClienteComp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lbldatosEmp = new javax.swing.JLabel();
        jtfDocumentoC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefComp = new javax.swing.JTextField();
        jtbbar1 = new javax.swing.JToolBar();
        jbnNuevoComp = new javax.swing.JButton();
        jbnAgregarProdComp = new javax.swing.JButton();
        jbnAgregarUsComp = new javax.swing.JButton();
        jbnReporteComp = new javax.swing.JButton();
        jbnBuscarCliente = new javax.swing.JButton();
        jbnCancelarComp = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtbNroCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jPanel2.setBackground(new java.awt.Color(247, 254, 255));

        jLabel2.setText("FECHA:");

        jtfFechaActual.setEditable(false);
        jtfFechaActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFechaActual.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        jLabel7.setText("TIPO COMPROBANTE A EMITIR :");

        cboTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar>", "BOLETA", "FACTURA", "NOTA DE VENTA" }));

        jLabel3.setText("EMPLEADO:");

        jtfCodCliente.setEditable(false);
        jtfCodCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfDatoClienteComp.setEditable(false);

        jLabel5.setText("CLIENTE :");

        lbldatosEmp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldatosEmp.setText("ORUNA RODRIGUEZ");

        jtfDocumentoC.setEditable(false);
        jtfDocumentoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Tipo Pago");

        jLabel6.setText("TEL.:");

        jtfTelefComp.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldatosEmp)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfDocumentoC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTelefComp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfDatoClienteComp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbldatosEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDatoClienteComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTelefComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jtbbar1.setBackground(new java.awt.Color(247, 254, 255));
        jtbbar1.setRollover(true);

        jbnNuevoComp.setBackground(new java.awt.Color(247, 254, 255));
        jbnNuevoComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/new.jpg"))); // NOI18N
        jbnNuevoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnNuevoCompActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnNuevoComp);

        jbnAgregarProdComp.setBackground(new java.awt.Color(247, 254, 255));
        jbnAgregarProdComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/shopping_cart_add_1.jpg"))); // NOI18N
        jbnAgregarProdComp.setEnabled(false);
        jbnAgregarProdComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAgregarProdCompActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnAgregarProdComp);

        jbnAgregarUsComp.setBackground(new java.awt.Color(247, 254, 255));
        jbnAgregarUsComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/addcliente.jpg"))); // NOI18N
        jbnAgregarUsComp.setEnabled(false);
        jbnAgregarUsComp.setFocusable(false);
        jbnAgregarUsComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbnAgregarUsComp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbnAgregarUsComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAgregarUsCompActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnAgregarUsComp);

        jbnReporteComp.setBackground(new java.awt.Color(247, 254, 255));
        jbnReporteComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/sales-report.jpg"))); // NOI18N
        jbnReporteComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnReporteCompActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnReporteComp);

        jbnBuscarCliente.setBackground(new java.awt.Color(247, 254, 255));
        jbnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/Search-Male-User.jpg"))); // NOI18N
        jbnBuscarCliente.setEnabled(false);
        jbnBuscarCliente.setFocusable(false);
        jbnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbnBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBuscarClienteActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnBuscarCliente);

        jbnCancelarComp.setBackground(new java.awt.Color(247, 254, 255));
        jbnCancelarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/Cancel__Red.jpg"))); // NOI18N
        jbnCancelarComp.setEnabled(false);
        jbnCancelarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCancelarCompActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnCancelarComp);

        jbnSalir.setBackground(new java.awt.Color(247, 254, 255));
        jbnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/Close-64.jpg"))); // NOI18N
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });
        jtbbar1.add(jbnSalir);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nro-COMPRA:");

        jtbNroCompra.setEditable(false);
        jtbNroCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbNroCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtbbar1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbNroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtbNroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jtbbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAgregarProdCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAgregarProdCompActionPerformed
        // TODO add your handling code here:
        AgregarCompra();
        if (cboTipoComprobante.getSelectedItem().toString().equalsIgnoreCase("BOLETA")) {
            frmTransaccion FrmTC = new frmTransaccion();
            if (jtfDocumentoC.getText().length() == 8) {
                FrmTC.lblRucT.setText("DNI");
                FrmTC.txtRucF.setText(jtfDocumentoC.getText());
            } else {
                FrmTC.lblRucT.setText("DNI");
                FrmTC.txtRucF.setText(jtfDocumentoC.getText());
            }
            FrmTC.txtDatoClienteT.setText(jtfDatoClienteComp.getText());
            FrmTC.txtTelefonoT.setText(jtfTelefComp.getText());
            FrmTC.lblNombreTipoComp.setText("BOLETA DE VENTA");
            FrmTC.setVisible(true);
        } else if (cboTipoComprobante.getSelectedItem().toString().equalsIgnoreCase("FACTURA")) {
            frmTransaccion FrmTC = new frmTransaccion();
            if (jtfDocumentoC.getText().length() == 11) {
                FrmTC.lblRucT.setText("RUC");
                FrmTC.txtRucF.setText(jtfDocumentoC.getText());
            } else {
                FrmTC.lblRucT.setText("RUC");
                FrmTC.txtRucF.setText("");
            }
            FrmTC.lblNombreTipoComp.setText("FACTURA DE VENTA");
            FrmTC.txtDatoClienteT.setText(jtfDatoClienteComp.getText());
            FrmTC.setVisible(true);
        } else {
            frmNotaVenta FrmNV = new frmNotaVenta();
            FrmNV.txtDatoClienteNV.setText(jtfDatoClienteComp.getText());
            FrmNV.setVisible(true);
        }
    }//GEN-LAST:event_jbnAgregarProdCompActionPerformed

    private void jbnAgregarUsCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAgregarUsCompActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(
                this, "Deseas Registrar al Cliente..?",
                "Mensaje..!!",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            frmRegCliente Frmcl = new frmRegCliente();
            Frmcl.setVisible(true);
        }
    }//GEN-LAST:event_jbnAgregarUsCompActionPerformed

    private void jbnNuevoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnNuevoCompActionPerformed
        // TODO add your handling code here:
        activarbotones(false);
        activartextos(true);
        limpiartextos();
    }//GEN-LAST:event_jbnNuevoCompActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnCancelarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCancelarCompActionPerformed
        // TODO add your handling code here:
        activarbotones(true);
    }//GEN-LAST:event_jbnCancelarCompActionPerformed

    private void jbnReporteCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnReporteCompActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jbnReporteCompActionPerformed

    private void jbnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnBuscarClienteActionPerformed
        // TODO add your handling code here
        int result = JOptionPane.showConfirmDialog(
                this, "Desea Buscar x Codigo?",
                "Mensaje..!!",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            String codclient = JOptionPane.showInputDialog("Buscar!!","Ingrese el Codigo ?");
            buscarClienteCod(codclient);
        }
        if (result == JOptionPane.NO_OPTION) {
            String numdocto = JOptionPane.showInputDialog("Buscar!!","Ingrese el Numero de Documento ?");
            buscarClienteNombre(numdocto);
        }
    }//GEN-LAST:event_jbnBuscarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new frmNuevaCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cboTipoComprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbnAgregarProdComp;
    private javax.swing.JButton jbnAgregarUsComp;
    private javax.swing.JButton jbnBuscarCliente;
    private javax.swing.JButton jbnCancelarComp;
    private javax.swing.JButton jbnNuevoComp;
    private javax.swing.JButton jbnReporteComp;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JTextField jtbNroCompra;
    private javax.swing.JToolBar jtbbar1;
    private javax.swing.JTextField jtfCodCliente;
    private javax.swing.JTextField jtfDatoClienteComp;
    private javax.swing.JTextField jtfDocumentoC;
    private javax.swing.JTextField jtfFechaActual;
    private javax.swing.JTextField jtfTelefComp;
    private javax.swing.JLabel lbldatosEmp;
    // End of variables declaration//GEN-END:variables
}
