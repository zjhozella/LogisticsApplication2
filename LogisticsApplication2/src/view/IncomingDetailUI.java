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
public class IncomingDetailUI extends JFrame{
    
    public JPanel mainPanel, bottomPanel, buttonPanel, empComboPanel;
    public static JLabel loadNumberL, truckNumberL1, truckNumberL2, trailerNumberL1, trailerNumberL2, dunnageIndexL,
            storeNumberL1, storeNumberL2, sealNumberL1, sealNumberL2, empIDL1, empIDL2, empNameL1, empNameL2,
            driverNumL1, driverNumL2, driverNameL1, driverNameL2, driverCompL1, driverCompL2, insectDetectedL, newEmpIDL1, newEmpNameL1, newEmpNameL2;
    public JButton submitButton, cancelButton, empAddButton;
    public static JComboBox loadNumberC, dunnageC, employeeC;
    public static JCheckBox insectDetected;
    
    public IncomingDetailUI(int index){
        super();
        initComponents();
        //Incoming entry header
        System.out.println("Incoming Load Details:\n");
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
        
        loadNumberL = new JLabel("Load Number: " + Model.getInList().get(index).getLoadNumber());
        
        truckNumberL1 = new JLabel("Truck #: " + Model.getInList().get(index).getTruckNumber(), SwingConstants.RIGHT);
        
        trailerNumberL1 = new JLabel("Trailer #: " + Model.getInList().get(index).getTrailerNumber(), SwingConstants.RIGHT);
        
        driverNumL1 = new JLabel("Driver Lic. #: " + Model.getOutList().get(index).getDr().getDlNumber(), SwingConstants.RIGHT);
        
        driverNameL1 = new JLabel("Driver Name: " + Model.getOutList().get(index).getDr().getFirstName() + " " 
            + Model.getOutList().get(index).getDr().getLastName(), SwingConstants.RIGHT);
        
        driverCompL1 = new JLabel("Driver Company: " + Model.getOutList().get(index).getDr().getCompany(), SwingConstants.RIGHT);
        
        dunnageIndexL = new JLabel("Dunnage Index: " + Model.getInList().get(index).getDunnageIndex(), SwingConstants.RIGHT);
        
        empIDL1 = new JLabel("Employee ID: " + Model.getInList().get(index).getEmployee().getID(), SwingConstants.RIGHT);
        
        empNameL1 = new JLabel("Employee Name: "+ Model.getInList().get(index).getEmployee().getFirstName() + " "
            + Model.getInList().get(index).getEmployee().getLastName(), SwingConstants.RIGHT);
        
        insectDetectedL = new JLabel("Was Insect Detected? " + Model.getInList().get(index).isInsectDetected() , SwingConstants.RIGHT);
        
        mainPanel.add(loadNumberL);
        mainPanel.add(truckNumberL1);
        mainPanel.add(trailerNumberL1);
        mainPanel.add(driverNumL1);
        mainPanel.add(driverNameL1);
        mainPanel.add(driverCompL1);
        mainPanel.add(dunnageIndexL);
        mainPanel.add(empIDL1);
        mainPanel.add(empNameL1);
        mainPanel.add(insectDetectedL);

        
        submitButton = new JButton("Submit");
        //submitButton.addActionListener(new OnSubmitButtonPressed());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        bottomPanel.add(buttonPanel);
    
        empComboPanel.add(empAddButton);
        
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Outgoing Transaction");
        this.setVisible(true);
    }
    
    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            //IncomingView.this.setVisible(false);
        }
        
    }

}