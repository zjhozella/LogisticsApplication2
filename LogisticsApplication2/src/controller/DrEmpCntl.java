/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Driver;
import model.DriverTableModel;
import model.Employee;
import model.EmployeeTableModel;
import model.Model;
import static model.Model.employeeTableModel;
import static model.Model.driverTableModel;
import view.DrEmpUI;

/**
 *
 * @author zjhoz
 */
public class DrEmpCntl {
    
    public DrEmpUI drEmpUI;
    private static ArrayList<Employee> empList;
    private static ArrayList<Driver> drList;
    
    public DrEmpCntl(){
        drEmpUI = new DrEmpUI();
        
        empList = Model.getEmpList();
        drList = Model.getDrList();
        
        employeeTableModel = new EmployeeTableModel(empList);
        driverTableModel = new DriverTableModel(drList);
    }
    
}
