/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import static controller.Controller.navCntl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NavigationView;
import view.outgoingListUI;

import java.util.Scanner;
import static model.Model.outgoingTableModel;
import view.IncomingView;

/**
 *
 * @author zjhoz
 */
public class NavigationCntl { 
    
    public static OutgoingCntl outLoad = new OutgoingCntl(navCntl); //Create new OutgoingCntl object
    public static IncomingCntl inLoad = new IncomingCntl();  //Create new IncomingCntl object

    public NavigationCntl(){


        //Will create in instance of the NavigationView that will spawn main menu navigation.
        NavigationView navUI = new NavigationView();

    }
}
