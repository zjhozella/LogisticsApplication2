/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author zjhoz
 */
public class DriverCreationUI extends JFrame{
    
    public JPanel mainPanel, buttonPanel;
    public JLabel numL, firstNameL, lastNameL, compL;
    public JTextField numF, firstNameF, lastNameF, compF;
    public JButton submitButton, cancelButton;
    
    public DriverCreationUI(){
        super();
        
        initComponents();
    }
    
    public void initComponents(){
        mainPanel = new JPanel(new GridLayout(4, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 10, 25, 10));
        
        buttonPanel = new JPanel(new GridLayout(1, 2));
        
        numL = new JLabel("Driver Lic. #: ", SwingConstants.RIGHT);
        numF = new JTextField(SwingConstants.LEFT);
        
        firstNameL = new JLabel("Driver First Name: ", SwingConstants.RIGHT);
        firstNameF = new JTextField(SwingConstants.LEFT);
        
        lastNameL = new JLabel("Driver Last Name: ", SwingConstants.RIGHT);
        lastNameF = new JTextField(SwingConstants.LEFT);
        
        compL = new JLabel("Driver Company: ", SwingConstants.RIGHT);
        compF = new JTextField(SwingConstants.LEFT);
        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new DriverCreationUI.onSubmitButtonPressed());
        
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new DriverCreationUI.onCancelButtonPressed());
        
        mainPanel.add(numL);
        mainPanel.add(numF);
        mainPanel.add(compL);
        mainPanel.add(compF);
        mainPanel.add(firstNameL);
        mainPanel.add(firstNameF);
        mainPanel.add(lastNameL);
        mainPanel.add(lastNameF);
        
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        this.setPreferredSize(new Dimension(300,250));
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Driver");
        this.pack();
        this.setVisible(true);
    }
    
    public class onSubmitButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (numF.getText().isBlank() || firstNameF.getText().isBlank() || lastNameF.getText().isBlank() || compF.getText().isBlank()){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Controller.driverCreationCntl.createDriver(numF.getText(), firstNameF.getText(), lastNameF.getText(), compF.getText());
                JOptionPane.showMessageDialog(mainPanel, "Successfully Created New Driver!", "InfoBox: " + "Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
                DriverCreationUI.this.setVisible(false);
            }
        }
        
    }
    
    public class onCancelButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            DriverCreationUI.this.setVisible(false);
        }
        
    }
    
}
