/**
 * @author T24G02
 **/
//Eine Klasse wird definiert
public class PolynomAuswertung {
	
	//Der Konstruktor wird definiert
	public static void main (String[] args){
		//Variablen werden mit dem Wert 0 initialisiert 
		double x = 0.0;
		double y = 0.0;
		
		//x wird der Wert 4.0 zugewiesen
		x = 4.0;
		
		/*y erhält das Ergebnis des Polynoms, 
		 * welches hier berechnet wird:	*/
		y = 0.5*(Math.pow(x, 2))+x-1.5;
		
		/*Ergebnis wird als String ausgegeben
		 * Dabei werden beide Variablen in String
		 * umgewandelt und dem String ergebnis hinzugefügt.
		 * Somit muss man in Z.10 nur den zugewiesenen x-Wert
		 * ändern um auch andere Funktionswerte zu sehen: */		 
		String ergebnis = "y("+x+") = "+y;
		
		//Das Ergebnis wird auf dem Bildschirm ausgegeben:
		System.out.println(ergebnis);
	} //Ende des Konstruktors

} //Ende der Klasse
