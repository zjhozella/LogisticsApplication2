package view;
import java.awt.*;
import javax.swing.*;

import controller.*;
import model.Model;
import model.OutgoingTableModel;
import model.*;

public class outgoingListUI extends JFrame{
    public OutgoingCntl outCntl;
    public JTable outTable;
    public JButton doneButton, editButton, addButton, deleteButton;
    public JScrollPane tableScroll;

    public outgoingListUI(){
        //Default Constructor
    }

    public void initOutUI(){
        JPanel tableP = new JPanel();
        JPanel buttonP = new JPanel();

        OutgoingCntl outCntl = new OutgoingCntl();

        outTable = new JTable();//HELP!!!!
    }

}