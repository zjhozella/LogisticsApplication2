/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.sql.Timestamp;
import java.util.Date;
import model.Driver;
import model.Employee;
import model.Load;
import model.OutgoingTrans;
import model.IncomingTrans;

/**
 *
 * @author zjhoz
 */
public class TestHarness {
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);
    
    //Load l2 = new Load(1, 458, 2318, 61, 753146798, "12345678", false, tsOut, null);
    
    public TestHarness(){
        
        //Outgoing Load Test
        Driver dr1 = new Driver("12345678", "John", "Smith", "Company");
        Employee ep1 = new Employee(1279466832, "Bob", "Jones");
        OutgoingTrans ot1 = new OutgoingTrans(ep1, false, tsOut);
        Load l1 = new Load(458, 2318, 1, 61, 753146798, false, ot1, dr1);
        if(l1 != null && dr1 !=  null && ot1 != null){
            
            System.out.println("Test outgoing load created sucessfully");
            
            System.out.println("Load info: Load Number:" + l1.getLoadNumber() + " Truck Number:" + l1.getTruckNumber() + " Trailer Number:" +
                    l1.getTrailerNumber() + " Dunnage Index: " + l1.getDunnageIndex() + " Store Number: " + l1.getStoreNumber() +
                    " Load Complete: " + l1.isLoadComplete() + " Out Employee ID: " + l1.getOt().getEmployee().getID() + " Employee Name: " 
                    + l1.getOt().getEmployee().getFirstName() + " " + l1.getOt().getEmployee().getLastName() + " Insect Detected: " +
                    l1.getOt().isInsectDetected() + " Out Timestamp: " + l1.getOt().getTsOut() + " Driver License Number: " + l1.getDr().getDlNumber() +
                    " Driver FN: " + l1.getDr().getFirstName() + " Driver LN: " + l1.getDr().getLastName() + " Driver Company: " + l1.getDr().getCompany());
            
            //Change the object
            l1.setTruckNumber(460);
            l1.setDunnageIndex(4);
            l1.setStoreNumber(62);
            l1.getDr().setFirstName("Frank");
            l1.getDr().setLastName("Woods");
            l1.getDr().setCompany("Werner");
            l1.getOt().getEmployee().setFirstName("Steve");
            l1.getOt().setInsectDetected(true);
            
            System.out.println("Load info: Load Number:" + l1.getLoadNumber() + " Truck Number:" + l1.getTruckNumber() + " Trailer Number:" +
                    l1.getTrailerNumber() + " Dunnage Index: " + l1.getDunnageIndex() + " Store Number: " + l1.getStoreNumber() +
                    " Load Complete: " + l1.isLoadComplete() + " Out Employee ID: " + l1.getOt().getEmployee().getID() + " Employee Name: " 
                    + l1.getOt().getEmployee().getFirstName() + " " + l1.getOt().getEmployee().getLastName() + " Insect Detected: " +
                    l1.getOt().isInsectDetected() + " Out Timestamp: " + l1.getOt().getTsOut() + " Driver License Number: " + l1.getDr().getDlNumber() +
                    " Driver FN: " + l1.getDr().getFirstName() + " Driver LN: " + l1.getDr().getLastName() + " Driver Company: " + l1.getDr().getCompany());
        }else
            System.out.println("Test load has not been created sucessfully");
        
        //Incoming Load Test
        Employee ep2 = new Employee(1279466832, "Bob", "Jones");
        IncomingTrans it1 = new IncomingTrans(ep1, false, tsOut);
        Load l2 = new Load(47, 1, true, it1);
        if(l2 != null && it1 != null){
            
            System.out.println("Test incoming load created sucessfully");
            
            System.out.println("Load info: Load Number:" + l2.getLoadNumber() + " Truck Number:" + l2.getTruckNumber() + " Trailer Number:" +
                    l2.getTrailerNumber() + " Dunnage Index: " + l2.getDunnageIndex() + " Store Number: " + l2.getStoreNumber() +
                    " Load Complete: " + l2.isLoadComplete() + " In Employee ID: " + l2.getIt().getEmployee().getID() + " Employee Name: " 
                    + l2.getIt().getEmployee().getFirstName() + " " + l2.getIt().getEmployee().getLastName() + " Insect Detected: " +
                    l2.getIt().isInsectDetected() + " In Timestamp: " + l2.getIt().getTsIn());
            
            //Change the object
            l2.setTruckNumber(460);
            l2.setDunnageIndex(4);
            l2.setStoreNumber(62);
            l2.getIt().getEmployee().setID(1279455832);
            
            System.out.println("Load info: Load Number:" + l2.getLoadNumber() + " Truck Number:" + l2.getTruckNumber() + " Trailer Number:" +
                    l2.getTrailerNumber() + " Dunnage Index: " + l2.getDunnageIndex() + " Store Number: " + l2.getStoreNumber() +
                    " Load Complete: " + l2.isLoadComplete() + " In Employee ID: " + l2.getIt().getEmployee().getID() + " Employee Name: " 
                    + l2.getIt().getEmployee().getFirstName() + " " + l2.getIt().getEmployee().getLastName() + " Insect Detected: " +
                    l2.getIt().isInsectDetected() + " In Timestamp: " + l2.getIt().getTsIn());
        }else
            System.out.println("Test load has not been created sucessfully");
        
        
    }
    
}
