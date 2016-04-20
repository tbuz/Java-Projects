/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class KontoTest {
	
	public static void main(String[] args){
		//------------------Konto
		Konto konto1 = new Konto();
		//Es wird gezeigt, dass ein Konto eröffnet wurde:
		System.out.println("Konto eröffnet.");
		konto1.zeigeKontostand();
		System.out.println("Zahle 200,04€ ein.");
		konto1.einzahlen(20004);
		System.out.println("Zahle 400,07€ aus.");
		konto1.abheben(40007);
		System.out.println("Zahle 20,00€ aus.");
		konto1.abheben(2000);
		System.out.println();

		//-------------------DispoKonto
		DispoKonto konto2 = new DispoKonto();
		konto2.zeigeKontostand();
		konto2.zeigeKreditrahmen();
		System.out.println("Zahle 100,24€ ein.");
		konto2.einzahlen(10024);
		System.out.println("Zahle 150,00€ aus.");
		konto2.dispo_abheben(15000);
		System.out.println("Zahle 100,00€ aus.");
		konto2.dispo_abheben(10000);
		konto2.aendereKreditrahmen(20000);
		System.out.println("Zahle 20,00€ aus.");
		konto2.dispo_abheben(10000);
		System.out.println("Zahle 200,00€ ein.");
		konto2.einzahlen(20000);
		System.out.println();
		
		//-------------------JugendKonto
		JugendKonto konto3 = new JugendKonto(15);
		konto3.zeigeLimit();
		konto3.zeigeKontostand();
		konto3.geburtstag();
		System.out.println("Zahle 1200,03€ ein.");
		konto3.einzahlen(120003);
		System.out.println("Zahle 400,93€ aus.");
		konto3.jugend_abheben(40093);
		konto3.aendereLimit(50000);
		System.out.println("Zahle 400,93€ aus.");
		konto3.jugend_abheben(40093);
		System.out.println();
		
		//------------------ZinsKonto
		ZinsKonto konto4 = new ZinsKonto();
		konto4.zeigeZinssatz();
		konto4.zeigeKontostand();
		System.out.println("Zahle 100,00€ ein.");
		konto4.einzahlen(10000);
		konto4.verzinsen();
		System.out.println("Zahle 20,93€ aus.");
		konto4.abheben(2093);
		System.out.println("Ändere Zinssatz auf 3.5%");
		konto4.aendereZinssatz(350);
		konto4.verzinsen();		
		
	}

}
