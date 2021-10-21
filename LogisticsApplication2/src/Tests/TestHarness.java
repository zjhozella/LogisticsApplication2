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
        Driver dr1 = new Driver("12345678", "John", "Smith", "Landaire");
        Employee ep1 = new Employee(1279466832, "Bob", "Jones");
        OutgoingTrans ot1 = new OutgoingTrans(1, 458, 2318, 0, false, 61, 753146798, ep1, dr1, false, tsOut);
        
        if(ot1 != null && dr1 !=  null && ep1 != null){
            
            System.out.println("Test outgoing load created sucessfully\n");
            
            System.out.println(ot1.printLoad() + ot1.getEmployee().printEmployee() + ot1.getDr().printDriver() + "\n");
            
            //Change the object
            ot1.setTruckNumber(460);
            ot1.setDunnageIndex(4);
            ot1.setStoreNumber(62);
            ot1.getDr().setFirstName("Frank");
            ot1.getDr().setLastName("Woods");
            ot1.getDr().setCompany("Werner");
            ot1.getEmployee().setFirstName("Steve");
            ot1.setInsectDetected(true);
            
            System.out.println(ot1.printLoad() + ot1.getEmployee().printEmployee() + ot1.getDr().printDriver() + "\n");
            
        }else
            System.out.println("Test load has not been created sucessfully\n");
        
        //Incoming Load Test
        Employee ep2 = new Employee(1279466832, "Bob", "Jones");
        IncomingTrans it1 = new IncomingTrans(1, 460, 2317, 3, true, ep2, false, tsIn);

        if(it1 != null && it1 != null){
            
            System.out.println("Test incoming load created sucessfully\n");
            
            System.out.println(it1.printLoad() + it1.getEmployee().printEmployee() + "\n");
            
            //Change the object
            it1.setTruckNumber(458);
            it1.setTrailerNumber(2318);
            it1.setDunnageIndex(4);
            it1.getEmployee().setID(1279455832);
            
            System.out.println(it1.printLoad() + it1.getEmployee().printEmployee() + "\n");
        }else
            System.out.println("Test load has not been created sucessfully\n");
    }
    
    public void testClassHierarchy(){
        ArrayList<Load> loadList = new ArrayList<>();
        
        //Create Driver object
        Driver dr1 = new Driver("12345678", "John", "Smith", "US Express");
        
        //Create employee objects
        Employee ep1 = new Employee(946, "Bob", "Jones");
        Employee ep2 = new Employee(157, "Clark", "Kent");

        //Create OutgoingTrans and add to loadList array
        loadList.add(new OutgoingTrans(1, 458, 2318, 0, false, 61, 753146798, ep1, dr1, false, tsOut));
        
        //Create IncomingTrans and add to loadList array
        loadList.add(new IncomingTrans(1, 460, 2317, 3, true, ep2, false, tsIn));

        /* Iterate through each Load object type in the array and use the printLoad method that has an override in each child class of the super printLoad() method. Prints Everny parameter from Load, IncomingTrans, OutgoingTrans. Includes DunnageIndex only for testing purpose. Only print Employee Number.
        */
        for (int i = 0; i < loadList.size(); ++i){
            System.out.println("---- TEST CLASS HIERARCHY "+ (i+1) + " ----");
            System.out.println(loadList.get(i).printLoad());
        }
    }
}
