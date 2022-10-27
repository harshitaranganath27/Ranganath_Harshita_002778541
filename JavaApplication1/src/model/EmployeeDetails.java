/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sushmithaprathap
 */
public class EmployeeDetails {

    private ArrayList<Employee> history;

    public EmployeeDetails() { //constructor
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }

    public Employee addNewEmployee() {  //method to add new employee to the history arraylist
        Employee newEmployee = new Employee();    //create empty employee of type Employee
        history.add(newEmployee);   //adds it to the history
        return newEmployee; // returns the reference to the new employee so we add the new data
    }
	
    public void deleteEmployee(Employee em) {
        history.remove(em);
    }

    public void updateEmployee(Employee em, int row) {
        history.set(row, em);
    }

}
