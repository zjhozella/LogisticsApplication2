/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jprince
 */
public class Transaction {
    //Default constructor
    private int transID = 0;
    private Load loadNumber;

    public Transaction (int transID, Load loadNumber){
        this.transID = transID;
        this.loadNumber = loadNumber;
    }

    /**
     * @return the transID
     */
    public int getTransID() {
        return transID;
    }

    /**
     * @param transID the transID to set
     */
    public void setTransID(int transID) {
        this.transID = transID;
    }

    /**
     * @return the loadNumber
     */
    public Load getLoadNumber() {
        return loadNumber;
    }

    /**
     * @param loadNumber the loadNumber to set
     */
    public void setLoadNumber(Load loadNumber) {
        this.loadNumber = loadNumber;
    }
}
