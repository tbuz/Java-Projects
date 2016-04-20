/**
 * Hausaufgabe 8
 * Aufgabe 3
 * @author T24G02
 *
 */
public class FlaschenTest {
	public static void main(String[] args){
		
		Flasche fl;
		boolean istMehrweg = Terminal.askBoolean("Falls eine MehrwegFlasche erzeugt werden soll, bitte true eingeben, ansonsten wird EinwegFlasche erzeugt: ");
		//Eingabe wird gepr�ft:
		if (istMehrweg){
			System.out.println("Es wird eine MehrwegFlasche erzeugt.");
			//MehrwegFlasche wird erzeugt mit dem Pfand 25 (Cent):
			//(Hier k�nnte man auch eine Benutzereingabe verlangen)
			fl = new MehrwegFlasche(25);
		}
		else {
			System.out.println("Es wird eine EinwegFlasche erzeugt.");
			//EinwegFlasche wird erzeugt mit Gr�nem Punkt:
			//(Hier k�nnte man auch eine Benutzereingabe verlangen)
			fl = new EinwegFlasche(true);
		}
		
		//Die toString Methode wird aufgerufen und gibt je nach vorheriger Wahl eine spezifische Ausgabe:
		System.out.println(fl.toString());
		//Die Instanzen werden einzeln gepr�ft:
		System.out.println("Variable fl ist Instanz von Flasche: " + Boolean.toString(fl instanceof Flasche) + ", von MehrwegFlasche: " + Boolean.toString(fl instanceof MehrwegFlasche) + ", von EinwegFlasche: " + Boolean.toString(fl instanceof EinwegFlasche));
		
		
	}

}
