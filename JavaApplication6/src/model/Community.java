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
public class Community {

    private String communityName;
    private int zipCode;
    private ArrayList<House> allHouses;
    private ArrayList<Hospital> allHospitals;
    private Hospital hospital;
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<House> getAllHouses() {
        return allHouses;
    }

    public void setAllHouses(ArrayList<House> allHouses) {
        this.allHouses = allHouses;
    }

    public ArrayList<Hospital> getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
        this.city = city;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Community() {
        this.zipCode = 0;
        this.communityName = "";
        this.allHouses = new ArrayList<>();
        this.allHospitals = new ArrayList<>();
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouses() {
        return allHouses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.allHouses = houses;
    }

    public House addNewHouse() {

        House newHouse = new House();
        allHouses.add(newHouse);
        return newHouse;
    }

    public void deleteHouse(House ms) {
        allHouses.remove(ms);
    }

    public Hospital addNewHosp() {

        Hospital newHosp = new Hospital();
        allHospitals.add(newHosp);
        return newHosp;
    }

    public ArrayList<House> searchHouse(String house1) {
        ArrayList<House> searchHouse = new ArrayList();
        for (House hs1 : allHouses) {
            if (hs1.getHouseAddress().toLowerCase().equals(house1.toLowerCase())) {

                searchHouse.add(hs1);

            }
        }
        return searchHouse;
    }

    public boolean checkhouseid(int id) {
        ArrayList<House> searchHouse = new ArrayList();
        for (House hse : allHouses) {
            if (hse.getHouseNum() == id) {

                searchHouse.add(hse);

            }
        }
        if(searchHouse.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return communityName;
    }

}
