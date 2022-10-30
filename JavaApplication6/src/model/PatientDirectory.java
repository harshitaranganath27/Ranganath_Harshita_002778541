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
public class PatientDirectory {

    private ArrayList<Patient> allPatients;
    private EncounterHistory encHistory;

    public PatientDirectory() {
        this.allPatients = new ArrayList<>();
        this.encHistory = encHistory;
    }

    public ArrayList<Patient> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(ArrayList<Patient> allPatients) {
        this.allPatients = allPatients;
    }

    public void deletePatient(Patient patient) {
        allPatients.remove(patient);
    }

    public Patient addNewPatient() {
        Patient newpatient = new Patient();
        allPatients.add(newpatient);
        return newpatient;
    }

}
