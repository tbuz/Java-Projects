/**
 * HA2 Aufgabe 3
 * @author T24G02
 *
 */
public class Notenvergabe {
	//
	public static void main ( String[] args){
		//Ein kurzer Text für den Benutzer:
		System.out.println("Bitte geben Sie ihre Punktzahl (0-40, ganzzahlig) \n" +
				"in der Konsole ein und bestätigen Sie mit Enter.");
		
		/*die Variable x wird deklariert und mithilfe von Terminal.readInt()
		 * durch eine Benutzereingabe initialisiert.
		 */
		int x = Terminal.readInt();
		
		//Nun wird je nach Eingabe mit der bedingten Ausführung unterschieden:
		//Man darf keine zu hohe Punktzahl eingeben:
		if (x>40) { System.out.println("Man kann nicht mehr als 40 Punkte erreichen!");	}
		//Note 1:
		if (x<=40 && x>35) { System.out.println("Note: 1"); }
		//Note 2:
		if (x<=35 && x>30) { System.out.println("Note: 2"); }
		//Note 3:
		if (x<=30 && x>25) { System.out.println("Note: 3"); }
		//Note 4:
		if (x<=25 && x>20) { System.out.println("Note: 4"); }
		//Note 5:
		if (x<=20 && x>=0) { System.out.println("Note: 5"); }
		//Falls eine negative Zahl eingegeben wird:
		if (x<0) { System.out.println("Man kann keine negative Punktzahl erreichen!"); }
	}

}
