package controller;
import model.*;
import view.*;
import java.util.Scanner;

import javax.swing.text.Style;

public class editOutLoadCntl{
    editOutView outEditView = new editOutView();
    
    /* DEPRECIATED CODE****
    Scanner scnr = new Scanner(System.in);
    boolean nav = true;

    public editOutLoadCntl(){
        editOutView editOut = new editOutView();
        int loadNum = scnr.nextInt();
        
        //Print Selected Load
        System.out.println("\n" + "Current Values for Load #" + loadNum);
        System.out.println(Model.getOutList().get(loadNum).printLoad());

        editOut.editOutMenu();// Display edit Out Nav menu
        int option = scnr.nextInt();
        
        while(nav){
            switch (option){
                case 1:
                    //method for editing truck number
                    editOut.editTruckNum();
                    int newTruckNum = scnr.nextInt();
                    Model.getOutList().get(loadNum).setTruckNumber(newTruckNum);
                    System.out.println("Truck Number for Load #" + loadNum + " has been updated to: "+ 
                        Model.getOutList().get(loadNum).getTruckNumber());
                    System.out.println();
                    nav = false;
                    break;
                case 2:
                    // method for editing trailer number
                    editOut.editTrailerNum();
                    int newTrailerNum = scnr.nextInt();
                    Model.getOutList().get(loadNum).setTrailerNumber(newTrailerNum);
                    System.out.println("Trailer Number for Load #" + loadNum + " has been updated to: "+
                        Model.getOutList().get(loadNum).getTrailerNumber());
                    System.out.println();
                    nav = false;
                    break;
                case 3:
                    // method call for editing store number
                    editOut.editStoreNum();
                    int newStoreNum = scnr.nextInt();
                    Model.getOutList().get(loadNum).setStoreNumber(newStoreNum);
                    System.out.println("Store Number for Load #" +loadNum+ " has been updated to: "+ 
                        Model.getOutList().get(loadNum).getStoreNumber());
                    System.out.println();
                    nav = false;
                    break;
                case 4:
                    // method call for editing seal num
                    editOut.editSealNum();
                    int newSealNum = scnr.nextInt();
                    Model.getOutList().get(loadNum).setSealNumber(newSealNum);
                    System.out.println("Seal Number for Load #"+loadNum+ " has been updated to: "+
                        Model.getOutList().get(loadNum).getSealNumber());
                    System.out.println();
                    nav = false;
                    break;
                case 5:
                    // method call for editing driver num
                    editOut.editDriverNum();
                    String newDriverNum = scnr.next();
                    Model.getOutList().get(loadNum).getDr().setDlNumber(newDriverNum);
                    System.out.println("Driver Number for Load #"+loadNum+" has been updated to: "+
                        Model.getOutList().get(loadNum).getDr().getDlNumber());
                    System.out.println();
                    nav = false;
                    break;
                case 6:
                    // method call for editing insect status
                    editOut.editInsectStatus();
                    Character newInsectStatus = scnr.next().charAt(0);
                    if (newInsectStatus == 'y' || newInsectStatus == 'Y'){
                        Model.getOutList().get(loadNum).setInsectDetected(true);
                        System.out.println("Insect Detected Status of Load #"+loadNum+ " has been updated to: "
                        + Model.getOutList().get(loadNum).isInsectDetected());
                        System.out.println();
                    }
                    else if (newInsectStatus == 'n' || newInsectStatus == 'N'){
                        Model.getOutList().get(loadNum).setInsectDetected(false);
                        System.out.println("Insect Detected Status of Load #"+loadNum+ " has been updated to: "
                        + Model.getOutList().get(loadNum).isInsectDetected());
                        System.out.println();
                    }
                    else {
                        System.out.println("Invalid input!");

                    }
                    nav = false;
                    break;

                case 9: // Return to main menu
                    nav=false;
                    break;
                }
        }
        // Create new NavigationCntl to return to main Menu
        NavigationCntl returnUI = new NavigationCntl();

    }

*/
}