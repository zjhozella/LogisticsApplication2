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
        
        /*This is where I am having the most trouble. I can not get the Outgoing load arraylist into the outTable JTable. I can follow in Mr. G's example where his data is comming in from but ours is flowing from either the OutgoingTableModel (from the outList) or can it flow from the outLoadList (outgoingLoads arraylist) or should it come from our Model.getOutList??? Once we figure where to load the table from I think the rest will come along easier. There must be something silly
        that I am missing (show me the way young skywalker!!). JWP 12/02
        */
        outTable = new JTable();

    }

}