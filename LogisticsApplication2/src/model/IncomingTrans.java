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
public class IncomingTrans extends Transaction {
    // Default incomingTrans Constructor
    int employeeID = 0;
    boolean insectDetected = false;
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsIn = new Timestamp(time);

    // incomingTrans Constructor that extends Transaction
    IncomingTrans(int transID, Load loadNumber, int employeeID, boolean insectDetected){
        super(transID, loadNumber);
        this.employeeID = employeeID;
        this.insectDetected = insectDetected;
    }
}
