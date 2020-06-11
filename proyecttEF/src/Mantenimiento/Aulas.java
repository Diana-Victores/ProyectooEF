/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class Aulas extends javax.swing.JFrame {

    /**
     * Creates new form Aulas
     */
    public Aulas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnModificacion = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtestatus = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aulas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 31, 70, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo aula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 75, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre aula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estatus aula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 151, -1, -1));

        btnRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 195, -1, -1));

        btnModificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificacion.setText("Modificación");
        btnModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 195, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 195, -1, -1));
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 246, 163, -1));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 245, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 163, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 163, -1));
        jPanel1.add(txtestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 163, -1));

        label_status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into aulas values(?,?,?)");

            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtnombre.getText().trim());
            pst.setString(3, txtestatus.getText().trim());

            pst.executeUpdate();

            txtcodigo.setText("");
            txtnombre.setText("");
            txtestatus.setText("");

            label_status.setText("Aula Registrada");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionActionPerformed
        try {
            String ID = txtbuscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("update aulas set codigo_aula = ?, nombre_aula = ?, estatus_aula= ? where codigo_aula=?");

            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtnombre.getText().trim());
            pst.setString(3, txtestatus.getText().trim());
           // pst.setString(4, cod.trim());

            pst.executeUpdate();

            txtcodigo.setText("");
            txtnombre.setText("");
            txtestatus.setText("");
            label_status.setText("Aula Modificada.");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnModificacionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from aulas where codigo_aula = ?");

            pst.setString(1, txtbuscar.getText().trim());
            pst.executeUpdate();

            txtcodigo.setText("");
            txtnombre.setText("");
            txtestatus.setText("");
            label_status.setText("Aula eliminada.");

        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from aulas where codigo_aula = ?");
            pst.setString(1, txtbuscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcodigo.setText(rs.getString("codigo_aula"));//Se unen los campos de la tabla(MYSQL) a los de JAVA
                txtnombre.setText(rs.getString("nombre_aula"));
                txtestatus.setText(rs.getString("estatus_aula"));

            } else {
                JOptionPane.showMessageDialog(null, "Aula no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificacion;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestatus;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
