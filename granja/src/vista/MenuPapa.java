/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Mateo Chaparro
 */
public class MenuPapa extends javax.swing.JFrame {

    public MenuPapa() {
        initComponents();
        infoLabel.setVisible(false);
        infoLabel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        infoinicialBtn = new javax.swing.JButton();
        infoinicialBtn1 = new javax.swing.JButton();
        ayudaBTN = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("INFORMACION INICIAL");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("FRESA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoinicialBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        infoinicialBtn.setText("MODIFICAR INFORMACION INICIAL");
        infoinicialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoinicialBtnActionPerformed(evt);
            }
        });
        getContentPane().add(infoinicialBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        infoinicialBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        infoinicialBtn1.setText("MODIFICAR DATOS DE CULTIVO");
        infoinicialBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoinicialBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(infoinicialBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 269, -1));

        ayudaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pregunta.png"))); // NOI18N
        ayudaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ayudaBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ayudaBTNMouseExited(evt);
            }
        });
        ayudaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ayudaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 206, -1, -1));

        infoLabel.setText("Informacion Incial: Datos acerca la plantacion inicial");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 198, 262, -1));

        infoLabel2.setText("Datos de Cultivo: Fertilizantes, abonos, enfermedades");
        getContentPane().add(infoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 218, -1, -1));

        volver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papa.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 70));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("MENU - FRESA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datosgen.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoinicialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoinicialBtnActionPerformed
        InfoIncialPapa ob1 = new InfoIncialPapa ();
        ob1.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_infoinicialBtnActionPerformed

    private void infoinicialBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoinicialBtn1ActionPerformed
        DatosGeneraPapa datosf = new DatosGeneraPapa ();
        datosf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_infoinicialBtn1ActionPerformed

    private void ayudaBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaBTNMouseEntered
        infoLabel.setVisible(true);
        infoLabel2.setVisible(true);
    }//GEN-LAST:event_ayudaBTNMouseEntered

    private void ayudaBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaBTNMouseExited
        infoLabel.setVisible(false);
        infoLabel2.setVisible(false);
    }//GEN-LAST:event_ayudaBTNMouseExited

    private void ayudaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaBTNActionPerformed

    }//GEN-LAST:event_ayudaBTNActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Cultivo ob = new Cultivo();
        ob.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaBTN;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JButton infoinicialBtn;
    private javax.swing.JButton infoinicialBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
