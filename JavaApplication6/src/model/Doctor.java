/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author harshitaranganath
 */
public class Doctor {
    private String docName;
    private int docId;
    private Long docContactNumber;
    private String specialty;
    private ArrayList<VitalSigns> vitalSign;        
    private Hospital hosp;

    public Hospital getHosp() {
        return hosp;
    }

    public void setHosp(Hospital hosp) {
        this.hosp = hosp;
    }
    
    public ArrayList<VitalSigns> getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(ArrayList<VitalSigns> vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Doctor(){
        this.docId = 0;
        this.docName = "";
        this.docContactNumber = 0L;
        this.specialty = "";
        this.vitalSign = new ArrayList<>();
        this.hosp = hosp;
    }
    
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Long getDocContactNumber() {
        return docContactNumber;
    }

    public void setDocContactNumber(Long docContactNumber) {
        this.docContactNumber = docContactNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    
        
    public VitalSigns addNewVs(){

    VitalSigns newVs = new VitalSigns();
    vitalSign.add(newVs);
    return newVs;
    
    }  

    @Override  
    public String toString(){
        return docName;
    } 
    
}
