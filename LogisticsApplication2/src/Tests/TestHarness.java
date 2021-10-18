/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.Driver;
import model.Employee;
import model.OutgoingTrans;
import model.IncomingTrans;
import model.Load;

/**
 *
 * @author zjhoz
 */
public class TestHarness {
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);
    
    public TestHarness(){
        
        //Outgoing Load Test
        Driver dr1 = new Driver("12345678", "John", "Smith", "Company");
        Employee ep1 = new Employee(1279466832, "Bob", "Jones");
        OutgoingTrans ot1 = new OutgoingTrans(1, 458, 2318, 0, false, 61, 753146798, ep1, dr1, false, tsOut);
        
        if(ot1 != null && dr1 !=  null && ep1 != null){
            
            System.out.println("Test outgoing load created sucessfully");
            
            System.out.println("Load info: Load Number:" + ot1.getLoadNumber() + " Truck Number:" + ot1.getTruckNumber() + " Trailer Number:" +
                    ot1.getTrailerNumber() + " Dunnage Index: " + ot1.getDunnageIndex() + " Store Number: " + ot1.getStoreNumber() +
                    " Load Complete: " + ot1.isLoadComplete() + " Out Employee ID: " + ot1.getEmployee().getID() + " Employee Name: " 
                    + ot1.getEmployee().getFirstName() + " " + ot1.getEmployee().getLastName() + " Insect Detected: " +
                    ot1.isInsectDetected() + " Out Timestamp: " + ot1.getTsOut() + " Driver License Number: " + ot1.getDr().getDlNumber() +
                    " Driver FN: " + ot1.getDr().getFirstName() + " Driver LN: " + ot1.getDr().getLastName() + " Driver Company: " + ot1.getDr().getCompany());
            
            //Change the object
            ot1.setTruckNumber(460);
            ot1.setDunnageIndex(4);
            ot1.setStoreNumber(62);
            ot1.getDr().setFirstName("Frank");
            ot1.getDr().setLastName("Woods");
            ot1.getDr().setCompany("Werner");
            ot1.getEmployee().setFirstName("Steve");
            ot1.setInsectDetected(true);
            
            System.out.println("Load info: Load Number:" + ot1.getLoadNumber() + " Truck Number:" + ot1.getTruckNumber() + " Trailer Number:" +
                    ot1.getTrailerNumber() + " Dunnage Index: " + ot1.getDunnageIndex() + " Store Number: " + ot1.getStoreNumber() +
                    " Load Complete: " + ot1.isLoadComplete() + " Out Employee ID: " + ot1.getEmployee().getID() + " Employee Name: " 
                    + ot1.getEmployee().getFirstName() + " " + ot1.getEmployee().getLastName() + " Insect Detected: " +
                    ot1.isInsectDetected() + " Out Timestamp: " + ot1.getTsOut() + " Driver License Number: " + ot1.getDr().getDlNumber() +
                    " Driver FN: " + ot1.getDr().getFirstName() + " Driver LN: " + ot1.getDr().getLastName() + " Driver Company: " + ot1.getDr().getCompany());
        }else
            System.out.println("Test load has not been created sucessfully");
        
        //Incoming Load Test
        Employee ep2 = new Employee(1279466832, "Bob", "Jones");
        IncomingTrans it1 = new IncomingTrans(1, 460, 2317, 3, true, ep2, false, tsIn);

        if(it1 != null && it1 != null){
            
            System.out.println("Test incoming load created sucessfully");
            
            System.out.println("Load info: Load Number:" + it1.getLoadNumber() + " Truck Number:" + it1.getTruckNumber() + " Trailer Number:" +
                    it1.getTrailerNumber() + " Dunnage Index: " + it1.getDunnageIndex() + " Store Number: " + it1.getStoreNumber() +
                    " Load Complete: " + it1.isLoadComplete() + " In Employee ID: " + it1.getEmployee().getID() + " Employee Name: " 
                    + it1.getEmployee().getFirstName() + " " + it1.getEmployee().getLastName() + " Insect Detected: " +
                    it1.isInsectDetected() + " In Timestamp: " + it1.getTsIn());
            
            //Change the object
            it1.setTruckNumber(458);
            it1.setTrailerNumber(2318);
            it1.setDunnageIndex(4);
            it1.getEmployee().setID(1279455832);
            
            System.out.println("Load info: Load Number:" + it1.getLoadNumber() + " Truck Number:" + it1.getTruckNumber() + " Trailer Number:" +
                    it1.getTrailerNumber() + " Dunnage Index: " + it1.getDunnageIndex() + " Store Number: " + it1.getStoreNumber() +
                    " Load Complete: " + it1.isLoadComplete() + " In Employee ID: " + it1.getEmployee().getID() + " Employee Name: " 
                    + it1.getEmployee().getFirstName() + " " + it1.getEmployee().getLastName() + " Insect Detected: " +
                    it1.isInsectDetected() + " In Timestamp: " + it1.getTsIn());
        }else
            System.out.println("Test load has not been created sucessfully");
        
        testClassHierarchy();
    }
    
    public void testClassHierarchy(){
        ArrayList<Load> loadList = new ArrayList<>();
        
        Driver dr1 = new Driver("12345678", "John", "Smith", "Company");
        Employee ep1 = new Employee(1279466832, "Bob", "Jones");
        loadList.add(new OutgoingTrans(1, 458, 2318, 0, false, 61, 753146798, ep1, dr1, false, tsOut));
        
        Employee ep2 = new Employee(1279466832, "Bob", "Jones");
        loadList.add(new IncomingTrans(1, 460, 2317, 3, true, ep2, false, tsIn));
        
        for (int i = 0; i < loadList.size(); ++i){
            loadList.get(i).printLoad();
        }
        
    }
}
