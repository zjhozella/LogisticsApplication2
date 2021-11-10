/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;
import model.Employee;
import model.IncomingTrans;
import model.Model;
import view.IncomingView;

/**
 *
 * @author zjhoz
 */
public class IncomingCntl {
    
    private Scanner scnr = new Scanner(System.in);
    public IncomingView view = new IncomingView();
    
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
    
    //Navigation Test
    public IncomingCntl(){
        view.printTruckNum();
        
    }
    
    public void createIncomingLoad(){
        
        Date date = new Date();
        long time = date.getTime();
        Timestamp inTS = new Timestamp(time);
        
        //Employee object creation
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);
        
        //IncomingTrans object creation
        IncomingTrans it = new IncomingTrans(loadNumber, truckNumber, trailerNumber, dunnageIndex, loadComplete, employee, insectDetected, inTS);
        Model.addToInList(it);

       
    }
    
    public void enterTruckNum(){
        setTruckNumber(getScnr().nextInt());
        view.printTrailerNum();
    }
    
    public void enterTrailerNum(){
        setTrailerNumber(getScnr().nextInt());
        view.printDunnage();
    }
    
    public void enterDunnage(){
        setDunnageIndex(getScnr().nextInt());
        view.printEID();
    }
    
    public void enterEID(){
        setEmployeeID(getScnr().nextInt());
        view.printEFirstName();
    }
    
    public void enterEFirstName(){
        setEmployeeFN(getScnr().next());
        view.printELastName();
    }
    
    public void enterELastName(){
        setEmployeeLN(getScnr().next());
        view.printInsect();
    }
    
    public void enterInsect(){
        if (getScnr().nextInt() != 0){
            setInsectDetected(true);
        }
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

}
