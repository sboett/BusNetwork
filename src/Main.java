import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        BusMarket busMarket = new BusMarket(new ArrayList<>());
        BusPool busPool = new BusPool(new ArrayList<>());
        BusPoolManager manager = new BusPoolManager(busMarket, busPool);

        manager.busMarket.displayBuyableBusses();
    }

}
