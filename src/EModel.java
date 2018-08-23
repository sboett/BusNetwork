import java.util.Arrays;
import java.util.List;

public enum EModel {

    CITARO(EManufacturer.MERCEDES, "Mercedes Citaro", 158, true, 1L),
    CAPACITY(EManufacturer.MERCEDES,"Mercedes CapaCity", 193, false, 2L),
    LIONCITY(EManufacturer.MAN,"MAN LionCity", 58, true, 3L),
    LIONCOACH(EManufacturer.MAN, "MAN LionCoach", 49, true, 4L),
    CITYWIDE(EManufacturer.SCANIA, "Scania Citywide", 117, true, 5L),
    V8900E(EManufacturer.VOLVO, "Volvo 8900", 162, false,  6L),
    V7900ELECTRIC(EManufacturer.VOLVO, "Volvo 7900 Electric", 140, true, 7L);

    final EManufacturer manufacturer;
    final String busName;
    final int seats;
    final boolean isAbleForDownies;
    final Long code;

    EModel(final EManufacturer manufacturer, final String busName, final int seats, final boolean isAbleForDownies, final Long code) {
        this.manufacturer = manufacturer;
        this.busName = busName;
        this.seats = seats;
        this.isAbleForDownies = isAbleForDownies;
        this.code = code;
    }

    private static final List<EModel> knownModels = Arrays.asList(EModel.values());

    public static List<EModel> getKnownModels(){
        return knownModels;
    }

}
