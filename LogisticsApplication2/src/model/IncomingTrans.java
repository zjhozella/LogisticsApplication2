/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Jprince
 */
public class IncomingTrans extends Load{
    
    // Default incomingTrans Constructor
    private boolean insectDetected = false;
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsIn = new Timestamp(time);

    // 0 - "Empty" 1 - "1/4" 2 - "1/2" 3 - "3/4" 4 - "Full"
    private int dunnageIndex = 0;

    private Employee employee;
    
    // incomingTrans Constructor that extends Transaction
    public IncomingTrans(int newLoadNumber, int newTruckNumber, int newTrailerNumber, int newDunnageIndex, boolean newLoadComplete, Employee employee, boolean insectDetected, Timestamp newTSin){
        // Parameters inherited from Super class: Load
        super(newLoadNumber, newTruckNumber, newTrailerNumber, newDunnageIndex, newLoadComplete);
        
        // Parameters that are unique to IncomingTrans
        this.employee = employee;
        this.insectDetected = insectDetected;
        this.tsIn = newTSin;
        this.dunnageIndex = newDunnageIndex;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * @return the tsIn
     */
    public Timestamp getTsIn() {
        return tsIn;
    }

    /**
     * @param tsIn the tsIn to set
     */
    public void setTsIn(Timestamp tsIn) {
        this.tsIn = tsIn;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Override printLoad from super class
    @Override
    public String printLoad(){
        return super.printLoad() + "\n" + "Incoming Load Information: " + "\n" +
            " Insect Detected: " + isInsectDetected() + ", Time: " + getTsIn() + ", Dunnage Index: " + getDunnageIndex() + ", Employee Number: " + getEmployee().getID();
    }

}
