public class GamePiece {
    String symbol;
    String color;
    int position = 0;
    boolean zielErreicht = false;

    GamePiece(String symbol, String color) {
        this.symbol = symbol;
        this.color = color;
    }
}
