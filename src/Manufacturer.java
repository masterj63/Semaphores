
public class Manufacturer implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= Main.ITEMS_TO_PROCESS; )
            synchronized (Main.STORE) {
                if(Main.STORE.isOccupied())
                    continue;
                Main.STORE.store(i);
                i++;
            }
    }
}
