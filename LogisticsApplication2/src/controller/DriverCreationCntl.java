/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static model.Model.driverTableModel;
import view.DriverCreationUI;

/**
 *
 * @author zjhoz
 */
public class DriverCreationCntl {
    
    DriverCreationUI driverCreationUI;
    
    public DriverCreationCntl(){
        driverCreationUI = new DriverCreationUI();
    }
    
    public void createDriver(String num, String fn, String ln, String comp){
        driverTableModel.newDriver(num, fn, ln, comp);
    }
    
}
