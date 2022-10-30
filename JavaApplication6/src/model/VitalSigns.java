/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harshitaranganath
 */
public class VitalSigns {

    private Float bloodPressure;
    private Float bodyTemp;
    private Float rr;


    public VitalSigns(){
        this.bloodPressure = 0.0f;
        this.bodyTemp = 0.0f;
        this.rr = 0.0f;
    }
    
    public Float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(Float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public Float getRr() {
        return rr;
    }

    public void setRr(Float rr) {
        this.rr = rr;
    }
    
}
