package MAS3.multi_faceted;

// Klasa reprezentująca zespół jazzowy.
// Dziedziczy po klasie Band i nadpisuje metodę perform().
public class JazzBand extends Band {
    // Konstruktor klasy JazzBand.
    // @param name Nazwa zespołu jazzowego.
    public JazzBand(String name) {
        super(name);
    }

    // Nadpisuje metodę perform(), aby dodać specyficzne zachowanie dla zespołów jazzowych.
    @Override
    public void perform() {
        System.out.println(getName() + " is creating smooth jazz vibes!");
        super.perform();
    }
}