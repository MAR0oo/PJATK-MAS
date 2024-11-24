package MP2.qualified;

import java.util.HashMap;
import java.util.Map;

//  Klasa reprezentująca bibliotekę, która posiada wiele książek.
//  Biblioteka może przechowywać książki i zarządzać nimi, używając tytułu książki jako klucza kwalifikowanego.
public class Library {
    private String name;
    private final Map<String, Book> books = new HashMap<>();

//  Konstruktor tworzący bibliotekę o podanej nazwie.
//  @param name Nazwa biblioteki.
    public Library(String name) {
        this.name = name;
    }

//  Pobiera nazwę biblioteki.
//  @return Nazwa biblioteki.
    public String getName() {
        return name;
    }

//  Ustawia nazwę biblioteki.
//  @param name Nowa nazwa biblioteki.
    public void setName(String name) {
        this.name = name;
    }

//  Pobiera mapę książek znajdujących się w bibliotece.
//  @return Mapa książek w bibliotece.
    public Map<String, Book> getBooks() {
        return new HashMap<>(books);
    }

//  Pobiera książkę o podanym tytule.
//  @param title Tytuł książki.
//  @return Książka o podanym tytule lub null, jeśli nie istnieje.
    public Book getBookByTitle(String title) {
        return books.get(title);
    }

//  Dodaje książkę do biblioteki.
//  @param bookToAdd Książka, która ma zostać dodana.
    public void addBook(Book bookToAdd) {
        if (bookToAdd == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (!books.containsKey(bookToAdd.getTitle())) {
            books.put(bookToAdd.getTitle(), bookToAdd);
            bookToAdd.setLibrary(this);
        }
    }

//  Usuwa książkę z biblioteki.
//  @param bookToRemove Książka, która ma zostać usunięta.
    public void removeBook(Book bookToRemove) {
        if (bookToRemove == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (books.containsKey(bookToRemove.getTitle())) {
            books.remove(bookToRemove.getTitle());
            bookToRemove.setLibrary(null);
        }
    }
}
