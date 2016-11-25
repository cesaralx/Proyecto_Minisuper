/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDListaProveedores.java
 *
 * Created on 24/11/2016, 12:06:49 AM
 */
package VISTA;

import MODELO.Proveedor;
import DATOS.datosProveedor;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class JDListaProveedores extends javax.swing.JDialog {

    DefaultTableModel LProveedores = new DefaultTableModel();

    /** Creates new form JDListaProveedores */
    public JDListaProveedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        /*
         * 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
         *
         */
        String titulos[] = {"PROVEEDOR ID", "RAZON SOCIAL", "E-MAIL", "CELULAR-TELEFONO", "LUGAR", "DIRECCION", "GIRO", "NOMBRE"};
        LProveedores.setColumnIdentifiers(titulos);
        try {
            for (Proveedor p : datosProveedor.mostrarProveedor()) {
                String Datos[] = {p.getId(), p.getRazonSocial(), p.getEmail(), p.getCelular() + " / " + p.getTelefono(), p.getLugar(), p.getDireccion(), p.getGiro(), p.getNombre()};
                LProveedores.addRow(Datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        /*
         * 
         */
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jtbProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtbProveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbProveedores.setModel(LProveedores);
        jtbProveedores.setGridColor(new java.awt.Color(247, 254, 255));
        jScrollPane1.setViewportView(jtbProveedores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PROVEEDORES");

        jbnGuardar.setText("Guardar");
        jbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnGuardar)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbnGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarActionPerformed
      String fecha = new SimpleDateFormat("_dd_MM_yyyy_").format(new Date()),
              hora = new SimpleDateFormat("hh-mm-ss a").format(new Date());
      
        try {

        File file = new File("Proveedores"+ fecha+hora+ "_.xls" );
        FileWriter output = new FileWriter(file);
        for(int i = 0; i <LProveedores.getColumnCount(); i++){
            output.write(LProveedores.getColumnName(i) + "\t");
         }
        output.write("\n");
        for(int k=0;k < LProveedores.getRowCount();k++) {
            for(int j=0;j<LProveedores.getColumnCount();j++) {
                output.write(LProveedores.getValueAt(k, j).toString() + "\t");
            }
            output.write("\n");
      }   
        output.close();
         }
            catch(Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_jbnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JDListaProveedores dialog = new JDListaProveedores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnGuardar;
    private javax.swing.JTable jtbProveedores;
    // End of variables declaration//GEN-END:variables
}