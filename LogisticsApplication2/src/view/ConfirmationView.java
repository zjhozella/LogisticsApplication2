/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jprince, zjhoz
 */
public class ConfirmationView {
    
    private int loadNumber;
    private int truckNumber;
    private int trailerNumber;
    private int storeNumber;
    private String dunnage;
    private int sealNumber;
    private String driverNumber;
    private String driverFN;
    private String driverLN;
    private String driverCompany;

    public ConfirmationView(int loadNumber, int truckNumber, int trailerNumber, int storeNumber, String dunnage, 
            int sealNumber, String driverNumber, String driverFN, String driverLN, String driverCompany){
        this.loadNumber = loadNumber;
        this.truckNumber = truckNumber;
        this.trailerNumber = trailerNumber;
        this.storeNumber = storeNumber;
        this.dunnage = dunnage;
        this.sealNumber = sealNumber;
        this.driverNumber = driverNumber;
        this.driverFN = driverFN;
        this.driverLN = driverLN;
        this.driverCompany = driverCompany;
        
    }
    
    // Will display all attributes from previous view
    // Will display a Confirm button
    // Once button is pressed, it will call the createLoad method in Main, passing all attributes
    
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
     * @return the dunnage
     */
    public String getDunnage() {
        return dunnage;
    }

    /**
     * @param dunnage the dunnage to set
     */
    public void setDunnage(String dunnage) {
        this.dunnage = dunnage;
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
    
}
