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
public class IncomingTrans {
    // Default incomingTrans Constructor
    private int employeeID = 0;
    private boolean insectDetected = false;
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsIn = new Timestamp(time);

    // incomingTrans Constructor that extends Transaction
    public IncomingTrans(int employeeID, boolean insectDetected, Timestamp newTSin){
        this.employeeID = employeeID;
        this.insectDetected = insectDetected;
        this.tsIn = newTSin;
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
}
