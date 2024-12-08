package MAS3.Disjoint;

// Klasa reprezentująca programistę, rozłączną rolę pracownika.
// Każdy programista jest również pracownikiem.
public class Developer {
    private final Employee employee; // Referencja do pracownika pełniącego rolę programisty
    private final String programmingLanguage; // Język programowania, w którym specjalizuje się programista

    // Konstruktor klasy Developer.
    // @param employee Pracownik, który pełni rolę programisty.
    // @param programmingLanguage Język programowania.
    public Developer(Employee employee, String programmingLanguage) {
        this.employee = employee;
        this.programmingLanguage = programmingLanguage;
    }

    // Pobiera pracownika pełniącego rolę programisty.
    // @return Obiekt Employee reprezentujący programistę.
    public Employee getEmployee() {
        return employee;
    }

    // Pobiera język programowania programisty.
    // @return Język programowania.
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Wyświetla informacje o programiście.
    public void printInfo() {
        System.out.println("Developer: " + employee.getName() + ", ID: " + employee.getId() + ", Language: " + programmingLanguage);
    }
}
