/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zjhoz
 */
public class Employee {
    
    //Initialize attributes
    private int ID = 0;
    private String firstName = "";
    private String lastName = "";
 
    //Constructor
    public Employee(int id, String firstName, String lastName){
        ID = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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

    
    public String printEmployee(){
        return "\n" + "Employee Information: " + "\n" + " Employee ID: " + getID() + ", Employee Name: " 
                    + getFirstName() + " " + getLastName();

    }
   
}
