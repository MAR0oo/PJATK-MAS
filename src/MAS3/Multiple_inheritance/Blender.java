package MAS3.Multiple_inheritance;

// Klasa reprezentująca blender, dziedzicząca po ElectricalAppliance i implementująca ManualTool.
// Łączy funkcjonalności narzędzia elektrycznego i ręcznego.
public class Blender extends ElectricalAppliance implements ManualTool {
    private final int speedLevels; // Liczba poziomów prędkości blendera

    // Konstruktor klasy Blender.
    // @param name Nazwa blendera.
    // @param power Moc blendera w watach.
    // @param speedLevels Liczba poziomów prędkości blendera.
    public Blender(String name, int power, int speedLevels) {
        super(name, power);
        this.speedLevels = speedLevels;
    }

    // Pobiera liczbę poziomów prędkości blendera.
    // @return Liczba poziomów prędkości.
    public int getSpeedLevels() {
        return speedLevels;
    }

    // Implementuje metodę mycia ręcznego z interfejsu ManualTool.
    @Override
    public void washByHand() {
        System.out.println("Washing the blender by hand.");
    }

    // Implementuje metodę regulacji ustawień z interfejsu ManualTool.
    @Override
    public void adjustSettings() {
        System.out.println("Adjusting the blender settings to " + speedLevels + " speed levels.");
    }

    // Nadpisuje metodę useTool(), aby uwzględnić specyficzne funkcjonalności blendera.
    @Override
    public void useTool() {
        super.useTool();
        System.out.println("Blending at speed level: " + speedLevels);
    }
}
