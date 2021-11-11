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

    // Menu For editing outTrans paramaters
    // Not all parameters are editable for security reasons
    public void editOutMenu(){
        System.out.println("Select an attribute to edit from list below: ");
        System.out.println("(1) - Edit Truck Number");   //Truck Number = Int
        System.out.println("(2) - Edit Trailer Number"); // Trailer Number = Int 
        System.out.println("(3) - Edit Store Number");   // Store Num = Int
        System.out.println("(4) - Edit Seal Number");    // Seal Num = Int
        System.out.println("(5) - Edit Driver Number");  // Driver Number = String
        System.out.println("(6) - Edit Insect Status");  // Insect Status = bool
        System.out.println("(9) - Exit to main menu");
    }

    //Menu for editing truck number parameter
    public void editTruckNum(){
        System.out.print("Enter new Truck Number: ");
    }

    //Menu for editing trailer number
    public void editTrailerNum(){
        System.out.print("Enter new Trailer Number: ");
    }

    //Menu for editing Store number
    public void editStoreNum(){
        System.out.print("Enter new Store Number: ");
    }

    //Menu for editing Seal number
    public void editSealNum(){
        System.out.print("Enter new Seal Number: ");
    }

    //Menu for editing Driver Number
    public void editDriverNum(){
        System.out.print("Enter new Driver Number: ");
    }

    //Menu for editing Insect Status
    public void editInsectStatus(){
        System.out.print("Enter new Insect Status (['y' = Insect Detected] ['n' = Insect NOT Detected]): ");
    }


}
