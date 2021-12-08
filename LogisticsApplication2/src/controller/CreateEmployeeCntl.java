/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Employee;
import model.Model;
import view.CreateEmployeeUI;
import static view.OutgoingView.employeeC;

/**
 *
 * @author zjhoz
 */
public class CreateEmployeeCntl {
    
    public static CreateEmployeeUI createEmpUI;
    
    public CreateEmployeeCntl(){
        createEmpUI = new CreateEmployeeUI();
    }
    
    public void createEmployee(int id, String fn, String ln){
        Employee emp = new Employee(id, fn, ln);
        Model.addToEmpList(emp);
        employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
    }
}
