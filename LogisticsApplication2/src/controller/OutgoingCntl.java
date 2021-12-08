/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.*;
import static model.Model.outgoingTableModel;
import view.OutgoingView;

/**
 *
 * @author zjhoz
 */
    public class OutgoingCntl {

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
    
    private NavigationCntl navigationCntl;
    private static ArrayList<OutgoingTrans> outList;
    public OutgoingView outUI;
  
    
    public OutgoingCntl(NavigationCntl newNavigationCntl){
        
        //supports navigating back to the Main Menu
        navigationCntl = newNavigationCntl;

        //Get the instrument list
        //When instantiated it will get the individual Instruments
        //outList = outgoingTableModel;
        outList = Model.getOutList();

        //Show the list of model objects in the UI
        //this.theInstrumentListUI = new InstrumentListUI();
        //theInstrumentListUI.setVisible(true);
        
        //Once the InstrumentList is instantiated, instantiate the InstrumentTableModel
        //BG theInstrumentTableModel = new InstrumentTableModel(theInstrumentList.getInstrumentList()); //from example
        outgoingTableModel = new OutgoingTableModel(outList);
    }

    // Take input from ConfirmationView, feed into Load object constructor for an outgoing load
    public void showCreateOutgoingLoadUI(){
        outUI = new OutgoingView();
    }
    
    public void createOutgoingLoad(){
        
        //Set each value of an outgoing load
        setTruckNumber(Integer.parseInt(outUI.truckNumberF.getText()));
        setTrailerNumber(Integer.parseInt(outUI.trailerNumberF.getText()));
        setDunnageIndex(OutgoingView.dunnageC.getSelectedIndex());
        setStoreNumber(Integer.parseInt(outUI.storeNumberF.getText()));
        setSealNumber(Integer.parseInt(outUI.sealNumberF.getText()));
        setInsectDetected(OutgoingView.insectDetected.isSelected());
        
        Driver tempDriver = Model.getDrList().get(OutgoingView.driverC.getSelectedIndex());
        Employee tempEmployee = Model.getEmpList().get(OutgoingView.employeeC.getSelectedIndex());
        
        Date date = new Date();
        long time = date.getTime();
        Timestamp outTS = new Timestamp(time);
        
        outgoingTableModel.newLoad(truckNumber, trailerNumber, dunnageIndex, storeNumber, sealNumber, tempDriver, tempEmployee, insectDetected, outTS);
    
        
    }
    
    //Prints all outgoing load information
    public void showAllOutgoing(){
            OutgoingView.displayAllOutgoingLoad();
    }
    
    //Prints all incomplete outgoing basic load information
    public void showAllIncompleteOutgoing(){
        OutgoingView.printIncompleteOutgoing();
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
