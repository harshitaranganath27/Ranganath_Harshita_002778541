/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import model.CredentialDirectory;
import model.MainSys;
/**
 *
 * @author harshitaranganath
 */
public class CityAdmin extends javax.swing.JPanel {

    /**
     * Creates new form CityAdmin
     */
    MainSys mainSystem;
    CredentialDirectory cred;
    public CityAdmin(MainSys mainSystem,CredentialDirectory allcredentials) {
        initComponents();
        this.mainSystem = mainSystem;
        this.cred = allcredentials;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Splitpane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnComm = new javax.swing.JButton();
        btnHosp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        btnComm.setText("Community");
        btnComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommActionPerformed(evt);
            }
        });

        btnHosp.setText("Hospitals");
        btnHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComm)
                    .addComponent(btnHosp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnComm, btnHosp});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnComm)
                .addGap(26, 26, 26)
                .addComponent(btnHosp)
                .addContainerGap(855, Short.MAX_VALUE))
        );

        Splitpane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Select an option to manage Communities and Hospitals");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(1008, Short.MAX_VALUE))
        );

        Splitpane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Splitpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Splitpane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommActionPerformed
        // TODO add your handling code here:
        CreateCityAdmin cjp = new CreateCityAdmin(mainSystem,cred);
        Splitpane.setRightComponent(cjp);
    }//GEN-LAST:event_btnCommActionPerformed

    private void btnHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospActionPerformed
        // TODO add your handling code here:
        CreateHospAdmin hjp = new CreateHospAdmin(mainSystem,cred);
        Splitpane.setRightComponent(hjp);
    }//GEN-LAST:event_btnHospActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane Splitpane;
    private javax.swing.JButton btnComm;
    private javax.swing.JButton btnHosp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
