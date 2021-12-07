/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;
import model.*;
import view.IncomingView;
import view.OutgoingView;

/**
 *
 * @author zjhoz
 */
public class IncomingCntl {
    
    private Scanner scnr = new Scanner(System.in);
    
    //All variables used for storage of data entered into the fields
    
    //Load attribute initialization
    private int loadNumber, truckNumber, trailerNumber, dunnageIndex;
    private boolean loadComplete;
    
    //Employee attrubute initialization
    private int employeeID;
    private String employeeFN;
    private String employeeLN;
    
    //IncomingTrans attribute initialization
    private boolean insectDetected;
    
    //Default incoming controller
    public IncomingCntl(){
        
    }
    
    public void createIncomingLoad(){
        
        Date date = new Date();
        long time = date.getTime();
        Timestamp inTS = new Timestamp(time);
        
        System.out.println("CREATE INCOMING LOAD:\n");
        
        //Shows all Outgoing Transactions that have loadComplete = false, meaning the attached incoming transaction is incomplete
        NavigationCntl.outCntl.showAllIncompleteOutgoing();
        
        //Prompts the user to choose which load they have incoming
        System.out.print("Please enter the load number that is incoming: ");
        setLoadNumber(getScnr().nextInt());
       
        //Sets loadComplete to true for both the Outgoing and Incoming transaction
        loadComplete = true;
        Model.getOutList().get(loadNumber).setLoadComplete(loadComplete);
        
        //Gets the new dunnage index from the user
        System.out.print("Enter Dunnage Number( (0) = Empty || (1) = 1/4 || (2) = 1/2 || (3) = 3/4 || (4) = Full ) :");
        setDunnageIndex(getScnr().nextInt());
        
        //Gets the new employee ID from the user
        System.out.print("Enter Employee ID:");
        setEmployeeID(getScnr().nextInt());
        
        //Gets the new employee first name from the user
        System.out.print("Enter Employee First Name:");
        setEmployeeFN(getScnr().next());
        
        //Gets the new employee last name from the user
        System.out.print("Enter Employee Last Name:");
        setEmployeeLN(getScnr().next());
        
        //Gets whether or not there is an insect detected on the incoming load
        System.out.print("Are insects detected? 'n' - No || 'y' - Yes: ");
        //Take input of next char 'y' or 'Y' will setInsectDetected to true, otherwise, false = default.
        char char1 = getScnr().next().charAt(0);
        
        if (char1 == 'y' || char1== 'Y'){
            setInsectDetected(true);
        }
        
        //Employee object creation for the incoming transaction
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);

        /*
            Takes all of the information we collected from the user and sets it in the respective 
            place of the already created incoming transaction.
        */
        Model.getInList().get(loadNumber).setLoadComplete(loadComplete);
        Model.getInList().get(loadNumber).setDunnageIndex(dunnageIndex);
        Model.getInList().get(loadNumber).setEmployee(employee);
        Model.getInList().get(loadNumber).setInsectDetected(insectDetected);
        Model.getInList().get(loadNumber).setTsIn(inTS);

       
    }
    
    /*
        Shows all Incoming Load's information
    */
    public void showAllIncoming(){
        IncomingView.displayAllIncomingLoad();
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

}
