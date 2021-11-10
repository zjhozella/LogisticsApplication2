/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OutgoingCntl;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jprince, zjhoz
 */
public class OutgoingView {

    Scanner scnr = new Scanner(System.in);
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
    private Timestamp outTS;
    

    public OutgoingView(){
        //Will contain all fields to collect data required for an outgoing load
        //Submit button will transfer all data into the ConfirmationView outgoing constructor 
        //for confirmation from the user
        
        
        
        System.out.println("Outgoing Load:\n");
        
        truckNumber = scnr.nextInt();
        
        trailerNumber = scnr.nextInt();
        
        storeNumber = scnr.nextInt();
        
        sealNumber = scnr.nextInt();
        
        DLNumber = scnr.next();
        
        DFirstName = scnr.next();
        
        DLastName = scnr.next();
        
        DCompany = scnr.next();
        
        EID = scnr.nextInt();
        
        EFirstName = scnr.next();
        
        ELastName = scnr.next();
        
        if (scnr.nextInt() != 0){
            insectDetected = true;
        }
        
        OutgoingCntl outCntl = new OutgoingCntl();
        Date date = new Date();
        long time = date.getTime();
        outTS = new Timestamp(time);
        outCntl.createOutgoingLoad(truckNumber, trailerNumber, dunnageIndex, storeNumber, sealNumber, DLNumber, 
                loadComplete, DLNumber, DLNumber, DCompany, EID, DLNumber, DLNumber, insectDetected, outTS);
        
        
        
    }

    public void enterTruckNum(){
        System.out.print("Enter Truck Number:");
    }
    
    public void enterTrailerNum(){
        System.out.print("Enter Trailer Number:");
    }
    
    public void enterStoreNum(){
        System.out.print("Enter Store Number:");
    }
    
    public void enterSealNum() {
        System.out.print("Enter Seal Number:");
    }
    
    public void enterDLNum(){
        System.out.print("Enter Driver License Number:");
    }
    
    public void enterDFirstName(){
        System.out.print("Enter Driver First Name:");
    }
    
    public void enterDLastName(){
        System.out.print("Enter Driver Last Name:");
    }
    
    public void enterDCompany(){
        System.out.print("Enter Driver Company:");
    }
    
    public void enterEID(){
        System.out.print("Enter Employee ID:");
    }
    
    public void enterEFirstName(){
        System.out.print("Enter Employee First Name:");
    }
    
    public void enterELastName(){
        System.out.print("Enter Employee Last Name:");
    }
    
    public void enterInsect(){
        System.out.print("Are there insects detected? (0)-No, (1)-Yes:");
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
        return DLNumber;
    }

    /**
     * @param newDlNumber the newDlNumber to set
     */
    public void setNewDlNumber(String newDlNumber) {
        this.DLNumber = newDlNumber;
    }

    /**
     * @return the newFirstName
     */
    public String getNewFirstName() {
        return DFirstName;
    }

    /**
     * @param newFirstName the newFirstName to set
     */
    public void setNewFirstName(String newFirstName) {
        this.DFirstName = newFirstName;
    }

    /**
     * @return the newLastName
     */
    public String getNewLastName() {
        return DLastName;
    }

    /**
     * @param newLastName the newLastName to set
     */
    public void setNewLastName(String newLastName) {
        this.DLastName = newLastName;
    }

    /**
     * @return the newCompany
     */
    public String getNewCompany() {
        return DCompany;
    }

    /**
     * @param newCompany the newCompany to set
     */
    public void setNewCompany(String newCompany) {
        this.DCompany = newCompany;
    }

    /**
     * @return the id
     */
    public int getId() {
        return EID;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.EID = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return EFirstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.EFirstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return ELastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.ELastName = lastName;
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
