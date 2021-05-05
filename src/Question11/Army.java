/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 * 
 * @author Chandra Bhanu Tata 
 */

public class Army {
    
    private String soldierName;
    private int noOfSoldiers;
    private String locations;
    /**
     * Constructor for the above declared attributes
     * @param soldierName
     * @param noOfDoctors
     * @param Address 
     */
    public Army(String soldierName, int noOfDoctors, String Address) {
        this.soldierName = soldierName;
        this.noOfSoldiers = noOfSoldiers;
        this.locations = locations;
    }
    public String getSoldierName() {
        return soldierName;
    }


    public int getNoOfSoldiers() {
        return noOfSoldiers;
    }


    public String getLocations() {
        return locations;
    }
    /**
     *Here hashcode method is overrided the hash code that returns based 
     * upon the three attributes given that is name, no of doctors,Address
     * Whenever their are two objects of hospital class with same attribute
     * values then their hashcode will also be similar.
     * @return hash code of that object
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.soldierName);
        hash = 37 * hash + this.noOfSoldiers;
        hash = 37 * hash + Objects.hashCode(this.locations);
        return hash;
    }

    /**
     * Equals method is overrided and this method is going to tell the compiler 
     *to check Hospital class attributes that is its name, no of doctors,Address 
     * if we use equals method to compare the objects of hospital and if it has
     * the same values for its attributes then it returns as true else false
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Army other = (Army) obj;
        if (this.noOfSoldiers != other.noOfSoldiers) {
            return false;
        }
        if (!Objects.equals(this.soldierName, other.soldierName)) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }
    
}
