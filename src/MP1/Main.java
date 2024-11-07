package MP1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Załadowanie ekstensji z pliku (ekstensja - trwałość)
        Product.loadExtension();

        // Ustawienie kategorii produktów (atrybut klasowy)
        Product.setCategory("Elektronika");

        // Tworzenie obiektów MP1.ProductDetails (atrybut złożony)
        ProductDetails tvDetails = new ProductDetails("Samsung", "QLED 8K", "High-end");
        ProductDetails speakerDetails = new ProductDetails("Bose", "SoundLink", "Przenośny głośnik bluetooth");

        // Lista tagów (atrybut powtarzalny)
        List<String> tvTags = Arrays.asList("Smart", "8K", "QLED");
        List<String> speakerTags = Arrays.asList("Przenośny", "Bluetooth", "Wodoodporny");

        // Tworzenie obiektów MP1.Product z różnymi konstruktorami (przeciążenie)
        Product tv = new Product("Smart TV", 2600, tvDetails, "Najlepszy telewizor SMART", tvTags);
        Product speaker = new Product("Głośnik Bluetooth", 200, speakerDetails, "Wodoodporny głośnik", speakerTags);

        // Przykład obsługi wyjątku przy ustawianiu ceny (walidacja danych)
        try {
            tv.setPriceBrutto(-100); // Wyjątek, cena nie może być ujemna
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd przy ustawianiu ceny: " + e.getMessage());
        }

        // Przykład obsługi wyjątku przy usuwaniu tagu (walidacja danych)
        try {
            speaker.removeTag("Wodoodporny"); // Wyjątek, nie można usunąć ostatniego tagu
        } catch (IllegalArgumentException e) {
            System.out.println("Nie można usunąć ostatniego taga: " + e.getMessage());
        }

        // Znalezienie najtańszego produktu (metoda klasowa)
        Product cheapestProduct = Product.findCheapestProduct();
        if (cheapestProduct != null) {
            System.out.println("Najtańszy produkt: " + cheapestProduct);
        } else {
            System.out.println("Nie znaleziono produktów");
        }

        // Dodawanie i usuwanie tagu (atrybut powtarzalny)
        tv.addTag("Wysoka jakość");
        tv.removeTag("Wysoka jakość");

        // Wyświetlenie kategorii (atrybut klasowy)
        System.out.println(Product.getCategory());

        // Wyświetlenie wszystkich produktów (ekstensja)
        Product.displayAllProducts();

        // Tworzenie kolejnego produktu
        ProductDetails mouseDetails = new ProductDetails("Logitech", "G PRO X", "Profesjonalna myszka do gier");
        List<String> mouseTags = Arrays.asList("PRO mysz", "Najlepsza do gamingu");
        Product mouse = new Product("Logitech Myszka", 500, mouseDetails, "Najpopularniejsza wśród esportowców", mouseTags);

        // Wyświetlenie wszystkich produktów po dodaniu nowego
        System.out.println();
        Product.displayAllProducts();

        // Zapisanie ekstensji do pliku (ekstensja - trwałość)
        Product.saveExtension();
    }
}