/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Employee;
import model.EmployeeTableModel;
import model.Model;
import static model.Model.employeeTableModel;
import view.DrEmpUI;

/**
 *
 * @author zjhoz
 */
public class DrEmpCntl {
    
    public DrEmpUI drEmpUI;
    private static ArrayList<Employee> empList;
    
    public DrEmpCntl(){
        drEmpUI = new DrEmpUI();
        
        empList = Model.getEmpList();
        
        employeeTableModel = new EmployeeTableModel(empList);
    }
    
}
