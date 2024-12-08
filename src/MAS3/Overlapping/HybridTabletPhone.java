package MAS3.Overlapping;

// Klasa reprezentująca urządzenie hybrydowe, łączące cechy tabletu i telefonu.
// Dziedziczy po klasie MultimediaDevice i dodaje atrybuty obsługi stylusa oraz 5G.
public class HybridTabletPhone extends MultimediaDevice {
    private final boolean hasStylus; // Czy urządzenie obsługuje stylus
    private final boolean supports5G; // Czy urządzenie obsługuje 5G

    // Konstruktor klasy HybridTabletPhone.
    // @param brand Marka urządzenia.
    // @param model Model urządzenia.
    // @param hasStylus Czy urządzenie obsługuje stylus.
    // @param supports5G Czy urządzenie obsługuje 5G.
    public HybridTabletPhone(String brand, String model, boolean hasStylus, boolean supports5G) {
        super(brand, model);
        this.hasStylus = hasStylus;
        this.supports5G = supports5G;
    }

    // Pobiera informację o obsłudze stylusa.
    // @return True, jeśli urządzenie obsługuje stylus.
    public boolean hasStylus() {
        return hasStylus;
    }

    // Pobiera informację o obsłudze 5G.
    // @return True, jeśli urządzenie obsługuje 5G.
    public boolean supports5G() {
        return supports5G;
    }

    // Wyświetla informacje o urządzeniu hybrydowym.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hybrid device:");
        System.out.println("- Tablet with stylus: " + (hasStylus ? "Yes" : "No"));
        System.out.println("- Phone with 5G support: " + (supports5G ? "Yes" : "No"));
    }
}
