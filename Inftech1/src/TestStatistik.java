/**
 * Hausaufgabe 9+10
 * @author T24G02
 *
 */
public class TestStatistik {
	
	public static void main(String[] args){
		//Das Array enthält die vorgegebenen 11 Elemente und wird gleichzeitig deklariert und initialisiert
		System.out.println("Erzeuge Array und weise Werte zu.");
		/*Die folgende Zuweisung könnte auch in einer for-Schleife erfolgen,
		 * kann aber, wie man auf dem Aufgabenblatt sieht, schnell zu Fehlern führen.
		 * Außerdem ist die gewählte schreibweise bei einer Länge von 11 Elementen noch erträglich.
		 */
		double[] zahlen = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
		
		//Das Objekt wird erzeugt und der Variable zugewiesen:
		ArrayStatistik objekt = new ArrayStatistik(zahlen);
		Statistik variable = objekt;
		
		//Die Konsolenausgabe folgt:
		System.out.println("Gebe toString()-Rückgabe aus:");
		System.out.println(variable.toString());
		System.out.println("Der Mittelwert ist: "+variable.mittelwert());
		System.out.println("Die Varianz beträgt: "+variable.varianz());
		/*Kommentar: Hier könnte man auch OBJEKT.toString/mittelwert/varianz schreiben,
		 * dies würde die gleiche Konsolenausgabe bewirken, da variable = objekt (Zeile 15).
		 */
	}
	

}
