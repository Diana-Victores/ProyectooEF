/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Asignaciones.AsiganacionEstudiante;
import Asignaciones.AsignacionMaestro;
import Mantenimiento.Aulas;
import Mantenimiento.Carreras;
import Mantenimiento.Cursos;
import Mantenimiento.Facultades;
import Mantenimiento.Jornadas;
import Mantenimiento.MantenimientoAlumno;
import Mantenimiento.MantenimientoMaestros;
import Mantenimiento.Secciones;
import Mantenimiento.Sedes;
import modelo.Usuarios;

/**
 *
 * @author Diana
 */
public class menu extends javax.swing.JFrame {

    Usuarios mod;

    public menu() {
        initComponents();
    }

    menu(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            menuMantenimientos.setVisible(true);
            menuAsignaciones.setVisible(true);
            menuAbrir.setVisible(true);
            menuCatalogo.setVisible(true);
            menuMantenimientos.setVisible(true);
            menuAsignaciones.setVisible (true);
            menuHerramientas.setVisible(true);
            menuSalir.setVisible(true);
        } else {
            menuSalir.setVisible(false);
            menuHerramientas.setVisible(false);
           
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuAbrir = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        menuCatalogo = new javax.swing.JMenu();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        menuMantenimientos = new javax.swing.JMenu();
        subMenuAddProducto = new javax.swing.JMenuItem();
        subMenuEditProducto = new javax.swing.JMenuItem();
        menuAsignaciones = new javax.swing.JMenu();
        menuHerramientas = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        menuAbrir.setText("Abrir");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mantenimiento Alumno");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        menuAbrir.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Mantenimiento Maestro");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        menuAbrir.add(jCheckBoxMenuItem3);

        jMenuBar2.add(menuAbrir);

        menuCatalogo.setText("Catalogo");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Mantenimiento Cursos");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Mantenimiento Carreras");
        jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem6ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Mantenimiento Facultaades");
        jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem7ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem7);

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("Mantenimiento Sedes");
        jCheckBoxMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem8ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem8);

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("Mantenimiento Aulas");
        jCheckBoxMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem9ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem9);

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText("Mantenimiento Secciones");
        jCheckBoxMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem10ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem10);

        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText("Mantenimiento Jornadas");
        jCheckBoxMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem11ActionPerformed(evt);
            }
        });
        menuCatalogo.add(jCheckBoxMenuItem11);

        jMenuBar2.add(menuCatalogo);

        menuMantenimientos.setText("Procesos");

        subMenuAddProducto.setText("Asigancion Alumnos");
        subMenuAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProductoActionPerformed(evt);
            }
        });
        menuMantenimientos.add(subMenuAddProducto);

        subMenuEditProducto.setText("Asignacion Maestro");
        subMenuEditProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuEditProductoActionPerformed(evt);
            }
        });
        menuMantenimientos.add(subMenuEditProducto);

        jMenuBar2.add(menuMantenimientos);

        menuAsignaciones.setText("Informes");
        jMenuBar2.add(menuAsignaciones);

        menuHerramientas.setText("Herramientas");
        jMenuBar2.add(menuHerramientas);

        menuSalir.setText("Ayuda");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Salir del Sistema");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        menuSalir.add(jCheckBoxMenuItem2);

        jMenuBar2.add(menuSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // Inicio
        MantenimientoAlumno frm = new MantenimientoAlumno();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void subMenuAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProductoActionPerformed
        // TODO add your handling code here:
        AsiganacionEstudiante frm = new AsiganacionEstudiante();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_subMenuAddProductoActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed

 MantenimientoMaestros frm = new MantenimientoMaestros();
        frm.setVisible(true);
        this.setVisible(false);


        
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        // cursos
        
        Cursos frm = new Cursos();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
        // TODO add your handling code here:
        
          Carreras frm = new Carreras();
        frm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
        // TODO add your handling code here:
        Facultades frm = new Facultades();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed

    private void jCheckBoxMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem8ActionPerformed
        // TODO add your handling code here:
        
        
         Sedes frm = new Sedes();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem8ActionPerformed

    private void jCheckBoxMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem9ActionPerformed
        // TODO add your handling code here:
        
         Aulas frm = new Aulas();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem9ActionPerformed

    private void jCheckBoxMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem10ActionPerformed
        // TODO add your handling code here:
        
         Secciones frm = new Secciones();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem10ActionPerformed

    private void jCheckBoxMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11ActionPerformed
        // TODO add your handling code here:
        
         Jornadas frm = new Jornadas();
        frm.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_jCheckBoxMenuItem11ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void subMenuEditProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuEditProductoActionPerformed
        // TODO add your handling code here:
          AsignacionMaestro frm = new AsignacionMaestro();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_subMenuEditProductoActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAbrir;
    private javax.swing.JMenu menuAsignaciones;
    private javax.swing.JMenu menuCatalogo;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenu menuMantenimientos;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem subMenuAddProducto;
    private javax.swing.JMenuItem subMenuEditProducto;
    // End of variables declaration//GEN-END:variables
}
