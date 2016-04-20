public class MittelwertNormierung {

	// gibt die Werte von zwei double−Variablen aus
	public static void gibAus(double z1, double z2) {
		System.out.println("Die einzelnen double−Zahlen sind "+
				z1+" und "+z2);
	}

	// gibt Indizes und Werte der Elemente eines Array aus
	public static void gibAus(double[] zahlen) {
		System.out.println("Gebe den double−Array der Laenge "+
				zahlen.length+" aus:");
		for (int i=0; i<zahlen.length; i++)
			System.out.println("Das Element mit Index "+i+
					" ist "+zahlen[i]);
		}
	
	// gibt das arithmetische Mittel von z1 und z2 zurueck
	public static double mittelwert(double z1, double z2) {
		return 0.5*(z1+z2);
		}
		
	// Die folgende Methode geht in einer for-Schleife das Array durch
	// Dabei werden alle einzelnen Werte zu einer Summe addiert
	// Schließlich wird die Summe durch die Anzahl der Elemente im Array geteilt
	//	und zurückgegeben:
		public static double mittelwert(double[] zahlen) {
			double summe = 0;
			for (int i=0; i<zahlen.length; i++){
				summe += zahlen[i];
			}
			return summe/zahlen.length;
		}
		
		// zieht von z1 und z2 die Zahl diff ab,
		// wichtiger Hinweis: funktioniert nicht so wie im Fall von
		// einem Array als Parameter − warum?
		
		//=> das liegt offensichtlich an den Parametern, die verlangt werden:
		// hier wird nach 3 einzelnen Doubles gefragt und auch im 
		// folgenden Code nur mit diesen gerechnet. Ein Array braucht einen
		// anderen Parameter und muss auch mit mehr als nur 2 Elementen umgehen können
		// (siehe unten)
		public static void normiere(double z1, double z2, double diff) {
			z1 -= diff;
			z2 -= diff;
		}
		
		// Hier wird jedes Element des Arrays in einer for-Schleife durchgegangen
		// und von jedem einzeln das diff abgezogen:
		public static void normiere(double[] zahlen, double diff) {
			for (int i=0; i<zahlen.length; i++){
				zahlen[i] -= diff;
			}
			
		}
}