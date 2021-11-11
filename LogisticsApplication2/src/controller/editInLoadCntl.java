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

        //editIn.ed
    }
}