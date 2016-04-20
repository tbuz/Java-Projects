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
		//Bei der Objekterstellung wird gepr�ft, ob das Alter unter 18 ist:
		if (alter>0 && alter<18){
			this.alter=alter;
			limit = 5000;
			System.out.println("JugendKonto er�ffnet.");
			System.out.println("Alter des Kontoinhabers: "+alter);
		}
		else { 
			//Wenn das Alter nicht passt, gibt es eine Fehlermeldung, das "Alter" wird dann auf den
			// Wert 18 gesetzt und die folgenden Methoden werden dann nicht mehr funktionieren (siehe unten)
			System.out.println("Das JugendKonto gibt es nur f�r Minderj�hrige!"); 
			this.alter=18;
		}
	}
	
	public void geburtstag(){
		//Das Alter kann ge�ndert werden, wenn der Inhaber Geburtstag hat. Dabei wird es um 1 erh�ht:
		alter++;
		System.out.println("Kontoinhaber hat Geburtstag.");
	}
	
	//In jeder der folgenden Methoden wird vor der Erf�llung der Aufgabe gepr�ft, ob das Alter des Inhabers passt:
	//Das Alter wird angezeigt:
	public void zeigeAlter(){
		System.out.println("Das Alter des Inhabers ist: "+alter);
		if (alter>=18){
			System.out.println("Der Inhaber ist zu alt f�r das JugendKonto!");
		}
	}
	//Hier kann man Geld abheben. Daf�r muss der Betrag im Limit liegen:
	public void jugend_abheben(int ausgang){
		if (alter<18 && alter>0){
			System.out.println("Zahle "+ausgang+" Cent aus.");
			if (ausgang<=limit){ abheben(ausgang); }
			//Fehlermeldung, wenn das Limit �berschritten wird:
			else { 
				System.out.println("Auszahlung nicht m�glich"); 
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
	//Hier wird das Limit ge�ndert:
	public void aendereLimit(int limit_neu){
		if (alter<18 && alter>0){
			System.out.println("�ndere Limit auf "+limit_neu+" Cent.");
			limit = limit_neu;
			zeigeLimit();
		}
		else { System.out.println("Auf das Konto kann nicht mehr zugegriffen werden, da der Inhaber zu alt ist!"); }
	}
	

}
