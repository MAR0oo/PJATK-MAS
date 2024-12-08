package MAS3.Dynamic;

// Klasa reprezentująca dzikie zwierzę.
// Dziedziczy po klasie Animal i dodaje atrybut siedliska.
public class WildAnimal extends Animal {
    private final String habitat; // Siedlisko zwierzęcia

    // Konstruktor klasy WildAnimal.
    // @param name Nazwa zwierzęcia.
    // @param age Wiek zwierzęcia.
    // @param habitat Siedlisko zwierzęcia.
    public WildAnimal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    // Pobiera siedlisko zwierzęcia.
    // @return Siedlisko zwierzęcia.
    public String getHabitat() {
        return habitat;
    }

    // Oswaja dzikie zwierzę.
    // @param ownerName Imię właściciela, który oswaja zwierzę.
    public void tame(String ownerName) {
        int index = Animal.getAnimalList().indexOf(this);
        Animal.getAnimalList().set(index, new TameAnimal(getName(), getAge(), ownerName));
    }

    // Odgrywa dźwięk dzikiego zwierzęcia.
    @Override
    public void makeSound() {
        System.out.println(getName() + " growls in the " + habitat + "!");
    }
}
