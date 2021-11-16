/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Timestamp;
import model.Model;

/**
 *
 * @author jprince, zjhoz
 */
public class ConfirmationView {
    
    //Constructor that prints ConfirmationView heading
    public ConfirmationView(){
        System.out.println("Please validate the following information:");
    }

    //Prints all data from the outgoing load they just created
    public void confirmOutgoing(){
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).printLoad());
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).getDr().printDriver());
        System.out.println(Model.getOutList().get(Model.getOutList().size() - 1).getEmployee().printEmployee());
    }
    
    //Prints all data from the incoming load they just created
    public void confirmIncoming(){
        System.out.println(Model.getInList().get(Model.getInList().size() - 1).printLoad());
        System.out.println(Model.getInList().get(Model.getInList().size() - 1).getEmployee().printEmployee());
    }
    
    //Prints instruction statement for the user
    public void confirmation(){
        System.out.println("Is the information above valid? 1 to confirm, 0 to edit load");
    }
}
