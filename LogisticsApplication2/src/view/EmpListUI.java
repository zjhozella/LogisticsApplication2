/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import controller.CreateEmployeeCntl;
import controller.DrEmpCntl;
import controller.EmpListCntl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Employee;
import static model.Model.employeeTableModel;

/**
 *
 * @author zjhoz
 */
public class EmpListUI extends JFrame{
    
    public static Employee emp;
    public EmpListCntl empListCntl;
    public JButton addButton, deleteButton, menuButton;
    public JScrollPane tableScroller;
    public static JPanel tablePanel, buttonPanel;
    public static int index;
    public static JTable empTable;
    
    public EmpListUI(){
        initEmpUI();
    }
    
    public void initEmpUI(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,3));
        empTable = new JTable(employeeTableModel);

        //Delete Button
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());

        // Show Details button
        addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        //Menu button
        menuButton = new JButton("Menu");
        menuButton.addActionListener(new MenuButtonListener());

        // Add buttons to button panel
        buttonPanel.add(menuButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(addButton);

        tableScroller = new JScrollPane(empTable);
        empTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
        this.setTitle("Employee List");
        this.setVisible(true);
        
    }
    
    // Menu button listener
    private class MenuButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            EmpListUI.this.setVisible(false);
            DrEmpCntl drEmpCntl = new DrEmpCntl();
        }
    }

    // Delete button listener
    private static class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            final JLabel errLabel = new JLabel();
            if (empTable.getSelectedRow() != -1) {            
                int result = JOptionPane.showConfirmDialog(tablePanel,"Are you sure you want to delete this Employee?","Delete Employee",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    int selectedTableRow = empTable.getSelectedRow();
                    errLabel.setText("Success!!! Employee has been deleted!");
                    employeeTableModel.deleteEmployee(empTable.getSelectedRow());
                    JOptionPane.showMessageDialog(new JFrame(), errLabel);
                    if (selectedTableRow > 0){
                        selectedTableRow -= 1;
                        empTable.setRowSelectionInterval(selectedTableRow, selectedTableRow); //highlight row in table
                    }
                } else if (result == JOptionPane.NO_OPTION){
                    errLabel.setText("You selected: No");
                } else {
                    errLabel.setText("None selected");
                }
            }
        }
    }

    // add button listener
    public class AddButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            Controller.createEmpCntl = new CreateEmployeeCntl();
            CreateEmployeeUI.creationOrigin = 4;
        }
    }
    
}
