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
    
    private int loadNumber;
    private int dunnage;

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
     * @return the dunnage
     */
    public int getDunnage() {
        return dunnage;
    }

    /**
     * @param dunnage the dunnage to set
     */
    public void setDunnage(int dunnage) {
        this.dunnage = dunnage;
    }
    
    
}

//Would this work to create the GUI so we do not have a ton of different classes?
class InitialFrame extends JFrame {
    
}
