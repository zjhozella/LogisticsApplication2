/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jprince
 */
public class driver {
    // What else should be put in here.
    // 
    //Default constructor
    int dlNumber     = 0; 
    String firstName = "";
    String lastName  = "";
    String company   = ""; //Should we track company as a string or assign as a company number?


    //Constructor for driver class
    public driver (int newDlNumber, String newFirstName, String newLastName, String newCompany){
        this.dlNumber  = newDlNumber;
        this.firstName = newFirstName;
        this.lastName  = newLastName;
        this.company   = newCompany;
    }
    
}
