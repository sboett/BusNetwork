public class Bus {

    int id;
    EModel model;
    double mileage;
    int vintage;
    double worth;

    public Bus(int id, EModel model, double mileage, int vintage, double worth) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.vintage = vintage;
        this.worth = worth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EModel getModel() {
        return model;
    }

    public void setModel(EModel model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }
}
