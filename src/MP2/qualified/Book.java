package MP2.qualified;

//  Klasa reprezentująca książkę, która może należeć do biblioteki.
//  Każda książka może znajdować się w jednej bibliotece.
public class Book {
    private String title;
    private Library library;

//  Konstruktor do utworzenia książki o podanym tytule.
//  @param title Tytuł książki.
    public Book(String title) {
        this.title = title;
    }

//  Pobiera tytuł książki.
//  @return Tytuł książki.
    public String getTitle() {
        return title;
    }

//  Ustawia tytuł książki.
//  @param title Nowy tytuł książki.
    public void setTitle(String title) {
        this.title = title;
    }

//  Pobiera bibliotekę, do której należy książka.
//  @return Biblioteka, do której należy książka.
    public Library getLibrary() {
        return library;
    }

//  Ustawia bibliotekę, do której należy książka.
//  Zapewnia, że relacja między książką a biblioteką jest odpowiednio utrzymywana.
//  @param newLibrary Nowa biblioteka, do której książka będzie należała.
    public void setLibrary(Library newLibrary) {
        if (this.library == newLibrary) {
            return;
        }
        if (this.library == null) {
            this.library = newLibrary;
            newLibrary.addBook(this);
        } else if (newLibrary == null) {
            this.library.removeBook(this);
            this.library = null;
        } else {
            this.library.removeBook(this);
            this.library = newLibrary;
            newLibrary.addBook(this);
        }
    }
}
