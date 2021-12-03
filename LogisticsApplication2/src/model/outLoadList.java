package model;
import java.util.ArrayList;

/*In this class I attempted to re-create an arraylist of Outgoing transactions similar to Mr. G's approach in the InstrumentList. Simply loading the loadOutArrayList from the Outgoingtrans in our model. Then the list of outgoing loads is returned as outgoingLoads.
However, I don't think this is necessary because our table can be brought in from the
OutgoingTableModel outList???? JP 12/02
*/

public class outLoadList {
    public ArrayList<OutgoingTrans> outgoingLoads = new ArrayList<>();

    public outLoadList(){
        outgoingLoads = loadOutArrayList();
    }

    //Load outgoing Trans into arraylist
    public ArrayList<OutgoingTrans> loadOutArrayList(){

        for(int i=0; i< Model.getOutList().size();++i){
            outgoingLoads.add(new OutgoingTrans(Model.getOutList().get(i).getLoadNumber(), Model.getOutList().get(i).getTruckNumber(), Model.getOutList().get(i).getTrailerNumber(), Model.getOutList().get(i).getDunnageIndex(), Model.getOutList().get(i).isLoadComplete(), Model.getOutList().get(i).getStoreNumber(), Model.getOutList().get(i).getSealNumber(), Model.getOutList().get(i).getEmployee(), Model.getOutList().get(i).getDr(), Model.getOutList().get(i).isInsectDetected(), Model.getOutList().get(i).getTsOut()));
            
        }
        return outgoingLoads;
        
    }

    public ArrayList<OutgoingTrans> getOutList(){
        return outgoingLoads;
    }

}
