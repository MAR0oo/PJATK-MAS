package MAS3.Overlapping;

// Klasa reprezentująca telefon, dziedzicząca po klasie MultimediaDevice.
// Dodaje unikalny atrybut obsługi 5G.
public class Phone extends MultimediaDevice {
    private final boolean supports5G; // Czy telefon obsługuje 5G

    // Konstruktor klasy Phone.
    // @param brand Marka telefonu.
    // @param model Model telefonu.
    // @param supports5G Czy telefon obsługuje 5G.
    public Phone(String brand, String model, boolean supports5G) {
        super(brand, model);
        this.supports5G = supports5G;
    }

    // Pobiera informację o obsłudze 5G.
    // @return True, jeśli telefon obsługuje 5G.
    public boolean supports5G() {
        return supports5G;
    }

    // Wyświetla informacje o telefonie.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phone with 5G support: " + (supports5G ? "Yes" : "No"));
    }
}
