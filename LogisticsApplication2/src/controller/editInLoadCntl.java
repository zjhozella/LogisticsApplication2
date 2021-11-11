package controller;
import java.util.Scanner;
import model.*;
import view.*;

public class editInLoadCntl{
    Scanner scnr = new Scanner(System.in);
    boolean nav = true;
    public editInLoadCntl(){
        //Navigation Test
        System.out.println("Welcome to editInLoadCntl");

        editInView editIn = new editInView(); //Create new view for editIncoming loads
        int loadNum = scnr.nextInt();
        //Print selected load
        System.out.println(Model.getInList().get(loadNum).printLoad());

        editIn.editInMenu(); //Display Nav menu
        int option = scnr.nextInt();

        while (nav){
            switch(option){
                case 1: 
                //Method for editing Truck Number
                editIn.editTruckNum();
                int newTruckNum = scnr.nextInt();
                Model.getInList().get(loadNum).setTruckNumber(newTruckNum);
                System.out.println("Truck Number for Load #" + loadNum + " has been updated to: "+ 
                    Model.getInList().get(loadNum).getTruckNumber());
                System.out.println();
                nav = false;
                break;

                case 2: 
                //Method for editing Trailer number
                editIn.editTrailerNum();
                int newTrailerNum = scnr.nextInt();
                Model.getInList().get(loadNum).setTrailerNumber(newTrailerNum);
                System.out.println("Trailer Number for Load #" + loadNum + " has been updated to: "+
                    Model.getInList().get(loadNum).getTrailerNumber());
                System.out.println();
                nav = false;
                break;

                case 3: 
                //Method for editing dunnage index
                editIn.editDunnage();
                int newDunnage = scnr.nextInt();
                Model.getInList().get(loadNum).setDunnageIndex(newDunnage);
                System.out.println("Dunnage Index for Load #" +loadNum+ " has been updated to: "+ 
                    Model.getInList().get(loadNum).getDunnageIndex());
                System.out.println();
                nav = false;
                break;

                case 4: 
                //Method for editing insect status
                editIn.editInsectStatus();
                Character newInsectStatus = scnr.next().charAt(0);
                if (newInsectStatus == 'y' || newInsectStatus == 'Y'){
                    Model.getInList().get(loadNum).setInsectDetected(true);
                    System.out.println("Insect Detected Status of Load #"+loadNum+ " has been updated to: "
                    + Model.getInList().get(loadNum).isInsectDetected());
                    System.out.println();
                }
                else if (newInsectStatus == 'n' || newInsectStatus == 'N'){
                    Model.getInList().get(loadNum).setInsectDetected(false);
                    System.out.println("Insect Detected Status of Load #"+loadNum+ " has been updated to: "
                    + Model.getInList().get(loadNum).isInsectDetected());
                    System.out.println();
                } 
                else {
                    System.out.println("Invalid input!" + "\n");
                }
                nav = false;
                break;

                case 9: 
                //Exit editing navigation and return to main menu
                nav = false;
                break;
            }

        }

        //Create new NavigationCntl to return to main menu
        NavigationCntl returnUI = new NavigationCntl();

        
    }
}