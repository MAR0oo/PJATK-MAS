package MP2.composition;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//  Klasa reprezentująca muzeum, które składa się z wielu sekcji.
//  Sekcja nie może istnieć bez muzeum, do którego należy.
public class Museum {
    private final Set<Section> sections = new HashSet<>();
    private String name;

//  Konstruktor do utworzenia muzeum o podanej nazwie.
//  @param name Nazwa muzeum.
    public Museum(String name) {
        this.name = name;
    }

//  Pobiera nazwę muzeum.
//  @return Nazwa muzeum.
    public String getName() {
        return name;
    }

//  Ustawia nazwę muzeum.
//  @param name Nowa nazwa muzeum.
    public void setName(String name) {
        this.name = name;
    }

//  Pobiera zestaw sekcji muzeum.
//  @return Niemodyfikowalny zestaw sekcji muzeum.
    public Set<Section> getSections() {
        return Collections.unmodifiableSet(sections);
    }

//  Dodaje sekcję do muzeum.
//  @param sectionToAdd Sekcja, która ma zostać dodana do muzeum.
    public void addSection(Section sectionToAdd) {
        if (sectionToAdd == null) {
            throw new IllegalArgumentException("Cannot add a null section");
        }
        if (sections.contains(sectionToAdd)) {
            return;
        }
        if (sectionToAdd.getMuseum() != this) {
            throw new IllegalArgumentException("Section must have this museum as its owner");
        }
        sections.add(sectionToAdd);
    }

//  Usuwa sekcję z muzeum.
//  @param sectionToRemove Sekcja, która ma zostać usunięta z muzeum.
    public void removeSection(Section sectionToRemove) {
        if (sectionToRemove == null) {
            throw new IllegalArgumentException("Cannot remove a null section");
        }
        if (!sections.contains(sectionToRemove)) {
            throw new IllegalArgumentException("Section does not belong to this museum");
        }
        sections.remove(sectionToRemove);
        Section.removeFromExtent(sectionToRemove);
    }
}
