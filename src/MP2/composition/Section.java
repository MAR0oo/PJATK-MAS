package MP2.composition;

import java.util.HashSet;
import java.util.Set;

//  Klasa reprezentująca sekcję muzeum, która jest częścią muzeum.
//  Sekcja nie może istnieć bez przypisanego muzeum (kompozycja).
public class Section {
    private static final Set<Section> extent = new HashSet<>();
    private final String name;
    private Museum museum;

    // Konstruktor do utworzenia sekcji o podanej nazwie i przypisanym muzeum.
    // @param name Nazwa sekcji.
    // @param museum Muzeum, do którego należy sekcja.
    public Section(String name, Museum museum) {
        if (museum == null) {
            throw new IllegalArgumentException("Section must have a library");
        }
        this.name = name;
        this.museum = museum;
        this.museum.addSection(this);
        extent.add(this);
    }

    // Pobiera nazwę sekcji.
    // @return Nazwa sekcji.
    public String getName() {
        return name;
    }

    // Pobiera muzeum, do którego należy sekcja.
    // @return Muzeum, do którego należy sekcja.
    public Museum getMuseum() {
        return museum;
    }

    // Pobiera zakres (extent) wszystkich sekcji.
    // @return Zestaw wszystkich utworzonych sekcji.
    public static Set<Section> getExtent() {
        return new HashSet<>(extent);
    }

    // Usuwa sekcję z zakresu.
    // @param section Sekcja do usunięcia.
    public static void removeFromExtent(Section section) {
        if (section == null || !extent.contains(section)) {
            throw new IllegalArgumentException("Section does not exist in the extent or is null");
        }
        section.museum = null;
        extent.remove(section);
    }

    // Czyści zakres wszystkich sekcji.
    public static void resetExtent() {
        extent.clear();
    }
}
