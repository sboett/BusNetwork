import java.util.List;

public class BusMarket {

    private List<Bus> buyableBusses;
    private List<EModel> models = EModel.getKnownModels();

    public BusMarket(List<Bus> buyableBusses) {
        this.buyableBusses = buyableBusses;
    }

    public void displayBuyableBusses(){
        System.out.println("Zum Verkauf stehende Busse:");

        for(int i = 0; i<models.size(); i++) {
            buyableBusses.add(new Bus(i, models.get(i), 2000.00, 2005, 80000));
            System.out.println(buyableBusses.get(i).id + " " + buyableBusses.get(i).model + " " + buyableBusses.get(i).mileage + "km " +
                               buyableBusses.get(i).vintage + " " + buyableBusses.get(i).worth);
        }
    }


    public List<Bus> getBuyableBusses() {
        return buyableBusses;
    }

    public void setBuyableBusses(List<Bus> buyableBusses) {
        this.buyableBusses = buyableBusses;
    }

    //TODO: Funktion die Preis aus Alter, Marke, Kilometer und Modell berechnet

}
