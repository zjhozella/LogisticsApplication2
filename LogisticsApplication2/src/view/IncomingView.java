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
            System.out.println(Model.getInList().get(i).printLoad());
            System.out.println(Model.getInList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Incoming Load Record " + (i) + " END<<<\n");
            /*System.out.println("Timestamp: " + Model.getInList().get(i).getTsIn());
            System.out.println("Load Number: " + Model.getInList().get(i).getLoadNumber());
            System.out.println("Truck Number: " + Model.getInList().get(i).getTruckNumber());
            System.out.println("Trailer Number: " + Model.getInList().get(i).getTrailerNumber());
            System.out.println("Is Load Complete? : " + Model.getInList().get(i).isLoadComplete());
            int dunnageIndex = Model.getInList().get(i).getDunnageIndex();
            String dunnage = switch (dunnageIndex) {
                case 0 -> "EMPTY";
                case 1 -> "1/4";
                case 2 -> "1/2";
                case 3 -> "1/3";
                default -> "FULL";
            };
            System.out.println("Dunnage Index: " + dunnage);
            System.out.println("Employee ID: " + Model.getInList().get(i).getEmployee().getID());
            System.out.println("Employee First Name: " + Model.getInList().get(i).getEmployee().getFirstName());
            System.out.println("Employee Last Name: " + Model.getInList().get(i).getEmployee().getLastName());
            System.out.println("Insects Detected? : " + Model.getInList().get(i).isInsectDetected());*/
            
        }
    }
}