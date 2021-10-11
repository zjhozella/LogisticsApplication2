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
public class outgoingTrans extends Transaction {
    int employeeID = 0;
    boolean insectDetected = false;

    outgoingTrans(int transID, Load loadNumber, int employeeID, boolean insectDetected){
        super(transID, loadNumber);
        this.employeeID = employeeID;
        this.insectDetected = insectDetected;
    }
}
