/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import controller.CreateEmployeeCntl;
import controller.NavigationCntl;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.Model;
import static view.incomingListUI.index;


/**
 *
 * @author jprince, zjhoz
 */
public class editInView extends JFrame{
    
    public JPanel mainPanel, bottomPanel, buttonPanel, empComboPanel;
    public static JLabel loadNumberL, truckNumberL1, truckNumberL2, trailerNumberL1, trailerNumberL2, dunnageIndexL,
            storeNumberL1, storeNumberL2, sealNumberL1, sealNumberL2, empIDL1, empIDL2, empNameL1, empNameL2,
            driverNumL1, driverNumL2, driverNameL1, driverNameL2, driverCompL1, driverCompL2, insectDetectedL, newEmpIDL1, newEmpNameL1, newEmpNameL2, loadbox, loadbox2;
    public JButton submitButton, cancelButton, empAddButton;
    public static JComboBox loadNumberC, dunnageC, employeeC;
    public static JCheckBox insectDetected;
    
    public editInView(){
        super();
        initComponents();
        //Incoming entry header
        System.out.println("Incoming Load:\n");
    }
    
    public void initComponents(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(14, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 100));
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));
        buttonPanel = new JPanel(new GridLayout(1,5));
        
        empComboPanel = new JPanel();
        empAddButton = new JButton("+");
        empAddButton.addActionListener(new OnAddEmployeeButtonPressed());
        
        //loadNumberL = new JLabel("Load Number: ", SwingConstants.RIGHT);
        loadbox = new JLabel("Load Number: " + Model.getInList().get(index).getLoadNumber(), SwingConstants.RIGHT);
        loadbox2 = new JLabel("", SwingConstants.LEFT);

        //loadNumberC = new JComboBox(fillLoadNumberComboBox());
        //loadNumberC.setSelectedIndex(-1);
        //loadNumberC.addActionListener(new OnLoadNumberChanged());
        
        truckNumberL1 = new JLabel("Truck #: " + Model.getInList().get(index).getTruckNumber(), SwingConstants.RIGHT);
        truckNumberL2 = new JLabel("", SwingConstants.LEFT);
        
        trailerNumberL1 = new JLabel("Trailer #: " + Model.getInList().get(index).getTrailerNumber(), SwingConstants.RIGHT);
        trailerNumberL2 = new JLabel("", SwingConstants.LEFT);
        
        storeNumberL1 = new JLabel("Store #: " + Model.getOutList().get(index).getStoreNumber(), SwingConstants.RIGHT);
        storeNumberL2 = new JLabel("", SwingConstants.LEFT);
        
        sealNumberL1 = new JLabel("Seal #: " + Model.getOutList().get(index).getSealNumber(), SwingConstants.RIGHT);
        sealNumberL2 = new JLabel("", SwingConstants.LEFT);
        
        empIDL1 = new JLabel("Outgoing Employee ID: " + Model.getOutList().get(index).getEmployee().getID(), SwingConstants.RIGHT);
        empIDL2 = new JLabel("", SwingConstants.LEFT);
        
        empNameL1 = new JLabel("Outgoing Employee Name: " + Model.getOutList().get(index).getEmployee().getFirstName()
    + " " + Model.getOutList().get(index).getEmployee().getLastName(), SwingConstants.RIGHT);
        empNameL2 = new JLabel("", SwingConstants.LEFT);
        
        driverNumL1 = new JLabel("Driver Lic. #: " + Model.getOutList().get(index).getDr().getDlNumber(), SwingConstants.RIGHT);
        driverNumL2 = new JLabel("", SwingConstants.LEFT);
        
        driverNameL1 = new JLabel("Driver Name: " + Model.getOutList().get(index).getDr().getFirstName() + " " +
            Model.getOutList().get(index).getDr().getLastName(), SwingConstants.RIGHT);
        driverNameL2 = new JLabel("", SwingConstants.LEFT);
        
        driverCompL1 = new JLabel("Driver Company: " + Model.getOutList().get(index).getDr().getCompany(), SwingConstants.RIGHT);
        driverCompL2 = new JLabel("", SwingConstants.LEFT);
        
        dunnageIndexL = new JLabel("Dunnage Index: ", SwingConstants.RIGHT);
        dunnageC = new JComboBox(Model.dunnageStrings);
        dunnageC.setSelectedIndex(Model.getInList().get(index).getDunnageIndex()); //Defaults to Current Index of selected load
        
        newEmpIDL1 = new JLabel("Current Employee ID: " + Model.getInList().get(index).getEmployee().getID(), SwingConstants.RIGHT);
        
        employeeC = new JComboBox(fillEmployeeComboBox());
        employeeC.setSelectedIndex(-1);// Want to populate this with employee INDEX
        employeeC.addActionListener(new OnEmployeeIDChanged());
        
        newEmpNameL1 = new JLabel("Employee Name: ", SwingConstants.RIGHT);
        newEmpNameL2 = new JLabel("", SwingConstants.RIGHT);
        
        insectDetectedL = new JLabel("Is Insect Detected? ", SwingConstants.RIGHT);
        insectDetected = new JCheckBox ();
        
        //mainPanel.add(loadNumberL);
        //mainPanel.add(loadNumberC);
        mainPanel.add(loadbox);
        mainPanel.add(loadbox2);
        mainPanel.add(truckNumberL1);
        mainPanel.add(truckNumberL2);
        mainPanel.add(trailerNumberL1);
        mainPanel.add(trailerNumberL2);
        mainPanel.add(storeNumberL1);
        mainPanel.add(storeNumberL2);
        mainPanel.add(sealNumberL1);
        mainPanel.add(sealNumberL2);
        mainPanel.add(empIDL1);
        mainPanel.add(empIDL2);
        mainPanel.add(empNameL1);
        mainPanel.add(empNameL2);
        mainPanel.add(driverNumL1);
        mainPanel.add(driverNumL2);
        mainPanel.add(driverNameL1);
        mainPanel.add(driverNameL2);
        mainPanel.add(driverCompL1);
        mainPanel.add(driverCompL2);
        mainPanel.add(dunnageIndexL);
        mainPanel.add(dunnageC);
        mainPanel.add(newEmpIDL1);
        mainPanel.add(empComboPanel);
        mainPanel.add(newEmpNameL1);
        mainPanel.add(newEmpNameL2);
        mainPanel.add(insectDetectedL);
        mainPanel.add(insectDetected);
        //Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new OnSubmitButtonPressed());
        // Cancel button
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        bottomPanel.add(buttonPanel);
        
        empComboPanel.add(employeeC);
        empComboPanel.add(empAddButton);
        
        this.setSize(550, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        this.setTitle("Edit Incoming Load");
        this.setVisible(true);
    }
    
    private class OnEmployeeIDChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + employeeC.getSelectedIndex());
            newEmpNameL2.setText(Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName());
        }  
    }
    
    private class OnLoadNumberChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + loadNumberC.getSelectedIndex() + " Load Number: " + loadNumberC.getSelectedItem());
            int selectedIndex = loadNumberC.getSelectedIndex();
            int selectedLoadNumber = Integer.parseInt(loadNumberC.getSelectedItem().toString());
            truckNumberL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getTruckNumber()));
            trailerNumberL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getTrailerNumber()));
            storeNumberL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getStoreNumber()));
            sealNumberL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getSealNumber()));
            empIDL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getEmployee().getID()));
            empNameL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getEmployee().getFirstName() + " " + Model.getOutList().get(selectedLoadNumber).getEmployee().getLastName()));
            driverNumL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getDr().getDlNumber()));
            driverNameL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getDr().getFirstName()) + " " + Model.getOutList().get(selectedLoadNumber).getDr().getLastName());
            driverCompL2.setText(String.valueOf(Model.getOutList().get(selectedLoadNumber).getDr().getCompany()));
        }
        
    }
    
    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            editInView.this.setVisible(false);
        }
        
    }
    
    private class OnSubmitButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            
            if (dunnageC.getSelectedIndex() == -1 || employeeC.getSelectedIndex() == -1 /*|| loadNumberC.getSelectedIndex() == -1 */){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                int response = JOptionPane.showConfirmDialog(mainPanel,
                        "Load Number: " + Model.getInList().get(index).getLoadNumber() +
                        "\nDunnage: " + Model.dunnageStrings[dunnageC.getSelectedIndex()] +
                        "\nEmployee ID: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getID() +
                        "\nEmployee Name: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName() +
                        "\nInsect Detected: " + insectDetected.isSelected(),
                        "Is The Following Correct?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(response == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(mainPanel, "Updated Incoming Transaction!", "InfoBox: " + "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    editInView.this.setVisible(false);
                    NavigationCntl.inCntl.updateIncomingLoad((Model.getInList().get(index).getLoadNumber()));
                    Model.incomingTableModel.fireTableDataChanged();
                }
            }
        }
    }
    
    private class OnAddEmployeeButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evt) {
            Controller.createEmpCntl = new CreateEmployeeCntl();
            CreateEmployeeUI.isOutgoing = false; 
        }
        
    }
    
    public String[] fillEmployeeComboBox(){
        String[] empIDNum = new String[Model.getEmpList().size()];
        for (int i = 0; i < empIDNum.length; ++i){
            empIDNum[i] = String.valueOf(Model.getEmpList().get(i).getID());
            System.out.println("Employee " + i + ": " + String.valueOf(Model.getEmpList().get(i).getID()));
            System.out.println("ArrayList size:" + Model.getEmpList().size());
            System.out.println(Model.getEmpList().get(i).getFirstName());
        }
        
        return empIDNum;
    }
    
    public String[] fillLoadNumberComboBox(){
        ArrayList<Integer> incompleteLoads = new ArrayList<>();
        for (int i = 0; i < Model.getOutList().size(); ++i){
            if (Model.getOutList().get(i).isLoadComplete()){
                System.out.println("Incomplete Load: " + Model.getOutList().get(i).getLoadNumber());
                incompleteLoads.add(Model.getOutList().get(i).getLoadNumber());
            }
        }
        String[] incompleteLoadsArray = new String[incompleteLoads.size()];
        for (int i = 0; i < incompleteLoadsArray.length; ++i){
            incompleteLoadsArray[i] = incompleteLoads.get(i).toString();
        }
        
        return incompleteLoadsArray;
    }
    
    /* DEPRECIATED CODE
    //Prints all attributes of all incoming loads
    public static void displayAllIncomingLoad() {
        for (int i = 1; i < Model.getInList().size(); ++i){
            System.out.println(">>>Incoming Load Record " + (i) + ":");
            System.out.println(Model.getInList().get(i).printLoad());
            System.out.println(Model.getInList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Incoming Load Record " + (i) + " END<<<\n");
            
        }
    }
    */
}