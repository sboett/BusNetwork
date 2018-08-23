import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class Main {

    private static BusMarket busMarket = new BusMarket(new ArrayList<>());
    private static BusPool busPool = new BusPool(new ArrayList<>());
    private static BusPoolManager manager = new BusPoolManager(busMarket, busPool);

    public static void main(String[] args){
        manager.busMarket.displayBuyableBusses();

    }

}
