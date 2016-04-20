/**
 * Hausaufgabe 8
 * Aufgabe 3
 * @author T24G02
 *
 */
public class Flasche {
	//Klassenvariablen werden deklariert:
	private String inhalt;
	private int volumen;
	
	public Flasche(String inhalt, int volumen){
		//Hier werden den Klassenvariablen die übergebenen Parameter zugewiesen: 
		this.inhalt = inhalt;
		this.volumen = volumen;
	}
	//Diese Methode gibt die Klassenvariablen in einem String verpackt aus:
	public String toString() {
		return "Diese Flasche beinhaltet "+inhalt+" und hat das Volumen "+volumen+"ml.";
	}
}
