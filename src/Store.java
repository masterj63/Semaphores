
public class Store {
    private boolean occupied;
    private int serialNumber;

    Store(){
        occupied = false;
        serialNumber = -1;
    }

    void store(int serialNumber){
        if(occupied){
            Log.d("Storage failure \n");
        }
        occupied = true;
        this.serialNumber = serialNumber;
        Log.d("Stored  item #%d \n", serialNumber);
    }

    void sell(){
        if(!occupied){
            Log.d("Sale failure \n");
            return;
        }
        occupied = false;
        Log.d("Sold    item #%d \n", serialNumber);
        serialNumber = -1;
    }

    boolean isOccupied() {
        return occupied;
    }
}
