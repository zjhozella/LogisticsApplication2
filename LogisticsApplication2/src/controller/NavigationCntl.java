/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.NavigationView;
import java.util.Scanner;
import view.IncomingView;

/**
 *
 * @author zjhoz
 */
public class NavigationCntl { //NavigationCntl should call NavView to print
    Scanner scnr = new Scanner(System.in);
    boolean nav = true; 
    
    OutgoingCntl outLoad = new OutgoingCntl();
    IncomingCntl inLoad = new IncomingCntl();

    public NavigationCntl(){

        //Wrapped in a while loop, to handle unexpected input.
        //Can change behavior by editing status of nav in each case.
        //Currently program sends to selected controller then EXITS. 
        //If nav changed to true in case then menu would re-load. (This is prob how it should be)
        while(nav){
            
            NavigationView.printMenu();
            int option = scnr.nextInt();
            
            switch (option){
                case 1://Create new Outgoing Load
                    outLoad.createOutgoingLoad();
                    ConfirmationCntl outC = new ConfirmationCntl(true);
                    nav = true;
                    break;
                case 2://Create new Incoming Load
                    inLoad.createIncomingLoad();
                    ConfirmationCntl inC = new ConfirmationCntl(false);
                    nav = true;
                    break;
                case 3://Edit an Outgoing Load
                    editOutLoadCntl editOutLoad = new editOutLoadCntl();
                    nav = false;
                    break;
                case 4: //Edit an Incoming Load
                    editInLoadCntl editInLoad = new editInLoadCntl();
                    nav = false;
                    break;
                case 5://Show all Outgoing Loads
                    outLoad.showAllOutgoing();
                    break;
                case 6://Show all Incoming Loads
                    inLoad.showAllIncoming();
                    break;
                case 9://Exit the program
                    System.out.println("Goodbye!");
                    System.exit(0);
                default: 
                    System.out.println("Invalid Option, choose again!");
                    break;
            }
        }

    }

}
