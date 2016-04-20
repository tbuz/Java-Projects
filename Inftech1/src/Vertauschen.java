/**
 * Hausaufgabe 4 Aufgabe 4
 * @author T24G02
 *
 */
public class Vertauschen {
	public static void main(String[] args) {
		// --- Vorgaben ---
		int n = 5;
		int k = 7;
		int[] zahlen;
		zahlen = new int[n];
		for (int i=0; i<n; i++){	zahlen[i] = (i+1) * k;	}
		for (int i=0; i<n; i++){	System.out.println(zahlen[i]);	}
		//Hinzugefügte Bildschirmausgabe:
		System.out.println("\n" +
				"Nun können die Indizes getauscht werden. \n" +
				"(Da das Array 5 Elemente hat, geht der Index von 0 bis 4)");
		int tauschindex1 = Terminal.askInt("Ersten Index eingeben: ");
		int tauschindex2 = Terminal.askInt("Zweiten Index eingeben: ");
		
		// --- Eigener Code ---
		//Erstmal wird kontrolliert, ob die Eingabe richtig war:
		if (tauschindex1>=5 || tauschindex1<0 || tauschindex2>=5 || tauschindex2<0) {
			System.out.println ("Falsche Eingabe, das Programm endet nun.");
		}
		
		else {
			/*Ein Wert muss beim Vertauschen in einer dritten Variable 
			 * zwischengespeichert werden:
			 */
			int zwischenspeicher;
			/*Jetzt wird in den folgenden drei Schritten getauscht:
			 *1. Der erste Wert wird zwischengespeichert,
			 *2. Dem ersten Wert wird der zweite Wert zugewiesen,
			 *3. Der zweite Wert erhält nun den aus dem Zwischenspeicher.
			 */
			zwischenspeicher = zahlen[tauschindex1];		
			zahlen[tauschindex1] = zahlen[tauschindex2];		
			zahlen[tauschindex2] = zwischenspeicher;
			System.out.println("Fertig getauscht.");
			
			//Bildschirmausgabe:
			System.out.println("Neues Array: ");
			for (int i=0; i<n; i++){	System.out.println(zahlen[i]);	}
			//Mittelwert wird noch berechnet und ausgegeben:
			double mittelwert = (double)(zahlen[tauschindex1]+zahlen[tauschindex2])/2;
			System.out.println("Der Mittelwert der getauschten Zahlen ist "+mittelwert);
			/*Es ist kein Fehler i in jeder for-Schleife neu zu deklarieren,
			 * weil das i auch nur in der for-Schleife existiert.
			 * (Würde man außerhalb der Schleife auf das i zugreifen wollen, 
			 * käme eine Fehlermeldung.)
			 */
		}
	}
}
