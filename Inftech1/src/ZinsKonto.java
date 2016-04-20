/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class ZinsKonto extends Konto {
	
	private int zinssatz; //Die Prozentzahl wird als Integer gespeichert, dabei erhält 1% den Wert 100 oder 2,75% den Wert 275.
							// das vereinfacht die Zinsberechnung und addition zum Kontostand
	private int zinsen;
	
	public ZinsKonto(){
		zinssatz = 100; //Wird auf 1% gesetzt (entspricht hier der Zahl 100)
		System.out.println("ZinsKonto eröffnet.");
	}
	
	public void zeigeZinssatz(){
		//Für die Ausgabe wird der Cast-Operator verwendet, damit die Stellen hinter dem Komma erscheinen
		System.out.println("Aktueller Zinssatz: "+((double)zinssatz/100)+"%");
	}
	
	public void verzinsen(){
		System.out.println("Verzinsen");
		zinsen = (getKontostand() * zinssatz / 10000);
		einzahlen(zinsen);
	}
	
	public void aendereZinssatz(int zinssatz_neu){
		if (zinssatz_neu<=0){
			System.out.println("Der Zinssatz kann nicht negativ sein!");
		}
		else {
			zinssatz = zinssatz_neu;
		}
		zeigeZinssatz();
	}
	
	

	
}
