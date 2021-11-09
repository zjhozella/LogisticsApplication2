package controller;
import model.*;
import view.*;
import java.util.Scanner;
import java.util.Set;

public class editOutLoadCntl{
    Scanner scnr = new Scanner(System.in);
    boolean nav = true;

    public  editOutLoadCntl(){
        //Test for navigation
        System.out.println("Welcome to editOutLoadCntl");
        editOutView editOut = new editOutView();
        int option = scnr.nextInt();

        switch (option){
            case 1:
                editOut.editTruckNum();
                break;
            case 2:
                // method for editing trailer number
                break;



            case 9:
                NavigationCntl returnUI = new NavigationCntl();
        }

    }


}