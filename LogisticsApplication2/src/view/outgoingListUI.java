package view;
import java.awt.*;
import javax.swing.*;

import controller.*;
import model.Model;
import model.OutgoingTableModel;
import model.*;

public class outgoingListUI extends JFrame{
    public OutgoingCntl outCntl;
    public static JTable outTable;
    public JButton doneButton, editButton, addButton, deleteButton;
    public JScrollPane tableScroll;

    public outgoingListUI(){
        //Default Constructor
        initOutUI();
    }

    public void initOutUI(){
        JPanel tablePanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(1,4));

        //OutgoingCntl outCntl = new OutgoingCntl();
        //outTable = new JTable(Model.getOutList().get());//HELP!!!!
        outTable = new JTable();

    }

}