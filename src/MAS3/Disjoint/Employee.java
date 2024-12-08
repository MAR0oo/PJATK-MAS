package MAS3.Disjoint;

// Klasa reprezentująca pracownika.
// Pełni rolę wspólnej klasy nadrzędnej dla rozłącznych ról Managera i Developera.
public class Employee {
    private final String name; // Imię pracownika
    private final int id; // ID pracownika

    // Konstruktor klasy Employee.
    // @param name Imię pracownika.
    // @param id ID pracownika.
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Pobiera imię pracownika.
    // @return Imię pracownika.
    public String getName() {
        return name;
    }

    // Pobiera ID pracownika.
    // @return ID pracownika.
    public int getId() {
        return id;
    }
}
