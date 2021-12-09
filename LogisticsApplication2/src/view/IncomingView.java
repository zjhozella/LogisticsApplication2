/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import controller.CreateEmployeeCntl;
import controller.NavigationCntl;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
public class IncomingView extends JFrame{
    
    public JPanel mainPanel, bottomPanel, buttonPanel, empComboPanel;
    public JLabel loadNumberL, truckNumberL, trailerNumberL, dunnageIndexL,
                 empIDL, empFirstL1, empLastL1, insectDetectedL;
    public static JLabel empFirstL2, empLastL2;
    public JTextField truckNumberF, trailerNumberF, dunnageIndexF;
    public JButton submitButton, cancelButton, empAddButton;
    public static JComboBox loadNumberC, dunnageC, employeeC;
    public static JCheckBox insectDetected;
    
    public IncomingView(){
        super();
        initComponents();
        //Incoming entry header
        System.out.println("Incoming Load:\n");
    }
    
    public void initComponents(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 100));
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));
        buttonPanel = new JPanel(new GridLayout(1,5));
        
        empComboPanel = new JPanel();
        empAddButton = new JButton("+");
        empAddButton.addActionListener(new OnAddEmployeeButtonPressed());
        
        loadNumberL = new JLabel("Load Number: ", SwingConstants.RIGHT);
        loadNumberC = new JComboBox();
        loadNumberC.setSelectedIndex(-1);
        
        truckNumberL = new JLabel("Truck #: ", SwingConstants.RIGHT);
        truckNumberF = new JTextField();
        truckNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        trailerNumberL = new JLabel("Trailer #: ", SwingConstants.RIGHT);
        trailerNumberF = new JTextField();
        trailerNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        dunnageIndexL = new JLabel("Dunnage Index: ", SwingConstants.RIGHT);
        dunnageC = new JComboBox(Model.dunnageStrings);
        dunnageC.setSelectedIndex(0); //Defaults to Empty
        
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
        
        empComboPanel.add(employeeC);
        empComboPanel.add(empAddButton);
        
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        this.setTitle("Create New Outgoing Transaction");
        this.setVisible(true);
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
            IncomingView.this.setVisible(false);
        }
        
    }
    
    private class OnSubmitButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            
            if (truckNumberF.getText().isBlank() || trailerNumberF.getText().isBlank() || dunnageC.getSelectedIndex() == -1 || employeeC.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                int response = JOptionPane.showConfirmDialog(mainPanel,
                        "Load Number: " + Controller.getNextLoadNumber() +
                        "\nTruck Number: " + truckNumberF.getText() +
                        "\nTrailer Number: " + trailerNumberF.getText() +
                        "\nDunnage: " + Model.dunnageStrings[dunnageC.getSelectedIndex()] +
                        "\nEmployee ID: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getID() +
                        "\nEmployee Name: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName() +
                        "\nInsect Detected: " + insectDetected.isSelected(),
                        "Is The Following Correct?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(response == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(mainPanel, "Created New Outgoing Transaction!", "InfoBox: " + "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    IncomingView.this.setVisible(false);
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
            CreateEmployeeUI.isOutgoing = false;
            

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
    
    public String[] fillLoadNumberComboBox(){
        ArrayList<Integer> incompleteLoads = new ArrayList<>();
        for (int i = 0; i < Model.getOutList().size(); ++i){
            if (!Model.getOutList().get(i).isLoadComplete()){
                incompleteLoads.add(Model.getOutList().get(i).getLoadNumber());
            }
        }
        String[] incompleteLoadsArray = new String[incompleteLoads.length()];
        return incompleteLoadsArray;
    }
    
    //Prints all attributes of all incoming loads
    public static void displayAllIncomingLoad() {
        for (int i = 1; i < Model.getInList().size(); ++i){
            System.out.println(">>>Incoming Load Record " + (i) + ":");
            System.out.println(Model.getInList().get(i).printLoad());
            System.out.println(Model.getInList().get(i).getEmployee().printEmployee());
            System.out.println(">>>Incoming Load Record " + (i) + " END<<<\n");
            
        }
    }
}