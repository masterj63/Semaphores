public class Main {
    static final int ITEMS_TO_PROCESS = 40;
    static final Store STORE = new Store();

    public static void main(String[] args) throws InterruptedException {
        Thread sellerThread = new Thread(new Seller());
        Thread manufacturerThread = new Thread(new Manufacturer());

        sellerThread.start();
        manufacturerThread.start();

        sellerThread.join();
        manufacturerThread.join();
    }
}
