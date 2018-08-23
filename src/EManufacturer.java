import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum EManufacturer {

    MERCEDES(1L),
    MAN(2L),
    SCANIA(3L),
    VOLVO(4L);

    final Long code;

    EManufacturer(Long id) {
        this.code = id;
    }

    private static final List<EManufacturer> knownManufacturer = Collections.unmodifiableList(Arrays.asList(EManufacturer.values()));

    public List<EManufacturer> getKnownManufacturer(){
        return knownManufacturer;
    }
}
