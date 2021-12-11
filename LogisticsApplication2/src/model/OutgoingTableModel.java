/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Controller;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import static view.outgoingListUI.outTrans;
import static view.outgoingListUI.index;


/**
 *
 * @author zjhoz
 */
public class OutgoingTableModel extends AbstractTableModel{

    public String[] columnNames = {"Load Number", "Truck Number", "Trailer Number", "Load Complete"};
    public ArrayList<OutgoingTrans> outList;
    public static int editOutLoadNum;
    // Should not be needed, creating no new loads here
    //public int nextOutLoadNumber;
    
    
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
                return outList.get(row).getLoadNumber();
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
    

    public void newLoad(int truckNumber, int trailerNumber, int dunnageIndex, int storeNumber, int sealNumber, Driver driver, Employee employee, boolean insectDetected, Timestamp outTS){
        if (outList.size() > 0){   
            outTrans = new OutgoingTrans(Controller.getNextLoadNumber(), truckNumber, trailerNumber, dunnageIndex, false, storeNumber, sealNumber, employee, driver, insectDetected, outTS);
            outList.add(outTrans);
            
            /**
                Creates a blank Incoming Transaction to match every Outgoing Transaction that is created. This links both
                transactions together to be consistent with the same load number, truck number, and trailer number.
                The Incoming Transaction record will be updated when the user creates a new Incoming Transaction.
            **/
            Employee blankEmployee = new Employee(-1, "", "");
            IncomingTrans it = new IncomingTrans(Controller.getNextLoadNumber(), truckNumber, trailerNumber, dunnageIndex, false, blankEmployee, insectDetected, outTS);
            Model.addToInList(it);
            Controller.setNextLoadNumber();  
            
        } else {
            outTrans = new OutgoingTrans(0, truckNumber, trailerNumber, dunnageIndex, false, storeNumber, sealNumber, employee, driver, insectDetected, outTS);
            outList.add(outTrans);
            
            Employee blankEmployee = new Employee(-1, "", "");
            IncomingTrans it = new IncomingTrans(0, truckNumber, trailerNumber, dunnageIndex, false, blankEmployee, insectDetected, outTS);
            Model.addToInList(it);
            Controller.setNextLoadNumber();
        }
        
        fireTableDataChanged(); //refreshes table
        Model.incomingTableModel.fireTableDataChanged(); 
    }

    public void editLoad(int truckNumber, int trailerNumber, int storeNumber, int sealNumber, Driver driver, Employee employee, boolean insectDetected){
        Model.getOutList().get(index).setTruckNumber(truckNumber);
        Model.getOutList().get(index).setTrailerNumber(trailerNumber);
        Model.getOutList().get(index).setStoreNumber(storeNumber);
        Model.getOutList().get(index).setSealNumber(sealNumber);
        Model.getOutList().get(index).setDr(driver);
        Model.getOutList().get(index).setEmployee(employee);
        Model.getOutList().get(index).setInsectDetected(insectDetected);
        
    }


    public void deleteOutgoing(int outIndex){
        
        this.outList.remove(outIndex);
        fireTableDataChanged();

        Model.incomingTableModel.fireTableDataChanged();
    }
    
}