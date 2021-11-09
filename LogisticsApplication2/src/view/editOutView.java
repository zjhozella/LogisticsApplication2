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
        System.out.println("(1) - Edit Truck Number");
        System.out.println("(2) - Edit Trailer Number");
        System.out.println("(3) - Edit Store Number");
        System.out.println("(4) - Edit Seal Number");
        System.out.println("(5) - Edit Driver Number");
        System.out.println("(6) - Edit Insect Status");
        System.out.println("(9) - Exit to main menu");


    }

    public String editTruckNum() {
        System.out.print("Enter new value for Truck Number: ");
        String newTruckNum = scnr.next();
        System.out.println("New Truck Number for load is now: " + newTruckNum);
        return newTruckNum;
    }


    

}
