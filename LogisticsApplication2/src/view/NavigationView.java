/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;

import controller.IncomingCntl;
import controller.OutgoingCntl;
import model.Load;

/**
 *
 * @author jprince, zjhoz
 */
public class NavigationView {
    
    //Will contain a frame, a panel within that frame, and 2 buttons (Outgoing, Incoming).
    //Button functionality will move the user to the respective screen
    public NavigationView(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Logistics Application\nPlease select one of the options below:");
        System.out.println("(1) - Enter New Outgoing Load");
        System.out.println("(2) - Enter New Incoming Load");
        System.out.println("(3) - Delete Outgoing Load");
        System.out.println("(4) - Delete Incoming Load");

        System.out.print("Enter your choice: ");
        int option = scnr.nextInt();
        
        switch (option){
            case 1:
                OutgoingCntl outLoad = new OutgoingCntl();
                break;
            case 2:
                IncomingCntl inLoad = new IncomingCntl();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
    
}
