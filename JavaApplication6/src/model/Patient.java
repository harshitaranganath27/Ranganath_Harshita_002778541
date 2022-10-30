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
public class Patient{
    private String nameOfPatient;
    private int patientId;
    private Long contactInfo;
    private EncounterHistory encHistory;
    private ArrayList<Encounter> encDir;  

    public Patient(){
        this.nameOfPatient = "";
        this.encDir = new ArrayList<>();
    }
    
    public ArrayList<Encounter> getEncDir() {
        return encDir;
    }

    public void setEncDir(ArrayList<Encounter> encDir) {
        this.encDir = encDir;
    }

    
    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Long getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Long contactInfo) {
        this.contactInfo = contactInfo;
    }

    public EncounterHistory getEncHistory() {
        return encHistory;
    }

    public void setEncHistory(EncounterHistory encHistory) {
        this.encHistory = encHistory;
    }

    public Encounter addEncounter(){

    Encounter newEnc = new Encounter();
    encDir.add(newEnc);
    return newEnc;
    
    }       

    @Override  
    public String toString(){
        return nameOfPatient;
    }     
    
}
