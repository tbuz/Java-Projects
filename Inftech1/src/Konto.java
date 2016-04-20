/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class Konto {
	
	private int kontostand;
	
	public Konto(){
		//Kontostand wird bei der Objekterzeugung/Er�ffnung auf 0 (Cent) gesetzt:
		kontostand = 0;
	}
	
	//eine getter-Methode damit der Kontostand eingesehen werden kann: (ben�tigt f�r die Subklassen)
	public int getKontostand(){
		return kontostand;
	}
	
	public void einzahlen(int eingang){
		//Der Kontostand wird um den eingegangenen Betrag erh�ht: 
		//(Im Prinzip eine eingeschr�nkte Setter-Methode, damit man nur den einzuzahlenden Betrag eingeben muss)
		kontostand += eingang;
		
		//Nach jedem Eingang wird der neue Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void abheben(int ausgang){
		//Der Kontostand wird um den gew�hlten Betrag verringert.
		//Daf�r muss aber genug Geld auf dem Konto sein:
		//(Ebenfalls eine eingeschr�nkte Setter-Methode. Man kann logischerweise nur einen Geldbetrag gr��er 0 abheben)
		if (kontostand >= ausgang && ausgang>0){
			kontostand -= ausgang;
		}
		//Sonst kommt die Fehlermeldung:
		else {	System.out.println("Auszahlung nicht m�glich!"); }
		//Nach jedem versuchten Abheben wird der (neue) Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void abheben(int ausgang, int kreditrahmen){
		//Die Methode abheben wird �berladen f�r den Fall, dass man von einem Dispokonto darauf zugreift.
		//Der Unterschied findet sich in dem zus�tzlichen Parameter und dem folgenden Vorgang:
		//Der Betrag den man abheben kann ist um den Kreditrahmen erweitert worden: 
		if ((kontostand+kreditrahmen) >= ausgang && ausgang>0){
			kontostand -= ausgang;	}
		else {	System.out.println("Auszahlung nicht m�glich!"); }
		//Nach jedem versuchten Abheben wird der (neue) Kontostand ausgegeben:
		zeigeKontostand();
	}
	
	public void zeigeKontostand(){
		System.out.println("Der aktuelle Kontostand betr�gt: "+kontostand+" Cent");
	}

}
