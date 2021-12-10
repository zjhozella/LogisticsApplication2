/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author zjhoz
 */
public class CreateEmployeeUI extends JFrame{
    
    public JPanel mainPanel, buttonPanel;
    public JLabel IDLabel, FNLabel, LNLabel;
    public JTextField IDField, FNField, LNField;
    public JButton addButton, cancelButton;
    
    public static int creationOrigin;
 
    public CreateEmployeeUI (){
        super();
        initComponents();
    }
    
    public void initComponents(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        
        IDLabel = new JLabel("Employee ID: ");
        FNLabel = new JLabel("Employee First Name: ");
        LNLabel = new JLabel("Employee Last Name: ");
        
        IDField = new JTextField();
        FNField = new JTextField();
        LNField = new JTextField();
        
        addButton = new JButton("Add Employee");
        addButton.addActionListener(new OnAddButtonPressed());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        mainPanel.add(IDLabel);
        mainPanel.add(IDField);
        mainPanel.add(FNLabel);
        mainPanel.add(FNField);
        mainPanel.add(LNLabel);
        mainPanel.add(LNField);
        
        buttonPanel.add(cancelButton);
        buttonPanel.add(addButton);
        
        this.setSize(500, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Employee");
        this.setVisible(true);
        
    }
    
    private class OnAddButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            if (IDField.getText().isBlank() || FNField.getText().isBlank() || LNField.getText().isBlank()){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Controller.createEmpCntl.createEmployee(creationOrigin, Integer.parseInt(IDField.getText()), FNField.getText(), LNField.getText());
                JOptionPane.showMessageDialog(mainPanel, "Successfully Created New Employee!", "InfoBox: " + "Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
                CreateEmployeeUI.this.setVisible(false);
            }
        }
    }
    
    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            CreateEmployeeUI.this.setVisible(false);
        }
        
    }
}
