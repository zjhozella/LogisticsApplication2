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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static view.CreateEmployeeUI.isOutgoing;

/**
 *
 * @author zjhoz
 */
public class EmpCreationUI extends JFrame{
    
    public JPanel mainPanel, buttonPanel;
    public JLabel IDL, firstNameL, lastNameL;
    public JTextField IDF, firstNameF, lastNameF;
    public JButton submitButton, cancelButton;
    
    public EmpCreationUI(){
        super();
        
        initComponents();
    }
    
    public void initComponents(){
        
        mainPanel = new JPanel(new GridLayout(3, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 10, 25, 10));
        
        buttonPanel = new JPanel(new GridLayout(1, 2));
        
        IDL = new JLabel("Employee ID: ", SwingConstants.RIGHT);
        IDF = new JTextField(SwingConstants.LEFT);
        
        firstNameL = new JLabel("Employee First Name: ", SwingConstants.RIGHT);
        firstNameF = new JTextField(SwingConstants.LEFT);
        
        lastNameL = new JLabel("Employee Last Name: ", SwingConstants.RIGHT);
        lastNameF = new JTextField(SwingConstants.LEFT);
        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new onSubmitButtonPressed());
        
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new onCancelButtonPressed());
        
        mainPanel.add(IDL);
        mainPanel.add(IDF);
        mainPanel.add(firstNameL);
        mainPanel.add(firstNameF);
        mainPanel.add(lastNameL);
        mainPanel.add(lastNameF);
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Employee");
        this.pack();
        this.setVisible(true);
    }
    
    public class onSubmitButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (IDF.getText().isBlank() || firstNameF.getText().isBlank() || lastNameF.getText().isBlank()){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Controller.empCreationCntl.createEmployee(Integer.parseInt(IDF.getText()), firstNameF.getText(), lastNameF.getText());
                JOptionPane.showMessageDialog(mainPanel, "Successfully Created New Employee!", "InfoBox: " + "Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
                EmpCreationUI.this.setVisible(false);
            }
        }
        
    }
    
    public class onCancelButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            EmpCreationUI.this.setVisible(false);
        }
        
    }
    
    
}
