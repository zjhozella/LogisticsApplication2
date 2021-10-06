/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticsapplication2;

import java.sql.Timestamp;
import model.Load;
import model.driver;

/**
 *
 * @author zjhoz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        // Send Load object attributes to database using an sql statement

        
    }
    
    
    // Do we create a separate createLoad method for incoming and outgoing? ex. createIncomingLoad createOutgoingLoad.
    // then have 2 different constructors in the load object that accepts only the required values for incoming and outgoing
    
    // Take input from ConfirmationView, feed into Load object constructor
    public void CreateLoad(int truckNumber, int trailerNumber, int Dunnage, int storeNumber, int sealNumber, 
            Timestamp outgoingTS, Timestamp incomingTS, boolean LoadComplete, int loadNumber){
        
        //Driver object creation
        driver driver = new driver("12345678", "Bob", "Smith", "CompanyName");
        //Load object creation
        Load load = new Load(1, 1, 1, 1, 1, false, Timestamp.valueOf(""));
        
    }
    
}
