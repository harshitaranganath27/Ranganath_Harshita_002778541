/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sirius
 */
public class EmployeeDetails {
    private ArrayList<Employee> empDetailsList;
    
    public EmployeeDetails(){
        this.empDetailsList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpDetailsList() {
        return empDetailsList;
    }

    public void setEmpDetailsList(ArrayList<Employee> empDetailsList) {
        this.empDetailsList = empDetailsList;
    }
    
    public Employee addNewEmployeeDetails(){
        Employee employee = new Employee();
        empDetailsList.add(employee);
        return employee;
    }
}
