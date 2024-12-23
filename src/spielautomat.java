/*
 * This is a typical slot-machine reel matrix. An occurrence of 3 same symbols 
 * starting on reel1 in a horizontal alignment will result in a win. 
 * This is called a „winline“.
 */

import java.util.*;
public class spielautomat {

	public static void main(String[] args) {
		/* Collect a random position for each reel to use as a starting point
		 * for the win calculation subset.
		 */
		// Zufallsgenerator deklarieren und initialisieren
		Random generator = new Random();
		// Keyboardscanner deklarieren und initialisieren
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		// Variable deklarieren in der die Eingabe gespeichert werden soll
		int input;
		// Variable initialisieren
		input = 1;
		// die Drehwalzen deklarieren
		String slot1, slot2, slot3;
		// eine Liste von Buchstaben deklarieren und initialisieren
		String buchstaben[] = {"A","B","C"};
		// Münzenanzahl im Bestand deklarieren
		int muenzen = 0;
		
		while(true) {
			// Spielautomat starten
			System.out.println("Slot Machine");
			// Spieler zum Zug auffordern
			System.out.println("press 1 to pull, 2 to quit");
			// Eingabe abfangen
			input = console.nextInt();
			// Eingabe abfragen
			if(input == 1) {
				// eine Zufallsposition für reel1 generieren
				int position1 = generator.nextInt(buchstaben.length);
				// Wert des Indexes von der Liste holen und in reel1 abspeichern
				slot1 = buchstaben[position1];
				// eine Zufallsposition für reel2 generieren
				int position2 = generator.nextInt(buchstaben.length);
				// Wert des Indexes von der Liste holen und in reel2 abspeichern
				slot2 = buchstaben[position2];
				// eine Zufallsposition für reel3 generieren
				int position3 = generator.nextInt(buchstaben.length);
				// Wert des Indexes von der Liste holen und in reel3 abspeichern
				slot3 = buchstaben[position3];
				
				// Konsolenausgabe
				System.out.println(" Reel 1 | Reel 2 | Reel 3 ");
				System.out.println("   " + slot1 + "    |" + "    " + slot2 + "   |" + "   " + slot3 + "   ");
				
				// Kontrollstruktur und Aufzählung
				if(slot1 == "A" && slot2 == "A" && slot3 == "A") {
					// bei 3 x A 10 Cent auszahlen
					System.out.println("You win 10 cents.");
					muenzen += 10;
					System.out.println("total win amount: " + muenzen + " cents");
				} else if(slot1 == "B" && slot2 == "B" && slot3 == "B") {
					// bei 3 x B 15 Cent auszahlen
					System.out.println("You win 15 cents.");
					muenzen += 15;
					System.out.println("total win amount: " + muenzen + " cents");
				} else if(slot1 == "C" && slot2 == "C" && slot3 == "C") {
					// bei 3x C 20 Cent auszahlen
					System.out.println("You win 20 cents.");
					muenzen += 20;
					System.out.println("total win amount: " + muenzen + " cents");
				} else {
					System.out.println("You win 0 cents.");
					muenzen += 0;
					System.out.println("total win amount: " + muenzen + " cents");
				}
			} else {
				//Programm abbrechen
				System.out.println("good bye!");
				break;
			}
		}	
	}
}
