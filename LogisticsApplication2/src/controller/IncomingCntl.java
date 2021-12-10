/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.*;
import static model.Model.incomingTableModel;
import view.IncomingView;
import view.editInView;

/**
 *
 * @author zjhoz
 */
public class IncomingCntl {
    
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

    private NavigationCntl navigationCntl;
    private static ArrayList<IncomingTrans> inList;
    public IncomingView inUI;
    
    //Default incoming controller
    public IncomingCntl(NavigationCntl newNavigationCntl){
        //supports navigating back to the Main Menu
        navigationCntl = newNavigationCntl;

        //Get the instrument list
        //When instantiated it will get the individual Instruments
        //outList = outgoingTableModel;
        inList = Model.getInList();

        //Create incoming table model and pass inList
        incomingTableModel = new IncomingTableModel(inList);
    }
    
    public void showCreateIncomingLoadUI(){
        inUI = new IncomingView();
    }
    
    public void createIncomingLoad(int loadNumber){
        
        //Set each value of an incoming load
        
        setDunnageIndex(IncomingView.dunnageC.getSelectedIndex());
        setInsectDetected(IncomingView.insectDetected.isSelected());
        
        Employee tempEmployee = Model.getEmpList().get(IncomingView.employeeC.getSelectedIndex());
    
        Date date = new Date();
        long time = date.getTime();
        Timestamp inTS = new Timestamp(time);
        
        
        incomingTableModel.editLoad(loadNumber, dunnageIndex, tempEmployee, insectDetected, inTS);
    
    }

    public void updateIncomingLoad(int loadNumber){
        
        //Set each value of an incoming load
        
        setDunnageIndex(editInView.dunnageC.getSelectedIndex());
        setInsectDetected(editInView.insectDetected.isSelected());
        
        Employee tempEmployee = Model.getEmpList().get(editInView.employeeC.getSelectedIndex());
    
        Date date = new Date();
        long time = date.getTime();
        Timestamp inTS = new Timestamp(time);
        
        
        incomingTableModel.editLoad(loadNumber, dunnageIndex, tempEmployee, insectDetected, inTS);
    
    }

    
    /*
        Shows all Incoming Load's information
    */
    public void showAllIncoming(){
        IncomingView.displayAllIncomingLoad();
    }

    /** DE
     * @return the scnr
    
    public Scanner getScnr() {
        return scnr;
    }

    /**
     * @param scnr the scnr to set
    
    public void setScnr(Scanner scnr) {
        this.scnr = scnr;
    }
    */

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
