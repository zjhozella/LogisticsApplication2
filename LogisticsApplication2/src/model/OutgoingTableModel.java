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

    public String[] columnNames = {"Load Number", "Truck Number", "Trailer Number","Load Complete",};
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
                return (Object) outList.get(row).isLoadComplete();
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
            case 4:
                 outList.get(row).setLoadComplete((boolean) value);
                 
            fireTableCellUpdated(row, col);
        }
    }
    
    public void deleteOutgoing(int index){
        this.outList.remove(index);
        fireTableDataChanged();
    }
    
}
