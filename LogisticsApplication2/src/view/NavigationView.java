/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.OutListCntl;
import controller.InListCntl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static controller.NavigationCntl.outCntl;
import static controller.NavigationCntl.inCntl;

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
        
        //Outgoing Load button
        newOut = new JButton("New Outgoing Load");
        newOut.addActionListener(new NewOutgoingButtonListener());
        
        //Incoming button
        newIn = new JButton("New Incoming Load");
        newIn.addActionListener(new NewIncomingButtonListener());
        
        // View outgoing load button
        listOut = new JButton("View All Outgoing Loads");
        listOut.addActionListener(new outListButtonListener());        
        
        //View Incoming load button
        listIn = new JButton("View All Incoming Loads");
        listIn.addActionListener(new inListButtonListener());
        //listOut.addActionListener(new inListButtonListener());

        exit = new JButton("Exit Application");
        exit.addActionListener(new exitButtonListener());
        
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
    
    public void disableNav(){
        this.setVisible(false);
    }

    private static class NewOutgoingButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent evt) {
                
                outCntl.showCreateOutgoingLoadUI();
                //ConfirmationCntl outC = new ConfirmationCntl(true);
        }
    }
    
    private static class NewIncomingButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent evt) {
                inCntl.createIncomingLoad();
                //ConfirmationCntl outC = new ConfirmationCntl(false);
        }
    }
    
    public class exitButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            System.exit(0);
        }
    }

    private static class outListButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            OutListCntl outListCntl = new OutListCntl();
        }
    }

    
    private static class inListButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            InListCntl inListCntl = new InListCntl();
        }
    }

}