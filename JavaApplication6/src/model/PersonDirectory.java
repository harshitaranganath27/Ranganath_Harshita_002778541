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
public class PersonDirectory{
    private ArrayList<Person> allPeople;    
    private House house;

    public ArrayList<Person> getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(ArrayList<Person> allPeople) {
        this.allPeople = allPeople;
    }
    
    public void deletePerson(Person person) {
        allPeople.remove(person);
    }    
    public PersonDirectory(){    
        this.allPeople = new ArrayList<Person>();    
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        allPeople.add(newPerson);
        return newPerson;
    }          
    public ArrayList<Person> searchPerson(String city1)
    {
        ArrayList<Person> searchPerson = new ArrayList();
        for(Person city: allPeople)
        {
            if(city.getNameOfPerson().toLowerCase().equals(city1.toLowerCase()))
            {  
                searchPerson.add(city);
            }
        }
        return searchPerson;
    }    
    
}
