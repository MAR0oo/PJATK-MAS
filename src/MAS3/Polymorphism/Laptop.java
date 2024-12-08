package MAS3.Polymorphism;

// Klasa reprezentująca laptop, dziedzicząca po klasie ElectronicDevice.
// Nadpisuje metodę powerOn(), aby dodać specyficzne zachowanie dla laptopa.
public class Laptop extends ElectronicDevice {

    // Konstruktor klasy Laptop.
    // @param brand Marka laptopa.
    public Laptop(String brand) {
        super(brand);
    }

    // Nadpisana metoda włączania laptopa.
    @Override
    public void powerOn() {
        System.out.println("Laptop " + getBrand() + " is booting up.");
    }
}
