package MAS3.Overlapping;

// Klasa reprezentująca tablet, dziedzicząca po klasie MultimediaDevice.
// Dodaje unikalny atrybut obsługi stylusa.
public class Tablet extends MultimediaDevice {
    private final boolean hasStylus; // Czy tablet obsługuje stylus

    // Konstruktor klasy Tablet.
    // @param brand Marka tabletu.
    // @param model Model tabletu.
    // @param hasStylus Czy tablet obsługuje stylus.
    public Tablet(String brand, String model, boolean hasStylus) {
        super(brand, model);
        this.hasStylus = hasStylus;
    }

    // Pobiera informację o obsłudze stylusa.
    // @return True, jeśli tablet obsługuje stylus.
    public boolean hasStylus() {
        return hasStylus;
    }

    // Wyświetla informacje o tablecie.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tablet with stylus: " + (hasStylus ? "Yes" : "No"));
    }
}
