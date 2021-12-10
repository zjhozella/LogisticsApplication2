/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Driver;
import model.Model;
import static model.Model.driverTableModel;
import view.CreateDriverUI;
import view.OutgoingView;
import view.editOutView;

/**
 *
 * @author zjhoz
 */
public class CreateDriverCntl {
    
    public static CreateDriverUI createDrUI;
    
    public CreateDriverCntl(){
        createDrUI = new CreateDriverUI();
    }
    
    public void createDriver(int creationOrigin, String num, String fn, String ln, String company){
        
        switch (creationOrigin){
            case 0:
            {
                Driver dr = new Driver(num, fn, ln, company);
                Model.addToDrList(dr);
                OutgoingView.driverC.addItem(Model.getDrList().get(Model.getDrList().size() - 1).getDlNumber());
                OutgoingView.driverC.setSelectedIndex(Model.getDrList().size() - 1);
                break;
            }
            case 1:
            {
                Driver dr = new Driver(num, fn, ln, company);
                Model.addToDrList(dr);
                editOutView.driverC.addItem(Model.getDrList().get(Model.getDrList().size() - 1).getDlNumber());
                editOutView.driverC.setSelectedIndex(Model.getDrList().size() - 1);
                break;
            }
            case 2:
            {
                Driver dr = new Driver(num, fn, ln, company);
                driverTableModel.newDriver(dr);
                break;
            }
            default:    
                break;
        }
        
        
    }
    
}
