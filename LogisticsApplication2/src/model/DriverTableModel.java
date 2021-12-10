/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import static view.DriverListUI.dr;

/**
 *
 * @author zjhoz
 */
public class DriverTableModel extends AbstractTableModel{
    public String[] columnNames = {"Lic. #", "First Name", "Last Name", "Company"};
    public ArrayList<Driver> drList;
    
    public DriverTableModel(ArrayList<Driver> drList){
        this.drList = drList;
        
       
    }
    
    @Override
    public int getRowCount() {
        return drList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return (Object) drList.get(row).getDlNumber();
            case 1: 
                return (Object) drList.get(row).getFirstName();
            case 2:
                return (Object) drList.get(row).getLastName();
            case 3:
                return (Object) drList.get(row).getCompany();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int c){
        return columnNames[c];
    }
    
    @Override
    public void setValueAt(Object value, int row, int col){
        switch(col){
            case 0:
                 drList.get(row).setDlNumber((String) value);
            case 1: 
                 drList.get(row).setFirstName((String) value);
            case 2:
                 drList.get(row).setLastName((String) value);
            case 3:
                 drList.get(row).setCompany((String) value);
                 
            fireTableCellUpdated(row, col);
        }
    }
    
    public void newDriver(Driver dr){
        
        drList.add(dr);
        
        fireTableDataChanged(); //refreshes table
    }
    
    public void deleteDriver(int index){
        this.drList.remove(index);
        fireTableDataChanged();
    }
}
