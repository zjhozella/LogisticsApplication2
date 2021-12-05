package view;
import java.awt.*;
import javax.swing.*;

import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import model.Model;
import model.OutgoingTableModel;
import model.*;
import static model.Model.outgoingTableModel;
import java.sql.Timestamp;

public class outgoingListUI extends JFrame{
    public OutgoingCntl outCntl;
    public static JTable outTable;
    public JButton doneButton, editButton, addButton, deleteButton;
    public JScrollPane tableScroller;
    public static JTable outLoadTable;
    public static OutgoingTrans outTrans;

    public outgoingListUI(){
        //Default Constructor
        initOutUI();
    }

    public void initOutUI(){
        JPanel tablePanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(1,4));
        //outgoingTableModel.getColumnModel().getColumn(0).setPreferredWidth(25);
        //instrumentTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        System.out.println(">>>View: outgoingListUI: initComponents: outgoingTableModel.getRowCount() " + outgoingTableModel.getRowCount());
        //clears text in new row when clicked
        outLoadTable = new JTable(outgoingTableModel);
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
        addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());
        //deleteButton = new JButton("Delete");
        //deleteButton.addActionListener(new DeleteButtonListener());
        //detailsButton = new JButton("Show Details");
        //detailsButton.addActionListener(new DetailsButtonListener());
        //menuButton = new JButton("Menu");
        //menuButton.addActionListener(new MenuButtonListener());
        //buttonPanel.add(menuButton);
        buttonPanel.add(addButton);
        //buttonPanel.add(deleteButton);
        //buttonPanel.add(detailsButton);
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
        this.setTitle("Vintage Sounds Instrument Inventory");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //OutgoingCntl outCntl = new OutgoingCntl();
        //outTable = new JTable(Model.getOutList().get());//HELP!!!! 
        
        /*This is where I am having the most trouble. I can not get the Outgoing load arraylist into the outTable JTable. I can follow in Mr. G's example where his data is comming in from but ours is flowing from either the OutgoingTableModel (from the outList) or can it flow from the outLoadList (outgoingLoads arraylist) or should it come from our Model.getOutList??? Once we figure where to load the table from I think the rest will come along easier. There must be something silly
        that I am missing (show me the way young skywalker!!). JWP 12/02
        */
        outTable = new JTable();

    }

    private static class AddButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent evt) {
                outgoingTableModel.newInstrument();
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
*/
        }
    }

    }
