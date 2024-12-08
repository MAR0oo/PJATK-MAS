package MAS3.Polymorphism;

// Klasa reprezentująca smartfon, dziedzicząca po klasie ElectronicDevice.
// Nadpisuje metodę powerOn(), aby dodać specyficzne zachowanie dla smartfona.
public class Smartphone extends ElectronicDevice {

    // Konstruktor klasy Smartphone.
    // @param brand Marka smartfona.
    public Smartphone(String brand) {
        super(brand);
    }

    // Nadpisana metoda włączania smartfona.
    @Override
    public void powerOn() {
        System.out.println("Smartphone " + getBrand() + " is starting up.");
    }
}
