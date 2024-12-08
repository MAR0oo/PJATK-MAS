package MAS3.multi_faceted;

// Klasa reprezentująca zespół rockowy.
// Dziedziczy po klasie Band i nadpisuje metodę perform().
public class RockBand extends Band {
    // Konstruktor klasy RockBand.
    // @param name Nazwa zespołu rockowego.
    public RockBand(String name) {
        super(name);
    }

    // Nadpisuje metodę perform(), aby dodać specyficzne zachowanie dla zespołów rockowych.
    @Override
    public void perform() {
        System.out.println(getName() + " is rocking the stage!");
        super.perform();
    }
}
