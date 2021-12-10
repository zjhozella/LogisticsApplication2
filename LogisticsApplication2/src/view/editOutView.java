package view;

import controller.Controller;
import controller.CreateEmployeeCntl;
import controller.CreateDriverCntl;
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

import static view.outgoingListUI.index;

public class editOutView extends JFrame{
    public JPanel mainPanel, bottomPanel, buttonPanel, driverComboPanel, empComboPanel;
    public JLabel loadNumberL1, truckNumberL, trailerNumberL, dunnageIndexL, storeNumberL, sealNumberL, 
            driverNumL, driverCompL1, driverNameL1, empIDL, empNameL1, insectDetectedL;
    public static JLabel loadNumberL2, driverCompL2, driverNameL2, empNameL2;
    public static JTextField truckNumberF, trailerNumberF, dunnageIndexF, storeNumberF, sealNumberF;
    public JButton submitButton, cancelButton, driverAddButton, empAddButton;
    public static JComboBox dunnageC, driverC, employeeC;
    public static JCheckBox insectDetected;
    

    public editOutView(){
        super();

        initComponents();
        //Outgoing entry header
        System.out.println("Outgoing Load:\n");
        //Testing
        System.out.println("Welcome to the edit menu for [Outgoing Load]");
    }

    public void initComponents(){
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(12, 2));
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
        
        loadNumberL1 = new JLabel("Load #: "+ Model.getOutList().get(index).getLoadNumber(), SwingConstants.RIGHT);
        loadNumberL2 = new JLabel("", SwingConstants.LEFT);
        
        truckNumberL = new JLabel("Truck #: ", SwingConstants.RIGHT);
        truckNumberF = new JTextField();
        truckNumberF.setText(String.valueOf(Model.getOutList().get(index).getTruckNumber()));
        truckNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        trailerNumberL = new JLabel("Trailer #: ", SwingConstants.RIGHT);
        trailerNumberF = new JTextField();
        trailerNumberF.setText(String.valueOf(Model.getOutList().get(index).getTrailerNumber()));
        trailerNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        dunnageIndexL = new JLabel("Dunnage Index: ", SwingConstants.RIGHT);
        dunnageC = new JComboBox(Model.dunnageStrings);
        dunnageC.setSelectedIndex(Model.getOutList().get(index).getDunnageIndex());
        
        storeNumberL = new JLabel("Store #: ", SwingConstants.RIGHT);
        storeNumberF = new JTextField();
        storeNumberF.setText(String.valueOf(Model.getOutList().get(index).getStoreNumber()));
        storeNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        sealNumberL = new JLabel("Seal #: ", SwingConstants.RIGHT);
        sealNumberF = new JTextField();
        sealNumberF.setText(String.valueOf(Model.getOutList().get(index).getSealNumber()));
        sealNumberF.setHorizontalAlignment(JTextField.LEFT);
        
        /**
         *  Creates a one dimensional String array to hold just the driver
         *  license numbers that are stored in the static Driver arrayList
         */
        driverNumL = new JLabel("Driver License #: ", SwingConstants.RIGHT);
        driverC = new JComboBox(fillDriverComboBox());
        for (int i = 0; i < Model.getDrList().size(); ++i){
            if (Model.getOutList().get(index).getDr().getDlNumber().equalsIgnoreCase(Model.getDrList().get(i).getDlNumber())){
                driverC.setSelectedIndex(i);
            }
        }
        driverC.addActionListener(new OnDriverLicenseNumberChanged());
        
        driverCompL1 = new JLabel("Driver Company: ", SwingConstants.RIGHT);
        driverCompL2 = new JLabel(Model.getDrList().get(driverC.getSelectedIndex()).getCompany(), SwingConstants.LEFT);
        
        driverNameL1 = new JLabel("Driver Name: ", SwingConstants.RIGHT);
        driverNameL2 = new JLabel(Model.getDrList().get(driverC.getSelectedIndex()).getFirstName() + " " + Model.getDrList().get(driverC.getSelectedIndex()).getLastName(), SwingConstants.LEFT);
        
        empIDL = new JLabel("Employee ID: ", SwingConstants.RIGHT);
        
        employeeC = new JComboBox(fillEmployeeComboBox());
        for (int i = 0; i < Model.getEmpList().size(); ++i){
            if (Model.getOutList().get(index).getEmployee().getID() == Model.getEmpList().get(i).getID()){
                employeeC.setSelectedIndex(i);
            }
        }
        employeeC.addActionListener(new OnEmployeeIDChanged());
        
        empNameL1 = new JLabel("Employee Name: ", SwingConstants.RIGHT);
        empNameL2 = new JLabel(Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName(), SwingConstants.LEFT);
        
        insectDetectedL = new JLabel("Is Insect Detected? ", SwingConstants.RIGHT);
        insectDetected = new JCheckBox("", Model.getOutList().get(index).isInsectDetected());
        
        mainPanel.add(loadNumberL1);
        mainPanel.add(loadNumberL2);
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
        mainPanel.add(driverNameL1);
        mainPanel.add(driverNameL2);
        mainPanel.add(empIDL);
        mainPanel.add(empComboPanel);
        mainPanel.add(empNameL1);
        mainPanel.add(empNameL2);;
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
        this.setTitle("Edit Outgoing Load");
        this.setVisible(true);
        
    }
    
    private class OnDriverLicenseNumberChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + driverC.getSelectedIndex());
            driverCompL2.setText(Model.getDrList().get(driverC.getSelectedIndex()).getCompany());
            driverNameL2.setText(Model.getDrList().get(driverC.getSelectedIndex()).getFirstName() + " " + Model.getDrList().get(driverC.getSelectedIndex()).getLastName());
        }
    }

    private class OnEmployeeIDChanged implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println("Selected Index: " + employeeC.getSelectedIndex());
            empNameL2.setText(Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName());
        }  
    }

    private class OnCancelButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            editOutView.this.setVisible(false);
        }
        
    }

    private class OnSubmitButtonPressed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            
            if (truckNumberF.getText().isBlank() || trailerNumberF.getText().isBlank() || dunnageC.getSelectedIndex() == -1 || storeNumberF.getText().isBlank() || sealNumberF.getText().isBlank() || driverC.getSelectedIndex() == -1 || employeeC.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(mainPanel, "One or more fields have been left blank!", "Submission Error", JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                int response = JOptionPane.showConfirmDialog(mainPanel,
                        "Load Number: " + Model.getOutList().get(index).getLoadNumber() +
                        "\nTruck Number: " + truckNumberF.getText() +
                        "\nTrailer Number: " + trailerNumberF.getText() +
                        "\nDunnage: " + Model.dunnageStrings[dunnageC.getSelectedIndex()] + "\nStore Number: " + storeNumberF.getText() +
                        "\nSeal Number: " + sealNumberF.getText() +
                        "\nDriver License No.: " + Model.getDrList().get(driverC.getSelectedIndex()).getDlNumber() +
                        "\nDriver Name: " + Model.getDrList().get(driverC.getSelectedIndex()).getFirstName() + " " + Model.getDrList().get(driverC.getSelectedIndex()).getLastName() +
                        "\nDriver Company: " + Model.getDrList().get(driverC.getSelectedIndex()).getCompany() +
                        "\nEmployee ID: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getID() +
                        "\nEmployee Name: " + Model.getEmpList().get(employeeC.getSelectedIndex()).getFirstName() + " " + Model.getEmpList().get(employeeC.getSelectedIndex()).getLastName() +
                        "\nInsect Detected: " + insectDetected.isSelected(),
                        "Is The Following Correct?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(response == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(mainPanel, "Updated Outgoing Load!", "InfoBox: " + "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    editOutView.this.setVisible(false);
                    NavigationCntl.outCntl.editOutgoingLoad(index);
                    Model.outgoingTableModel.fireTableDataChanged();
                }else{
                    
                }
                
                
            }
            
            
        }
        
    }

    private class OnAddEmployeeButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.createEmpCntl = new CreateEmployeeCntl();
            CreateEmployeeUI.isOutgoing = true;
        }
        
    }

    private class OnAddDriverButtonPressed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.createDrCntl = new CreateDriverCntl();
            

        }
        
    }

    public String[] fillDriverComboBox(){
        String[] driverLicNum = new String[Model.getDrList().size()];
        for (int i = 0; i < driverLicNum.length; ++i){
            driverLicNum[i] = Model.getDrList().get(i).getDlNumber();
        }
        
        return driverLicNum;
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

