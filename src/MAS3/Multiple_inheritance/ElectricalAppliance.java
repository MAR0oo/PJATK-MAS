package MAS3.Multiple_inheritance;

// Klasa reprezentująca urządzenie elektryczne w kuchni.
// Dziedziczy po KitchenTool i dodaje atrybut mocy oraz funkcjonalność elektryczną.
public class ElectricalAppliance extends KitchenTool {
    private final int power; // Moc urządzenia w watach

    // Konstruktor klasy ElectricalAppliance.
    // @param name Nazwa urządzenia.
    // @param power Moc urządzenia w watach.
    public ElectricalAppliance(String name, int power) {
        super(name);
        this.power = power;
    }

    // Pobiera moc urządzenia.
    // @return Moc urządzenia w watach.
    public int getPower() {
        return power;
    }

    // Podłącza urządzenie elektryczne.
    public void plugIn() {
        System.out.println("Plugging in the electrical appliance: " + getName());
    }

    // Nadpisuje metodę useTool(), aby dodać specyficzną funkcjonalność urządzeń elektrycznych.
    @Override
    public void useTool() {
        System.out.println("Using the electrical appliance: " + getName() + " with power " + power + "W");
    }
}
