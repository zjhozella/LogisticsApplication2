/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author zjhoz
 */
public class Load {
    // Default constructor
    private int truckNumber   = 0;
    private int trailerNumber = 0;
    private int storeNumber   = 0;
    private int sealNumber    = 0;
    private int driverNumber  = 0;
    private boolean loadComplete = false;
    Timestamp outgoingTime = new Timestamp(2000);
    //Need to input timestamps


    // Constructor for load class
    public Load (int newTrailerNumber, int newTruckNumber, int newStoreNumber , int newSealNumber , int newDriverNumber ,
                 boolean newLoadComplete, Timestamp outgoingTime ){
        this.setTrailerNumber(newTrailerNumber);
        this.setTruckNumber(newTruckNumber);
        this.setStoreNumber(newStoreNumber);
        this.setSealNumber(newSealNumber);
        this.setDriverNumber(newDriverNumber);
        this.setLoadComplete(newLoadComplete);
        // Need to figure this part out still
        System.out.println(outgoingTime.toString());
    }

    public int getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    public int getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(int trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public int getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(int sealNumber) {
        this.sealNumber = sealNumber;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public boolean isLoadComplete() {
        return loadComplete;
    }

    public void setLoadComplete(boolean loadComplete) {
        this.loadComplete = loadComplete;
    }
}