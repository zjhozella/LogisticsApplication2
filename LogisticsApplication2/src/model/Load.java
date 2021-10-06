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
    private Timestamp outgoingTime = new Timestamp(2000);
    //Need to input timestamps


    // Constructor for load class
    public Load (int newTrailerNumber, int newTruckNumber, int newStoreNumber , int newSealNumber , int newDriverNumber ,
                 boolean newLoadComplete, Timestamp outgoingTime ){
        this.trailerNumber = newTrailerNumber;
        this.truckNumber   = newTruckNumber;
        this.storeNumber   = newStoreNumber;
        this.sealNumber    = newSealNumber;
        this.driverNumber  = newDriverNumber;
        this.loadComplete  = newLoadComplete;
        
        // Need to figure this part out still
        System.out.println(outgoingTime.toString());
    }

    // Getter and setters for load
    /**
     * @return the truckNumber
     */
    public int getTruckNumber() {
        return truckNumber;
    }

    /**
     * @param truckNumber the truckNumber to set
     */
    public void setTruckNumber(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    /**
     * @return the trailerNumber
     */
    public int getTrailerNumber() {
        return trailerNumber;
    }

    /**
     * @param trailerNumber the trailerNumber to set
     */
    public void setTrailerNumber(int trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    /**
     * @return the storeNumber
     */
    public int getStoreNumber() {
        return storeNumber;
    }

    /**
     * @param storeNumber the storeNumber to set
     */
    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    /**
     * @return the sealNumber
     */
    public int getSealNumber() {
        return sealNumber;
    }

    /**
     * @param sealNumber the sealNumber to set
     */
    public void setSealNumber(int sealNumber) {
        this.sealNumber = sealNumber;
    }

    /**
     * @return the driverNumber
     */
    public int getDriverNumber() {
        return driverNumber;
    }

    /**
     * @param driverNumber the driverNumber to set
     */
    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    /**
     * @return the loadComplete
     */
    public boolean isLoadComplete() {
        return loadComplete;
    }

    /**
     * @param loadComplete the loadComplete to set
     */
    public void setLoadComplete(boolean loadComplete) {
        this.loadComplete = loadComplete;
    }

    /**
     * @return the outgoingTime
     */
    public Timestamp getOutgoingTime() {
        return outgoingTime;
    }

    /**
     * @param outgoingTime the outgoingTime to set
     */
    public void setOutgoingTime(Timestamp outgoingTime) {
        this.outgoingTime = outgoingTime;
    }

  
}