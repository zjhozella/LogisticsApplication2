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
    private static ArrayList<Driver> drList = new ArrayList<>();
    private static ArrayList<Employee> empList = new ArrayList<>();
    
    public static OutgoingTableModel outgoingTableModel;
    public static IncomingTableModel incomingTableModel;
    public static String[] dunnageStrings = {"Empty", "1/4", "1/2", "1/3", "Full"};
    
    //Default Constructor
    public Model(){
        loadData();
        //outgoingTableModel = new OutgoingTableModel(outList);
    }
    
    //Method used to load example transactions into the array lists. This will not be needed in the actual application. Here for ease of testing.
    public void loadData(){
        
        //Outgoing Load Test
        Driver dr1 = new Driver("12345678", "John", "Smith", "Landaire");
        Employee ep1 = new Employee(127946683, "Bob", "Jones");
        OutgoingTrans ot1 = new OutgoingTrans(0, 460, 2317, 0, true, 61, 753146798, ep1, dr1, false, tsOut);
        addToOutList(ot1);
        addToDrList(dr1);
        addToEmpList(ep1);
        
        //Incoming Load Test
        IncomingTrans it1 = new IncomingTrans(0, 460, 2317, 3, true, ep1, false, tsIn);
        addToInList(it1);
        
        //Outgoing Load Test
        Driver dr2 = new Driver("87654321", "Joe", "Shmo", "CFL");
        Employee ep2 = new Employee(139846602, "Wade", "Rake");
        OutgoingTrans ot2 = new OutgoingTrans(1, 765, 1073, 0, true, 86, 757965123, ep2, dr2, false, tsOut);
        addToOutList(ot2);
        addToDrList(dr2);
        addToEmpList(ep2);
        
        //Incoming Load Test
        Employee ep3 = new Employee(165431246, "Steven", "Brisk");
        IncomingTrans it2 = new IncomingTrans(1, 765, 1073, 1, true, ep3, true, tsIn);
        addToInList(it2);
        addToEmpList(ep3);
        
        //Outgoing Load Test
        OutgoingTrans ot3 = new OutgoingTrans(2, 931, 2476, 0, false, 94, 129355123, ep1, dr2, false, tsOut);
        addToOutList(ot3);
        
        //Incoming Load Test
        Employee blankEmployee = new Employee(0, null, null);
        IncomingTrans it3 = new IncomingTrans(2, 931, 2476, 4, false, blankEmployee, false, tsIn);
        addToInList(it3);
        
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
        //outgoingTableModel.fireTableDataChanged(); //refreshes table
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

    /**
     * @return the drList
     */
    public static ArrayList<Driver> getDrList() {
        return drList;
    }

    /**
     * @param driver the driver to add to the list
     */
    public static void addToDrList(Driver driver) {
        drList.add(driver);
    }

    /**
     * @return the empList
     */
    public static ArrayList<Employee> getEmpList() {
        return empList;
    }

    /**
     * @param employee the employee to add to the list
     */
    public static void addToEmpList(Employee employee) {
        empList.add(employee);
    }
    
    
    
}