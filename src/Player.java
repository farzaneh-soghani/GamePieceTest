public class Player {
    String name;         // Name des Spielers
    GamePiece one;       // Erster Stein
    GamePiece two;       // Zweiter Stein

    // Konstruktor: Erstellt einen Spieler mit zwei Steinen
    public Player(String name, GamePiece one, GamePiece two) {
        this.name = name;
        this.one = one;
        this.two = two;
    }

    boolean gewonnen() {
        return one.zielErreicht  && two.zielErreicht ;
    }
}
