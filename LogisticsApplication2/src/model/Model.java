/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zjhoz
 */
public class Model {
    
    private Date date = new Date();
    private long time = date.getTime();
    private Timestamp tsOut = new Timestamp(time);
    private Timestamp tsIn = new Timestamp(time);
    
    public static ArrayList<OutgoingTrans> out = new ArrayList<>();
    public static ArrayList<IncomingTrans> in = new ArrayList<>();
    
    //Default Constructor
    public Model(){
        
    }
    
    
    
}