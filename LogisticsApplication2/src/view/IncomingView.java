/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Model;

/**
 *
 * @author jprince, zjhoz
 */
public class IncomingView {
    
    
    public IncomingView(){
        //Will contain all fields to collect data required for an incoming load

        //Incoming entry header
        System.out.println("Incoming Load:\n");
    }
    
    //Prints all attributes of all incoming loads
    public static void displayAllIncomingOutgoingLoad() {
        for (int i = 1; i < Model.getInList().size(); ++i){
            System.out.println(">>>Incoming Load Record " + (i) + ":");
            System.out.println(Model.getInList().get(i).printLoad());
            System.out.println(Model.getInList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Incoming Load Record " + (i) + " END<<<\n");
            
        }
    }
}