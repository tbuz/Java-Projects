public class TestMittelwertNormierung {
	public static void main(String[] args) {
		// vorgegebene double−Zahlen
		double[] meineZahlen = {6.5, 7.0, 6., 5.5, 6.5, 7.5};
		double x1 = 10.5;
		double x2 = 9.5;

		// Ausgabe
		System.out.println("Zahlen vor Normierung:");
		MittelwertNormierung.gibAus(x1, x2);
		MittelwertNormierung.gibAus(meineZahlen);

		// berechne Mittelwert von x1 und x2
		double mittelwertEinzeln;
		mittelwertEinzeln = MittelwertNormierung.mittelwert(x1, x2);
		// normiere die Zahlen x1 und x2
		MittelwertNormierung.normiere(x1, x2, mittelwertEinzeln);

		// => berechne Mittelwert aller Elemente des Arrays:
		// (mithilfe der aufgerufenen Methode)
		double mittelwertVomArray;
		mittelwertVomArray = MittelwertNormierung.mittelwert(meineZahlen);
		//normiert alle Elemente des Arrays:
		MittelwertNormierung.normiere(meineZahlen, mittelwertVomArray);


		// Ausgabe
		System.out.println(); // Leerzeile
		System.out.println("Zahlen nach Normierung:");
		MittelwertNormierung.gibAus(x1, x2);
		MittelwertNormierung.gibAus(meineZahlen);
	}
	
	/* Weitere Fragen:
	 * 1. Wie ist die Eindeutigkeit von Methoden bei gleichem Namen sichergestellt (hier gibAus, mittelwert
	 * und normiere je zweimal)? Wie nennt man das erneute Deﬁnieren einer Methode mit dem gleichen
	 * Namen?
	 * 
	 * -> Die Eindeutigkeit ist sichergestellt dadurch, mit welchen Parametern die jeweilige Funktion
	 * aufgerufen wird. So hat man hier zwei Möglichkeiten: Entweder man übergibt zwei einzelne Doubles
	 * oder ein Double-Array beim Aufrufen.
	 * Diesen Vorgang nennt man Überladen einer Methode.
	 * 
	 * 
	 * 2. Warum funktioniert die Normierung nur für den Array und nicht für die double-Variablen, die
	 * ihre ursprünglichen Werte beibehalten haben nach Aufruf der Methoden normiere, während der
	 * Array verändert wurde?
	 * 
	 * -> (Das Array wird zwar genau so wie die Doubles in den Speicher geschrieben, im Gegensatz zu diesen 
	 * ist der zugewiesene Speicher für ein Array nicht vorbestimmt. Die Größe wird erst beim Erstellen
	 * des Arrays festgelegt.)
	 * Beim Bearbeiten und Verändern dieser neu erstellten Variablen zeigen sich Unterschiede.
	 * Eine einfache Variable wie ein Double oder Integer wird nur in dem Scope, in dem sie
	 * deklariert ist, auch verändert. 
	 * Wird dieser Wert in eine andere Methode als Parameter übergeben, so wird dort mit dem Wert 
	 * eine neue Variable erstellt und dann diese Variable bearbeitet und nicht mehr die 
	 * ursprüngliche in der vorherigen Methode.
	 * 
	 * Das ist der offensichtliche Unterschied zum Array. Ein Array wird einmal erstellt und 
	 * auch wenn es als Parameter an andere Methoden weitergegeben wird, wird immer der gleiche
	 * Speichereintrag des Arrays bearbeitet, es ist also über das Scope hinweg gültig. 
	 * 
	 */
	
	
}