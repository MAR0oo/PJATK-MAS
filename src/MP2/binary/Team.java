package MP2.binary;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


//  Reprezentuje zespół składający się z wielu członków.
//  Klasa ta zapewnia automatyczne utrzymanie relacji między zespołem a jego członkami.

public class Team {
    private final Set<Member> members = new HashSet<>();
    private String name;



//  Konstruktor do utworzenia zespołu o podanej nazwie.
//  @param name Nazwa zespołu.
    public Team(String name) {
        this.name = name;
    }

//  Pobiera nazwę zespołu.
//  @return Nazwa zespołu.
    public String getName() {
        return name;
    }


//  Ustawia nazwę zespołu.
//  @param name Nowa nazwa zespołu.
    public void setName(String name) {
        this.name = name;
    }

//  Pobiera członków zespołu.
//  @return Niemodyfikowalny zbór członków zespołu.
    public Set<Member> getMembers() {
        return Collections.unmodifiableSet(members);
    }


//  Pobiera pseudonimy członków zespołu w formacie przyjaznym do prezentacji.
//  @return Łańcuch tekstowy z pseudonimami członków zespołu.
    public String getMemberNicknames() {
        return members.stream().map(Member::getNickname).collect(Collectors.joining(", "));
    }

//  Dodaje członka do zespołu.
//  @param newMember Członek, który ma zostać dodany.
    public void addMember(Member newMember) {
        if (newMember == null) {
            throw new IllegalArgumentException("Cannot add null member");
        }
        if (members.contains(newMember)) {
            return;
        }
        this.members.add(newMember);
        newMember.setBelongsTo(this);
    }


//  Usuwa członka z zespołu.
//  @param memberToRemove Członek, który ma zostać usunięty.
    public void removeMember(Member memberToRemove) {
        if (members.contains(memberToRemove)) {
            members.remove(memberToRemove);
            memberToRemove.setBelongsTo(null);
        }
    }
}
