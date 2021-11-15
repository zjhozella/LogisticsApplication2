/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Timestamp;
import model.Model;

/**
 *
 * @author jprince, zjhoz
 */
public class ConfirmationView {
    
    //Outgoing attribute initialization
    private int truckNumber, trailerNumber, storeNumber, sealNumber;
    private boolean outLoadComplete;
    private String driverNumber, driverFN, driverLN, driverCompany;
    private Timestamp outTS;
    
    //Incoming attributes initialization
    private int loadNumber;
    private Timestamp inTS;
    
    //Used in both incoming and outgoing
    private int dunnageIndex;
    private boolean loadComplete;
    private int employeeID;
    private String employeeFN, employeeLN;
    private boolean insectDetected;
    
    public ConfirmationView(){
        System.out.println("Please validate the following information:");
    }

    public void confirmOutgoing(){
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).printLoad());
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).getDr().printDriver());
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).getEmployee().printEmployee());
    }
    
    public void confirmIncoming(){
        System.out.println(Model.getInList().get(Model.getInList().size() - 1).printLoad());
        System.out.println(Model.getInList().get(Model.getInList().size() - 1).getEmployee().printEmployee());
    }
    
    public void confirmation(){
        System.out.println("Is the information above valid? 1 to confirm, 0 to deny");
    }
    
    public ConfirmationView(int truckNumber, int trailerNumber, int dunnageIndex, int storeNumber,
            int sealNumber, boolean loadComplete, String driverNumber, String driverFN, String driverLN, String driverCompany,
            int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp outTS){
        this.truckNumber = truckNumber;
        this.trailerNumber = trailerNumber;
        this.dunnageIndex = dunnageIndex;
        this.storeNumber = storeNumber;
        this.sealNumber = sealNumber;
        this.loadComplete = loadComplete;
        this.driverNumber = driverNumber;
        this.driverFN = driverFN;
        this.driverLN = driverLN;
        this.driverCompany = driverCompany;
        this.employeeID = employeeID;
        this.employeeFN = employeeFN;
        this.employeeLN = employeeLN;
        this.insectDetected = insectDetected;
        this.outTS = outTS;

        
        // Will display all attributes from previous view
        // Will display a Confirm button
        // Once Confirm button is pressed, it will call the createOutgoingLoad method in Main, passing all attributes
        // Generate loadNumber once confirm button is pressed
    }
    
    public ConfirmationView(int loadNumber, int dunnageIndex, boolean loadComplete, int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp inTS){
        this.loadNumber = loadNumber;
        this.dunnageIndex = dunnageIndex;
        this.loadComplete = loadComplete;
        this.employeeID = employeeID;
        this.employeeFN = employeeFN;
        this.employeeLN = employeeLN;
        this.insectDetected = insectDetected;
        this.inTS = inTS;
        
        // Will display all attributes from previous view
        // Will display a Confirm button
        // Once Confirm button is pressed, it will call the createIncomingLoad method in Main, passing all attributes
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
     * @return the outLoadComplete
     */
    public boolean isOutLoadComplete() {
        return outLoadComplete;
    }

    /**
     * @param outLoadComplete the outLoadComplete to set
     */
    public void setOutLoadComplete(boolean outLoadComplete) {
        this.outLoadComplete = outLoadComplete;
    }

    /**
     * @return the driverNumber
     */
    public String getDriverNumber() {
        return driverNumber;
    }

    /**
     * @param driverNumber the driverNumber to set
     */
    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    /**
     * @return the driverFN
     */
    public String getDriverFN() {
        return driverFN;
    }

    /**
     * @param driverFN the driverFN to set
     */
    public void setDriverFN(String driverFN) {
        this.driverFN = driverFN;
    }

    /**
     * @return the driverLN
     */
    public String getDriverLN() {
        return driverLN;
    }

    /**
     * @param driverLN the driverLN to set
     */
    public void setDriverLN(String driverLN) {
        this.driverLN = driverLN;
    }

    /**
     * @return the driverCompany
     */
    public String getDriverCompany() {
        return driverCompany;
    }

    /**
     * @param driverCompany the driverCompany to set
     */
    public void setDriverCompany(String driverCompany) {
        this.driverCompany = driverCompany;
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
