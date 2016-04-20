/**
 * Hausaufgabe 4 Aufgabe 2
 * @author T24G02
 *
 */
public class MinMaxSum {
	public static void main (String[] args){
		//Das Array wird erstellt (Deklariert und Initialisiert):
		int [] values = {12, 9, 13, 27, 58, 33, 25, 14, 40, 70, 89, 73};
		
		/*min, max und sum werden mit Startwerten versehen, das muss vor der folgenden for-Schleife gemacht werden.
		 * max und min erhalten das erste Element des Arrays
		 * sum erhält den Anfangswert 0.
		*/
		int max = values[0];
		int min = values[0];
		int sum = 0;
		
		/*In der for-Schleife wird nun jede Stelle des Arrays durchgegangen (Index 0 bis 11).
		 * Ist der nächste Wert im Array größer als das aktuelle max, so wird dieser max zugewiesen.
		 * Ist der nächste Wert im Array kleiner als das aktuelle min, so wird dieser min zugewiesen.
		 * sum addiert jeden neuen Wert zu seinem aktuellen und rechnet somit alle Werte des Arrays zusammen.
		 */
		for (int i=0; i<values.length; i++) {
			if (max<values[i])  max=values[i]; 
			if (min>values[i])  min=values[i];
			sum = sum + values[i];
			}
		
		//Schließlich wird alles auf der Konsole ausgegeben.
		System.out.println("Die größte Zahl im Array ist: "+max);
		System.out.println("Die kleinste Zahl im Array ist: "+min);
		System.out.println("Die Summe der Zahlen im Array ist: "+sum);
		
	}

}
