/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import model.Driver;
import model.Employee;
import model.Model;
import model.OutgoingTrans;

/**
 *
 * @author zjhoz
 */
public class OutgoingCntl {
    
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
    
}
