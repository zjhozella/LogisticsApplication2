/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author zjhoz
 */
public class Load {
    // Default constructor
    private int truckNumber   = 0;
    private int trailerNumber = 0;

    //Dunnage Array
    String[] dunnage = {"empty", "1/4", "1/2", "3/4", "Full"};

    private int storeNumber   = 0;
    int loadNumber = 0;
    private int sealNumber    = 0;
    private int driverNumber  = 0;
    private boolean loadComplete = false;

    Date date = new Date();
    long time = date.getTime();
    Timestamp tsOut = new Timestamp(time);
    Timestamp tsIn = new Timestamp(time);

    // Constructor for load class
    public Load (int newloadNumber, int newTruckNumber, int newTrailerNumber, int newStoreNumber , int newSealNumber , int newDriverNumber ,
                 boolean newLoadComplete, Timestamp newTSout, Timestamp newTSin){
        this.loadNumber    = newloadNumber;
        this.trailerNumber = newTrailerNumber;
        this.truckNumber   = newTruckNumber;
        this.storeNumber   = newStoreNumber;
        this.sealNumber    = newSealNumber;
        this.driverNumber  = newDriverNumber;
        this.loadComplete  = newLoadComplete;
        this.tsOut         = newTSout;
        this.tsIn          = newTSin;

    }


  
}