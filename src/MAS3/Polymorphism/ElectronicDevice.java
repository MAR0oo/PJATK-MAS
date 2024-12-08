package MAS3.Polymorphism;

// Klasa bazowa reprezentująca urządzenie elektroniczne.
// Definiuje wspólne cechy urządzeń oraz metodę powerOn(), którą można nadpisać w klasach dziedziczących.
public class ElectronicDevice {
    private final String brand; // Marka urządzenia

    // Konstruktor klasy ElectronicDevice.
    // @param brand Marka urządzenia.
    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    // Pobiera markę urządzenia.
    // @return Marka urządzenia.
    public String getBrand() {
        return brand;
    }

    // Włącza urządzenie.
    // Domyślna implementacja metody, która może zostać nadpisana w klasach dziedziczących.
    public void powerOn() {
        System.out.println("The electronic device is powering on.");
    }
}
