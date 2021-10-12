/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jprince, zjhoz
 */
public class Driver {
   
    //Default constructor for driver
    private String dlNumber  = ""; 
    private String firstName = "";
    private String lastName  = "";
    private String company   = "";

    //Constructor for driver class
    public Driver (String newDlNumber, String newFirstName, String newLastName, String newCompany){
        this.dlNumber  = newDlNumber;
        this.firstName = newFirstName;
        this.lastName  = newLastName;
        this.company   = newCompany;
    }

    //Getters and setters for driver class
    /**
     * @return the dlNumber
     */
    public String getDlNumber() {
        return dlNumber;
    }

    /**
     * @param dlNumber the dlNumber to set
     */
    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
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
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    
}
