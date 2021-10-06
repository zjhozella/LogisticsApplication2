/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author zjhoz
 */
public class Load {
    // Default constructor
    private int truckNumber   = 0;
    private int trailerNumber = 0;

    //Dunnage Array
    String[] dunnage = {"empty", "1/4", "1/2", "3/4", "Full"};

    private int storeNumber   = 0;
    private int sealNumber    = 0;
    private String driverNumber  = "";
    private boolean loadComplete = false;

    
    Date date = new Date();
    long time = date.getTime();
    Timestamp ts = new Timestamp(time);


    // Constructor for load class
    public Load (int loadNumber, int newTruckNumber, int newTrailerNumber, int newStoreNumber , int newSealNumber , String newDriverNumber ,
                 boolean newLoadComplete, Timestamp newTS){
        this.trailerNumber = newTrailerNumber;
        this.truckNumber   = newTruckNumber;
        this.storeNumber   = newStoreNumber;
        this.sealNumber    = newSealNumber;
        this.driverNumber  = newDriverNumber;
        this.loadComplete  = newLoadComplete;
        this.ts = newTS;
        
        // Need to figure this part out still

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
    public String getDriverNumber() {
        return driverNumber;
    }

    /**
     * @param driverNumber the driverNumber to set
     */
    public void setDriverNumber(String driverNumber) {
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

  
}