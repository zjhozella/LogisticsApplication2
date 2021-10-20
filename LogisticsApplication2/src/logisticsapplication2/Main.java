/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticsapplication2;

import Tests.TestHarness;
import java.sql.Timestamp;
import model.Driver;
import model.Employee;
import model.IncomingTrans;
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
        

        
        // Send Load object attributes to database using an sql statement

        /*** Test Harness ***/
        TestHarness test = new TestHarness();
        test.testClassHierarchy();
        
    }
   
    // Take input from ConfirmationView, feed into Load object constructor for an outgoing load
    public void createOutgoingLoad(int loadNumber, int truckNumber, int trailerNumber, int dunnageIndex, int storeNumber,
            int sealNumber, String driverNumber,  boolean loadComplete, String driverFN, String driverLN, String driverCompany,
            int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp outTS){
        
        //Driver object creation
        Driver driver = new Driver(driverNumber, driverFN, driverLN, driverCompany);
        
        //Employee object creation
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);
        
        //OutgoingTrans object creation
        OutgoingTrans ot = new OutgoingTrans(loadNumber, truckNumber, trailerNumber, dunnageIndex, loadComplete, storeNumber, sealNumber, employee, driver, insectDetected, outTS);
        
    }
    
    public void createIncomingLoad(int loadNumber, int truckNumber, int trailerNumber, int dunnageIndex, boolean loadComplete, int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp inTS){
        
        //Employee object creation
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);
        
        //IncomingTrans object creation
        IncomingTrans it = new IncomingTrans(loadNumber, truckNumber, trailerNumber, dunnageIndex, loadComplete, employee, insectDetected, inTS);
    }
    
}
