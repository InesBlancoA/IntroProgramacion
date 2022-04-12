
package com.mycompany.proyecto;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frm_consolas extends javax.swing.JFrame {

  
    
    
    
    public frm_consolas() {
        initComponents();
        
           
        
        
        
    }
    
    

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_FondoConsolas = new javax.swing.JPanel();
        lbl_info = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_memoria = new javax.swing.JLabel();
        lbl_juegos = new javax.swing.JLabel();
        txt_codigo_prod = new javax.swing.JTextField();
        txt_nombre_prod = new javax.swing.JTextField();
        txt_precio_prod = new javax.swing.JTextField();
        txt_cantidad_prod = new javax.swing.JTextField();
        txt_memoria = new javax.swing.JTextField();
        txt_juegos = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_nombre1 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_FondoConsolas.setBackground(new java.awt.Color(208, 252, 252));
        Pnl_FondoConsolas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pnl_FondoConsolas.setForeground(new java.awt.Color(204, 204, 204));

        lbl_info.setBackground(new java.awt.Color(255, 255, 255));
        lbl_info.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_info.setText("REGISTRO DE CONSOLAS");

        lbl_codigo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_codigo.setText("Codigo:");

        lbl_marca.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_marca.setText("Marca:");

        lbl_precio.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_precio.setText("Precio:");

        lbl_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_cantidad.setText("Cantidad:");

        lbl_memoria.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_memoria.setText("Memoria:");

        lbl_juegos.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_juegos.setText("Juegos:");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_nombre1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_nombre1.setText("Nombre:");

        javax.swing.GroupLayout Pnl_FondoConsolasLayout = new javax.swing.GroupLayout(Pnl_FondoConsolas);
        Pnl_FondoConsolas.setLayout(Pnl_FondoConsolasLayout);
        Pnl_FondoConsolasLayout.setHorizontalGroup(
            Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_FondoConsolasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_FondoConsolasLayout.createSequentialGroup()
                        .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo)
                            .addComponent(lbl_nombre1))
                        .addGap(30, 30, 30)
                        .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_FondoConsolasLayout.createSequentialGroup()
                                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre_prod))
                                .addGap(49, 49, 49)
                                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_memoria)
                                    .addComponent(lbl_juegos))
                                .addGap(18, 18, 18)
                                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_memoria, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(txt_juegos))
                                .addGap(56, 56, 56)
                                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))
                            .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_FondoConsolasLayout.createSequentialGroup()
                                    .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(215, 215, 215))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_FondoConsolasLayout.createSequentialGroup()
                                    .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_cantidad_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_precio_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(360, 360, 360)))))
                    .addGroup(Pnl_FondoConsolasLayout.createSequentialGroup()
                        .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cantidad)
                            .addComponent(lbl_marca)
                            .addComponent(lbl_precio))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Pnl_FondoConsolasLayout.setVerticalGroup(
            Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_FondoConsolasLayout.createSequentialGroup()
                .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(lbl_memoria)
                    .addComponent(txt_codigo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addGap(27, 27, 27)
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_juegos)
                    .addComponent(txt_nombre_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_juegos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir)
                    .addComponent(lbl_nombre1))
                .addGap(27, 27, 27)
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_marca)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_precio)
                    .addComponent(txt_precio_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Pnl_FondoConsolasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(txt_cantidad_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_FondoConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_FondoConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        
        String codigo_pr = txt_codigo_prod.getText();
        String marca_pr = txt_marca.getText();
        String nom_pr = txt_nombre_prod.getText();
        String prec_pr = txt_precio_prod.getText();
        String cant_pr = txt_cantidad_prod.getText();
        String memo_pr = txt_memoria.getText();
        String jueg_pr = txt_juegos.getText();
        

            
            Producto obj_pr = new Producto(Integer.parseInt(codigo_pr), marca_pr, nom_pr, Double.parseDouble(prec_pr),
                                           Integer.parseInt(cant_pr));

            Consolas obj_consola = new Consolas(memo_pr,jueg_pr);
            
            Consolas obj_conso = new Consolas();
            
            obj_conso.setObj_producto_consola(obj_pr);
            obj_conso.setMemoria(memo_pr);
            obj_conso.setCant_juegos(jueg_pr);
            obj_conso.agregar_producto();
            
            if (JOptionPane.showConfirmDialog(null,"Producto Ingresado Correctamente. Desea ingresar otro producto?"
                        + " principal?","WARNING",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    
             /*Consolas obj_tablaconsola = new Consolas();
             tabla_consolas.setModel(obj_tablaconsola.mostrar_reporte_producto());
                */    
                    limpia_cajas_de_texto();
                }else{
                    this.dispose();
                    llamar_formulario();
                }
            
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    
    
    
    
    private void limpia_cajas_de_texto (){
        
        this.txt_codigo_prod.setText("");
        this.txt_nombre_prod.setText("");
        this.txt_marca.setText("");
        this.txt_precio_prod.setText("");
        this.txt_cantidad_prod.setText("");
        this.txt_memoria.setText("");
        this.txt_juegos.setText("");
        
    }
    
    private void llamar_formulario (){
        frm_menu_computadoras menu = new frm_menu_computadoras();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(frm_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_consolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_consolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_FondoConsolas;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_juegos;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_memoria;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JTextField txt_cantidad_prod;
    private javax.swing.JTextField txt_codigo_prod;
    private javax.swing.JTextField txt_juegos;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_memoria;
    private javax.swing.JTextField txt_nombre_prod;
    private javax.swing.JTextField txt_precio_prod;
    // End of variables declaration//GEN-END:variables
}
