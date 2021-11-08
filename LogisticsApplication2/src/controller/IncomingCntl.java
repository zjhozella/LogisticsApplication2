/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import model.Employee;
import model.IncomingTrans;
import model.Model;

/**
 *
 * @author zjhoz
 */
public class IncomingCntl {
    
    
    public void createIncomingLoad(int loadNumber, int truckNumber, int trailerNumber, int dunnageIndex, boolean loadComplete, int employeeID, String employeeFN, String employeeLN, boolean insectDetected, Timestamp inTS){
        
        //Employee object creation
        Employee employee = new Employee(employeeID, employeeFN, employeeLN);
        
        //IncomingTrans object creation
        IncomingTrans it = new IncomingTrans(loadNumber, truckNumber, trailerNumber, dunnageIndex, loadComplete, employee, insectDetected, inTS);
        Model.addToInList(it);
    }
}
