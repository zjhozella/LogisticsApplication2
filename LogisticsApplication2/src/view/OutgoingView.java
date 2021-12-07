/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NavigationCntl;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    public JLabel msgLabel, truckNumberL, trailerNumberL, dunnageIndexL, storeNumberL, sealNumberL, 
            driverNumL, driverCompL1, driverFirstL1, driverLastL1, empIDL, empFirstL1, empLastL1, insectDetectedL;
    public static JLabel driverCompL2, driverFirstL2, driverLastL2, empFirstL2, empLastL2;
    public JTextField truckNumberF, trailerNumberF, dunnageIndexF, storeNumberF, sealNumberF;
    public JButton submitButton, cancelButton;
    public static JComboBox dunnageC, driverC, employeeC;
    public static JCheckBox insectDetected;
    
    public String[] dunnageStrings = {"Empty", "1/4", "1/2", "1/3", "Full"};
    
    public OutgoingView(){
        super();
        //Will contain all fields to collect data required for an outgoing load

        initComponents();
        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
  
    }
    
    public void initComponents(){
        
        detailPanel = new JPanel();
        detailPanel.setLayout(new GridLayout(13, 2));
        detailPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 100));
        
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
        
        dunnageIndexL = new JLabel("Dunnage Index: ", SwingConstants.RIGHT);
        dunnageC = new JComboBox(dunnageStrings);
        dunnageC.setSelectedIndex(0); //Defaults to Empty
        
        storeNumberL = new JLabel("Store #: ", SwingConstants.RIGHT);
        storeNumberF = new JTextField();
        storeNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        sealNumberL = new JLabel("Seal #: ", SwingConstants.RIGHT);
        sealNumberF = new JTextField();
        sealNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        /**
         *  Creates a one dimensional String array to hold just the driver
         *  license numbers that are stored in the static Driver arrayList
         */
        driverNumL = new JLabel("Driver License #: ", SwingConstants.RIGHT);
        String[] driverLicNum = new String[Model.getDrList().size()];
        for (int i = 0; i < driverLicNum.length; ++i){
            driverLicNum[i] = Model.getDrList().get(i).getDlNumber();
        }
        driverC = new JComboBox(driverLicNum);
        driverC.setSelectedIndex(-1);
        driverC.addActionListener(new OnDriverLicenseNumberChanged());
        
        driverCompL1 = new JLabel("Driver Company: ", SwingConstants.RIGHT);
        driverCompL2 = new JLabel("", SwingConstants.RIGHT);
        
        driverFirstL1 = new JLabel("Driver First Name: ", SwingConstants.RIGHT);
        driverFirstL2 = new JLabel("", SwingConstants.RIGHT);
        
        driverLastL1 = new JLabel("Driver Last Name: ", SwingConstants.RIGHT);
        driverLastL2 = new JLabel("", SwingConstants.RIGHT);
        
        empIDL = new JLabel("Employee ID: ", SwingConstants.RIGHT);
        String[] empIDNum = new String[Model.getEmpList().size()];
        for (int i = 0; i < empIDNum.length; ++i){
            empIDNum[i] = String.valueOf(Model.getEmpList().get(i).getID());
            System.out.println("Employee " + i + ": " + String.valueOf(Model.getEmpList().get(i).getID()));
            System.out.println("ArrayList size:" + Model.getEmpList().size());
            System.out.println(Model.getEmpList().get(i).getFirstName());
        }
        employeeC = new JComboBox(empIDNum);
        employeeC.setSelectedIndex(-1);
        employeeC.addActionListener(new OnEmployeeIDChanged());
        
        empFirstL1 = new JLabel("Employee First Name: ", SwingConstants.RIGHT);
        empFirstL2 = new JLabel("", SwingConstants.RIGHT);
        
        empLastL1 = new JLabel("Employee Last Name: ", SwingConstants.RIGHT);
        empLastL2 = new JLabel("", SwingConstants.RIGHT);
        
        insectDetectedL = new JLabel("Is Insect Detected? ", SwingConstants.RIGHT);
        insectDetected = new JCheckBox ();
        
        
        msgLabel = new JLabel("");
        
        detailPanel.add(truckNumberL);
        detailPanel.add(truckNumberF);
        detailPanel.add(trailerNumberL);
        detailPanel.add(trailerNumberF);
        detailPanel.add(dunnageIndexL);
        detailPanel.add(dunnageC);
        detailPanel.add(storeNumberL);
        detailPanel.add(storeNumberF);
        detailPanel.add(sealNumberL);
        detailPanel.add(sealNumberF);
        detailPanel.add(driverNumL);
        detailPanel.add(driverC);
        detailPanel.add(driverCompL1);
        detailPanel.add(driverCompL2);
        detailPanel.add(driverFirstL1);
        detailPanel.add(driverFirstL2);
        detailPanel.add(driverLastL1);
        detailPanel.add(driverLastL2);
        detailPanel.add(empIDL);
        detailPanel.add(employeeC);
        detailPanel.add(empFirstL1);
        detailPanel.add(empFirstL2);
        detailPanel.add(empLastL1);
        detailPanel.add(empLastL2);
        detailPanel.add(insectDetectedL);
        detailPanel.add(insectDetected);
        
        msgPanel.add(msgLabel);
        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new OnSubmitButtonPressed());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        bottomPanel.add(msgPanel);
        bottomPanel.add(buttonPanel);
        
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(detailPanel, BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Outgoing Transaction");
        this.setVisible(true);
        
    }


    
    private class OnDriverLicenseNumberChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + driverC.getSelectedIndex());
            driverCompL2.setText(Model.getDrList().get(driverC.getSelectedIndex()).getCompany());
            driverFirstL2.setText(Model.getDrList().get(driverC.getSelectedIndex()).getFirstName());
            driverLastL2.setText(Model.getDrList().get(driverC.getSelectedIndex()).getLastName());
        }
    }
    
        private class OnEmployeeIDChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + employeeC.getSelectedIndex());
            empFirstL2.setText(Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName());
            empLastL2.setText(Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName());
        }  
    }
    
    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            OutgoingView.this.setVisible(false);
        }
        
    }
    
    private class OnSubmitButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            
            
            
            JOptionPane.showMessageDialog(detailPanel, "Created New Outgoing Transaction!", "InfoBox: " + "Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
            OutgoingView.this.setVisible(false);
            NavigationCntl.outCntl.createOutgoingLoad();
        }
        
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