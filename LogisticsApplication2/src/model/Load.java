/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zjhoz, jprince
 */
public class Load {
    
    //Intializing attributes
    private int truckNumber;
    private int trailerNumber;

    // 0 - "Empty" 1 - "1/4" 2 - "1/2" 3 - "3/4" 4 - "Full"
    private int dunnageIndex;

    private int storeNumber;
    private int loadNumber;
    
    private boolean loadComplete = false;

    //Load Parent Constructor
    public Load (int newLoadNumber, int newTruckNumber, int newTrailerNumber, int newDunnageIndex, boolean newLoadComplete){
        loadNumber = newLoadNumber;
        truckNumber = newTruckNumber;
        trailerNumber = newTrailerNumber;
        dunnageIndex = newDunnageIndex;
        loadComplete = newLoadComplete;
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
     * @return the dunnageIndex
     */
    public int getDunnageIndex() {
        return dunnageIndex;
    }

    /**
     * @param dunnageIndex the dunnageIndex to set
     */
    public void setDunnageIndex(int dunnageIndex) {
        this.dunnageIndex = dunnageIndex;
    }

    public String printLoad(){
        return "Load Number: " + getLoadNumber() + " TruckNumber: " + getTruckNumber() + " TrailerNumber: " + getTrailerNumber()
            + " Dunnage Index: " + getDunnageIndex() + " Load Complete: " + isLoadComplete();
    
    }
}