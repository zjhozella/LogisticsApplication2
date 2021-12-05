/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Model;
import view.NavigationView;
//import view.View;

/**
 *
 * @author zjhoz
 */
public class Controller {
    
    private Model model;
    private NavigationView view;
    
    //Stores the number that will be used for the loadNumber when we create the next load.
    private static int nextLoadNumber;
    public static NavigationCntl navCntl;
    
    public Controller(Model model, NavigationView view){
        this.model = model;
        this.view = view;

        //Sets the next load number that will be used
        setNextLoadNumber();
        
        //Shows main menu
        navCntl = new NavigationCntl();
    }
    
    /**
     * 
     * @return the nextLoadNumber
     */
    public static int getNextLoadNumber(){
        return nextLoadNumber;
    }
    
    /**
     * Sets the nextLoadNumber to the loadNumber of the last item in the OutgoingTrans ArrayList
     */
    public static void setNextLoadNumber(){
        nextLoadNumber = Model.getOutList().get(Model.getOutList().size() - 1).getLoadNumber() + 1;
    }
    
    /**
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * @return the view
     */
    public NavigationView getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(NavigationView view) {
        this.view = view;
    }
    
    
    /**
     * @return the view
     */
    /*public View getView() {
        return view;
    }*/

    /**
     * @param view the view to set
     */
    /*public void setView(View view) {
        this.view = view;
    }*/
}
