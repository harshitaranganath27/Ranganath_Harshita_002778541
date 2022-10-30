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
public class HospitalDirectory extends City{
    private ArrayList<Hospital> hospDir;

    public ArrayList<Hospital> getHospDir() {
        return hospDir;
    }

    public void setHospDir(ArrayList<Hospital> hospDir) {
        this.hospDir = hospDir;
    }
    
    public HospitalDirectory() {
        this.hospDir = new ArrayList<>();
    }
    
    public Hospital addNewHosp(){
        Hospital newHosp = new Hospital();
        hospDir.add(newHosp);
        return newHosp;
    }      
}
