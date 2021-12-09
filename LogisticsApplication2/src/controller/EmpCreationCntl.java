/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Employee;
import model.Model;
import view.EmpCreationUI;

/**
 *
 * @author zjhoz
 */
public class EmpCreationCntl {
    
    EmpCreationUI empCreationUI;
    
    public EmpCreationCntl(){
        empCreationUI = new EmpCreationUI();
    }
    
    public void createEmployee(int id, String fn, String ln){
        Employee emp = new Employee(id, fn, ln);
        Model.addToEmpList(emp);
    }
    
}
