package MP2.withAttribute;

import java.util.ArrayList;
import java.util.List;


//  Klasa reprezentująca nieruchomość (np. mieszkanie, dom).
//  Property może być wynajmowane przez wielu najemców, a każda nieruchomość może być wynajmowana jednocześnie przez wielu klientów.

public class Property {
    private final String address;
    private final List<Renter> renters;


//  Konstruktor do utworzenia nowej nieruchomości o podanym adresie.
//  @param address Adres nieruchomości.
    public Property(String address) {
        this.address = address;
        this.renters = new ArrayList<>();
    }

//  Pobiera adres nieruchomości.
//  @return Adres nieruchomości.
    public String getAddress() {
        return address;
    }

//  Pobiera listę najemców danej nieruchomości.
//  @return Lista najemców nieruchomości.
    public List<Renter> getRenters() {
        return renters;
    }

//  Dodaje najemcę do listy najemców nieruchomości.
//  @param renter Najemca, który ma zostać dodany.
    public void addRenter(Renter renter) {
        if (!renters.contains(renter)) {
            renters.add(renter);
            renter.addRentedProperty(this);
        }
    }

//  Usuwa najemcę z listy najemców nieruchomości.
//  @param renter Najemca, który ma zostać usunięty.
    public void removeRenter(Renter renter) {
        if (renters.contains(renter)) {
            renters.remove(renter);
            renter.removeRentedProperty(this);
        }
    }
}

