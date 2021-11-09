/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Load;
import view.NavigationView;
import java.util.Scanner;

/**
 *
 * @author zjhoz
 */
public class NavigationCntl { //NavigationCntl should call NavView to print
    Scanner scnr = new Scanner(System.in);
    boolean nav = true;

    public NavigationCntl(){

        //Wrapped in a while loop, to handle unexpected input.
        //Can change behavior by editing status of nav in each case.
        //Currently program sends to selected controller then EXITS. 
        //If nav changed to true in case then menu would re-load.
        while(nav){
            NavigationView navMenu= new NavigationView();
            int option = scnr.nextInt();
        

            switch (option){
                case 1: 
                    OutgoingCntl outLoad = new OutgoingCntl();
                    nav = false;
                    break;
                case 2:
                    IncomingCntl inLoad = new IncomingCntl();
                    nav = false;
                    break;
                case 3:
                    editOutLoadCntl editOutLoad = new editOutLoadCntl();
                    nav = false;
                    break;
                case 4: 
                    editInLoadCntl editInLoad = new editInLoadCntl();
                    nav = false;
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default: 
                    System.out.println("Invalid Option, choose again!");
                    break;
            }
        }

    }

}
