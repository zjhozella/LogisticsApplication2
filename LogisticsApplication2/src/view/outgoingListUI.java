package view;
import java.awt.*;
import javax.swing.*;

import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import static model.Model.outgoingTableModel;

public class outgoingListUI extends JFrame{
    public OutgoingCntl outCntl;
    public static JTable outTable;
    public JButton detailsButton, deleteButton, menuButton;
    public JScrollPane tableScroller;
    public static JTable outLoadTable;
    public static OutgoingTrans outTrans;

    public outgoingListUI(){
        //Default Constructor
        initOutUI();
    }

    public void initOutUI(){
        JPanel tablePanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(1,3));
        //outgoingTableModel.getColumnModel().getColumn(0).setPreferredWidth(25);
        //instrumentTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        //System.out.println(">>>View: outgoingListUI: initComponents: outgoingTableModel.getRowCount() " + outgoingTableModel.getRowCount());
        //clears text in new row when clicked
        
        outLoadTable = new JTable(outgoingTableModel);
        
        
        /* Code imported from Mr. G's code, should not be implemented
        In our code, FOR NOW.
        outLoadTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = outLoadTable.rowAtPoint(evt.getPoint());
                int col = outLoadTable.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    if (outgoingTableModel.getValueAt(row, col) == "Enter serial #") {
                        outgoingTableModel.setValueAt(null, row, col);
                    } else if (outgoingTableModel.getValueAt(row, col) == "Enter manufacturer") {
                        outgoingTableModel.setValueAt(null, row, col);
                    } else if (outgoingTableModel.getValueAt(row, col) == "Enter model") {
                        outgoingTableModel.setValueAt(null, row, col);
                    }
                }
            }
        });
        */
        // Delete button
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());

        // Show Details button
        detailsButton = new JButton("Show Details");
        detailsButton.addActionListener(new DetailsButtonListener());
        
        // Menu Button
        menuButton = new JButton("Menu");
        menuButton.addActionListener(new MenuButtonListener());

        //Add buttons to button panel
        buttonPanel.add(menuButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(detailsButton);

        tableScroller = new JScrollPane(outLoadTable);
        outLoadTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
        this.setTitle("Outgoing Load List");
        this.setVisible(true);

        outTable = new JTable();

    }

    
    /**
     * @deprecated 
    
    private static class AddButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent evt) {
                //outgoingTableModel.newLoad();
                /*
                int selectedTableRow = InstrumentCntl.instrumentTableModel.getRowCount() - 1;
                if (selectedTableRow != -1){
                    System.out.println("View: InstrumentListUI: actionPerformed(): selectedModelRow" + selectedTableRow);
                    int selectedModelRow = instrumentTable.convertRowIndexToModel(selectedTableRow);
                    System.out.println("View: InstrumentListUI: actionPerformed(): selectedModelRow" + selectedModelRow);
                    //BG ORIGINAL CODE InstrumentListUI.this.parentInstrumentCntl.getInstrumentDetailUI(selectedModelRow);
                    //instrumentListUI.instrumentCntl.getInstrumentDetailUI(selectedModelRow);
                    instrumentCntl.getInstrumentDetailUI(selectedModelRow);
            }

        }       
    }
    */

    // Delete button listener
    private  class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //delete logic here
        }     
    }

    // Show details button listener
    private class DetailsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //open detail UI here
        }
  
    }

    // Menu button listener
    private class MenuButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            outgoingListUI.this.setVisible(false);
        }

        
    }

}