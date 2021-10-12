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
import model.OutgoingTrans;

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

        /*** Test Harness ***/
        TestHarness test = new TestHarness();
        
    }
   
    // Take input from ConfirmationView, feed into Load object constructor for an outgoing load
    public void createOutgoingLoad(int loadNumber, int truckNumber, int trailerNumber, int dunnageIndex, int storeNumber, int sealNumber, String driverNumber,  
            boolean loadComplete, String driverFN, String driverLN, String driverCompany, int employeeID, boolean insectDetected, Timestamp outTS){
        
        //Driver object creation
        Driver driver = new Driver(driverNumber, driverFN, driverLN, driverCompany);
        
        //OutgoingTrans object creation
        OutgoingTrans ot = new OutgoingTrans(employeeID, insectDetected, outTS);
        
        //Load object creation -- feeds in the objects created above, each with their own attrubutes.
        Load load = new Load(truckNumber, trailerNumber, dunnageIndex, storeNumber, sealNumber, loadComplete, ot, driver);
        
        
    }
    
}
