import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein, um das Spiel bis hierhin fortzusetzen: ");
        int ziel = sc.nextInt();
        // Anzahl des Ziels aus Argument
        //int ziel = Integer.parseInt(args[0]);

        Random rand = new Random();

        GamePiece p1_one = new GamePiece("*", "Rot");
        GamePiece p1_two = new GamePiece("*", "Pink");

        GamePiece p2_one = new GamePiece("#", "Blau");
        GamePiece p2_two = new GamePiece("#", "Grün");

        Player p1 = new Player("Alice", p1_one, p1_two);
        Player p2 = new Player("Bob", p2_one, p2_two);

        // Zufälligen Startspieler wählen
        Player spieler;
        Player gegner;
        if (rand.nextBoolean()) {
            spieler = p1;
            gegner = p2;
        } else {
            spieler = p2;
            gegner = p1;
        }

        // Spielschleife
        while (true) {

            // Zufälligen Stein wählen (50/50)
            GamePiece gewaehlterStein;
            GamePiece andererStein;
            if (rand.nextBoolean()) {
                gewaehlterStein = spieler.one;
                andererStein = spieler.two;
            } else {
                gewaehlterStein = spieler.two;
                andererStein = spieler.one;
            }

            // Wenn gewählter Stein schon im Ziel, den anderen nehmen
            if (gewaehlterStein.zielErreicht) {
                gewaehlterStein = andererStein;
            }

            // Würfeln
            int wurf = rand.nextInt(6) + 1;
            System.out.println(spieler.name + " würfelt: " + wurf);

            // Stein bewegen
            gewaehlterStein.position += wurf;

            // Prüfen, ob Stein das Ziel erreicht
            if (gewaehlterStein.position >= ziel) {
                gewaehlterStein.position = ziel;
                gewaehlterStein.zielErreicht = true;
            }

            // Gegnerische Steine auf gleicher Position zurücksetzen
            if (gegner.one.position == gewaehlterStein.position) {
                gegner.one.position = 0;
                System.out.println("Gegnerischer Stein wurde zurückgesetzt");

            }
            if (gegner.two.position == gewaehlterStein.position) {
                gegner.two.position = 0;
                System.out.println("Gegnerischer Stein wurde zurückgesetzt");
            }

            // Spielfeld ausgeben
            druckeFeld(p1, p2, ziel);

            // Zuginformationen ausgeben
            System.out.println("Gewählter Stein: " + gewaehlterStein.symbol + " (" + gewaehlterStein.color + ")");
            System.out.println("Neue Position: " + gewaehlterStein.position);

            // Prüfen, ob Spieler gewonnen hat
            if (spieler.gewonnen()) {
                System.out.println(spieler.name + " hat gewonnen!");
                break;
            }

            // Spieler tauschen
            Player temp = spieler;
            spieler = gegner;
            gegner = temp;

            System.out.println("\n-> Nächster Spieler\n");
        }
    }

    static void druckeFeld(Player p1, Player p2, int ziel) {
        for (int feld = 0; feld <= ziel; feld++) {
            if (p1.one.position == feld) System.out.print(p1.one.symbol);
            else if (p1.two.position == feld) System.out.print(p1.two.symbol);
            else if (p2.one.position == feld) System.out.print(p2.one.symbol);
            else if (p2.two.position == feld) System.out.print(p2.two.symbol);
            else System.out.print("_");
        }
        System.out.println();
    }
}

