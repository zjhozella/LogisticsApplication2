/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Driver;
import model.Model;
import view.CreateDriverUI;
import static view.OutgoingView.driverC;

/**
 *
 * @author zjhoz
 */
public class CreateDriverCntl {
    
    public static CreateDriverUI createDrUI;
    
    public CreateDriverCntl(){
        createDrUI = new CreateDriverUI();
    }
    
    public void createDriver(String num, String fn, String ln, String company){
        Driver dr = new Driver(num, fn, ln, company);
        Model.addToDrList(dr);
        driverC.addItem(Model.getDrList().get(Model.getDrList().size() - 1).getDlNumber());
        driverC.setSelectedIndex(Model.getDrList().size() - 1);
    }
    
}
