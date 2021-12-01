/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author zjhoz
 */
public class OutgoingTableModel extends AbstractTableModel{

    public String[] columnNames = {"Load Number", "Truck Number", "Trailer Number", "Dunnage Index", "Load Complete", "Store Number", "Seal Number", "Employee ID", "Employee First Name", "Employee Last Name", "Driver License No.", "Driver First Name", "Driver Last Name", "Driver Company", "Insect Detected", "Timestamp"};
    public ArrayList<OutgoingTrans> outList;
    
    public OutgoingTableModel(ArrayList<OutgoingTrans> outList){
        this.outList = outList;
    }
    
    @Override
    public int getRowCount() {
        return outList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return (Object) outList.get(row).getLoadNumber();
            case 1: 
                return (Object) outList.get(row).getTruckNumber();
            case 2:
                return (Object) outList.get(row).getTrailerNumber();
            case 3:
                return (Object) outList.get(row).getDunnageIndex();
            case 4:
                return (Object) outList.get(row).isLoadComplete();
            case 5:
                return (Object) outList.get(row).getStoreNumber();
            case 6:
                return (Object) outList.get(row).getSealNumber();
            case 7:
                return (Object) outList.get(row).getEmployee().getID();
            case 8:
                return (Object) outList.get(row).getEmployee().getFirstName();
            case 9:
                return (Object) outList.get(row).getEmployee().getLastName();
            case 10:
                return (Object) outList.get(row).getDr().getDlNumber();
            case 11:
                return (Object) outList.get(row).getDr().getFirstName();
            case 12:
                return (Object) outList.get(row).getDr().getLastName();
            case 13:
                return (Object) outList.get(row).isInsectDetected();
            case 14:
                return (Object) outList.get(row).getTsOut();
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
                 outList.get(row).setLoadNumber((int) value);
            case 1: 
                 outList.get(row).setTruckNumber((int) value);
            case 2:
                 outList.get(row).setTrailerNumber((int) value);
            case 3:
                 outList.get(row).setDunnageIndex((int) value);
            case 4:
                 outList.get(row).setLoadComplete((boolean) value);
            case 5:
                 outList.get(row).setStoreNumber((int) value);
            case 6:
                 outList.get(row).setSealNumber((int) value);
            case 7:
                 outList.get(row).getEmployee().setID((int) value);
            case 8:
                 outList.get(row).getEmployee().setFirstName((String) value);
            case 9:
                 outList.get(row).getEmployee().setLastName((String) value);
            case 10:
                 outList.get(row).getDr().setDlNumber((String) value);
            case 11:
                 outList.get(row).getDr().setFirstName((String) value);
            case 12:
                outList.get(row).getDr().setLastName((String) value);
            case 13:
                 outList.get(row).setInsectDetected((boolean) value);
            case 14:
                 outList.get(row).setTsOut((Timestamp) value);
                 
            fireTableCellUpdated(row, col);
        }
    }
    
    public void deleteOutgoing(int index){
        this.outList.remove(index);
        fireTableDataChanged();
    }
    
}
