/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author jprince
 */
public class IncomingView {
    
    private int truckNumber;
    private int trailerNumber;
    private String dunnage;

    
    
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


    
    
}

class InitialFrame extends JFrame {
    
}
