/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OutgoingCntl;



/**
 *
 * @author jprince, zjhoz
 */
public class OutgoingView {

    OutgoingCntl outCntl = new OutgoingCntl();

    public OutgoingView(){
        //Will contain all fields to collect data required for an outgoing load
        //Submit button will transfer all data into the ConfirmationView outgoing constructor 
        //for confirmation from the user

        System.out.println("Outgoing Load:\n");
  
    }

    
    public void printTruckNum(){
        System.out.print("Enter Truck Number:");
        outCntl.enterTruckNum();
    }
    
    public void printTrailerNum(){
        System.out.print("Enter Trailer Number:");
        outCntl.enterTrailerNum();
    }
    
    public void printStoreNum(){
        System.out.print("Enter Store Number:");
        outCntl.enterStoreNum();
    }
    
    public void printSealNum() {
        System.out.print("Enter Seal Number:");
        outCntl.enterSealNum();
    }
    
    public void printDLNum(){
        System.out.print("Enter Driver License Number:");
        outCntl.enterDLNum();
    }
    
    public void printDFirstName(){
        System.out.print("Enter Driver First Name:");
        outCntl.enterDFirstName();
    }
    
    public void printDLastName(){
        System.out.print("Enter Driver Last Name:");
        outCntl.enterDLastName();
    }
    
    public void printDCompany(){
        System.out.print("Enter Driver Company:");
        outCntl.enterDCompany();
    }
    
    public void printEID(){
        System.out.print("Enter Employee ID:");
        outCntl.enterEID();
    }
    
    public void printEFirstName(){
        System.out.print("Enter Employee First Name:");
        outCntl.enterEFirstName();
    }
    
    public void printELastName(){
        System.out.print("Enter Employee Last Name:");
        outCntl.enterELastName();
    }
    
    public void printInsect(){
        System.out.print("Are there insects detected? (0)-No, (1)-Yes:");
        outCntl.enterInsect();
    }
    
}
