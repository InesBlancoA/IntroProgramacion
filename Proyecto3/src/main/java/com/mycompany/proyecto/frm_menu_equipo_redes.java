/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author ines_
 */
public class frm_menu_equipo_redes extends javax.swing.JFrame {

    /**
     * Creates new form frm_menu_equipo_redes
     */
    public frm_menu_equipo_redes() {
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

        pnl_fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_fondo.setBackground(new java.awt.Color(204, 204, 255));
        pnl_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("Equipo de Redes");
        pnl_fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, -1));

        btn_ingresar.setText("Ingresar Producto");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 44, 137, -1));

        btn_mostrar.setText("Mostrar Productos");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 87, 137, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 259, 137, -1));

        btn_buscar.setText("Buscar Producto");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 130, 137, -1));

        btn_borrar.setText("Borrar Producto");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 173, 137, -1));

        btn_actualizar.setText("Actualizar Producto");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        pnl_fondo.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 216, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frm_equipo_redes obj_eredes = new frm_equipo_redes();
        obj_eredes.setLocationRelativeTo(null);
        obj_eredes.setVisible(true);
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frm_mostrar_equipo_redes_lista obj_eredes = new frm_mostrar_equipo_redes_lista();
        obj_eredes.setLocationRelativeTo(null);
        obj_eredes.setVisible(true);
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:

        this.dispose();
        frm_buscar_equipo_redes obj_eredes_buscar = new frm_buscar_equipo_redes();
        obj_eredes_buscar.setLocationRelativeTo(null);
        obj_eredes_buscar.setVisible(true);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:

        this.dispose();
        frm_borrar_equipo_redes obj_eredes_borrar = new frm_borrar_equipo_redes();
        obj_eredes_borrar.setLocationRelativeTo(null);
        obj_eredes_borrar.setVisible(true);
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:

        this.dispose();
        frm_modificar_equipo_redes obj_eredes_actualizar = new frm_modificar_equipo_redes();
        obj_eredes_actualizar.setLocationRelativeTo(null);
        obj_eredes_actualizar.setVisible(true);
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu_equipo_redes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu_equipo_redes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu_equipo_redes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu_equipo_redes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu_equipo_redes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnl_fondo;
    // End of variables declaration//GEN-END:variables
}