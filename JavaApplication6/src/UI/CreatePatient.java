/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.MainSys;
import model.CredentialDirectory;
import model.Doctor;
import model.Hospital;

/**
 *
 * @author harshitaranganath
 */
public class CreatePatient extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatient
     */
    MainSys mainSystem;
    CredentialDirectory allcredentials;

    public CreatePatient(MainSys mainSystem, CredentialDirectory allcredentials) {
        initComponents();
        this.mainSystem = mainSystem;
        this.allcredentials = allcredentials;
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
        txtSearchHosp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSearchDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSearchComm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSearchHosp = new javax.swing.JButton();
        btnSearchDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        jLabel2.setText("Search for nearby hospitals and doctors");

        jLabel3.setText("Search Hospital");

        jLabel4.setText("Search Doctors");

        jLabel5.setText("Input Community");

        txtSearchComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCommActionPerformed(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital", "Hospital ID", "Doctor", "Doctor ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearchHosp.setText("Search");

        btnSearchDoc.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(577, 577, 577)
                        .addComponent(btnSearchDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSearchHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchComm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSearchHosp)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSearchComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSearchDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchHosp)
                    .addComponent(txtSearchHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCommActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtSearchComm.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Search term");
        } else {
            ArrayList<Doctor> searchComm = new ArrayList();
            searchComm = searchByhosp(searchBycomm(txtSearchComm.getText()));
            if (searchComm.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Records matching with this Community");
            } else {
                popTable(searchComm);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchDoc;
    private javax.swing.JButton btnSearchHosp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtSearchComm;
    private javax.swing.JTextField txtSearchDoc;
    private javax.swing.JTextField txtSearchHosp;
    // End of variables declaration//GEN-END:variables
    private void popTable(ArrayList<Doctor> searchComm) {
        DefaultTableModel m1 = (DefaultTableModel) tblRecords.getModel();
        m1.setRowCount(0);
        for (Doctor Dc : searchComm) {
            Object[] row = new Object[6];
            for (City ct : mainSystem.getAllcities()) {
                row[0] = ct.searchHospital(Dc.getHosp().getHospitalName()).get(0).getHospitalId();
            }
            row[1] = Dc.getHosp().getHospitalName();
            row[2] = Dc.getDocName();
            row[3] = Dc.getDocId();
            m1.addRow(row);
        }
    }

    private ArrayList<Hospital> searchBycomm(String name) {
        ArrayList<Community> searchComm = new ArrayList();
        ArrayList<Hospital> searchHosp = new ArrayList();
        for (City ct : mainSystem.getAllcities()) {
            for (Hospital hosp : ct.getAllHospitals()) {
                if (hosp.getCommunity().getCommunityName().equals(name)) {
                    Hospital hp = new Hospital();
                    hp.setHospitalName(hosp.getHospitalName());
                    hp.setHospitalId(hosp.getZipCode());
                    searchHosp.add(hp);
                }
            }
        }
        return searchHosp;
    }

    private ArrayList<Doctor> searchByhosp(ArrayList<Hospital> searchHosp) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Community> searchComm = new ArrayList();
        ArrayList<Doctor> searchDoc = new ArrayList();
        for (Doctor doc : mainSystem.getDoctorDir().getAllDoctors()) {
            for (Hospital hosp : searchHosp) {
                if (hosp.getHospitalName().equals(doc.getHosp().getHospitalName())) {
                    Doctor dc = new Doctor();
                    Hospital hsp = new Hospital();
                    dc.setDocName(doc.getDocName());
                    dc.setSpecialty(doc.getSpecialty());
                    dc.setDocContactNumber(doc.getDocContactNumber());
                    dc.setDocId(doc.getDocId());
                    hsp.setHospitalName(hosp.getHospitalName());
                    hsp.setHospitalId(hosp.getHospitalId());
                    dc.setHosp(hsp);
                    searchDoc.add(dc);
                }

            }

        }
        return searchDoc;
    }

}