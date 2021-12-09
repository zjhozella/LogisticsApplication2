/*
 * Click nbfs://nbhost/SystemFileSystem/Tdriverlates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Tdriverlates/Classes/Class.java to edit this tdriverlate
 */
package view;

import controller.Controller;
import controller.DriverCreationCntl;
import controller.DriverListCntl;
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
import model.Driver;
import static model.Model.driverTableModel;
import static view.DriverListUI.buttonPanel;
import static view.DriverListUI.driverTable;
import static view.DriverListUI.tablePanel;


/**
 *
 * @author zjhoz
 */
public class DriverListUI extends JFrame{
    
    public static Driver dr;
    public DriverListCntl driverListCntl;
    public JButton addButton, deleteButton, menuButton;
    public JScrollPane tableScroller;
    public static JPanel tablePanel, buttonPanel;
    public static int index;
    public static JTable driverTable;
    
    public DriverListUI(){
        initDriverUI();
    }
    
    public void initDriverUI(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,3));
        driverTable = new JTable(driverTableModel);

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

        tableScroller = new JScrollPane(driverTable);
        driverTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
        this.setTitle("Driver List");
        this.setVisible(true);
        
    }
    
    // Menu button listener
    private class MenuButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DriverListUI.this.setVisible(false);
        }
    }

    // Delete button listener
    private static class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            final JLabel errLabel = new JLabel();
            if (driverTable.getSelectedRow() != -1) {            
                int result = JOptionPane.showConfirmDialog(tablePanel,"Are you sure you want to delete this Driver?","Delete Driver",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    int selectedTableRow = driverTable.getSelectedRow();
                    errLabel.setText("Success!!! Driver has been deleted!");
                    driverTableModel.deleteDriver(driverTable.getSelectedRow());
                    JOptionPane.showMessageDialog(new JFrame(), errLabel);
                    if (selectedTableRow > 0){
                        selectedTableRow -= 1;
                        driverTable.setRowSelectionInterval(selectedTableRow, selectedTableRow); //highlight row in table
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
            Controller.driverCreationCntl = new DriverCreationCntl();
        }
    }
}
