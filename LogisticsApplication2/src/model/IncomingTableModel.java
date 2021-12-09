/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import static view.incomingListUI.inTrans;
/**
 *
 * @author zjhoz
 */
public class IncomingTableModel extends AbstractTableModel{
    
    public String[] columnNames = {"Load Number", "Truck Number", "Trailer Number","Load Complete"};
    public ArrayList<IncomingTrans> inList;
    
    public IncomingTableModel(ArrayList<IncomingTrans> inList){
        this.inList = inList;
    }
    
    @Override
    public int getRowCount() {
        return inList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return (Object) inList.get(row).getLoadNumber();
            case 1: 
                return (Object) inList.get(row).getTruckNumber();
            case 2:
                return (Object) inList.get(row).getTrailerNumber();
            case 3:
                return (Object) inList.get(row).isLoadComplete();
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
                 inList.get(row).setLoadNumber((int) value);
            case 1: 
                 inList.get(row).setTruckNumber((int) value);
            case 2:
                 inList.get(row).setTrailerNumber((int) value);
            case 3:
                 inList.get(row).setLoadComplete((boolean) value);
                 
            fireTableCellUpdated(row, col);
        }
    }
    
    public void editLoad(int loadNumber, int dunnageIndex, Employee employee, boolean insectDetected, Timestamp inTS){

        Model.getInList().get(loadNumber).setDunnageIndex(dunnageIndex);
        Model.getInList().get(loadNumber).setEmployee(employee);
        Model.getInList().get(loadNumber).setInsectDetected(insectDetected);
        Model.getInList().get(loadNumber).setTsIn(inTS);
        Model.getInList().get(loadNumber).setLoadComplete(true);
        Model.getOutList().get(loadNumber).setLoadComplete(true);
        fireTableDataChanged();
        Model.incomingTableModel.fireTableDataChanged();
    }
    
    public void deleteIncoming(int index){
        //this.inList.remove(index);
        Model.getInList().get(index).setDunnageIndex(0);
        Model.getInList().get(index).setEmployee(new Employee(0, "", ""));
        Model.getInList().get(index).setInsectDetected(false);
        Model.getInList().get(index).setTsIn(null);
        Model.getInList().get(index).setLoadComplete(false);
        Model.getOutList().get(index).setLoadComplete(false);
        fireTableDataChanged();
    }
}
