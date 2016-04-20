/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class JugendKonto extends Konto {
	
	private int alter;
	private int limit;
	
	public JugendKonto (int alter){
		//Bei der Objekterstellung wird geprüft, ob das Alter unter 18 ist:
		if (alter>0 && alter<18){
			this.alter=alter;
			limit = 5000;
			System.out.println("JugendKonto eröffnet.");
			System.out.println("Alter des Kontoinhabers: "+alter);
		}
		else { 
			//Wenn das Alter nicht passt, gibt es eine Fehlermeldung, das "Alter" wird dann auf den
			// Wert 18 gesetzt und die folgenden Methoden werden dann nicht mehr funktionieren (siehe unten)
			System.out.println("Das JugendKonto gibt es nur für Minderjährige!"); 
			this.alter=18;
		}
	}
	
	public void geburtstag(){
		//Das Alter kann geändert werden, wenn der Inhaber Geburtstag hat. Dabei wird es um 1 erhöht:
		alter++;
		System.out.println("Kontoinhaber hat Geburtstag.");
	}
	
	//In jeder der folgenden Methoden wird vor der Erfüllung der Aufgabe geprüft, ob das Alter des Inhabers passt:
	//Das Alter wird angezeigt:
	public void zeigeAlter(){
		System.out.println("Das Alter des Inhabers ist: "+alter);
		if (alter>=18){
			System.out.println("Der Inhaber ist zu alt für das JugendKonto!");
		}
	}
	//Hier kann man Geld abheben. Dafür muss der Betrag im Limit liegen:
	public void jugend_abheben(int ausgang){
		if (alter<18 && alter>0){
			System.out.println("Zahle "+ausgang+" Cent aus.");
			if (ausgang<=limit){ abheben(ausgang); }
			//Fehlermeldung, wenn das Limit überschritten wird:
			else { 
				System.out.println("Auszahlung nicht möglich"); 
				zeigeKontostand(); }
		}
		else { System.out.println("Auf das Konto kann nicht mehr zugegriffen werden, da der Inhaber zu alt ist!"); }
	}
	//Hier kann das Limit angezeigt werden:
	public void zeigeLimit(){
		if (alter<18 && alter>0){ 
			System.out.println("Aktuelles Limit: "+limit+" Cent");
		} else { System.out.println("Auf das Konto kann nicht mehr zugegriffen werden, da der Inhaber zu alt ist!"); }
	}
	//Hier wird das Limit geändert:
	public void aendereLimit(int limit_neu){
		if (alter<18 && alter>0){
			System.out.println("Ändere Limit auf "+limit_neu+" Cent.");
			limit = limit_neu;
			zeigeLimit();
		}
		else { System.out.println("Auf das Konto kann nicht mehr zugegriffen werden, da der Inhaber zu alt ist!"); }
	}
	

}
