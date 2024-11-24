package MP2.binary;


//  Reprezentuje członka, który należy do zespołu.
//  Klasa ta zapewnia automatyczne utrzymanie relacji między członkiem a jego zespołem.


public class Member {

    private String nickname;
    private Team belongsTo;


//  Konstruktor do utworzenia członka o podanym pseudonimie.
//  @param nickname Pseudonim członka.
    public Member(String nickname) {
        this.nickname = nickname;
    }

//  Pobiera pseudonim członka.
//  @return Pseudonim członka.
    public String getNickname() {
        return nickname;
    }

//  Pobiera zespół, do którego należy członek.
//  @return Zespół, do którego należy członek.
    public Team getBelongsTo() {
        return belongsTo;
    }

//  Ustawia pseudonim członka.
//  @param nickname Nowy pseudonim członka.
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//  Ustawia zespół, do którego należy członek.
//  Zapewnia, że relacja między członkiem a zespołem jest odpowiednio utrzymywana.
//  @param newTeam Nowy zespół, do którego będzie należał członek.
    public void setBelongsTo(Team newTeam) {
        if (belongsTo == newTeam) {
            return;
        }
        if (belongsTo == null) {
            joinTeam(newTeam);
        } else if (newTeam == null) {
            leaveTeam();
        } else {
            switchTeam(newTeam);
        }
    }

//  Dołącza do nowego zespołu.
//  @param newTeam Nowy zespół, do którego członek ma dołączyć.
    private void joinTeam(Team newTeam) {
        belongsTo = newTeam;
        belongsTo.addMember(this);
    }

//  Opuszcza obecny zespół.
    private void leaveTeam() {
        belongsTo.removeMember(this);
        belongsTo = null;
    }

//  Zmienia zespół na nowy.
//  @param newTeam Nowy zespół, do którego członek ma przejść.
    private void switchTeam(Team newTeam) {
        belongsTo.removeMember(this);
        belongsTo = newTeam;
        newTeam.addMember(this);
    }
}
