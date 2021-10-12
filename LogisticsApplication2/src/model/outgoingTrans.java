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
public class OutgoingTrans {
    
    //Initialize attributes
    private boolean insectDetected = false;
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);

    private Employee employee;
    
    public OutgoingTrans(Employee employee, boolean insectDetected, Timestamp newTSout){
        this.employee = employee;
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
}
