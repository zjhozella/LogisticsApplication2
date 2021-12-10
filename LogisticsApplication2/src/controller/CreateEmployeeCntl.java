/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Employee;
import model.Model;
import static model.Model.employeeTableModel;
import view.CreateEmployeeUI;
import view.IncomingView;
import view.OutgoingView;
import view.editInView;
import view.editOutView;

/**
 *
 * @author zjhoz
 */
public class CreateEmployeeCntl {
    
    public static CreateEmployeeUI createEmpUI;
    
    public CreateEmployeeCntl(){
        createEmpUI = new CreateEmployeeUI();
    }
    
    public void createEmployee(int creationOrigin, int id, String fn, String ln){
        
        switch (creationOrigin) {
            case 0:
                {
                    Employee emp = new Employee(id, fn, ln);
                    Model.addToEmpList(emp);
                    OutgoingView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
                    OutgoingView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
                    break;
                }
            case 1:
                {
                    Employee emp = new Employee(id, fn, ln);
                    Model.addToEmpList(emp);
                    IncomingView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
                    IncomingView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
                    break;
                }
            case 2:
                {
                    Employee emp = new Employee(id, fn, ln);
                    Model.addToEmpList(emp);
                    editOutView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
                    editOutView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
                    break;
                }
            case 3:
                {
                    Employee emp = new Employee(id, fn, ln);
                    Model.addToEmpList(emp);
                    editInView.employeeC.addItem(Model.getEmpList().get(Model.getEmpList().size() - 1).getID());
                    editInView.employeeC.setSelectedIndex(Model.getEmpList().size() - 1);
                    break;
                }
            case 4:
            {
                Employee emp = new Employee(id, fn, ln);
                employeeTableModel.newEmployee(emp);
            }
            default:
                break;
        }
       
        
    }
}