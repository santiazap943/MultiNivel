/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import granja.Control;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mateo Chaparro
 */
public class DatosGenerales extends javax.swing.JFrame {
    Menu menu;
    LogIn wn=new LogIn();
    public static String usu;
    public DatosGenerales() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        establecimientoF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ciudadF = new javax.swing.JTextField();
        telefonoF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sectorF = new javax.swing.JTextField();
        totalmetrosF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE DATOS GENERALES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Nombre del establecimiento *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        establecimientoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                establecimientoFActionPerformed(evt);
            }
        });
        establecimientoF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                establecimientoFKeyTyped(evt);
            }
        });
        getContentPane().add(establecimientoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 172, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Dirección *");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        direccionF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFActionPerformed(evt);
            }
        });
        getContentPane().add(direccionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 172, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Telefono *");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        ciudadF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadFActionPerformed(evt);
            }
        });
        ciudadF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadFKeyTyped(evt);
            }
        });
        getContentPane().add(ciudadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 172, -1));

        telefonoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFActionPerformed(evt);
            }
        });
        telefonoF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoFKeyTyped(evt);
            }
        });
        getContentPane().add(telefonoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 172, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Total de metros cuadrados del lugar *");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Barrio o vereda");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        sectorF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorFActionPerformed(evt);
            }
        });
        sectorF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sectorFKeyTyped(evt);
            }
        });
        getContentPane().add(sectorF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 172, -1));

        totalmetrosF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalmetrosFKeyTyped(evt);
            }
        });
        getContentPane().add(totalmetrosF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Ciudad *");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        volverBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        volverBtn.setText("VOLVER");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel10.setText("Los datos marcados con  ' * '  son de caracter obligatorio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datosgen.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void establecimientoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_establecimientoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_establecimientoFActionPerformed

    private void direccionFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFActionPerformed

    private void ciudadFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadFActionPerformed

    private void telefonoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFActionPerformed

    private void sectorFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectorFActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        menu = new Menu();
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_volverBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
         PreparedStatement pps = Control.cn.prepareStatement("INSERT INTO datos_establecimiento(nombre_establecimiento,usuario,direccion,telefono,ciudad,barrio,metros) VALUES(?,?,?,?,?,?,?)");
         pps.setString(2, usu );
         pps.setString(1, establecimientoF.getText());
         pps.setString(3, direccionF.getText());
         pps.setString(4, telefonoF.getText());
         pps.setString(5, sectorF.getText());
         pps.setString(6, ciudadF.getText() );
         pps.setString(7, totalmetrosF.getText());
         pps.executeUpdate();
         InfoIncialFresa.data=establecimientoF.getText();
         InfoIncialPapa.data=establecimientoF.getText();
    } catch (SQLException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void establecimientoFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_establecimientoFKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_establecimientoFKeyTyped

    private void sectorFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sectorFKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_sectorFKeyTyped

    private void ciudadFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadFKeyTyped
char c= evt.getKeyChar();
       if(Character.isDigit(c))
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadFKeyTyped

    private void telefonoFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoFKeyTyped
char c= evt.getKeyChar();
       if(c<0||c>9)
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFKeyTyped

    private void totalmetrosFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalmetrosFKeyTyped
char c= evt.getKeyChar();
       if(c<0||c>9)
           evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_totalmetrosFKeyTyped

    /**
     * @param args the command line arguments
     */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ciudadF;
    private javax.swing.JTextField direccionF;
    public static javax.swing.JTextField establecimientoF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField sectorF;
    private javax.swing.JTextField telefonoF;
    private javax.swing.JTextField totalmetrosF;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
