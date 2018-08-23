import java.util.List;

public class BusPool {

    List<Bus> ownedBusses;

    public BusPool(List<Bus> ownedBusses) {
        this.ownedBusses = ownedBusses;
    }

    public void showAllBusses(){
        for(int i = 0; i<ownedBusses.size(); i++){
            System.out.println(ownedBusses.get(i).id + " " + ownedBusses.get(i).model + " " + ownedBusses.get(i).mileage + "km " +
                    ownedBusses.get(i).vintage + " " + ownedBusses.get(i).worth);
        }
    }

    public List<Bus> getOwnedBusses() {
        return ownedBusses;
    }

    public void setOwnedBusses(List<Bus> ownedBusses) {
        this.ownedBusses = ownedBusses;
    }
}
