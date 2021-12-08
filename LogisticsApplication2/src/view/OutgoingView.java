/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import controller.CreateDriverCntl;
import controller.CreateEmployeeCntl;
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

    public JPanel mainPanel, bottomPanel, buttonPanel, driverComboPanel, empComboPanel;
    public JLabel truckNumberL, trailerNumberL, dunnageIndexL, storeNumberL, sealNumberL, 
            driverNumL, driverCompL1, driverFirstL1, driverLastL1, empIDL, empFirstL1, empLastL1, insectDetectedL;
    public static JLabel driverCompL2, driverFirstL2, driverLastL2, empFirstL2, empLastL2;
    public JTextField truckNumberF, trailerNumberF, dunnageIndexF, storeNumberF, sealNumberF;
    public JButton submitButton, cancelButton, driverAddButton, empAddButton;
    public static JComboBox dunnageC, driverC, employeeC;
    public static JCheckBox insectDetected;
    
    public static String[] dunnageStrings = {"Empty", "1/4", "1/2", "1/3", "Full"};
    
    public OutgoingView(){
        super();
        //Will contain all fields to collect data required for an outgoing load

        initComponents();
        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
  
    }
    
    public void initComponents(){
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(13, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 100));
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));
        buttonPanel = new JPanel(new GridLayout(1,5));
        
        driverComboPanel = new JPanel();
        driverAddButton = new JButton("+");
        driverAddButton.addActionListener(new OnAddDriverButtonPressed());
        
        empComboPanel = new JPanel();
        empAddButton = new JButton("+");
        empAddButton.addActionListener(new OnAddEmployeeButtonPressed());
        
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
        
        employeeC = new JComboBox(fillEmployeeComboBox());
        employeeC.setSelectedIndex(-1);
        employeeC.addActionListener(new OnEmployeeIDChanged());
        
        empFirstL1 = new JLabel("Employee First Name: ", SwingConstants.RIGHT);
        empFirstL2 = new JLabel("", SwingConstants.RIGHT);
        
        empLastL1 = new JLabel("Employee Last Name: ", SwingConstants.RIGHT);
        empLastL2 = new JLabel("", SwingConstants.RIGHT);
        
        insectDetectedL = new JLabel("Is Insect Detected? ", SwingConstants.RIGHT);
        insectDetected = new JCheckBox ();
        
        mainPanel.add(truckNumberL);
        mainPanel.add(truckNumberF);
        mainPanel.add(trailerNumberL);
        mainPanel.add(trailerNumberF);
        mainPanel.add(dunnageIndexL);
        mainPanel.add(dunnageC);
        mainPanel.add(storeNumberL);
        mainPanel.add(storeNumberF);
        mainPanel.add(sealNumberL);
        mainPanel.add(sealNumberF);
        mainPanel.add(driverNumL);
        mainPanel.add(driverComboPanel);
        mainPanel.add(driverCompL1);
        mainPanel.add(driverCompL2);
        mainPanel.add(driverFirstL1);
        mainPanel.add(driverFirstL2);
        mainPanel.add(driverLastL1);
        mainPanel.add(driverLastL2);
        mainPanel.add(empIDL);
        mainPanel.add(empComboPanel);
        mainPanel.add(empFirstL1);
        mainPanel.add(empFirstL2);
        mainPanel.add(empLastL1);
        mainPanel.add(empLastL2);
        mainPanel.add(insectDetectedL);
        mainPanel.add(insectDetected);

        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new OnSubmitButtonPressed());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new OnCancelButtonPressed());
        
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        bottomPanel.add(buttonPanel);
        
        driverComboPanel.add(driverC);
        driverComboPanel.add(driverAddButton);
        
        empComboPanel.add(employeeC);
        empComboPanel.add(empAddButton);
        
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
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
            
            if (truckNumberF.getText().isBlank() || trailerNumberF.getText().isBlank() || dunnageC.getSelectedIndex() == -1 || storeNumberF.getText().isBlank() || sealNumberF.getText().isBlank() || driverC.getSelectedIndex() == -1 || employeeC.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                int response = JOptionPane.showConfirmDialog(mainPanel,
                        "Load Number: " + Controller.getNextLoadNumber() +
                        "\nTruck Number: " + truckNumberF.getText() +
                        "\nTrailer Number: " + trailerNumberF.getText() +
                        "\nDunnage: " + OutgoingView.dunnageStrings[dunnageC.getSelectedIndex()] + "\nStore Number: " + storeNumberF.getText() +
                        "\nSeal Number: " + sealNumberF.getText() +
                        "\nDriver License No.: " + Model.getDrList().get(driverC.getSelectedIndex()).getDlNumber() +
                        "\nDriver Name: " + Model.getDrList().get(driverC.getSelectedIndex()).getFirstName() + " " + Model.getDrList().get(driverC.getSelectedIndex()).getLastName() +
                        "\nDriver Company: " + Model.getDrList().get(driverC.getSelectedIndex()).getCompany() +
                        "\nEmployee ID: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getID() +
                        "\nEmployee Name: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName() +
                        "\nInsect Detected: " + insectDetected.isSelected(),
                        "Is The Following Correct?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(response == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(mainPanel, "Created New Outgoing Transaction!", "InfoBox: " + "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    OutgoingView.this.setVisible(false);
                    NavigationCntl.outCntl.createOutgoingLoad();
                }else{
                    
                }
                
                
            }
            
            
        }
        
    }
    
    private class OnAddEmployeeButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.createEmpCntl = new CreateEmployeeCntl();
            
            

        }
        
    }
    
    private class OnAddDriverButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.createDrCntl = new CreateDriverCntl();
            

        }
        
    }
    
    public String[] fillEmployeeComboBox(){
        String[] empIDNum = new String[Model.getEmpList().size()];
        for (int i = 0; i < empIDNum.length; ++i){
            empIDNum[i] = String.valueOf(Model.getEmpList().get(i).getID());
            System.out.println("Employee " + i + ": " + String.valueOf(Model.getEmpList().get(i).getID()));
            System.out.println("ArrayList size:" + Model.getEmpList().size());
            System.out.println(Model.getEmpList().get(i).getFirstName());
        }
        
        return empIDNum;
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