package MAS3.Dynamic;

import java.util.ArrayList;
import java.util.List;

// Klasa abstrakcyjna reprezentująca ogólne zwierzę.
// Zawiera wspólne atrybuty oraz listę wszystkich utworzonych zwierząt.
public abstract class Animal {
    private final String name; // Nazwa zwierzęcia
    private final int age; // Wiek zwierzęcia
    private static final List<Animal> animalList = new ArrayList<>(); // Lista wszystkich zwierząt

    // Konstruktor klasy Animal.
    // @param name Nazwa zwierzęcia.
    // @param age Wiek zwierzęcia.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalList.add(this); // Dodanie zwierzęcia do listy
    }

    // Pobiera nazwę zwierzęcia.
    // @return Nazwa zwierzęcia.
    public String getName() {
        return name;
    }

    // Pobiera wiek zwierzęcia.
    // @return Wiek zwierzęcia.
    public int getAge() {
        return age;
    }

    // Pobiera listę wszystkich zwierząt.
    // @return Lista wszystkich zwierząt.
    public static List<Animal> getAnimalList() {
        return animalList;
    }

    // Metoda abstrakcyjna do odgrywania dźwięku przez zwierzę.
    public abstract void makeSound();
}
