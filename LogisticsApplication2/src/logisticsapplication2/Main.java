/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticsapplication2;

import Tests.TestHarness;
import controller.*;
import model.*;
import view.*;

/**
 *
 * @author zjhoz, jprince
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        NavigationCntl navCntl = new NavigationCntl();
        
        
        //Main has to create a NavigationCntl 

        /*** Test Harness ***/
        /*TestHarness test = new TestHarness();
        test.testClassHierarchy();*/
        
    }
   
    
    
    
    
}
