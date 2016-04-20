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
		//(Hier k�nnte man nat�rlich auch eine Benutzereingabe verlangen)
		super("Wasser", 1000);
		//In diesen Konstruktor (EinwegFlasche) �bergebener Parameter wird aufgenommen:
		this.hatGruenerPunkt = hatGruenerPunkt;
	}
	
	public String toString(){
		//Hier wird die Methode toString aus der Klasse Flasche �berschrieben und wie folgt erweitert:
		//(je nachdem ob ein Gr�ner Punkt vorhanden ist oder nicht)
		if (hatGruenerPunkt){
			return super.toString()+" Sie ist eine Einwegflasche und darf als Gr�ner-Punkt-M�ll weggeworfen werden.";
		}
		else {
			return super.toString()+" Sie ist eine Einwegflasche und darf als Gr�ner-Punkt-M�ll weggeworfen werden.";
		}
	}

}
