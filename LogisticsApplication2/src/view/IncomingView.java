/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IncomingCntl;
import model.Model;

/**
 *
 * @author jprince, zjhoz
 */
public class IncomingView {
    
    IncomingCntl inCntl = new IncomingCntl();
    
    public IncomingView(){
        //Will contain all fields to collect data required for an incoming load
        //Submit button will transfer all data into the ConfirmationView incoming constructor 
        //for confirmation from the user
        //Use the truckNumber and trailerNumber pair to find matching loadNumber to send to confirmationView
    }

    public static void exitViewMessage(){
        System.out.println("Move on to ConfirmationView");
    }
    
    public static void displayAllIncomingOutgoingLoad() {
        for (int i = 1; i < Model.getInList().size(); ++i){
            System.out.println(">>>Incoming Load Record " + (i) + ":");
            System.out.println("Timestamp: " + Model.getInList().get(i).getTsIn());
            System.out.println("Date: " + Model.getInList().get(i).getDate());
            System.out.println("Time: " + Model.getInList().get(i).getTime());
            System.out.println("Employee First Name: " + Model.getInList().get(i).getEmployee().getFirstName());
            System.out.println("Employee Last Name: " + Model.getInList().get(i).getEmployee().getLastName());
            System.out.println("Truck Number: " + Model.getInList().get(i).getTruckNumber());
            System.out.println("Trailer Number: " + Model.getInList().get(i).getTrailerNumber());
        }
    }
}