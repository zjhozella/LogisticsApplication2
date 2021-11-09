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

    public NavigationCntl(){
        NavigationView navMenu= new NavigationView();
        int option = scnr.nextInt();
        
        switch (option){
            case 1: 
                OutgoingCntl outLoad = new OutgoingCntl();
                break;
            case 2:
                IncomingCntl inLoad = new IncomingCntl();
                break;
            case 3:
                editOutLoadCntl editOutLoad = new editOutLoadCntl();
                break;
            case 4: 
                editInLoadCntl editInLoad = new editInLoadCntl();
                break;
            default:
                System.out.println("Invalid option, please try again!");
                break;
        }

        
    }

}
