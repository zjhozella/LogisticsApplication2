/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.DriverListCntl;
import controller.EmpListCntl;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zjhoz
 */
public class DrEmpUI extends JFrame{
    
    public JPanel titlePanel, buttonPanel;
    public JButton listDriverB, listEmpB, mainMenuB;
    
    public DrEmpUI(){
        super();
        
        initComponents();
    }
    
    public void initComponents(){
        
        titlePanel = new JPanel(new FlowLayout());
        titlePanel.add(new JLabel("<html><h2 style=\"text-align:center;\">Driver/Employee Data Management</h2><p style=\"text-align:center;\">Please select from the following menu options:</p></html>"));
        
        buttonPanel = new JPanel(new GridLayout(3,1));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        listDriverB = new JButton("List All Drivers");
        listDriverB.addActionListener(new onListDriverButtonPressed());
        
        listEmpB = new JButton("List All Employees");
        listEmpB.addActionListener(new onListEmployeeButtonPressed());
        
        mainMenuB = new JButton("Close Window");
        mainMenuB.addActionListener(new onMenuButtonPressed());

        buttonPanel.add(listDriverB);
        buttonPanel.add(listEmpB);
        buttonPanel.add(mainMenuB);
        
        this.setSize(225, 100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(titlePanel, BorderLayout.NORTH);
        this.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        this.setTitle("Driver/Employee Data");
        this.pack();
        this.setVisible(true);
    }
    
    public class onListDriverButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            DriverListCntl driverListCntl = new DriverListCntl();
            DrEmpUI.this.setVisible(false);
        }
        
    }
    
    public class onListEmployeeButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            EmpListCntl empListCntl = new EmpListCntl();
            DrEmpUI.this.setVisible(false);
        }
        
    }
    
    public class onMenuButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            DrEmpUI.this.setVisible(false);
        }
        
    }
    
}
