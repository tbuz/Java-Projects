/**
 * HA3 Aufgabe 2
 * @author T24G02
 *
 */


public class Betrag {
	// main Methode enthält die Betragsfunktion und verwendet Terminal.readDouble() für die Eingabe
	public static void main ( String[] args){
		/*die Variable x wird deklariert und mithilfe von Terminal.readDouble()
		 * durch eine Benutzereingabe initialisiert.
		 * Zur Verschönerung ein kurzer Text im voraus:
		 */
		System.out.println("Bitte geben Sie in der Konsole eine Zahl ein \n" +
				"und bestätigen Sie mit Enter.");
		System.out.println("(Bitte Punkt statt Komma und \n" +
				"nach dem Vorzeichen kein Leerzeichen)");
		System.out.print("x= ");
		double x = Terminal.readDouble();
		//die Variable betrag wird Deklariert
		double betrag;
		//die Zuweisung von betrag erfolgt in einer bedingten Ausführung:
		//1. Fall: wenn x größer gleich 0 ist:
		if (x>=0) {	betrag = x;	}
		//Sonst (bzw. 2. Fall): (x muss kleiner als 0 sein)
		else { betrag = -x;	}
		//Ausgabe auf der Konsole:
		System.out.println("Der Betrag ist: "+betrag);		
		
	}
	
}
