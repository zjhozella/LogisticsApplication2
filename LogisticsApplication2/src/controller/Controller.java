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
    //private View view;
    
    public Controller(Model model, NavigationView view){
        this.model = model;
        this.view = view;
        
        NavigationCntl navCntl = new NavigationCntl();
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
