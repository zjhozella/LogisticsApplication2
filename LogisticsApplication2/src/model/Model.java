/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zjhoz
 */
public class Model {
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);
    
    //Application-wide Array Lists to store all Load data.
    private static ArrayList<OutgoingTrans> outList = new ArrayList<>();
    private static ArrayList<IncomingTrans> inList = new ArrayList<>();
    
    //Default Constructor
    public Model(){
        loadData();
    }
    
    //Method used to load example transactions into the array lists. This will not be needed in the actual application. Here for ease of testing.
    public void loadData(){
    
        //Outgoing Load Test
        Driver dr0 = new Driver("null", "null", "null", "null");
        Employee ep0 = new Employee(1279466832, "null", "null");
        OutgoingTrans ot0 = new OutgoingTrans(0, 0, 0, 0, false, 0, 0, ep0, dr0, false, tsOut);
        addToOutList(ot0);
        
        //Incoming Load Test
        Employee ep01 = new Employee(0, "null", "null");
        IncomingTrans it0 = new IncomingTrans(0, 0, 0, 0, true, ep01, false, tsIn);
        addToInList(it0);
        
        //Outgoing Load Test
        Driver dr1 = new Driver("12345678", "John", "Smith", "Landaire");
        Employee ep1 = new Employee(1279466832, "Bob", "Jones");
        OutgoingTrans ot1 = new OutgoingTrans(1, 458, 2318, 0, false, 61, 753146798, ep1, dr1, false, tsOut);
        addToOutList(ot1);
        
        //Incoming Load Test
        Employee ep2 = new Employee(1279466832, "Bob", "Jones");
        IncomingTrans it1 = new IncomingTrans(1, 460, 2317, 3, true, ep2, false, tsIn);
        addToInList(it1);
        
        //Outgoing Load Test
        Driver dr2 = new Driver("87654321", "Joe", "Shmo", "Landaire");
        Employee ep3 = new Employee(1398466024, "Wade", "Rake");
        OutgoingTrans ot2 = new OutgoingTrans(2, 765, 1073, 0, false, 86, 757965123, ep3, dr2, false, tsOut);
        addToOutList(ot1);
        
        //Incoming Load Test
        Employee ep4 = new Employee(1279466832, "Steven", "Brisk");
        IncomingTrans it2 = new IncomingTrans(2, 765, 1073, 1, true, ep4, true, tsIn);
        addToInList(it1);
        
    }

    /**
     * @return the outList
     */
    public static ArrayList<OutgoingTrans> getOutList() {
        return outList;
    }

    /**
     * @param outTrans the Outgoing Transaction to add to the outList
     */
    public static void addToOutList(OutgoingTrans outTrans) {
        outList.add(outTrans);
    }

    /**
     * @return the inList
     */
    public static ArrayList<IncomingTrans> getInList() {
        return inList;
    }

    /**
     * @param inTrans the IncomingTransaction to add to the inList
     */
    public static void addToInList(IncomingTrans inTrans) {
        inList.add(inTrans);
    }
    
    
    
}