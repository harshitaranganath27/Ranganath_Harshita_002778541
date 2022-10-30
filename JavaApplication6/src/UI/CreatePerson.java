/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.CredentialDirectory;
import model.Doctor;
import model.Hospital;
import model.MainSys;
import model.Person;
import model.House;

/**
 *
 * @author harshitaranganath
 */
public class CreatePerson extends javax.swing.JPanel {

    /**
     * Creates new form CreatePerson
     */
    CredentialDirectory cred;
    MainSys mainSystem;

    public CreatePerson(MainSys mainSystem, CredentialDirectory cred) {
        initComponents();
        this.mainSystem = mainSystem;
        this.cred = cred;
        popHouses();
    }

    public boolean rolecheck() {
        Main mainObj = new Main();
        String password;
        String username;
        String role;
        password = "admin";
        username = "admin";
        role = mainObj.getrole();
        boolean b1 = cred.checkSysAdminCred(username, password, role);
        return b1;
    }

    public boolean fieldcheck() {
        if (txtContact.getText().length() != 0 || txtGender.getText().length() != 0 || txtNameid.getText().length() != 0 || txtName.getText().length() != 0 || txtDesignation.getText().length() != 0 || combobxAdd.getSelectedItem().toString().length() != 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean fieldcheck1() {
        if (txtContact1.getText().length() != 0 || txtGender1.getText().length() != 0 || txtNameid1.getText().length() != 0 || txtName1.getText().length() != 0 || txtDesignation1.getText().length() != 0 || combobxAdd1.getSelectedItem().toString().length() != 0) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDob = new javax.swing.JFormattedTextField();
        txtName = new javax.swing.JTextField();
        txtNameid = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnpopulate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        combobxAdd = new javax.swing.JComboBox<>();
        txtNameid1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDob1 = new javax.swing.JFormattedTextField();
        txtGender1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        txtDesignation1 = new javax.swing.JTextField();
        combobxAdd1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();

        setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Citizen");

        jLabel2.setText("Create Persons");

        jLabel3.setText("Name");

        jLabel4.setText("Name Id");

        jLabel5.setText("Gender");

        jLabel6.setText("Date of Birth");

        jLabel7.setText("Contact");

        jLabel8.setText("Designation");

        jLabel9.setText("Address");

        txtDob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        txtNameid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameidKeyTyped(evt);
            }
        });

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Name ID", "Gender", "Date of Birth", "Contact", "Designation", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnpopulate.setText("Populate Table");
        btnpopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpopulateActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        combobxAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Name Id");

        jLabel11.setText("Name");

        jLabel12.setText("Gender");

        jLabel13.setText("Date of Birth");

        txtDob1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));

        jLabel14.setText("Contact");

        jLabel15.setText("Designation");

        combobxAdd1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Address");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameid1)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGender1)
                            .addComponent(txtDob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(66, 66, 66)
                                .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobxAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(41, 41, 41)
                                .addComponent(txtDesignation1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDesignation)
                            .addComponent(txtContact)
                            .addComponent(txtGender)
                            .addComponent(txtNameid)
                            .addComponent(txtDob)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(combobxAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(btnpopulate)
                                .addGap(215, 215, 215))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnCreate)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(446, 446, 446))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(454, 454, 454))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(483, 483, 483))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContact, txtDesignation, txtDob, txtGender, txtName, txtNameid});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContact1, txtDesignation1, txtDob1, txtGender1, txtName1, txtNameid1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNameid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(combobxAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(btnpopulate))))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtNameid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(combobxAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtDesignation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
        } else {
            DefaultTableModel m2 = (DefaultTableModel) tblRecords.getModel();
            Person SelectedRecords = (Person) m2.getValueAt(SelectedRow, 0);
            txtName1.setText(SelectedRecords.getNameOfPerson());
            txtDesignation1.setText(SelectedRecords.getDesignation());
            txtNameid1.setText(String.valueOf(SelectedRecords.getIdentification()));
            txtContact1.setText(String.valueOf(SelectedRecords.getContactDetails()));
            txtGender1.setText(SelectedRecords.getGender());
            txtDob.setText(String.valueOf(SelectedRecords.getDob()));
            popHouses1(SelectedRecords.getHouse().getHouseAddress());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean b1 = rolecheck();
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if (b1) {
            DefaultTableModel defaultModel = (DefaultTableModel) tblRecords.getModel();
            Person SelectedRecords = (Person) defaultModel.getValueAt(SelectedRow, 0);
            mainSystem.getPersonDir().deletePerson(SelectedRecords);
            JOptionPane.showMessageDialog(this, "Selected row has been deleted");
            popTable();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnpopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpopulateActionPerformed
        // TODO add your handling code here:
        popTable();
    }//GEN-LAST:event_btnpopulateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (fieldcheck()) {
            Person pn = mainSystem.getPersonDir().addNewPerson();
            House hse = new House();
            String name = txtName.getText();
            String gen = txtGender.getText();
            Long mob = Long.valueOf(txtContact.getText());
            int id1 = Integer.valueOf(txtNameid.getText());
            String Add = combobxAdd.getSelectedItem().toString();
            String date1 = txtDob.getText();
            String designmation = txtDesignation.getText();

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                pn.setDob(dateFormat.parse(date1));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Please Input Correct Date Format");
            }

            pn.setNameOfPerson(name);
            pn.setGender(gen);
            pn.setContactDetails(mob);
            pn.setDesignation(designmation);
            pn.setIdentification(id1);

            hse.setHouseAddress(Add);
            pn.setHouse(hse);

            txtName.setText("");
            txtGender.setText("");
            txtContact.setText("");
            txtNameid.setText("");
            txtDob.setText("");
            txtDesignation.setText("");
            popHouses();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all records");
        }


    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int SelectedRow = tblRecords.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
        } else {
            if (fieldcheck1()) {
                DefaultTableModel m2 = (DefaultTableModel) tblRecords.getModel();
                Person SelectedRecords = (Person) m2.getValueAt(SelectedRow, 0);
                ArrayList<Person> searchComm = mainSystem.getPersonDir().searchPerson(SelectedRecords.getNameOfPerson());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                searchComm.get(0).setNameOfPerson(txtName.getText());
                searchComm.get(0).setIdentification(Integer.valueOf(txtNameid.getText()));
                searchComm.get(0).setContactDetails(Long.valueOf(txtContact1.getText()));
                searchComm.get(0).setGender(txtGender1.getText());
                try { 
                    searchComm.get(0).setDob(dateFormat.parse(txtDob.getText()));
                    
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Please Input Correct Date Format"); 
                }
                House hse = new House();
                hse.setHouseAddress(combobxAdd.getSelectedItem().toString());
                searchComm.get(0).setHouse(hse);                           
                JOptionPane.showMessageDialog(this, "Data has been updated");
            } else {
                JOptionPane.showMessageDialog(this, "Please Fill all the fields");
            }

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtNameidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameidKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameidKeyTyped

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContactKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnpopulate;
    private javax.swing.JComboBox<String> combobxAdd;
    private javax.swing.JComboBox<String> combobxAdd1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtDesignation1;
    private javax.swing.JFormattedTextField txtDob;
    private javax.swing.JFormattedTextField txtDob1;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNameid;
    private javax.swing.JTextField txtNameid1;
    // End of variables declaration//GEN-END:variables
    public void popHouses() {
        combobxAdd.removeAllItems();
        combobxAdd.addItem("");
        for (City Cs : this.mainSystem.getAllcities()) {
            for (Community Cs1 : Cs.getAllCommunities()) {
                for (House Cs2 : Cs1.getAllHouses()) {
                    combobxAdd.addItem(Cs2.getHouseAddress());
                }
            }
        }
    }

    public void popHouses1(String city) {
        combobxAdd1.removeAllItems();
        combobxAdd1.addItem(city);
        for (City ct : mainSystem.getAllcities()) {
            for (Community Cs1 : ct.getAllCommunities()) {
                for (House Cs2 : Cs1.getAllHouses()) {
                    if (Cs2.getHouseAddress().equals(city)) {
                    } else {
                        combobxAdd1.addItem(Cs2.getHouseAddress());
                    }
                }

            }

        }

    }

    private void popTable() {
        tblRecords.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        DefaultTableModel model = (DefaultTableModel) tblRecords.getModel();
        model.setRowCount(0);
        for (Person person : mainSystem.getPersonDir().getAllPeople()) {
            Object[] row = new Object[7];
            row[0] = person;
            row[1] = person.getIdentification();
            row[2] = person.getGender();
            row[3] = person.getDob();
            row[4] = person.getContactDetails();
            row[5] = person.getDesignation();
            row[6] = person.getHouse().getHouseAddress();
            model.addRow(row);
        }

    }
}
