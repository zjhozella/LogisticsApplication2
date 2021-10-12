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
    private int truckNumber   = 0;
    private int trailerNumber = 0;

    //Dunnage Array -- uses dunnageIndex to determine what string to insert into database (0-5)
    private String[] dunnage = {"Empty", "1/4", "1/2", "3/4", "Full"};
    private int dunnageIndex = 0;

    private int storeNumber  = 0;
    private int loadNumber   = 0;
    private int sealNumber   = 0;
    
    private boolean loadComplete = false;
    
    //Initializing model objects
    private OutgoingTrans ot;
    private Driver dr;
    private IncomingTrans it;

    // Outgoing constructor for Load
    public Load (int newTruckNumber, int newTrailerNumber, int newDunnageIndex, int newStoreNumber,
            int newSealNumber, boolean newLoadComplete, OutgoingTrans newOt, Driver newDr){
        //Generate Load Number
        truckNumber   = newTruckNumber;
        trailerNumber = newTrailerNumber;
        dunnageIndex  = newDunnageIndex;
        storeNumber   = newStoreNumber;
        sealNumber    = newSealNumber;
        loadComplete  = newLoadComplete;
        ot            = newOt;
        dr            = newDr;
        

    }
    
    // Incoming constructor for Load
    public Load(int newLoadNumber, int newDunnageIndex, boolean newLoadComplete, IncomingTrans newIt){
        loadNumber   = newLoadNumber;
        dunnageIndex = newDunnageIndex;
        loadComplete = newLoadComplete;
        it           = newIt;
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
        this.setDunnage(dunnage);
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

    /**
     * @return the ot
     */
    public OutgoingTrans getOt() {
        return ot;
    }

    /**
     * @param ot the ot to set
     */
    public void setOt(OutgoingTrans ot) {
        this.ot = ot;
    }

    /**
     * @return the dr
     */
    public Driver getDr() {
        return dr;
    }

    /**
     * @param dr the dr to set
     */
    public void setDr(Driver dr) {
        this.dr = dr;
    }

    /**
     * @return the it
     */
    public IncomingTrans getIt() {
        return it;
    }

    /**
     * @param it the it to set
     */
    public void setIt(IncomingTrans it) {
        this.it = it;
    }


  
}