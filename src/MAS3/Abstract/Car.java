package MAS3.Abstract;

// Klasa reprezentująca samochód, dziedzicząca z klasy abstrakcyjnej Vehicle.
// Dodaje unikalny atrybut liczby drzwi.
public class Car extends Vehicle {
    private final int numberOfDoors; // Liczba drzwi w samochodzie

    // Konstruktor klasy Car.
    // @param brand Marka samochodu.
    // @param year Rok produkcji samochodu.
    // @param numberOfDoors Liczba drzwi w samochodzie.
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Pobiera liczbę drzwi w samochodzie.
    // @return Liczba drzwi.
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
