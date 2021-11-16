/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;
import model.*;
import view.OutgoingView;

/**
 *
 * @author zjhoz
 */
public class OutgoingCntl {
    
    private Scanner scnr = new Scanner(System.in);

    //All variables used for storage of data entered into the fields
    
    //Load attribute initialization
    private int truckNumber, trailerNumber, dunnageIndex, storeNumber, sealNumber;
    private boolean loadComplete;
    
    //Driver attribute initialization
    private String DLNumber, DFirstName, DLastName, DCompany;
    
    //Employee attrubute initialization
    private int EID;
    private String EFirstName, ELastName;
    
    //OutgoingTrans attribute initialization
    private boolean insectDetected = false;
    
    //Navigation Test
    public OutgoingCntl(){
        
        
    }

    // Take input from ConfirmationView, feed into Load object constructor for an outgoing load
    public void createOutgoingLoad(){
        
        Date date = new Date();
        long time = date.getTime();
        Timestamp outTS = new Timestamp(time);
        
        System.out.println("CREATE OUTGOING LOAD:\n");
        
        System.out.print("Enter Truck Number:");
        setTruckNumber(getScnr().nextInt());
        
        System.out.print("Enter Trailer Number:");
        setTrailerNumber(getScnr().nextInt());
        
        dunnageIndex = 0; //default
        loadComplete = false; //default
        
        System.out.print("Enter Store Number:");
        setStoreNumber(getScnr().nextInt());
        
        System.out.print("Enter Seal Number:");
        setSealNumber(getScnr().nextInt());
        
        System.out.print("Enter Driver License Number:");
        setDLNumber(getScnr().next());
        
        System.out.print("Enter Driver First Name:");
        setDFirstName(getScnr().next());
        
        System.out.print("Enter Driver Last Name:");
        setDLastName(getScnr().next());
        
        System.out.print("Enter Driver Company:");
        setDCompany(getScnr().next());
        
        System.out.print("Enter Employee ID:");
        setEID(getScnr().nextInt());
        
        System.out.print("Enter Employee First Name:");
        setEFirstName(getScnr().next());
        
        System.out.print("Enter Employee Last Name:");
        setELastName(getScnr().next());

        System.out.print("Are insects detected? 'n' - No || 'y' - Yes: ");
        //Take input of next char 'y' or 'Y' will setInsectDetected to true, otherwise, false = default.
        char char1 = getScnr().next().charAt(0);
        
        if (char1 == 'y' || char1== 'Y'){
            setInsectDetected(true);
        }

        //Driver object creation
        Driver driver = new Driver(DLNumber, DFirstName, DLastName, DCompany);
        
        //Employee object creation
        Employee employee = new Employee(EID, EFirstName, ELastName);
        //OutgoingTrans object creation
        OutgoingTrans ot = new OutgoingTrans(Model.getOutList().size() , truckNumber, trailerNumber, dunnageIndex, loadComplete, storeNumber, sealNumber, employee, driver, insectDetected, outTS);
        Model.addToOutList(ot);
    }
    
    //Prints all outgoing load information
    public void showAllOutgoing(){
            OutgoingView.displayAllOutgoingLoad();
    }

    /**
     * @return the scnr
     */
    public Scanner getScnr() {
        return scnr;
    }

    /**
     * @param scnr the scnr to set
     */
    public void setScnr(Scanner scnr) {
        this.scnr = scnr;
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
     * @return the DLNumber
     */
    public String getDLNumber() {
        return DLNumber;
    }

    /**
     * @param DLNumber the DLNumber to set
     */
    public void setDLNumber(String DLNumber) {
        this.DLNumber = DLNumber;
    }

    /**
     * @return the DFirstName
     */
    public String getDFirstName() {
        return DFirstName;
    }

    /**
     * @param DFirstName the DFirstName to set
     */
    public void setDFirstName(String DFirstName) {
        this.DFirstName = DFirstName;
    }

    /**
     * @return the DLastName
     */
    public String getDLastName() {
        return DLastName;
    }

    /**
     * @param DLastName the DLastName to set
     */
    public void setDLastName(String DLastName) {
        this.DLastName = DLastName;
    }

    /**
     * @return the DCompany
     */
    public String getDCompany() {
        return DCompany;
    }

    /**
     * @param DCompany the DCompany to set
     */
    public void setDCompany(String DCompany) {
        this.DCompany = DCompany;
    }

    /**
     * @return the EID
     */
    public int getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(int EID) {
        this.EID = EID;
    }

    /**
     * @return the EFirstName
     */
    public String getEFirstName() {
        return EFirstName;
    }

    /**
     * @param EFirstName the EFirstName to set
     */
    public void setEFirstName(String EFirstName) {
        this.EFirstName = EFirstName;
    }

    /**
     * @return the ELastName
     */
    public String getELastName() {
        return ELastName;
    }

    /**
     * @param ELastName the ELastName to set
     */
    public void setELastName(String ELastName) {
        this.ELastName = ELastName;
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
}
