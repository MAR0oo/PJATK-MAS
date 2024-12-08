package MAS3;

import MAS3.Abstract.Bicycle;
import MAS3.Abstract.Car;
import MAS3.Disjoint.Developer;
import MAS3.Disjoint.Employee;
import MAS3.Disjoint.Manager;
import MAS3.Dynamic.Animal;
import MAS3.Dynamic.TameAnimal;
import MAS3.Dynamic.WildAnimal;
import MAS3.Multiple_inheritance.Blender;
import MAS3.Multiple_inheritance.ElectricalAppliance;
import MAS3.Multiple_inheritance.KitchenTool;
import MAS3.Overlapping.HybridTabletPhone;
import MAS3.Overlapping.Phone;
import MAS3.Overlapping.Tablet;
import MAS3.Polymorphism.ElectronicDevice;
import MAS3.Polymorphism.Laptop;
import MAS3.Polymorphism.Smartphone;
import MAS3.multi_faceted.*;

public class Main {
    public static void main(String[] args) {

        // Abstract //

        // Tworzenie obiektu samochodu
        Car car = new Car("Toyota", 2020, 4); // Samochód marki Toyota z 2020 roku i 4 drzwiami.
        // Tworzenie obiektu roweru
        Bicycle bicycle = new Bicycle("Giant", 2022, 21); // Rower marki Giant z 2022 roku i 21 biegami.

        // Wyświetlenie informacji o samochodzie
        System.out.println("Car: " + car.getBrand() + ", Year: " + car.getYear() + ", Doors: " + car.getNumberOfDoors());
        // Wyświetlenie informacji o rowerze
        System.out.println("Bicycle: " + bicycle.getBrand() + ", Year: " + bicycle.getYear() + ", Gears: " + bicycle.getGearCount());





        // Disjoint //

        // Tworzenie obiektu pracownika emp1
        Employee emp1 = new Employee("Kuba", 101); // Pracownik o imieniu Kuba i ID 101

        // Tworzenie obiektu pracownika emp2
        Employee emp2 = new Employee("Robert", 102); // Pracownik o imieniu Robert i ID 102

        // Przypisanie roli menedżera do pracownika emp1
        Manager manager = new Manager(emp1, 5); // Menedżer zarządzający zespołem o rozmiarze 5

        // Przypisanie roli programisty do pracownika emp2
        Developer developer = new Developer(emp2, "Java"); // Programista specjalizujący się w Javie

        // Wyświetlenie informacji o menedżerze
        manager.printInfo(); // Wyświetla: Manager: Kuba, ID: 101, Team Size: 5

        // Wyświetlenie informacji o programiście
        developer.printInfo(); // Wyświetla: Developer: Robert, ID: 102, Language: Java





        // Polimorficzne wołanie metody //

        // Tworzenie obiektu Laptop przypisanego do referencji ElectronicDevice
        ElectronicDevice device1 = new Laptop("Dell"); // Laptop marki Dell

        // Tworzenie obiektu Smartphone przypisanego do referencji ElectronicDevice
        ElectronicDevice device2 = new Smartphone("Samsung"); // Smartfon marki Samsung

        // Wywołanie metody powerOn() na podstawie rzeczywistego typu obiektu
        device1.powerOn(); // Wywołuje metodę powerOn() klasy Laptop
        device2.powerOn(); // Wywołuje metodę powerOn() klasy Smartphone

        // Demonstracja dynamicznego wiązania w pętli
        ElectronicDevice[] devices = {device1, device2}; // Tablica urządzeń elektronicznych
        for (ElectronicDevice device : devices) {
            device.powerOn(); // Wywołanie odpowiedniej metody powerOn() dla każdego urządzenia
        }





        // Overlapping //

        // Tworzenie obiektu Tablet
        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7", true); // Tablet marki Samsung z obsługą stylusa

        // Tworzenie obiektu Phone
        Phone phone = new Phone("Apple", "iPhone 14", true); // Telefon marki Apple z obsługą 5G

        // Tworzenie obiektu HybridTabletPhone
        HybridTabletPhone hybrid = new HybridTabletPhone("Microsoft", "Surface Duo", true, true); // Hybrydowe urządzenie Microsoft z obsługą stylusa i 5G

        // Wyświetlanie informacji o tablecie
        System.out.println("Tablet:");
        tablet.displayInfo(); // Wyświetla informacje o tablecie

        // Wyświetlanie informacji o telefonie
        System.out.println("\nPhone:");
        phone.displayInfo(); // Wyświetla informacje o telefonie

        // Wyświetlanie informacji o urządzeniu hybrydowym
        System.out.println("\nHybrid Device:");
        hybrid.displayInfo(); // Wyświetla informacje o urządzeniu hybrydowym





        // Wielodziedziczenie //

        // Tworzenie obiektu KitchenTool
        KitchenTool knife = new KitchenTool("Chef Knife"); // Nóż szefa kuchni

        // Tworzenie obiektu ElectricalAppliance
        ElectricalAppliance mixer = new ElectricalAppliance("Stand Mixer", 500); // Mikser elektryczny o mocy 500 W

        // Tworzenie obiektu Blender
        Blender blender = new Blender("Kitchen Blender", 700, 5); // Blender kuchenny z mocą 700 W i 5 poziomami prędkości

        // Demonstracja narzędzia kuchennego
        System.out.println("Kitchen Tool:");
        knife.useTool(); // Wyświetla: Using the kitchen tool: Chef Knife

        // Demonstracja urządzenia elektrycznego
        System.out.println("\nElectrical Appliance:");
        mixer.plugIn(); // Wyświetla: Plugging in the electrical appliance: Stand Mixer
        mixer.useTool(); // Wyświetla: Using the electrical appliance: Stand Mixer with power 500W

        // Demonstracja blendera
        System.out.println("\nBlender:");
        blender.plugIn(); // Wyświetla: Plugging in the electrical appliance: Kitchen Blender
        blender.useTool(); // Wyświetla: Using the electrical appliance: Kitchen Blender with power 700W; Blending at speed level: 5
        blender.adjustSettings(); // Wyświetla: Adjusting the blender settings to 5 speed levels
        blender.washByHand(); // Wyświetla: Washing the blender by hand





        // Wieloaspektowe //

        // Tworzenie zespołu rockowego
        RockBand rockBand = new RockBand("AC/DC"); // Zespół rockowy o nazwie AC/DC

        // Tworzenie zespołu jazzowego
        JazzBand jazzBand = new JazzBand("Smooth Jazz"); // Zespół jazzowy o nazwie Smooth Jazz

        // Tworzenie instrumentów
        Instrument guitar = new StringInstrument("Electric Guitar"); // Instrument strunowy: Gitara elektryczna
        Instrument drums = new PercussionInstrument("Drum Set"); // Instrument perkusyjny: Zestaw perkusyjny
        Instrument bass = new StringInstrument("Bass Guitar"); // Instrument strunowy: Gitara basowa
        Instrument saxophone = new StringInstrument("Saxophone"); // Instrument strunowy: Saksofon

        // Dodawanie instrumentów do zespołu rockowego
        rockBand.addInstrument(guitar); // Dodanie gitary elektrycznej do zespołu rockowego
        rockBand.addInstrument(drums); // Dodanie zestawu perkusyjnego do zespołu rockowego
        rockBand.addInstrument(bass); // Dodanie gitary basowej do zespołu rockowego

        // Dodawanie instrumentów do zespołu jazzowego
        jazzBand.addInstrument(saxophone); // Dodanie saksofonu do zespołu jazzowego
        jazzBand.addInstrument(drums); // Dodanie zestawu perkusyjnego do zespołu jazzowego

        // Występ zespołu rockowego
        System.out.println("Rock Band Performance:");
        rockBand.perform(); // Wyświetla informacje o występie zespołu rockowego

        // Występ zespołu jazzowego
        System.out.println("\nJazz Band Performance:");
        jazzBand.perform(); // Wyświetla informacje o występie zespołu jazzowego





        // Dynamiczne //

        // Tworzenie dzikiego zwierzęcia
        WildAnimal lion = new WildAnimal("Lion", 5, "Savannah"); // Dzikie zwierzę: lew w sawannie

        // Wyświetlanie listy zwierząt i ich dźwięków
        System.out.println("Initial Animals:");
        Animal.getAnimalList().forEach(Animal::makeSound); // Wyświetla dźwięki wszystkich zwierząt na liście

        // Oswajanie lwa
        System.out.println("\nTaming the lion...");
        lion.tame("Kuba"); // Lew zostaje oswojony przez Kubę

        // Wyświetlanie listy zwierząt po oswojeniu
        System.out.println("\nAnimals after taming:");
        Animal.getAnimalList().forEach(Animal::makeSound); // Wyświetla dźwięki zwierząt po oswojeniu

        // Wypuszczenie lwa na wolność
        System.out.println("\nReleasing the lion to the wild...");
        TameAnimal tamedLion = (TameAnimal) Animal.getAnimalList().get(0); // Pobranie oswojonego lwa z listy
        tamedLion.releaseToWild("Savannah"); // Lew wraca do sawanny

        // Wyświetlanie listy zwierząt po wypuszczeniu
        System.out.println("\nAnimals after releasing to the wild:");
        Animal.getAnimalList().forEach(Animal::makeSound); // Wyświetla dźwięki zwierząt po wypuszczeniu

    }
}

