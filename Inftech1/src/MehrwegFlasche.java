/**
 * Hausaufgabe 8
 * Aufgabe 3
 * @author T24G02
 *
 */
public class MehrwegFlasche extends Flasche {
	//Klassenvariable wird deklariert:
	private int pfand; //in Cent

	public MehrwegFlasche(int pfand){
		//Hier wird der Konstruktor der Super-Klasse (Flasche) mit zwei Parametern aufgerufen.
		//(Hier k�nnte man nat�rlich auch eine Benutzereingabe verlangen)
		super("Cola", 500);
		//In diesen Konstruktor (MehrwegFlasche) �bergebener Parameter wird aufgenommen:
		this.pfand = pfand;
	}
	
	public String toString(){
		//Hier wird die Methode toString aus der Klasse Flasche �berschrieben und wie folgt erweitert:
		//(dabei wird der Pfand angegeben)
		 return super.toString()+" Sie hat einen Pfand von "+pfand+" Cent und sollte daher nicht einfach in den M�ll geworfen werden.";
	}
	
}
