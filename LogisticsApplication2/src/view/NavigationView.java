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
public class NavigationView {
    
    //Will contain a frame, a panel within that frame, and 2 buttons (Outgoing, Incoming).
    //Button functionality will move the user to the respective screen
    public NavigationView(){
        System.out.println("Welcome to Logistics Application\n");
    }
    
    //Prints menu for the user to select a choice
    public static void printMenu(){
        System.out.println("Please select one of the options below:");
        System.out.println("(1) - Enter New Outgoing Load");
        System.out.println("(2) - Enter New Incoming Load");
        System.out.println("(3) - Edit Outgoing Load");
        System.out.println("(4) - Edit Incoming Load");
        System.out.println("(5) - View All Outgoing Loads");
        System.out.println("(6) - View All Incoming Loads");
        System.out.println("(9) - Quit");
        System.out.print("Enter your choice: ");
    }
    
}
