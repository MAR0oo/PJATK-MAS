package MP2.withAttribute;

import java.util.ArrayList;
import java.util.List;


//  Klasa reprezentująca osobę wynajmującą (np. klienta).

public class Renter {
    private final String name;
    private final List<Property> rentedProperties;


//  Konstruktor do utworzenia nowego najemcy o podanej nazwie.
//  @param name Nazwa najemcy.
    public Renter(String name) {
        this.name = name;
        this.rentedProperties = new ArrayList<>();
    }

//  Pobiera nazwę najemcy.
//  @return Nazwa najemcy.
    public String getName() {
        return name;
    }

//  Pobiera listę nieruchomości wynajmowanych przez najemcę.
//  @return Lista nieruchomości wynajmowanych przez najemcę.
    public List<Property> getRentedProperties() {
        return rentedProperties;
    }

//  Dodaje nieruchomość do listy nieruchomości wynajmowanych przez najemcę.
//  @param property Nieruchomość, która ma zostać dodana.
    public void addRentedProperty(Property property) {
        if (!rentedProperties.contains(property)) {
            rentedProperties.add(property);
            property.addRenter(this);
        }
    }

//  Usuwa nieruchomość z listy nieruchomości wynajmowanych przez najemcę.
//  @param property Nieruchomość, która ma zostać usunięta.
    public void removeRentedProperty(Property property) {
        if (rentedProperties.contains(property)) {
            rentedProperties.remove(property);
            property.removeRenter(this);
        }
    }
}
