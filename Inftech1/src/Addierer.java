/**
 * Hausaufgabe 4 Aufgabe 3
 * @author T24G02
 *
 */
public class Addierer {
	
	public static void main (String[] args) {
		//Ein kurzer Text zur Information
		System.out.println("Dies ist ein einfacher Addierer. Es k�nnen beliebig viele Zahlen addiert werden. \n" +
				"Die Bedingung ist, dass die Zahlen positiv sein m�ssen. Wird eine negative Zahl eingegeben, so endet das Programm.");
		System.out.println("Bitte geben Sie nun die erste Zahl ein: ");
		//Die Variable eingabe speichert die Benutzereingabe 
		int eingabe = Terminal.readInt();
		//Die Variable summe wird mit dem Anfangswert 0 deklariert und initialisiert
		int summe = 0;
		
		//Solange die eingabe positiv ist, l�uft die while-Schleife
		while (eingabe>=0) {
			//Hier wird zu der vorhandenen Summe die neue Eingabe hinzugef�gt (sofern sie positiv ist)
			summe = summe + eingabe;
			//Folgende Textausgabe fordert zur n�chsten Eingabe auf:
			System.out.println("Bitte geben Sie die n�chste Zahl ein. (Eine negative Zahl beendet die Addition)");
			//Die n�chste Eingabe wird in der Variablen eingabe gespeichert:
			eingabe = Terminal.readInt();
		}
		//Sobald die while-Bedingung nicht mehr erf�llt ist, also eine negative Zahl eingegeben wurde, kommt folgender Text:
		System.out.println("Die Summe der eingegebenen positiven Zahlen betr�gt "+summe+".");
	}

}
