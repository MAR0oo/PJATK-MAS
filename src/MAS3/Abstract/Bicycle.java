package MAS3.Abstract;

// Klasa reprezentująca rower, dziedzicząca z klasy abstrakcyjnej Vehicle.
// Dodaje unikalny atrybut liczby biegów.
public class Bicycle extends Vehicle {
    private final int gearCount; // Liczba biegów w rowerze

    // Konstruktor klasy Bicycle.
    // @param brand Marka roweru.
    // @param year Rok produkcji roweru.
    // @param gearCount Liczba biegów w rowerze.
    public Bicycle(String brand, int year, int gearCount) {
        super(brand, year);
        this.gearCount = gearCount;
    }

    // Pobiera liczbę biegów w rowerze.
    // @return Liczba biegów.
    public int getGearCount() {
        return gearCount;
    }
}
