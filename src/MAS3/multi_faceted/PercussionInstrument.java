package MAS3.multi_faceted;

// Klasa reprezentująca instrument perkusyjny.
// Dziedziczy po klasie Instrument i nadpisuje metodę play().
public class PercussionInstrument extends Instrument {
    // Konstruktor klasy PercussionInstrument.
    // @param name Nazwa instrumentu perkusyjnego.
    public PercussionInstrument(String name) {
        super(name);
    }

    // Nadpisuje metodę play(), aby dodać specyficzne zachowanie dla instrumentów perkusyjnych.
    @Override
    public void play() {
        System.out.println("Beating the " + getName());
    }
}
