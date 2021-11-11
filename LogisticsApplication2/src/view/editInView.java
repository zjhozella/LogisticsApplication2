package view;

public class editInView {

    public editInView(){
        System.out.println("Welcome to the edit menu for [Incoming Load]");
        System.out.print("Please enter load number to edit: ");
    }
    
    // Menu For editing incoming Transaction paramaters
    // Not all parameters are editable for security reasons, do not want employees to be
    //able to edit employee # or if load is completed. 
    public void editInMenu(){
        System.out.println("Select an attribute to edit from list below: ");
        System.out.println("(1) - Edit Truck Number");   //Truck Number = Int
        System.out.println("(2) - Edit Trailer Number"); // Trailer Number = Int 
        System.out.println("(3) - Edit Dunnage Amount"); // Dunnage index = Int
        System.out.println("(4) - Edit Insect Status");  // Insect Status = bool
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

    //Menu for editing Dunnage inder
    public void editDunnage(){
        System.out.print("Enter new Dunnage Amount: ");
    }

    //Menu for editing Driver number
    public void editDriverNum(){
        System.out.print("Enter new Driver Number: ");
    }

    //Menu for editing Insect Status
    public void editInsectStatus(){
        System.out.print("Enter new Insect Status (['y' = Insect Detected] ['n' = Insect NOT Detected]): ");
    }
}
