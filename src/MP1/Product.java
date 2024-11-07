package MP1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final String EXTENSION_STORAGE = "products.dat";
    private static List<Product> extension = new ArrayList<>(); // Ekstensja
    private static final double VAT_RATE = 0.23;
    private String name;
    private double priceBrutto;
    private List<String> tags = new ArrayList<>(); // Atrybut powtarzalny
    private String description; // Atrybut opcjonalny
    private static String category = "Default"; // Atrybut klasowy
    private ProductDetails details; // Atrybut złożony


    // Konstruktor przeciążony (przeciążenie)
    public Product(String name, double priceBrutto) {
        setName(name);
        setPriceBrutto(priceBrutto);
        this.details = null;
        this.description = "";
        this.tags = new ArrayList<>();
        extension.add(this); // Dodanie do ekstensji
    }

    // Konstruktor przeciążony (przeciążenie)
    public Product(String name, double priceBrutto, ProductDetails details, String description, List<String> tags) {
        this(name, priceBrutto);
        setDetails(details);
        setDescription(description);
        setTags(tags);
    }

    // Atrybut klasowy (getter)
    public static String getCategory() {
        return category;
    }

    // Atrybut klasowy (setter)
    public static void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Kategoria nie może być null lub pusta");
        }
        Product.category = category;
    }


    // Metoda klasowa - wyświetla wszystkie produkty (ekstensja)
    public static void displayAllProducts() {
        for (Product product : extension) {
            System.out.println(product);
        }
    }

    // Metoda klasowa - znajduje najtańszy produkt (ekstensja)
    public static Product findCheapestProduct() {
        if (extension.isEmpty()) {
            return null;
        }

        Product cheapest = extension.get(0);
        for (Product product : extension) {
            if (product.getPriceBrutto() < cheapest.getPriceBrutto()) {
                cheapest = product;
            }
        }
        return cheapest;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie może być pusta lub null");
        }
        this.name = name;
    }

    public double getPriceBrutto(){
        return priceBrutto;
    }

    public void setPriceBrutto(double priceBrutto){
        if (priceBrutto < 0) {
            throw new IllegalArgumentException("Cena brutto nie moze być ujemna");
        }
        this.priceBrutto = priceBrutto;
    }

    // Atrybut pochodny - obliczenie ceny netto
    public double getPriceNetto() {
        return priceBrutto / (1 + VAT_RATE);
    }

    public void setDetails(ProductDetails details){
        if(details == null) {
            throw new IllegalArgumentException("Detale nie mogą być null");
        }
        this.details = details;
    }

    public void setDescription(String description) {
        if(description != null && description.trim().isEmpty()){
            description = "";
        }
        this.description = description;
    }

    public void addTag(String tag) {
        if (tag == null || tag.trim().isEmpty()) {
            throw new IllegalArgumentException("Tag nie może być pusty lub null");
        }
        tags.add(tag);
    }

    public void removeTag(String tag){
        if (tags.size() <= 1) {
            throw new IllegalArgumentException("Nie można usunąć ostatniego taga");
        }
        tags.remove(tag);
    }

    public void setTags(List<String> tags) {
        if (tags == null || tags.isEmpty()) {
            throw new IllegalArgumentException("Tagi nie mogą być puste lub null");
        }
        this.tags = new ArrayList<>(tags);
    }

    // Przesłonięcie metody toString()
    @Override
    public String toString() {
        return "MP1.Product{" +
                "name='" + name + '\'' +
                ", priceBrutto=" + priceBrutto +
                ", priceNetto=" + getPriceNetto() +
                ", details=" + details +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", category='" + getCategory() + '\'' +
                '}';
    }

    // Zapis ekstensji do pliku (ekstensja - trwałość)
    public static void saveExtension() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EXTENSION_STORAGE))) {
            oos.writeObject(extension);
        } catch (IOException e) {
            System.err.println("Błąd przy zapisywaniu ekstensji: " + e.getMessage());
        }
    }

    // Wczytanie ekstensji z pliku (ekstensja - trwałość)
    public static void loadExtension() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EXTENSION_STORAGE))) {
            extension = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Błąd przy ładowaniu ekstensji: " + e.getMessage());
        }
    }


}
