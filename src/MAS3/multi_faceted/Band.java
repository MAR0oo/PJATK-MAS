package MAS3.multi_faceted;

import java.util.List;
import java.util.ArrayList;

// Klasa bazowa reprezentująca zespół muzyczny.
// Zawiera wspólny atrybut nazwy oraz listę instrumentów.
public class Band {
    private final String name; // Nazwa zespołu
    private final List<Instrument> instruments; // Lista instrumentów zespołu

    // Konstruktor klasy Band.
    // @param name Nazwa zespołu.
    public Band(String name) {
        this.name = name;
        this.instruments = new ArrayList<>();
    }

    // Pobiera nazwę zespołu.
    // @return Nazwa zespołu.
    public String getName() {
        return name;
    }

    // Dodaje instrument do zespołu.
    // @param instrument Instrument do dodania.
    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    // Pobiera listę instrumentów zespołu.
    // @return Lista instrumentów.
    public List<Instrument> getInstruments() {
        return instruments;
    }

    // Występ zespołu.
    public void perform() {
        System.out.println(name + " is performing!");
        instruments.forEach(Instrument::play);
    }
}
