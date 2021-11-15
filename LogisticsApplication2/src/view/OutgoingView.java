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
public class OutgoingView {


    public OutgoingView(){
        //Will contain all fields to collect data required for an outgoing load


        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
  
    }
    
    //Prints all attributes of all outgoing loads
    public static void displayAllOutgoingLoad() {
        for (int i = 1; i < Model.getOutList().size(); ++i){
            System.out.println(">>>Outgoing Load Record " + (i) + ":");
            System.out.println(Model.getOutList().get(i).printLoad());
            System.out.println(Model.getOutList().get(i).getDr().printDriver());
            System.out.println(Model.getOutList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Outgoing Load Record  " + (i) + " END<<<\n");
            
            
        }
    }
    
}