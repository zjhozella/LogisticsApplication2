/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IncomingCntl;

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
        
        System.out.println("Outgoing Load:\n");
  
    }

    public void printTruckNum(){
        System.out.print("Enter Truck Number:");
        inCntl.enterTruckNum();
    }
    
    public void printTrailerNum(){
        System.out.print("Enter Trailer Number:");
        inCntl.enterTrailerNum();
    }
    
    public void printDunnage(){
        System.out.print("Enter Dunnage Number:");
        inCntl.enterDunnage();
    }
    
    public void printEID(){
        System.out.print("Enter Employee ID:");
        inCntl.enterEID();
    }
    
    public void printEFirstName(){
        System.out.print("Enter Employee First Name:");
        inCntl.enterEFirstName();
    }
    
    public void printELastName(){
        System.out.print("Enter Employee Last Name:");
        inCntl.enterELastName();
    }
    
    public void printInsect(){
        System.out.print("Are there insects detected? (0)-No, (1)-Yes:");
        inCntl.enterInsect();
    }
    
    

}