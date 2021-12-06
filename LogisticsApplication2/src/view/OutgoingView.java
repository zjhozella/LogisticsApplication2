/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.Model;


/**
 *
 * @author jprince, zjhoz
 */
public class OutgoingView extends JFrame{

    public JPanel detailPanel, msgPanel, bottomPanel, buttonPanel;
    public JLabel msgLabel, truckNumberL, trailerNumberL;
    public JTextField truckNumberF, trailerNumberF;
    public JButton submitButton, cancelButton;
    
    public OutgoingView(){
        super();
        //Will contain all fields to collect data required for an outgoing load

        initComponents();
        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
  
    }
    
    public void initComponents(){
        
        detailPanel = new JPanel();
        detailPanel.setLayout(new GridLayout(2, 2));
        detailPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 50));
        
        msgPanel = new JPanel();
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));
        buttonPanel = new JPanel(new GridLayout(1,5));
        
        truckNumberL = new JLabel("Truck #: ", SwingConstants.RIGHT);
        truckNumberF = new JTextField();
        truckNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        trailerNumberL = new JLabel("Trailer #: ", SwingConstants.RIGHT);
        trailerNumberF = new JTextField();
        trailerNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        msgLabel = new JLabel("");
        
        detailPanel.add(truckNumberL);
        detailPanel.add(truckNumberF);
        detailPanel.add(trailerNumberL);
        detailPanel.add(trailerNumberF);
        
        msgPanel.add(msgLabel);
        
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        bottomPanel.add(msgPanel);
        bottomPanel.add(buttonPanel);
        
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(detailPanel, BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Outgoing Transaction");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void printIncompleteOutgoing(){
        for (int i = 1; i < Model.getOutList().size(); ++i){
            if (!Model.getOutList().get(i).isLoadComplete()){
                System.out.println(Model.getOutList().get(i).printBasicLoad());
            }
        }
    }
    
    //Prints all attributes of all outgoing loads
    public static void displayAllOutgoingLoad() {
        for (int i = 1; i < Model.getOutList().size(); ++i){
            System.out.println(">>>Outgoing Load Record " + (i) + ":");
            System.out.println(Model.getOutList().get(i).printLoad());
            System.out.println(Model.getOutList().get(i).getDr().printDriver());
            System.out.println(Model.getOutList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Outgoing Load Record  " + (i) + " END<<<\n");
            
            
        }
    }
    
}