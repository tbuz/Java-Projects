/**
 * Hausaufgabe 8
 * Aufgabe 3
 * @author T24G02
 *
 */
public class EinwegFlasche extends Flasche {
	//Klassenvariable wird deklariert:
	private boolean hatGruenerPunkt;
	
	public EinwegFlasche(boolean hatGruenerPunkt){
		//Hier wird der Konstruktor der Super-Klasse (Flasche) mit zwei Parametern aufgerufen.
		//(Hier könnte man natürlich auch eine Benutzereingabe verlangen)
		super("Wasser", 1000);
		//In diesen Konstruktor (EinwegFlasche) übergebener Parameter wird aufgenommen:
		this.hatGruenerPunkt = hatGruenerPunkt;
	}
	
	public String toString(){
		//Hier wird die Methode toString aus der Klasse Flasche überschrieben und wie folgt erweitert:
		//(je nachdem ob ein Grüner Punkt vorhanden ist oder nicht)
		if (hatGruenerPunkt){
			return super.toString()+" Sie ist eine Einwegflasche und darf als Grüner-Punkt-Müll weggeworfen werden.";
		}
		else {
			return super.toString()+" Sie ist eine Einwegflasche und darf als Grüner-Punkt-Müll weggeworfen werden.";
		}
	}

}
