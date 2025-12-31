# GamePieceTest
Ein kleines Java-Konsolenspiel mit zwei Spielern und beweglichen Spielsteinen.  
Jeder Spieler hat zwei Steine, die sich auf einem Spielfeld bewegen.  
Das Ziel ist, beide Steine ins Ziel zu bringen. Wer zuerst beide Steine erreicht, gewinnt.

## Features

- Konsolenbasiertes Spiel
- Zwei Spieler mit je zwei Spielsteinen
- Zufälliger Startspieler
- Gegnerische Steine werden bei gleicher Position zurückgesetzt
- Nach jedem Zug wird auf eine Eingabe gewartet, um das Spiel schrittweise zu spielen

## Installation & Start

1. **Java 17** oder höher installieren
2. Projekt klonen:

```bash
git clone https://github.com/farzaneh-soghani/GamePieceTest.git
```
3. In IntelliJ öffnen oder über Terminal:
- `Erst in den Projektordner wechseln` → cd GamePieceTest  
- `Dann in den src-Ordner wechseln` → cd src  
- `Alle Java-Dateien kompilieren` → javac *.java 
- `Das Spiel starten` → java GamePieceTest

Beim Start wirst du aufgefordert, eine Zahl einzugeben, die als Ziel für die Spielsteine dient.
### Enter klicken, dann wird das Spiel abgelaufen. 

   
## Dateien

- `GamePieceTest.java` → Hauptklasse, steuert das Spiel  
- `Player.java` → Klasse für Spieler und deren Spielsteine  
- `GamePiece.java` → Klasse für einzelne Spielsteine  
- `README.md` → Projektbeschreibung und Anleitung  
- `LICENSE` → MIT-Lizenz, regelt Nutzung und Weitergabe  

## Lizenz

Dieses Projekt ist unter der **MIT License** lizenziert. Siehe die Datei `LICENSE`.


