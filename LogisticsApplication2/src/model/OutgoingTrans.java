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
public class OutgoingTrans extends Load{
    //Initialize attributes
    private boolean insectDetected;
    private int storeNumber;
    private int sealNumber;
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);

    private Employee employee;
    private Driver dr;
    
    public OutgoingTrans(int newLoadNumber, int newTruckNumber, int newTrailerNumber, int newDunnageIndex, boolean newLoadComplete, int newStoreNumber, int newSealNumber, Employee employee, Driver dr, boolean insectDetected, Timestamp newTSout){
        
        super(newLoadNumber, newTruckNumber, newTrailerNumber, newDunnageIndex, newLoadComplete);
        
        storeNumber = newStoreNumber;
        sealNumber = newSealNumber;
        this.employee = employee;
        this.dr = dr;
        this.insectDetected = insectDetected;
        this.tsOut = newTSout;
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
     * @return the tsOut
     */
    public Timestamp getTsOut() {
        return tsOut;
    }

    /**
     * @param tsOut the tsOut to set
     */
    public void setTsOut(Timestamp tsOut) {
        this.tsOut = tsOut;
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
     * @return the dr
     */
    public Driver getDr() {
        return dr;
    }

    /**
     * @param dr the dr to set
     */
    public void setDr(Driver dr) {
        this.dr = dr;
    }
}
