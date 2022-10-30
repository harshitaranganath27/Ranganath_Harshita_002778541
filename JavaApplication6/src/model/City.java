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
public class City{

    private String cityName;
    private int cityId;
    private Community community;
    private ArrayList<Community> allCommunities;    
    private ArrayList<Hospital> allHospitals;

    public ArrayList<Hospital> getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getAllCommunities() {
        return allCommunities;
    }

    public void setAllCommunities(ArrayList<Community> allCommunities) {
        this.allCommunities = allCommunities;
    }

    public City() {
        this.cityName = "";
        this.cityId = 0;
        this.allCommunities = new ArrayList<>();
        this.allHospitals = new ArrayList<>();
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        
        this.community = community;
    }

    public String getName() {
        return cityName;
    }

    public void setName(String Name) {
        this.cityName = Name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public Community addCommunity(){

        Community newCommunity = new Community();
        allCommunities.add(newCommunity);
        return newCommunity;
    }        

    
    public void deleteCommunity(Community ms) {
        allCommunities.remove(ms);
    }            

    public void deleteHospital(Hospital ms) {
        allHospitals.remove(ms);
    }   
    
    public ArrayList<Community> searchCommunity(String comm1)
    {
        ArrayList<Community> searchCommunity = new ArrayList();
        for(Community comm: allCommunities)
        {
            if(comm.getCommunityName().toLowerCase().equals(comm1.toLowerCase()))
            {
                searchCommunity.add(comm);
            }
        }
        return searchCommunity;
    }     
    
    public Hospital addNewHosp(){

    Hospital newHosp = new Hospital();
    allHospitals.add(newHosp);
    return newHosp;
    }             
      
    public ArrayList<Hospital> searchHospital(String hosp)
    {
        ArrayList<Hospital> searchHospital = new ArrayList();
        for(Hospital hs1: allHospitals)
        {
            if(hs1.getHospitalName().toLowerCase().equals(hosp.toLowerCase()))
            {
                searchHospital.add(hs1); 
            }
        }
        return searchHospital;
    }
  
    public boolean checkcommid(int id)
    {
        ArrayList<Community> searchComm= new ArrayList();
        for(Community cty: allCommunities)
        {
            if(cty.getZipCode()==id)
            {
                searchComm.add(cty);
            }
        }
        if(searchComm.isEmpty()){
            
            return false;
        }else{
            return true;
        }
    }      
    
    @Override  
    public String toString(){
        return cityName;
    }        
}
