package MP2.withAttribute;

import java.util.ArrayList;
import java.util.List;


//  Klasa reprezentująca rezerwację, będącą asocjacją z atrybutem między Renter a Property.
//  Booking zawiera informacje o rezerwacji nieruchomości przez najemcę, w tym datę rezerwacji.

public class Booking {
    private final Renter renter;
    private final Property property;
    private final String bookingDate;
    private static final List<Booking> bookingList = new ArrayList<>();


//  Konstruktor do utworzenia rezerwacji nieruchomości przez najemcę.
//  @param renter Najemca, który dokonuje rezerwacji.
//  @param property Nieruchomość, która jest rezerwowana.
//  @param bookingDate Data rezerwacji.
    public Booking(Renter renter, Property property, String bookingDate) {
        if (!renter.getRentedProperties().contains(property)) {
            renter.addRentedProperty(property);
        }
        this.renter = renter;
        this.property = property;
        this.bookingDate = bookingDate;
        bookingList.add(this);
    }

//  Pobiera najemcę związanym z tą rezerwacją.
//  @return Najemca rezerwacji.
    public Renter getRenter() {
        return renter;
    }

//  Pobiera nieruchomość związaną z tą rezerwacją.
//  @return Nieruchomość rezerwacji.
    public Property getProperty() {
        return property;
    }

//  Pobiera datę rezerwacji.
//  @return Data rezerwacji.
    public String getBookingDate() {
        return bookingDate;
    }
}