/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Isaac
 */
public class frm_menu_consolas extends javax.swing.JFrame {

    
    public frm_menu_consolas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_consolas = new javax.swing.JLabel();
        btn_ingresa_prod = new javax.swing.JButton();
        btn_mostrar_prod = new javax.swing.JButton();
        btn_buscar_prod = new javax.swing.JButton();
        btn_borrar_prod = new javax.swing.JButton();
        btn_actualizar_prod = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_consolas.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_consolas.setText("CONSOLAS");

        btn_ingresa_prod.setText("Ingresar Producto");
        btn_ingresa_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresa_prodActionPerformed(evt);
            }
        });

        btn_mostrar_prod.setText("Mostrar Productos");
        btn_mostrar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_prodActionPerformed(evt);
            }
        });

        btn_buscar_prod.setText("Buscar Productos");
        btn_buscar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_prodActionPerformed(evt);
            }
        });

        btn_borrar_prod.setText("Borrar Producto");
        btn_borrar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_prodActionPerformed(evt);
            }
        });

        btn_actualizar_prod.setText("Actualizar Producto");
        btn_actualizar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_prodActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_mostrar_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ingresa_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_borrar_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_consolas)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_consolas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresa_prod)
                .addGap(18, 18, 18)
                .addComponent(btn_mostrar_prod)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_prod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_borrar_prod)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar_prod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresa_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresa_prodActionPerformed
    
        this.dispose();
        frm_consolas obj_consolas_vid = new frm_consolas();
        obj_consolas_vid.setLocationRelativeTo(null);
        obj_consolas_vid.setVisible(true);
    }//GEN-LAST:event_btn_ingresa_prodActionPerformed

    private void btn_mostrar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_prodActionPerformed
        this.dispose();
        frm_mostrar_consolas_lista obj_mostrar = new frm_mostrar_consolas_lista();
        
        obj_mostrar.setLocationRelativeTo(null);
        
        obj_mostrar.setVisible(true);
        
        
    }//GEN-LAST:event_btn_mostrar_prodActionPerformed

    private void btn_buscar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_prodActionPerformed
        this.dispose();
        frm_buscar_consola obj_bus_consola = new frm_buscar_consola();
        obj_bus_consola.setLocationRelativeTo(null);
        obj_bus_consola.setVisible(true);
    }//GEN-LAST:event_btn_buscar_prodActionPerformed

    private void btn_borrar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_prodActionPerformed
        this.dispose();
        frm_borrar_consolas obj_borrar_consolas = new frm_borrar_consolas();
        obj_borrar_consolas.setLocationRelativeTo(null);
        obj_borrar_consolas.setVisible(true);
    }//GEN-LAST:event_btn_borrar_prodActionPerformed

    private void btn_actualizar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_prodActionPerformed
        this.dispose();
        frm_modificar_consolas obj_modificar =  new frm_modificar_consolas();
        obj_modificar.setLocationRelativeTo(null);
        obj_modificar.setVisible(true);
    }//GEN-LAST:event_btn_actualizar_prodActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu_consolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_prod;
    private javax.swing.JButton btn_borrar_prod;
    private javax.swing.JButton btn_buscar_prod;
    private javax.swing.JButton btn_ingresa_prod;
    private javax.swing.JButton btn_mostrar_prod;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_consolas;
    // End of variables declaration//GEN-END:variables
}
