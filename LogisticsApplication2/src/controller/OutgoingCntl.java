/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;

import javax.print.attribute.standard.MediaSize.NA;

import model.Driver;
import model.Employee;
import model.Model;
import model.OutgoingTrans;

/**
 *
 * @author zjhoz
 */
public class OutgoingCntl {
    
    //Navigation Test
    public OutgoingCntl(){
        System.out.println("Welcome to the OutgoingCntl");
    }

    // Take input from ConfirmationView, feed into Load object constructor for an outgoing load
    public void createOutgoingLoad(int truckNumber, int trailerNumber, int dunnageIndex, int storeNumber,
            int sealNumber, String driverNumber,  boolean loadComplete, String driverFN, String driverLN, String driverCompany,
            int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp outTS){
        
        //Driver object creation
        Driver driver = new Driver(driverNumber, driverFN, driverLN, driverCompany);
        
        //Employee object creation
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);
        //OutgoingTrans object creation
        OutgoingTrans ot = new OutgoingTrans(Model.getOutList().size() , truckNumber, trailerNumber, dunnageIndex, loadComplete, storeNumber, sealNumber, employee, driver, insectDetected, outTS);
        Model.addToOutList(ot);
    }
    
}
