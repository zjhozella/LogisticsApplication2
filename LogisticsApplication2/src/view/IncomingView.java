/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jprince, zjhoz
 */
public class IncomingView {
    
   
    
    public IncomingView(){
        //Will contain all fields to collect data required for an incoming load
        //Submit button will transfer all data into the ConfirmationView incoming constructor 
        //for confirmation from the user
        //Use the truckNumber and trailerNumber pair to find matching loadNumber to send to confirmationView
        
        System.out.println("Outgoing Load:\n");
  
    }

    public void printTruckNum(){
        System.out.print("Enter Truck Number:");
    }
    
    public void printTrailerNum(){
        System.out.print("Enter Trailer Number:");
    }
    
    public void printDunnage(){
        System.out.print("Enter Dunnage Number:");
    }
    
    public void printEID(){
        System.out.print("Enter Employee ID:");
    }
    
    public void printEFirstName(){
        System.out.print("Enter Employee First Name:");
    }
    
    public void printELastName(){
        System.out.print("Enter Employee Last Name:");
    }
    
    public void printInsect(){
        System.out.print("Are there insects detected? (0)-No, (1)-Yes:");
    }
    
    

}