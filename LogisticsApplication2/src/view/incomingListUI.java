package view;
import java.awt.*;
import javax.swing.*;
import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import static model.Model.incomingTableModel;
import static controller.InListCntl;
import view.*;

public class incomingListUI extends JFrame{
    public IncomingCntl inCntl;
    //public static JTable inTable;
    public JButton detailsButton, deleteButton, menuButton;
    public JScrollPane tableScroller;
    public static JTable inLoadTable;
    public static IncomingTrans inTrans;
    public static JPanel tablePanel, buttonPanel;

    public incomingListUI(){
        //Default constructor
        initInUI();
    }

    public void initInUI(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,3));
        inLoadTable = new JTable(incomingTableModel);

        //Delete Button
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());

        // Show Details button
        detailsButton = new JButton("Show Details");
        //detailsButton.addActionListener(new DetailsButtonListener());

        //Menu button
        menuButton = new JButton("Menu");
        menuButton.addActionListener(new MenuButtonListener());

        // Add buttons to button panel
        buttonPanel.add(menuButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(detailsButton);

        tableScroller = new JScrollPane(inLoadTable);
        inLoadTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
        this.setTitle("Incoming Load List");
        this.setVisible(true);
        
    }

    // Menu button listener
    private class MenuButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            incomingListUI.this.setVisible(false);
        }
    }

    // Delete button listener
    private static class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            final JLabel errLabel = new JLabel();
            if (inLoadTable.getSelectedRow() != -1) {            
                int result = JOptionPane.showConfirmDialog(tablePanel,"Are you sure you want to delete this instrument?","Delete Instrument",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    int selectedTableRow = inLoadTable.getSelectedRow();
                    errLabel.setText("Success!!! Incoming Load has been deleted!");
                    incomingTableModel.deleteIncoming(inLoadTable.getSelectedRow());
                    JOptionPane.showMessageDialog(new JFrame(), errLabel);
                    if (selectedTableRow > 0){
                        selectedTableRow -= 1;
                        inLoadTable.setRowSelectionInterval(selectedTableRow, selectedTableRow); //highlight row in table
                    }
                } else if (result == JOptionPane.NO_OPTION){
                    errLabel.setText("You selected: No");
                } else {
                    errLabel.setText("None selected");
                }
            }
        }

    // Show details button listener
    public class DetailsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            int selectedTableRow = inLoadTable.getSelectedRow();
            if (selectedTableRow != -1){
                int selectedModelRow = inLoadTable.convertRowIndexToModel(selectedTableRow);
                incomingListUI.inLoadTable.getI getInstrumentDetailUI(selectedModelRow); 
                
            }
       
}    
    }
    }}
