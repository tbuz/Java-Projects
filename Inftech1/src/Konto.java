/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class Konto {
	
	private int kontostand;
	
	public Konto(){
		//Kontostand wird bei der Objekterzeugung/Eröffnung auf 0 (Cent) gesetzt:
		kontostand = 0;
	}
	
	//eine getter-Methode damit der Kontostand eingesehen werden kann: (benötigt für die Subklassen)
	public int getKontostand(){
		return kontostand;
	}
	
	public void einzahlen(int eingang){
		//Der Kontostand wird um den eingegangenen Betrag erhöht: 
		//(Im Prinzip eine eingeschränkte Setter-Methode, damit man nur den einzuzahlenden Betrag eingeben muss)
		kontostand += eingang;
		
		//Nach jedem Eingang wird der neue Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void abheben(int ausgang){
		//Der Kontostand wird um den gewählten Betrag verringert.
		//Dafür muss aber genug Geld auf dem Konto sein:
		//(Ebenfalls eine eingeschränkte Setter-Methode. Man kann logischerweise nur einen Geldbetrag größer 0 abheben)
		if (kontostand >= ausgang && ausgang>0){
			kontostand -= ausgang;
		}
		//Sonst kommt die Fehlermeldung:
		else {	System.out.println("Auszahlung nicht möglich!"); }
		//Nach jedem versuchten Abheben wird der (neue) Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void abheben(int ausgang, int kreditrahmen){
		//Die Methode abheben wird überladen für den Fall, dass man von einem Dispokonto darauf zugreift.
		//Der Unterschied findet sich in dem zusätzlichen Parameter und dem folgenden Vorgang:
		//Der Betrag den man abheben kann ist um den Kreditrahmen erweitert worden: 
		if ((kontostand+kreditrahmen) >= ausgang && ausgang>0){
			kontostand -= ausgang;	}
		else {	System.out.println("Auszahlung nicht möglich!"); }
		//Nach jedem versuchten Abheben wird der (neue) Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void zeigeKontostand(){
		System.out.println("Der aktuelle Kontostand beträgt: "+kontostand+" Cent");
	}

}
