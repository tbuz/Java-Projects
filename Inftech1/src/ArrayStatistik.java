/**
 * Hausaufgabe 9+10
 * @author T24G02
 *
 */
public class ArrayStatistik implements Statistik {
	
	private double[] zahlen;
	
	public ArrayStatistik(double[] zahlen) {
		this.zahlen = zahlen;
	}
	
	public double mittelwert() {
		//summe z�hlt alle Werte des Arrays in einer for-Schleife zusammen
		double summe = 0;
		for (int i=0; i<=zahlen.length-1; i++){
			summe += zahlen[i];
		}
		//Der Mittelwert ist die Summe aller Elemente geteilt durch deren Anzahl
		return (summe/zahlen.length); 
	}

	public double varianz() {
		//summe hat hier eine �hnliche Funktion, nur werden hier die (y-M)^2 zusammengez�hlt:
		double summe = 0;
		for (int i=0; i<zahlen.length; i++){
			//zur Berechnung der Potenz wird Math.pow verwendet
			summe += Math.pow(zahlen[i]-mittelwert(), 2);
		}
		//Hier wird nun ebenfalls die berechnete Summe durch die Anzahl der Elemente geteilt:
		return summe/zahlen.length;
	}
	//Hier wird der String in einer for-Schleife erstellt und dann zur�ckgegeben:
	public String toString(){
		String ausgabe = "Zahlen ("+zahlen.length+"): ";
		for (int i=0; i<zahlen.length; i++){
			ausgabe += zahlen[i]+" ";
		}
		return ausgabe; 
	}

}
