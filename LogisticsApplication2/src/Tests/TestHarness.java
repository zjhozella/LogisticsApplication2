/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.sql.Timestamp;
import java.util.Date;
import model.Driver;
import model.Load;
import model.OutgoingTrans;

/**
 *
 * @author zjhoz
 */
public class TestHarness {
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);
    
    //Load l1 = new Load(1, 458, 2318, 61, 753146798, "12345678", false, tsOut, null);
    
    public TestHarness(){
        
        //Outgoing Load Test
        Driver dr1 = new Driver("12345678", "John", "Smith", "Company");
        OutgoingTrans ot1 = new OutgoingTrans(1279466832, false, tsOut);
        Load l1 = new Load(458, 2318, 1, 61, 753146798, false, ot1, dr1);
        if(l1 != null){
            
            System.out.println("Test load created sucessfully");
            
            System.out.println("Load info: Load Number:" + l1.getLoadNumber() + " Truck Number:" + l1.getTruckNumber() + " Trailer Number:" +
                    l1.getTrailerNumber() + " Dunnage Index: " + l1.getDunnageIndex() + " Store Number: " + l1.getStoreNumber() +
                    " Load Complete: " + l1.isLoadComplete() + " Employee ID: " + ot1.getEmployeeID() + " Insect Detected: " +
                    ot1.isInsectDetected() + " Out Timestamp: " + ot1.getTsOut() + " Driver License Number: " + dr1.getDlNumber() +
                    " Driver FN: " + dr1.getFirstName() + " Driver LN: " + dr1.getLastName() + " Driver Company: " + dr1.getCompany());
            
            //Change the object
            l1.setTruckNumber(460);
            System.out.println("Load info: Load Number:" + l1.getLoadNumber() + " Truck Number:" + l1.getTruckNumber() + " Trailer Number:" +
                    l1.getTrailerNumber() + " Dunnage Index: " + l1.getDunnageIndex() + " Store Number: " + l1.getStoreNumber() +
                    " Load Complete: " + l1.isLoadComplete() + " Employee ID: " + ot1.getEmployeeID() + " Insect Detected: " +
                    ot1.isInsectDetected() + " Out Timestamp: " + ot1.getTsOut() + " Driver License Number: " + dr1.getDlNumber() +
                    " Driver FN: " + dr1.getFirstName() + " Driver LN: " + dr1.getLastName() + " Driver Company: " + dr1.getCompany());
        }else
            System.out.println("Test load has not been created sucessfully");
    }
    
}
