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
public class CreateDriverUI extends JFrame{
    
    public JPanel mainPanel, buttonPanel;
    public JLabel numLabel, compLabel, FNLabel, LNLabel;
    public JTextField numField, compField, FNField, LNField;
    public JButton addButton, cancelButton;
 
    public CreateDriverUI (){
        super();
        initComponents();
    }
    
    public void initComponents(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        
        numLabel = new JLabel("Driver License Number: ");
        compLabel = new JLabel("Driver Company: ");
        FNLabel = new JLabel("Driver First Name: ");
        LNLabel = new JLabel("Driver Last Name: ");
        
        numField = new JTextField();
        compField = new JTextField();
        FNField = new JTextField();
        LNField = new JTextField();
        
        addButton = new JButton("Add Driver");
        addButton.addActionListener(new OnAddButtonPressed());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        mainPanel.add(numLabel);
        mainPanel.add(numField);
        mainPanel.add(compLabel);
        mainPanel.add(compField);
        mainPanel.add(FNLabel);
        mainPanel.add(FNField);
        mainPanel.add(LNLabel);
        mainPanel.add(LNField);
        
        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);
        
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
            if (compField.getText().isBlank() || numField.getText().isBlank() || FNField.getText().isBlank() || LNField.getText().isBlank()){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Controller.createDrCntl.createDriver(numField.getText(), FNField.getText(), LNField.getText(), compField.getText());
                JOptionPane.showMessageDialog(mainPanel, "Created New Employee!", "InfoBox: " + "Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
                CreateDriverUI.this.setVisible(false);
            }
        }
    }
    
    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            CreateDriverUI.this.setVisible(false);
        }
        
    }
    
}
