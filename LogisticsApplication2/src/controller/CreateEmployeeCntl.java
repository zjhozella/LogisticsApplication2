/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Employee;
import model.Model;
import view.CreateEmployeeUI;
import view.IncomingView;
import view.OutgoingView;

/**
 *
 * @author zjhoz
 */
public class CreateEmployeeCntl {
    
    public static CreateEmployeeUI createEmpUI;
    
    public CreateEmployeeCntl(){
        createEmpUI = new CreateEmployeeUI();
    }
    
    public void createEmployee(boolean isOutgoing, int id, String fn, String ln){
        
        if (isOutgoing){
            Employee emp = new Employee(id, fn, ln);
            Model.addToEmpList(emp);
            OutgoingView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
            OutgoingView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
        }else{
            Employee emp = new Employee(id, fn, ln);
            Model.addToEmpList(emp);
            IncomingView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
            IncomingView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
        }
       
        
    }
}