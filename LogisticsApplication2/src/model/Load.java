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
 * @author zjhoz, jprince
 */
public class Load {
    // Default constructor
    private int truckNumber   = 0;
    private int trailerNumber = 0;

    //Dunnage Array
    private String[] dunnage = {"empty", "1/4", "1/2", "3/4", "Full"};

    private int storeNumber  = 0;
    private int loadNumber   = 0;
    private int sealNumber   = 0;
    private String driverNumber = "";
    
    private boolean loadComplete = false;

    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);

    // Constructor for load class
    public Load (int newloadNumber, int newTruckNumber, int newTrailerNumber, int newStoreNumber , int newSealNumber , String newDriverNumber ,
                 boolean newLoadComplete, Timestamp newTSout, Timestamp newTSin){
        this.loadNumber    = newloadNumber;
        this.trailerNumber = newTrailerNumber;
        this.truckNumber   = newTruckNumber;
        this.storeNumber   = newStoreNumber;
        this.sealNumber    = newSealNumber;
        this.driverNumber  = newDriverNumber;
        this.loadComplete  = newLoadComplete;
        this.tsOut         = newTSout;
        this.tsIn          = newTSin;

    }
   

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
     * @return the dunnage
     */
    public String[] getDunnage() {
        return dunnage;
    }

    /**
     * @param dunnage the dunnage to set
     */
    public void setDunnage(String[] dunnage) {
        this.dunnage = dunnage;
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
     * @return the loadNumber
     */
    public int getLoadNumber() {
        return loadNumber;
    }

    /**
     * @param loadNumber the loadNumber to set
     */
    public void setLoadNumber(int loadNumber) {
        this.loadNumber = loadNumber;
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

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * @return the tsOut
     */
    public Timestamp getTsOut() {
        return tsOut;
    }

    /**
     * @param tsOut the tsOut to set
     */
    public void setTsOut(Timestamp tsOut) {
        this.tsOut = tsOut;
    }

    /**
     * @return the tsIn
     */
    public Timestamp getTsIn() {
        return tsIn;
    }

    /**
     * @param tsIn the tsIn to set
     */
    public void setTsIn(Timestamp tsIn) {
        this.tsIn = tsIn;
    }


  
}