/**
 * Hausaufgabe 4 Aufgabe 3
 * @author T24G02
 *
 */
public class Addierer {
	
	public static void main (String[] args) {
		//Ein kurzer Text zur Information
		System.out.println("Dies ist ein einfacher Addierer. Es können beliebig viele Zahlen addiert werden. \n" +
				"Die Bedingung ist, dass die Zahlen positiv sein müssen. Wird eine negative Zahl eingegeben, so endet das Programm.");
		System.out.println("Bitte geben Sie nun die erste Zahl ein: ");
		//Die Variable eingabe speichert die Benutzereingabe 
		int eingabe = Terminal.readInt();
		//Die Variable summe wird mit dem Anfangswert 0 deklariert und initialisiert
		int summe = 0;
		
		//Solange die eingabe positiv ist, läuft die while-Schleife
		while (eingabe>=0) {
			//Hier wird zu der vorhandenen Summe die neue Eingabe hinzugefügt (sofern sie positiv ist)
			summe = summe + eingabe;
			//Folgende Textausgabe fordert zur nächsten Eingabe auf:
			System.out.println("Bitte geben Sie die nächste Zahl ein. (Eine negative Zahl beendet die Addition)");
			//Die nächste Eingabe wird in der Variablen eingabe gespeichert:
			eingabe = Terminal.readInt();
		}
		//Sobald die while-Bedingung nicht mehr erfüllt ist, also eine negative Zahl eingegeben wurde, kommt folgender Text:
		System.out.println("Die Summe der eingegebenen positiven Zahlen beträgt "+summe+".");
	}

}
