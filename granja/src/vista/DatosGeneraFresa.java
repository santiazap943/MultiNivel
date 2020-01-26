/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import granja.Control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mateo Chaparro
 */
public class DatosGeneraFresa extends javax.swing.JFrame {

    /**
     * Creates new form DatosCultivoFresa
     */
    public DatosGeneraFresa() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_abono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        cargarBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cargarBtn2 = new javax.swing.JButton();
        cargarBtn3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        descripcion_problema = new javax.swing.JTextField();
        nombre_problema = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cargarBtn4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ABONO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("- Cargar Información sobre el abono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 240, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        nombre_abono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_abonoActionPerformed(evt);
            }
        });
        nombre_abono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_abonoKeyTyped(evt);
            }
        });
        getContentPane().add(nombre_abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Descripción");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 90, -1));

        cargarBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cargarBtn.setText("CARGAR");
        cargarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cargarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("- Registrar abono en cultivo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("PROBLEMAS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        cargarBtn2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cargarBtn2.setText("VOLVER");
        cargarBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(cargarBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        cargarBtn3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cargarBtn3.setText("SALIR");
        cargarBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(cargarBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("-Asociar problema con cultivo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        descripcion_problema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcion_problemaKeyTyped(evt);
            }
        });
        getContentPane().add(descripcion_problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 117, -1));

        nombre_problema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_problemaKeyTyped(evt);
            }
        });
        getContentPane().add(nombre_problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 117, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Descripción");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setText("-Cargar reporte del problema");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        cargarBtn4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cargarBtn4.setText("CARGAR");
        cargarBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(cargarBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("DATOS GENERALES - ABONO Y PROBLEMA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datosgen.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtn2ActionPerformed
        MenuFresa ob = new MenuFresa();
        ob.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cargarBtn2ActionPerformed

    private void cargarBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtn3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cargarBtn3ActionPerformed

    private void cargarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtnActionPerformed
        try {
            PreparedStatement pps = Control.cn.prepareStatement("INSERT INTO problema(nombre,descripcion)VALUES(?,?);");
            pps.setString(1, nombre_problema.getText());
            pps.setString(2, descripcion_problema.getText());
            InfoIncialFresa.pr=nombre_problema.getText();
            InfoIncialPapa.pr=nombre_problema.getText();
            
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DatosGeneraFresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargarBtnActionPerformed

    private void cargarBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtn4ActionPerformed
         try {
            PreparedStatement pps = Control.cn.prepareStatement("INSERT INTO abono(nombre,precio,descripcion)VALUES(?,?,?);");
            pps.setString(1, nombre_abono.getText());
            pps.setInt(2, Integer.parseInt(precio.getText()));
            pps.setString(3, descripcion.getText());
            InfoIncialFresa.ab=nombre_abono.getText();
            InfoIncialPapa.ab=nombre_abono.getText();
            
                    } catch (SQLException ex) {
            Logger.getLogger(DatosGeneraFresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargarBtn4ActionPerformed

    private void nombre_abonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_abonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_abonoActionPerformed

    private void nombre_abonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_abonoKeyTyped
       char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();
    }//GEN-LAST:event_nombre_abonoKeyTyped

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionKeyTyped

    private void nombre_problemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_problemaKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_problemaKeyTyped

    private void descripcion_problemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcion_problemaKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_descripcion_problemaKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
char c= evt.getKeyChar();
       if(c<0||c>9)
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_precioKeyTyped

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarBtn;
    private javax.swing.JButton cargarBtn2;
    private javax.swing.JButton cargarBtn3;
    private javax.swing.JButton cargarBtn4;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField descripcion_problema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField nombre_abono;
    public static javax.swing.JTextField nombre_problema;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}