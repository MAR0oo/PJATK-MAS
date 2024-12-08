package MAS3.Disjoint;

// Klasa reprezentująca menedżera, rozłączną rolę pracownika.
// Każdy menedżer jest również pracownikiem.
public class Manager {
    private final Employee employee; // Referencja do pracownika pełniącego rolę menedżera
    private final int teamSize; // Rozmiar zespołu menedżera

    // Konstruktor klasy Manager.
    // @param employee Pracownik, który pełni rolę menedżera.
    // @param teamSize Rozmiar zespołu menedżera.
    public Manager(Employee employee, int teamSize) {
        this.employee = employee;
        this.teamSize = teamSize;
    }

    // Pobiera pracownika pełniącego rolę menedżera.
    // @return Obiekt Employee reprezentujący menedżera.
    public Employee getEmployee() {
        return employee;
    }

    // Pobiera rozmiar zespołu menedżera.
    // @return Rozmiar zespołu.
    public int getTeamSize() {
        return teamSize;
    }

    // Wyświetla informacje o menedżerze.
    public void printInfo() {
        System.out.println("Manager: " + employee.getName() + ", ID: " + employee.getId() + ", Team Size: " + teamSize);
    }
}
