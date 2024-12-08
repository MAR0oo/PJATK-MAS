package MAS3.Dynamic;

// Klasa reprezentująca oswojone zwierzę.
// Dziedziczy po klasie Animal i dodaje atrybut właściciela.
public class TameAnimal extends Animal {
    private final String ownerName; // Imię właściciela

    // Konstruktor klasy TameAnimal.
    // @param name Nazwa zwierzęcia.
    // @param age Wiek zwierzęcia.
    // @param ownerName Imię właściciela zwierzęcia.
    public TameAnimal(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    // Pobiera imię właściciela.
    // @return Imię właściciela.
    public String getOwnerName() {
        return ownerName;
    }

    // Wypuszcza oswojone zwierzę na wolność.
    // @param habitat Siedlisko, do którego zwierzę zostanie wypuszczone.
    public void releaseToWild(String habitat) {
        int index = Animal.getAnimalList().indexOf(this);
        Animal.getAnimalList().set(index, new WildAnimal(getName(), getAge(), habitat));
    }

    // Odgrywa dźwięk oswojonego zwierzęcia.
    @Override
    public void makeSound() {
        System.out.println(getName() + " purrs happily with its owner " + ownerName + ".");
    }
}
