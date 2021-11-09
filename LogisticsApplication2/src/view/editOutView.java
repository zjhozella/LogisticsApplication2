package view;

//import controller.editOutLoadCntl;
import model.Model;
import java.util.Scanner;

public class editOutView {
    Scanner scnr = new Scanner(System.in);
    public editOutView(){
        System.out.println("Welcome to the edit menu for [Outgoing Load]");
        System.out.print("Please enter load number to edit: ");
        int loadNum = scnr.nextInt();
        System.out.println("Current Load information: ");
        System.out.println(Model.getOutList().get(loadNum).printLoad());

        // Menu For editing outTrans paramaters
        // Not all parameters are editable for security reasons
        System.out.println("Select an attribute to edit from list below: ");
        System.out.println("(1) - Edit Truck Number"); //Truck Number = Int
        System.out.println("(2) - Edit Trailer Number"); // Trailer Number = Int 
        System.out.println("(3) - Edit Store Number"); // Store Num = Int
        System.out.println("(4) - Edit Seal Number"); // Seal Num = Int
        System.out.println("(5) - Edit Driver Number"); // Driver Number = String
        System.out.println("(6) - Edit Insect Status"); // Insect Status = bool
        System.out.println("(9) - Exit to main menu");


    }

    public int editTruckNum() {
        System.out.print("Enter new value for Truck Number: ");
        int newTruckNum = scnr.nextInt();
        System.out.println("New Truck Number for load is now: " + newTruckNum);
        return newTruckNum;
    }


    

}
