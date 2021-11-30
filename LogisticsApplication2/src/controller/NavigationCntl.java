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
    
    OutgoingCntl outLoad = new OutgoingCntl(); //Create new OutgoingCntl object
    IncomingCntl inLoad = new IncomingCntl();  //Create new IncomingCntl object

    public NavigationCntl(){

        //Wrapped in a while loop, to handle unexpected input.
        //Can change behavior by editing status of nav in each case.
        while(nav){
            
            System.out.println(Controller.getNextLoadNumber());
            NavigationView.printMenu();
            
            int option = scnr.nextInt();
            
            
            switch (option){
                case 1://Create new Outgoing Load
                    outLoad.createOutgoingLoad();
                    ConfirmationCntl outC = new ConfirmationCntl(true); //Create new confirmationCntl
                    nav = true;
                    break;
                case 2://Create new Incoming Load
                    inLoad.createIncomingLoad();
                    ConfirmationCntl inC = new ConfirmationCntl(false); //Create new confirmationCntl 
                    nav = true;
                    break;
                case 3://Edit an Outgoing Load
                    editOutLoadCntl editOutLoad = new editOutLoadCntl(); //Create new instance of editOutLoadCntl
                    nav = false;
                    break;
                case 4: //Edit an Incoming Load
                    editInLoadCntl editInLoad = new editInLoadCntl();//create new instance of editInLoadCntl
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
                    System.exit(0); //Program will exit if 9 is selected
                default: 
                    System.out.println("Invalid Option, choose again!");
                    break;
            }
        }

    }

}
