/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Credentials;
import model.CredentialDirectory;
import model.House;
import model.Community;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import model.City;
import model.Operations;
import model.MainSys;
import javax.swing.JCheckBox;

/**
 *
 * @author harshitaranganath
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private String username;
    private String password;
    CredentialDirectory allcredentials;
    Operations crudops1;
    House hse;
    Community comm;
    City city1;
    MainSys mainSystem;

    public Main() {
        initComponents();
        allcredentials = new CredentialDirectory();
        this.mainSystem = new MainSys();
    }

    public Main(MainSys mainSystem, CredentialDirectory allcredentials) {
        initComponents();
        this.allcredentials = allcredentials;
        this.city1 = city1;
        this.mainSystem = mainSystem;
    }

    private Boolean checkBlankInput() {
        if (txtuname.getText().length() == 0 || txtpassword.getPassword().length == 0 || (chkbxSysAdmin.getText().length() == 0 && chkbxHospAdmin.getText().length() == 0 && chkbxPatient.getText().length() == 0 && chkbxDoctor.getText().length() == 0 && chkbxCommAdmin.getText().length() == 0)) {
            return false;
        } else {
            return true;
        }
    }

    private Boolean checkcred() {
        //CredentialDirectory allcredentials = new CredentialDirectory();
        String username = txtuname.getText();
        String password = String.valueOf(txtpassword.getPassword());
        if (chkbxSysAdmin.isSelected()) {
            String role = chkbxSysAdmin.getText();
            ArrayList<Credentials> idcheck = allcredentials.searchCredentials(username, password, role);
            if (allcredentials.checkSysAdminCred(username, password, role)) {
                return true;
            } else {
                return false;
            }
        } else if (chkbxPatient.isSelected()) {
            String role = chkbxPatient.getText();
            ArrayList<Credentials> idcheck = allcredentials.searchCredentials(username, password, role);
            if (idcheck.contains(username) && idcheck.contains(password) && idcheck.contains(role)) {
                return true;
            } else {
                return false;
            }
        } else if (chkbxCommAdmin.isSelected()) {

            String role = chkbxCommAdmin.getText();
            boolean idcheck = allcredentials.checkCommAdminCred(username, password, role);
            if (idcheck) {
                return true;
            } else {
                return false;
            }
        } else if (chkbxDoctor.isSelected()) {
            String role = chkbxDoctor.getText();
            ArrayList<Credentials> idcheck = allcredentials.searchCredentials(username, password, role);
            if (idcheck.contains(username) && idcheck.contains(password) && idcheck.contains(role)) {
                return true;
            } else {
                return false;
            }
        } else if (chkbxHospAdmin.isSelected()) {
            String role = chkbxHospAdmin.getText();
            ArrayList<Credentials> idcheck = allcredentials.searchCredentials(username, password, role);
            if (idcheck.contains(username) && idcheck.contains(password) && idcheck.contains(role)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public String getuname() {
        return String.valueOf(txtuname.getText());
    }

    public String getpass() {
        return String.valueOf(txtpassword.getPassword());
    }

    public String getrole() {
        if (chkbxDoctor.isSelected()) {
            return chkbxDoctor.getText();
        } else if (chkbxCommAdmin.isSelected()) {
            return chkbxCommAdmin.getText();
        } else if (chkbxPatient.isSelected()) {
            return chkbxPatient.getText();
        } else if (chkbxHospAdmin.isSelected()) {
            return chkbxHospAdmin.getText();
        } else {
            return chkbxSysAdmin.getText();
        }
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

    private boolean checkbox() {
        JCheckBox[] newList = new JCheckBox[5];
        newList[0] = chkbxCommAdmin;
        newList[1] = chkbxHospAdmin;
        newList[2] = chkbxDoctor;
        newList[3] = chkbxPatient;
        newList[4] = chkbxSysAdmin;
        int k = 0;
        for (int i = 0; i < newList.length; i++) {
            if (newList[i].isSelected()) {
                k += 1;
            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
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
        loginPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        chkbxPatient = new javax.swing.JCheckBox();
        chkbxSysAdmin = new javax.swing.JCheckBox();
        chkbxCommAdmin = new javax.swing.JCheckBox();
        chkbxHospAdmin = new javax.swing.JCheckBox();
        chkbxDoctor = new javax.swing.JCheckBox();
        btnAuthenticate = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        mainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(224, 238, 238));
        loginPanel.setForeground(new java.awt.Color(0, 102, 255));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        jLabel5.setText("Username");
        loginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        jLabel6.setText("Password");
        loginPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        loginPanel.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 210, 30));

        chkbxPatient.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        chkbxPatient.setText("Patient");
        chkbxPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxPatientActionPerformed(evt);
            }
        });
        loginPanel.add(chkbxPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        chkbxSysAdmin.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        chkbxSysAdmin.setText("System Admin");
        chkbxSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxSysAdminActionPerformed(evt);
            }
        });
        loginPanel.add(chkbxSysAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 20));

        chkbxCommAdmin.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        chkbxCommAdmin.setText("Community Admin");
        chkbxCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxCommAdminActionPerformed(evt);
            }
        });
        loginPanel.add(chkbxCommAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        chkbxHospAdmin.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        chkbxHospAdmin.setText("Hospital Admin");
        chkbxHospAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxHospAdminActionPerformed(evt);
            }
        });
        loginPanel.add(chkbxHospAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        chkbxDoctor.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        chkbxDoctor.setText("Doctor");
        chkbxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxDoctorActionPerformed(evt);
            }
        });
        loginPanel.add(chkbxDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        btnAuthenticate.setBackground(new java.awt.Color(0, 153, 153));
        btnAuthenticate.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
        btnAuthenticate.setText("Authenticate");
        btnAuthenticate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthenticateActionPerformed(evt);
            }
        });
        loginPanel.add(btnAuthenticate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 140, 30));
        loginPanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Login");
        mainPanel.add(jLabel4);

        jLabel3.setText("jLabel3");
        mainPanel.add(jLabel3);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel10.setText("Mass General Hospital");
        mainPanel.add(jLabel10);

        loginPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -160, 990, 70));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Select a login type below");
        loginPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 440, 30));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Please enter your credentials");
        loginPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 330, 30));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("Mass General Hospital");
        loginPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 580));

        setSize(new java.awt.Dimension(1084, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkbxPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxPatientActionPerformed

    private void chkbxSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxSysAdminActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_chkbxSysAdminActionPerformed

    private void chkbxCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxCommAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxCommAdminActionPerformed

    private void chkbxHospAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxHospAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxHospAdminActionPerformed

    private void chkbxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxDoctorActionPerformed

    private void btnAuthenticateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthenticateActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()) {
            boolean checkcred = true;
            if (checkcred && checkbox()) {
                Credentials cred = new Credentials();
                String uname = txtuname.getText();
                String pass = String.valueOf(txtpassword.getPassword());

                if (chkbxSysAdmin.isSelected()) {

                    String role = chkbxSysAdmin.getText();
                    cred.setRole(role);
                    chkbxSysAdmin.setSelected(false);
                    boolean sysadmincheck = allcredentials.checkSysAdminCred(uname, pass, role);
                    if (sysadmincheck) {
                        new Main().setVisible(false);
                        JFrame frame = new JFrame();
                        frame.setPreferredSize(new Dimension(1070, 600));
                        SystemAdmin welcomeadmin = new SystemAdmin(mainSystem, allcredentials);
                        frame.setSize(1070, 600);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //frame.setUndecorated(true); 
                        frame.setVisible(true);
                        frame.getContentPane().add(welcomeadmin);
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Check your credentials");
                    }
                } else if (chkbxPatient.isSelected()) {
                    String role = chkbxPatient.getText();
                    cred.setRole(role);
                    chkbxPatient.setSelected(false);
                    boolean commadmincheck = allcredentials.checkCommAdminCred(uname, pass, role);
                    if (commadmincheck) {
                        new Main().setVisible(false);
                        JFrame frame = new JFrame();
                        frame.setPreferredSize(new Dimension(1070, 600));
                        CreatePatient welcomeadmin = new CreatePatient(mainSystem, allcredentials);

                        frame.setSize(1070, 600);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        frame.setVisible(true);
                        frame.getContentPane().add(welcomeadmin);
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Check your credentials");
                    }
                } else if (chkbxCommAdmin.isSelected()) {
                    String role = chkbxCommAdmin.getText();
                    cred.setRole(role);
                    chkbxCommAdmin.setSelected(false);
                    boolean commadmincheck = allcredentials.checkCommAdminCred(uname, pass, role);
                    if (commadmincheck) {
                        new Main().setVisible(false);
                        JFrame frame = new JFrame();
                        CityAdmin welcomeadmin = new CityAdmin(mainSystem, allcredentials);
                        frame.setSize(1070, 600);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                        frame.setVisible(true);
                        frame.getContentPane().add(welcomeadmin);
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Check your credentials");
                    }
                } else if (chkbxDoctor.isSelected()) {
                    String role = chkbxDoctor.getText();
                    cred.setRole(role);
                    chkbxDoctor.setSelected(false);
                    cred.setRole(role);
                    chkbxDoctor.setSelected(false);
                    boolean commadmincheck = allcredentials.checkCommAdminCred(uname, pass, role);
                    if (commadmincheck) {
                        new Main().setVisible(false);
                        JFrame frame = new JFrame();
                        DoctorPatientCreate welcomeadmin = new DoctorPatientCreate(mainSystem, allcredentials);
                        frame.setSize(900, 600);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        frame.setVisible(true);
                        frame.getContentPane().add(welcomeadmin);
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Check your credentials");
                    }

                } else if (chkbxHospAdmin.isSelected()) {
                    String role = chkbxHospAdmin.getText();
                    cred.setRole(role);
                    chkbxHospAdmin.setSelected(false);
                    cred.setRole(role);
                    chkbxHospAdmin.setSelected(false);
                    boolean commadmincheck = allcredentials.checkCommAdminCred(uname, pass, role);

                    if (commadmincheck) {
                        new Main().setVisible(false);
                        JFrame frame = new JFrame();
                        HospitalAdmin welcomeadmin = new HospitalAdmin(mainSystem, allcredentials);
                        frame.setSize(1070, 600);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //frame.setUndecorated(true); 
                        frame.setVisible(true);
                        frame.getContentPane().add(welcomeadmin);
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Check your credentials");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Input a Role");
                    String role = "";
                }
                cred.setPassword(pass);
                cred.setUsername(uname);
                txtuname.setText("");
                txtpassword.setText("");
                Main mj = new Main();
                mj.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Credentials or Role");
            }
        } else {

            JOptionPane.showMessageDialog(this, "Please Fill the fields");
        }
    }//GEN-LAST:event_btnAuthenticateActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthenticate;
    private javax.swing.JCheckBox chkbxCommAdmin;
    private javax.swing.JCheckBox chkbxDoctor;
    private javax.swing.JCheckBox chkbxHospAdmin;
    private javax.swing.JCheckBox chkbxPatient;
    private javax.swing.JCheckBox chkbxSysAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables

}
