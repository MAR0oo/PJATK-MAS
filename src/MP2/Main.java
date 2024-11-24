package MP2;


//  Główna klasa demonstrująca użycie Asocjacji binarnej, asocjacji Z atrybutem, Asocjacji Kwalifikowanej i Kompozycji

import MP2.binary.Member;
import MP2.binary.Team;
import MP2.composition.Museum;
import MP2.composition.Section;
import MP2.qualified.Book;
import MP2.qualified.Library;
import MP2.withAttribute.Booking;
import MP2.withAttribute.Property;
import MP2.withAttribute.Renter;

public class Main {
    public static void main(String[] args) {

        // Demonstracja użycia klas Team i Member (Asocjacja Binarna)
        System.out.println("Demonstracja użycia klas Team i Member (Asocjacja Binarna)\n");

        // Tworzenie zespołów
        Team teamAlpha = new Team("Alpha"); // Tworzenie zespołu Alpha
        Team teamBeta = new Team("Beta"); // Tworzenie zespołu Beta

        // Tworzenie członków
        Member member1 = new Member("Enzo"); // Tworzenie członka Enzo
        Member member2 = new Member("Mati"); // Tworzenie członka Mati

        // Dodawanie członków do zespołów
        teamAlpha.addMember(member1); // Członek Enzo dołącza do zespołu Alpha
        teamAlpha.addMember(member2); // Członek Mati dołącza do zespołu Alpha

        // Wyświetlanie członków zespołu Alpha
        System.out.println("Członkowie zespołu Alpha: " + teamAlpha.getMemberNicknames());

        // Zmiana zespołu dla członka
        member1.setBelongsTo(teamBeta); // Członek Enzo przechodzi z zespołu Alpha do zespołu Beta

        // Wyświetlanie członków zespołów po zmianie
        System.out.println("Członkowie zespołu Alpha po zmianie: " + teamAlpha.getMemberNicknames());
        System.out.println("Członkowie zespołu Beta: " + teamBeta.getMemberNicknames());

        // Usuwanie członka z zespołu
        teamBeta.removeMember(member1); // Członek Enzo opuszcza zespół Beta

        // Wyświetlanie członków zespołu Beta po usunięciu
        System.out.println("Członkowie zespołu Beta po usunięciu: " + teamBeta.getMemberNicknames());



        // Demonstracja użycia klas Booking, Property i Member (Asocjacja z atrybutem)
        System.out.println("\n\nDemonstracja użycia klas Booking, Property i Member (Asocjacja z atrybutem)\n");

        // Tworzenie obiektów Renter i Property
        Renter renter1 = new Renter("Mateusz Matecki"); // Utworzenie nowego najemcy o nazwie "Mateusz Matecki"
        Property house1 = new Property("Majowa 100a"); // Utworzenie nowej nieruchomości o adresie "Majowa 100a"
        Property apartment2 = new Property("Sikorskiego 19"); // Utworzenie nowej nieruchomości o adresie "Sikorskiego 19"

        // Tworzenie rezerwacji (asocjacja z atrybutem)
        Booking booking1 = new Booking(renter1, house1, "2024-11-22"); // Rezerwacja nieruchomości "Majowa 100a" przez Mateusza Mateckiego na dzień "2024-11-22"
        Booking booking2 = new Booking(renter1, apartment2, "2024-12-01"); // Rezerwacja nieruchomości "Sikorskiego 19" przez Mateusaz Mateckiwgo na dzień "2024-12-01"

        // Wyświetlanie wynajętych nieruchomości przez Mateusz Matecki
        System.out.println("Nieruchomości wynajęte przez Mateusz Matecki: ");
        for (Property property : renter1.getRentedProperties()) {
            System.out.println(property.getAddress()); // Wyświetlanie adresów nieruchomości wynajętych przez Mateusz Matecki
        }

        // Wyświetlanie najemców nieruchomości house1
        System.out.println("Najemcy nieruchomości Majowa 100a: ");
        for (Renter renter : house1.getRenters()) {
            System.out.println(renter.getName()); // Wyświetlanie nazw najemców nieruchomości "Majowa 100a"
        }



        // Demonstracja użycia klas Book i Library (Asocjacja kwalifikowana)
        System.out.println("\n\nDemonstracja użycia klas Book i Library (Asocjacja kwalifikowana)\n");

        // Tworzenie obiektu biblioteki
        Library library = new Library("Biblioteka Narodowa"); // Utworzenie nowej biblioteki o nazwie "Biblioteka Narodowa"

        // Tworzenie obiektów książek
        Book book1 = new Book("The Great Gatsby"); // Utworzenie książki o tytule "The Great Gatsby"
        Book book2 = new Book("Nic mnie nie złamie"); // Utworzenie książki o tytule "Nic mnie nie złamie"
        Book book3 = new Book("Pismo Święte"); // Utworzenie książki o tytule "Pismo Święte"

        // Dodawanie książek do biblioteki
        library.addBook(book1); // Dodanie książki "The Great Gatsby" do biblioteki "Biblioteka Narodowa"
        library.addBook(book2); // Dodanie książki "Nic mnie nie złamie" do biblioteki "Biblioteka Narodowa"
        library.addBook(book3); // Dodanie książki "Pismo Święte" do biblioteki "Biblioteka Narodowa"

        // Pobieranie książki z biblioteki po tytule
        Book retrievedBook = library.getBookByTitle("Nic mnie nie złamie"); // Pobranie książki o tytule "Nic mnie nie złamie" z biblioteki
        System.out.println("Pobrano książkę: " + retrievedBook.getTitle()); // Wyświetlenie tytułu pobranej książki

        // Usuwanie książki z biblioteki
        library.removeBook(book2); // Usunięcie książki "Nic mnie nie złamie" z biblioteki "Biblioteka Narodowa"

        // Sprawdzenie, czy książka została usunięta
        Book removedBook = library.getBookByTitle("Nic mnie nie złamie"); // Próba pobrania książki "Nic mnie nie złamie" z biblioteki
        if (removedBook == null) {
            System.out.println("Książka 'Nic mnie nie złamie' została usunięta z biblioteki."); // Informacja o usunięciu książki
        }



        // Demonstracja użycia klas Museum i Section (Kompozycja)
        System.out.println("\n\nDemonstracja użycia klas Museum i Section (Kompozycja)\n");


        // Tworzenie obiektu muzeum
        Museum museum = new Museum("Muzeum Warszawa"); // Utworzenie nowego muzeum o nazwie "Muzeum Warszawa"

        // Tworzenie obiektów sekcji muzeum
        Section section1 = new Section("Fikcja", museum); // Utworzenie sekcji "Fikcja" przypisanej do muzeum "Muzeum Warszawa"
        Section section2 = new Section("Nauka", museum); // Utworzenie sekcji "Nauka" przypisanej do biblioteki "Muzeum Warszawa"
        Section section3 = new Section("Historia", museum); // Utworzenie sekcji "Historia" przypisanej do biblioteki "Muzeum Warszawa"

        // Wyświetlanie sekcji muzeum
        System.out.println("Sekcje w muzeum 'Muzeum Warszawa':");
        for (Section section : museum.getSections()) {
            System.out.println(section.getName()); // Wyświetlanie nazw sekcji w bibliotece
        }

        // Usuwanie sekcji z biblioteki
        museum.removeSection(section2); // Usunięcie sekcji "Nauka" z muzeum

        // Sprawdzenie, czy sekcja została usunięta
        System.out.println("\nSekcje w muzeum 'Muzeum Warszawa' po usunięciu sekcji 'Nauka':");
        for (Section section : museum.getSections()) {
            System.out.println(section.getName()); // Wyświetlanie nazw sekcji w bibliotece po usunięciu
        }
    }
}
