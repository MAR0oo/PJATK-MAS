package MAS3.Overlapping;

// Klasa bazowa reprezentująca urządzenie multimedialne.
// Zawiera wspólne atrybuty i metody dla wszystkich urządzeń.
public class MultimediaDevice {
    private final String brand; // Marka urządzenia
    private final String model; // Model urządzenia

    // Konstruktor klasy MultimediaDevice.
    // @param brand Marka urządzenia.
    // @param model Model urządzenia.
    public MultimediaDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Pobiera markę urządzenia.
    // @return Marka urządzenia.
    public String getBrand() {
        return brand;
    }

    // Pobiera model urządzenia.
    // @return Model urządzenia.
    public String getModel() {
        return model;
    }

    // Wyświetla podstawowe informacje o urządzeniu.
    public void displayInfo() {
        System.out.println("Device: " + brand + " " + model);
    }
}
