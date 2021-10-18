/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.security.Timestamp;

/**
 *
 * @author jprince, zjhoz
 */
public class OutgoingView {

    //All variables used for storage of data entered into the fields
    
    //Load attribute initialization
    private int loadNumber, truckNumber, trailerNumber, dunnageIndex, storeNumber, sealNumber;
    private boolean loadComplete;
    
    //Driver attribute initialization
    private String newDlNumber, newFirstName, newLastName, newCompany;
    
    //Employee attrubute initialization
    private int id;
    private String firstName, lastName;
    
    //OutgoingTrans attribute initialization
    private boolean insectDetected;
    private Timestamp outTS;
    

    public OutgoingView(){
        //Will contain all fields to collect data required for an outgoing load
        //Submit button will transfer all data into the ConfirmationView outgoing constructor 
        //for confirmation from the user
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
     * @return the newDlNumber
     */
    public String getNewDlNumber() {
        return newDlNumber;
    }

    /**
     * @param newDlNumber the newDlNumber to set
     */
    public void setNewDlNumber(String newDlNumber) {
        this.newDlNumber = newDlNumber;
    }

    /**
     * @return the newFirstName
     */
    public String getNewFirstName() {
        return newFirstName;
    }

    /**
     * @param newFirstName the newFirstName to set
     */
    public void setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
    }

    /**
     * @return the newLastName
     */
    public String getNewLastName() {
        return newLastName;
    }

    /**
     * @param newLastName the newLastName to set
     */
    public void setNewLastName(String newLastName) {
        this.newLastName = newLastName;
    }

    /**
     * @return the newCompany
     */
    public String getNewCompany() {
        return newCompany;
    }

    /**
     * @param newCompany the newCompany to set
     */
    public void setNewCompany(String newCompany) {
        this.newCompany = newCompany;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the insectDetected
     */
    public boolean isInsectDetected() {
        return insectDetected;
    }

    /**
     * @param insectDetected the insectDetected to set
     */
    public void setInsectDetected(boolean insectDetected) {
        this.insectDetected = insectDetected;
    }

    /**
     * @return the outTS
     */
    public Timestamp getOutTS() {
        return outTS;
    }

    /**
     * @param outTS the outTS to set
     */
    public void setOutTS(Timestamp outTS) {
        this.outTS = outTS;
    }
}
