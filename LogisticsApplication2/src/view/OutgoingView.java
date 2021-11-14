/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Model;


/**
 *
 * @author jprince, zjhoz
 */
public class OutgoingView {

    //OutgoingCntl outCntl = new OutgoingCntl();

    public OutgoingView(){
        //Will contain all fields to collect data required for an outgoing load
        //Submit button will transfer all data into the ConfirmationView outgoing constructor 
        //for confirmation from the user

        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
  
    }
    
    public static void exitViewMessage(){
        System.out.println("Move on to ConfirmationView");
    }
    
    public static void displayAllOutgoingLoad() {
        for (int i = 1; i < Model.getOutList().size(); ++i){
            System.out.println(">>>Outgoing Load Record " + (i) + ":");
            System.out.println("Timestamp: " + Model.getOutList().get(i).getTsOut());
            System.out.println("Date: " + Model.getOutList().get(i).getDate());
            System.out.println("Time: " + Model.getOutList().get(i).getTime());
            System.out.println("Driver License Number: " + Model.getOutList().get(i).getDr().getDlNumber());
            System.out.println("Driver Company: " + Model.getOutList().get(i).getDr().getCompany());
            System.out.println("Driver First Name: " + Model.getOutList().get(i).getDr().getFirstName());
            System.out.println("Driver Last Name: " + Model.getOutList().get(i).getDr().getLastName());
            System.out.println("Employee First Name: " + Model.getOutList().get(i).getEmployee().getFirstName());
            System.out.println("Employee Last Name: " + Model.getOutList().get(i).getEmployee().getLastName());
            System.out.println("Truck Number: " + Model.getOutList().get(i).getTruckNumber());
            System.out.println("Trailer Number: " + Model.getOutList().get(i).getTrailerNumber());
            System.out.println("Store Number: " + Model.getOutList().get(i).getStoreNumber());
            System.out.println("Seal Number: " + Model.getOutList().get(i).getSealNumber());
        }
    }
    
}