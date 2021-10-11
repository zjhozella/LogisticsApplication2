/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticsapplication2;

import Tests.TestHarness;
import java.sql.Timestamp;
import model.Load;
import model.Driver;

/**
 *
 * @author zjhoz, jprince
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // CreateLoad
        // Send Load object attributes to database using an sql statement

      TestHarness test = new TestHarness();
        
    }
   
    // Take input from ConfirmationView, feed into Load object constructor
    public void createLoad(int loadNumber, int truckNumber, int trailerNumber, String dunnage, int storeNumber, int sealNumber, String driverNumber,  
            boolean loadComplete, Timestamp outgoingTS, Timestamp incomingTS, String driverFN, String driverLN, String driverCompany){
        
        //Driver object creation
        Driver driver = new Driver(driverNumber, driverFN, driverLN, driverCompany);
        //Load object creation
        Load load = new Load(loadNumber, truckNumber, trailerNumber, storeNumber, sealNumber, driverNumber, loadComplete, outgoingTS, incomingTS);
        
    }
    
}
