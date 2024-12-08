package MAS3.Abstract;

// Klasa abstrakcyjna reprezentująca ogólny pojazd.
// Posiada wspólne atrybuty i metody dla różnych typów pojazdów.
public abstract class Vehicle {
    private final String brand; // Marka pojazdu
    private final int year; // Rok produkcji pojazdu

    // Konstruktor klasy abstrakcyjnej.
    // @param brand Marka pojazdu.
    // @param year Rok produkcji pojazdu.
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Pobiera markę pojazdu.
    // @return Marka pojazdu.
    public String getBrand() {
        return brand;
    }

    // Pobiera rok produkcji pojazdu.
    // @return Rok produkcji pojazdu.
    public int getYear() {
        return year;
    }
}
