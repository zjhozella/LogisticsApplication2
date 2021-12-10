package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.html.InlineView;

import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import static model.Model.outgoingTableModel;
import static model.Model.incomingTableModel;
import static view.incomingListUI.inLoadTable;

public class outgoingListUI extends JFrame{
    public OutgoingCntl outCntl;
    public static JTable outTable;
    public JButton detailsButton, deleteButton, menuButton;
    public JScrollPane tableScroller;
    public static JTable outLoadTable;
    public static OutgoingTrans outTrans;
    public static JPanel tablePanel, buttonPanel;
    public static int index;

    public outgoingListUI(){
        //Default Constructor
        initOutUI();
    }

    public void initOutUI(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,3));
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
    private static class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            final JLabel errLabel = new JLabel();
            if (outLoadTable.getSelectedRow() != -1) {            
                int result = JOptionPane.showConfirmDialog(tablePanel,"Are you sure you want to delete this Outgoing Load? (This will also delete the corresponding Incoming Load!)","Delete Outgoing Load",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    int selectedTableRow = outLoadTable.getSelectedRow();
                    //TESTS

                    // Below is how to retreive the loadNumber from deleted row in table
                    //System.out.println(outLoadTable.getValueAt(selectedTableRow, 0));

                    //System.out.println("SelectedTableRow: "+selectedTableRow);
                    //Cast Object to int for outLoadNum
                    int outLoadNum = (int) outLoadTable.getValueAt(selectedTableRow, 0);
                    System.out.print(outLoadNum);

                    errLabel.setText("Success!!! Outgoing & Incoming Load has been deleted!");
                    /*
                    //Reset paramaters in inList only if outList load is complete
                    if(!outgoingTableModel.outList.get(selectedTableRow).isLoadComplete()){
                        Model.getInList().get(index).setEmployee(new Employee(0, "",""));
                        Model.getInList().get(index).setLoadNumber(0);
                        Model.getInList().get(index).setDunnageIndex(0);
                        Model.getInList().get(index).setInsectDetected(false);
                        Model.getInList().get(index).setTsIn(null);
                        Model.getInList().get(index).setLoadComplete(false);
                    }
                    */
                    outgoingTableModel.deleteOutgoing(outLoadTable.getSelectedRow());
                    incomingTableModel.deleteIncomingCombo(selectedTableRow);
                    
                    
                    
                    JOptionPane.showMessageDialog(new JFrame(), errLabel);
                    if (selectedTableRow > 0){
                        selectedTableRow -= 1;
                        outLoadTable.setRowSelectionInterval(selectedTableRow, selectedTableRow); //highlight row in table

                    }
                } else if (result == JOptionPane.NO_OPTION){
                    errLabel.setText("You selected: No");
                } else {
                    errLabel.setText("None selected");
                }
            }
        }
    }

    // Show details button listener
    public class DetailsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            int selectedTableRow = outLoadTable.getSelectedRow();
            index = selectedTableRow;
            if (selectedTableRow != -1){
                int selectedModelRow = outLoadTable.convertRowIndexToModel(selectedTableRow);
                //create new OutgoingDetailUI
                //IncomingDetailUI inDetails = new IncomingDetailUI(index);
                OutgoingDetailUI outDetails = new OutgoingDetailUI(index);
            }    
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