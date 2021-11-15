/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import view.ConfirmationView;

/**
 *
 * @author zjhoz
 */
public class ConfirmationCntl {
    
    public ConfirmationView cView = new ConfirmationView();
    Scanner scnr = new Scanner(System.in);
    
    public ConfirmationCntl(boolean isOutgoing){
        if (isOutgoing){
            cView.confirmOutgoing();
            cView.confirmation();
            if (scnr.nextInt() != 1)
            {
                //Create new editOutLoad controller and send user to edit
                editOutLoadCntl editOut = new editOutLoadCntl();
                
            }
                
        }else{
            cView.confirmIncoming();
            cView.confirmation();
            if (scnr.nextInt() != 1)
            {
                //Create new editInLoad controller for user to edit inLoad
                editInLoadCntl editIn = new editInLoadCntl();
            }
        }
        
        System.out.println("Load Confirmed! Returning to Main Menu.");
    }
    
}
