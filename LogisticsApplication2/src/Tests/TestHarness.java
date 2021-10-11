/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.sql.Timestamp;
import java.util.Date;
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
    
    //Load l1 = new Load(1, 458, 2318, 61, 753146798, "12345678", false, tsOut, null);
    
    public TestHarness(){
        Load l1 = new Load(1, 458, 2318, 1, 61, 753146798, "12345678", false);
        if(l1 != null){
            System.out.println("Test load created sucessfully");
            System.out.println("Load info: " + l1.getLoadNumber() + " " + l1.getSealNumber() + " " + l1.getTruckNumber());
            //Change the object
            l1.setTruckNumber(460);
            System.out.println("Load info: " + l1.getLoadNumber() + " " + l1.getSealNumber() + " " + l1.getTruckNumber());
        }else
            System.out.println("Test load has not been created");
    }
    
}
