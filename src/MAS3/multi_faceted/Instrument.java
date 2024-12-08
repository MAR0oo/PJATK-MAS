package MAS3.multi_faceted;

// Klasa bazowa reprezentująca instrument muzyczny.
// Zawiera wspólny atrybut nazwy oraz metodę play() do odgrywania dźwięku.
public class Instrument {
    private final String name; // Nazwa instrumentu

    // Konstruktor klasy Instrument.
    // @param name Nazwa instrumentu.
    public Instrument(String name) {
        this.name = name;
    }

    // Pobiera nazwę instrumentu.
    // @return Nazwa instrumentu.
    public String getName() {
        return name;
    }

    // Odgrywa dźwięk instrumentu.
    public void play() {
        System.out.println("Playing the " + name);
    }
}
