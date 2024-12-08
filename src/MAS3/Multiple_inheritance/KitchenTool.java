package MAS3.Multiple_inheritance;

// Klasa bazowa reprezentująca narzędzie kuchenne.
// Zawiera wspólny atrybut i metodę dla wszystkich narzędzi kuchennych.
public class KitchenTool {
    private final String name; // Nazwa narzędzia kuchennego

    // Konstruktor klasy KitchenTool.
    // @param name Nazwa narzędzia kuchennego.
    public KitchenTool(String name) {
        this.name = name;
    }

    // Pobiera nazwę narzędzia kuchennego.
    // @return Nazwa narzędzia.
    public String getName() {
        return name;
    }

    // Używa narzędzia kuchennego.
    public void useTool() {
        System.out.println("Using the kitchen tool: " + name);
    }
}
