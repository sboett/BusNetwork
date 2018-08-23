import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        BusMarket busMarket = new BusMarket(new ArrayList<>());
        BusPool busPool = new BusPool(new ArrayList<>());
        BusPoolManager manager = new BusPoolManager(busMarket, busPool);

        manager.busMarket.displayBuyableBusses();
        manager.buyBusFromMarket(2);
        manager.buyBusFromMarket(4);
        manager.buyBusFromMarket(6);
        manager.busPool.showAllBusses();
        manager.revaluateBus(2);
        manager.sellBusFromPool(2);
    }

}
