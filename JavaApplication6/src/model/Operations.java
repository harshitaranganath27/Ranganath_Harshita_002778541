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
public class Operations {
    private ArrayList<MainSys> ops;
    
    public Operations() {
        this.ops = new ArrayList<MainSys>();
    }

    public MainSys addNew(){
        MainSys newattbs = new MainSys();
        ops.add(newattbs);
        return newattbs;
    }    

    public ArrayList<MainSys> getOps() {
        return ops;
    }

    public void setOps(ArrayList<MainSys> ops) {
        this.ops = ops;
    }

    public void deleteEmployee(MainSys ms) {
        ops.remove(ms);
    }            
        
}

