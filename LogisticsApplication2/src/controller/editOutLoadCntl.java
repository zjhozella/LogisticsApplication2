package controller;
import model.*;
import view.*;
import java.util.Scanner;

public class editOutLoadCntl{
    Scanner scnr = new Scanner(System.in);
    boolean nav = true;

    public editOutLoadCntl(){
        //Test for navigation
        System.out.println("Welcome to editOutLoadCntl");

        editOutView editOut = new editOutView();
        int loadNum = scnr.nextInt();
        System.out.println(Model.getOutList().get(loadNum).printLoad());

        editOut.editOutMenu();
        int option = scnr.nextInt();
        
        switch (option){
            case 1:
                //method for editing truck number
                editOut.editTruckNum();
                int newTruckNum = scnr.nextInt();
                Model.getOutList();


                break;
            case 2:
                // method for editing trailer number
                break;
            case 3:
                // method call for editing store number
                break;
            case 4:
                // method call for editing seal num
                break;
            case 5:
                // method call for editing driver num
                break;
            case 6:
                // method call for editing insect status
                break;

            case 9: // Return to main menu
                NavigationCntl returnUI = new NavigationCntl();
        }

    }


}