public class BusPoolManager {

    final BusMarket busMarket;
    final BusPool busPool;

    public BusPoolManager(BusMarket busMarket, BusPool busPool) {
        this.busMarket = busMarket;
        this.busPool = busPool;
    }

    public void buyBusFromMarket(int id){

        for(int i = 0; i<busMarket.getBuyableBusses().size(); i++){
            if(busMarket.getBuyableBusses().get(i).id == id){
                busPool.getOwnedBusses().add(busMarket.getBuyableBusses().get(i));
                System.out.print("Kauf von Bus" + busMarket.getBuyableBusses().get(i).model + "war erfolgreich!");
                //TODO: Kontostand verringert sich
                break;
            }
        }
    }

    public void sellBusFromPool(int id){

        for(int i = 0; i<busPool.getOwnedBusses().size(); i++){
            if(busPool.getOwnedBusses().get(i).id == id){
                System.out.println("Anzahl Busse: " + busPool.getOwnedBusses().size());
                System.out.println("Verkauf von Bus" + busPool.getOwnedBusses().get(i).model + "war erfolgreich!");
                busPool.getOwnedBusses().remove(i);
                //TODO: Kontostand erhöht sich
                System.out.println("Anzahl Busse: " + busPool.getOwnedBusses().size());
                break;
            }
        }
    }

    public void revaluateBus(int id){

        for(int i = 0; i<busPool.getOwnedBusses().size(); i++) {
            if(busPool.getOwnedBusses().get(i).id == id) {
                busPool.getOwnedBusses().get(i).worth += 1;
                System.out.println("Fahrzeug" + busPool.getOwnedBusses().get(i).model +"wurde gewartet");
            }
        }

    }


    public BusMarket getBusMarket() {
        return busMarket;
    }

    public BusPool getBusPool() {
        return busPool;
    }
}
