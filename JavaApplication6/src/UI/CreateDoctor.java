/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CredentialDirectory;
import model.Doctor;
import model.Hospital;
import model.MainSys;

/**
 *
 * @author harshitaranganath
 */
public class CreateDoctor extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctor
     */
    MainSys mainSystem;
    CredentialDirectory allcredentials;

    public CreateDoctor(MainSys mainSystem, CredentialDirectory allcredentials) {
        initComponents();
        this.mainSystem = mainSystem;
        this.allcredentials = allcredentials;
        popcity();
    }

    public boolean rolecheck() {
        Main mj = new Main();
        String password;
        String username;
        String role;
        password = "admin";
        username = "admin";
        role = mj.getrole();
        boolean b1 = allcredentials.checkSysAdminCred(username, password, role);

        return b1;
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
        comboBoxhosp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtSpeciality = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        btncreatee = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        comboBoxhosp1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDoc1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        txtSpeciality1 = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Doctors");

        comboBoxhosp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxhosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxhospActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Hospital");

        jLabel3.setText("Doctor Name");

        jLabel4.setText("Doctor Id");

        jLabel5.setText("Contact ");

        jLabel6.setText("Doctor Speciality");

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        txtSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityActionPerformed(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Doctor Id", "Hospital", "Hospital ID", "Contact", "Doctor Speciality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        btncreatee.setText("Create");
        btncreatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateeActionPerformed(evt);
            }
        });

        jButton1.setText("Populate Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        comboBoxhosp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxhosp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxhosp1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Hospital");

        jLabel8.setText("Doctor Name");

        txtDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoc1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Doctor Id");

        jLabel10.setText("Contact ");

        jLabel11.setText("Doctor Speciality");

        txtId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId1ActionPerformed(evt);
            }
        });
        txtId1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtId1KeyTyped(evt);
            }
        });

        txtContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact1ActionPerformed(evt);
            }
        });

        txtSpeciality1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpeciality1ActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel12.setText("Create Doctors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxhosp, 0, 120, Short.MAX_VALUE)
                                    .addComponent(txtDoc)
                                    .addComponent(txtId)
                                    .addComponent(txtContact)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btncreatee)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId1)
                            .addComponent(txtContact1)
                            .addComponent(txtSpeciality1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(btnEdit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDoc1)
                        .addComponent(comboBoxhosp1, 0, 110, Short.MAX_VALUE)))
                .addContainerGap(674, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(493, 493, 493))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxhosp, txtContact, txtDoc, txtId, txtSpeciality});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxhosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btncreatee))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnView)
                            .addComponent(btnDelete))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxhosp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSpeciality1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxhosp, txtContact, txtDoc, txtId, txtSpeciality});

    }// </editor-fold>//GEN-END:initComponents

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialityActionPerformed

    private void comboBoxhospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxhospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxhospActionPerformed

    private void btncreateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateeActionPerformed
        // TODO add your handling code here:
        if (txtDoc.getText().length() != 0 || txtSpeciality.getText().length() != 0 || txtContact.getText().length() != 0 || txtId.getText().length() != 0 || comboBoxhosp.getSelectedItem().toString().length() != 0) {
            String name = txtDoc.getText();
            String spl = txtSpeciality.getText();
            Long cnt = Long.valueOf(txtContact.getText());
            int id1 = Integer.valueOf(txtId.getText());
            String hsp = comboBoxhosp.getSelectedItem().toString();

            Hospital hp = new Hospital();
            hp.setHospitalName(hsp);
            Doctor doc = mainSystem.getDoctorDir().addNewDoc();
            doc.setDocId(id1);
            doc.setDocName(name);
            doc.setDocContactNumber(cnt);
            doc.setDocContactNumber(cnt);
            doc.setHosp(hp);
            doc.setSpecialty(spl);
            txtDoc.setText("");
            txtSpeciality.setText("");
            txtContact.setText("");
            txtId.setText("");
            popcity();
        } else {

            JOptionPane.showMessageDialog(this, "Please Fill all Text Fields");

        }


    }//GEN-LAST:event_btncreateeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        popTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxhosp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxhosp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxhosp1ActionPerformed

    private void txtDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoc1ActionPerformed

    private void txtId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId1ActionPerformed

    private void txtContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact1ActionPerformed

    private void txtSpeciality1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpeciality1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpeciality1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
        } else {
            DefaultTableModel m2 = (DefaultTableModel) tblRecords.getModel();
            Doctor SelectedRecords = (Doctor) m2.getValueAt(SelectedRow, 0);
            txtId1.setText(String.valueOf(SelectedRecords.getDocId()));
            txtDoc1.setText(SelectedRecords.getDocName());
            txtSpeciality1.setText(SelectedRecords.getSpecialty());
            txtContact1.setText(String.valueOf(SelectedRecords.getDocContactNumber()));
            popHosp(SelectedRecords.getHosp().getHospitalName());

        }


    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        boolean b1 = rolecheck();
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if (b1) {
            DefaultTableModel m2 = (DefaultTableModel) tblRecords.getModel();
            Doctor SelectedRecords = (Doctor) m2.getValueAt(SelectedRow, 0);
            mainSystem.getDoctorDir().deleteDoc(SelectedRecords);
            JOptionPane.showMessageDialog(this, "Selected row has been deleted");
            popTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
        } else {
            if (txtDoc.getText().length() == 0 || txtSpeciality.getText().length() == 0 || txtContact.getText().length() == 0 || txtId.getText().length() == 0 || comboBoxhosp.getSelectedItem().toString().length() == 0) {
                DefaultTableModel m2 = (DefaultTableModel) tblRecords.getModel();
                Doctor SelectedRecords = (Doctor) m2.getValueAt(SelectedRow, 0);
                ArrayList<Doctor> searchComm = mainSystem.getDoctorDir().searchDoctor(SelectedRecords.getDocName());
                searchComm.get(0).setDocName(txtDoc1.getText());
                searchComm.get(0).setDocId(Integer.valueOf(txtId1.getText()));
                searchComm.get(0).setDocContactNumber(Long.valueOf(txtContact1.getText()));
                searchComm.get(0).setSpecialty(txtSpeciality1.getText());
                Hospital hp = new Hospital();
                hp.setHospitalName(comboBoxhosp1.getSelectedItem().toString());
                searchComm.get(0).setHosp(hp);
                JOptionPane.showMessageDialog(this, "Data has been updated");

            } else {
                JOptionPane.showMessageDialog(this, "Please Fill All the fields");
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtId1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtId1KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtId1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btncreatee;
    private javax.swing.JComboBox<String> comboBoxhosp;
    private javax.swing.JComboBox<String> comboBoxhosp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtDoc1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtSpeciality1;
    // End of variables declaration//GEN-END:variables
    public void popcity() {
        comboBoxhosp.removeAllItems();
        comboBoxhosp.addItem("");

        for (City ct : mainSystem.getAllcities()) {
            for (Hospital hsp : ct.getAllHospitals()) {
                comboBoxhosp.addItem(hsp.getHospitalName());
            }

        }
    }

    private void popTable() {
        tblRecords.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        DefaultTableModel m1 = (DefaultTableModel) tblRecords.getModel();
        m1.setRowCount(0);
        for (Doctor doc : mainSystem.getDoctorDir().getAllDoctors()) {
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getDocId();
            row[2] = doc.getHosp().getHospitalName();
            for (City ct : mainSystem.getAllcities()) {
                row[3] = ct.searchHospital(doc.getHosp().getHospitalName()).get(0).getHospitalId();
            }
            row[4] = doc.getDocContactNumber();
            row[5] = doc.getSpecialty();
            m1.addRow(row);
        }

    }

    public void popHosp(String city) {
        comboBoxhosp1.removeAllItems();
        comboBoxhosp1.addItem(city);
        for (City ct : mainSystem.getAllcities()) {
            for (Hospital hsp : ct.getAllHospitals()) {
                if (hsp.getHospitalName().equals(city)) {
                } else {
                    comboBoxhosp1.addItem(hsp.getHospitalName());
                }
            }
        }

    }
}
