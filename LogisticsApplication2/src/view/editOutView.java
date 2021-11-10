package view;

import model.*;
import controller.*;
import java.util.Scanner;

import controller.editOutLoadCntl;

public class editOutView {
    Scanner scnr = new Scanner(System.in);

    public editOutView(){
        System.out.println("Welcome to the edit menu for [Outgoing Load]");
        System.out.print("Please enter load number to edit: ");
    }

    public void editOutMenu(){
        // Menu For editing outTrans paramaters
        // Not all parameters are editable for security reasons
        System.out.println("Select an attribute to edit from list below: ");
        System.out.println("(1) - Edit Truck Number");   //Truck Number = Int
        System.out.println("(2) - Edit Trailer Number"); // Trailer Number = Int 
        System.out.println("(3) - Edit Store Number");   // Store Num = Int
        System.out.println("(4) - Edit Seal Number");    // Seal Num = Int
        System.out.println("(5) - Edit Driver Number");  // Driver Number = String
        System.out.println("(6) - Edit Insect Status");  // Insect Status = bool
        System.out.println("(9) - Exit to main menu");
    }

    public void editTruckNum(){
        System.out.println("Enter new Truck Number: ");
    }


}
