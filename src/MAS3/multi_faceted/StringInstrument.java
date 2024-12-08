package MAS3.multi_faceted;

// Klasa reprezentująca instrument strunowy.
// Dziedziczy po klasie Instrument i nadpisuje metodę play().
public class StringInstrument extends Instrument {
    // Konstruktor klasy StringInstrument.
    // @param name Nazwa instrumentu strunowego.
    public StringInstrument(String name) {
        super(name);
    }

    // Nadpisuje metodę play(), aby dodać specyficzne zachowanie dla instrumentów strunowych.
    @Override
    public void play() {
        System.out.println("Strumming the " + getName());
    }
}
