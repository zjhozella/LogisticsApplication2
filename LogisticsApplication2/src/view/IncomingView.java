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
public class IncomingView {
    
    //All variables used for storage of data entered into the fields
    
    //Load attribute initialization
    private int truckNumber, trailerNumber, dunnageIndex;
    private boolean loadComplete;
    
    //Employee attrubute initialization
    private int employeeID;
    private String employeeFN;
    private String employeeLN;
    
    //IncomingTrans attribute initialization
    private boolean insectDetected;
    private Timestamp inTS;
    
    public IncomingView(){
        //Will contain all fields to collect data required for an incoming load
        //Submit button will transfer all data into the ConfirmationView for confirmation from the user
        //Use the truckNumber and trailerNumber pair to find matching loadNumber to send to confirmationView
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
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the employeeFN
     */
    public String getEmployeeFN() {
        return employeeFN;
    }

    /**
     * @param employeeFN the employeeFN to set
     */
    public void setEmployeeFN(String employeeFN) {
        this.employeeFN = employeeFN;
    }

    /**
     * @return the employeeLN
     */
    public String getEmployeeLN() {
        return employeeLN;
    }

    /**
     * @param employeeLN the employeeLN to set
     */
    public void setEmployeeLN(String employeeLN) {
        this.employeeLN = employeeLN;
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
     * @return the inTS
     */
    public Timestamp getInTS() {
        return inTS;
    }

    /**
     * @param inTS the inTS to set
     */
    public void setInTS(Timestamp inTS) {
        this.inTS = inTS;
    }

}