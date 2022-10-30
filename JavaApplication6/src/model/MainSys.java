/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/**
 *
 * @author harshitaranganath
 */
public class MainSys {

    private City city;
    private DoctorDirectory doctorDir;
    private PatientDirectory patientDir;
    private PersonDirectory personDir;
    private House house;
    private Community comm;
    private Hospital hospital;

    public MainSys() {
        this.city = new City();
        this.doctorDir = new DoctorDirectory();
        this.allcities = new ArrayList<City>();
        this.personDir = new PersonDirectory();
        this.patientDir = new PatientDirectory();
    }

    public Hospital gethospital() {
        return hospital;
    }

    public void sethospital(Hospital hospital) {
        this.hospital = hospital;
    }
    private ArrayList<City> allcities;

    public Community getComm() {
        return comm;
    }

    public void setComm(Community comm) {
        this.comm = comm;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public DoctorDirectory getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(DoctorDirectory doctorDir) {
        this.doctorDir = doctorDir;
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDirectory personDir) {
        this.personDir = personDir;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City addnewCity() {

        City newCity = new City();
        allcities.add(newCity);
        return newCity;
    }

    public ArrayList<City> getAllcities() {
        return allcities;
    }

    public void setAllcities(ArrayList<City> allcities) {
        this.allcities = allcities;
    }

    public void deleteCity(City ms) {
        allcities.remove(ms);
    }

    public ArrayList<City> searchCity(String city1) {
        ArrayList<City> searchCity = new ArrayList();
        for (City city : allcities) {
            if (city.getCityName().toLowerCase().equals(city1.toLowerCase())) {
                searchCity.add(city);
            }
        }
        return searchCity;
    }

    public boolean checkCityid(int id) {
        ArrayList<City> searchCity = new ArrayList();
        for (City cty : allcities) {
            if (cty.getCityId() == id) {
                searchCity.add(cty);
            }
        }
        if (searchCity.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
