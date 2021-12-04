/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jprince, zjhoz
 */
public class NavigationView extends JFrame{
    
    public JPanel titlePanel, centerPanel, buttonPanel;
    public JButton newOut, newIn, listOut, listIn, exit;
    
    //Will contain a frame, a panel within that frame, and 2 buttons (Outgoing, Incoming).
    //Button functionality will move the user to the respective screen
    public NavigationView(){
        super();
        initNav();
        System.out.println("Welcome to Logistics Application\n");
    }
    
    public void initNav(){
        centerPanel = new JPanel(new GridLayout(1, 1));
        buttonPanel = new JPanel(new GridLayout(5,1));
        newOut = new JButton("New Outgoing Load");
        newIn = new JButton("New Incoming Load");
        listOut = new JButton("View All Outgoing Loads");
        listIn = new JButton("View All Incoming Loads");
        exit = new JButton("Exit Application");
        
        centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        
        buttonPanel.add(newOut);
        buttonPanel.add(newIn);
        buttonPanel.add(listOut);
        buttonPanel.add(listIn);
        buttonPanel.add(exit);
        
        centerPanel.add(buttonPanel);
        titlePanel = new JPanel(new FlowLayout());
        titlePanel.add(new JLabel("<html><h2 style=\"text-align:center;\">Welcome to Logistics!</h2><p style=\"text-align:center;\">Please select from the following menu options:</p></html>"));
  
        
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(titlePanel, BorderLayout.NORTH);
        this.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        this.setTitle("Logistics Application");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    //Prints menu for the user to select a choice
    public static void printMenu(){
        System.out.println("Please select one of the options below:");
        System.out.println("(1) - Enter New Outgoing Load");
        System.out.println("(2) - Enter New Incoming Load");
        System.out.println("(3) - Edit Outgoing Load");
        System.out.println("(4) - Edit Incoming Load");
        System.out.println("(5) - View All Outgoing Loads");
        System.out.println("(6) - View All Incoming Loads");
        System.out.println("(9) - Quit");
        System.out.print("Enter your choice: ");
    }
    
}
