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
public class DoctorDirectory {

    private ArrayList<Doctor> allDoctors;

    public DoctorDirectory() {
        this.allDoctors = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(ArrayList<Doctor> allDoctors) {
        this.allDoctors = allDoctors;
    }

    public Doctor addNewDoc() {
        Doctor newDoc = new Doctor();
        allDoctors.add(newDoc);
        return newDoc;
    }

    public void deleteDoc(Doctor ms) {
        allDoctors.remove(ms);
    }

    public ArrayList<Doctor> searchDoctor(String city1) {
        ArrayList<Doctor> searchDoctor = new ArrayList();
        for (Doctor city : allDoctors) {
            if (city.getDocName().toLowerCase().equals(city1.toLowerCase())) {
                searchDoctor.add(city);
            }
        }
        return searchDoctor;
    }

}
