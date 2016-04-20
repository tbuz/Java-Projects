/**
 * Hausaufgabe 8
 * Aufgabe 2
 * @author T24G02
 *
 */
public class DispoKonto extends Konto {
	
	private int kreditrahmen;
	
	public DispoKonto (){
		kreditrahmen = 10000;
		//Es wird gezeigt, dass ein Dispokonto er�ffnet wurde:
		System.out.println("Dispokonto mit Dispo (100�) er�ffnet.");
	}
	
	public void aendereKreditrahmen(int aenderung){
		//Der Kreditrahmen wird auf den neuen Wert ge�ndert:
		System.out.println("Kreditrahmen wird ge�ndert auf: "+aenderung+" Cent");
		kreditrahmen = aenderung;
	}
	
	public void zeigeKreditrahmen(){
		System.out.println("Dispokredit: "+kreditrahmen+" Cent");
	}
	
	//Die gesonderte Stellung beim Abheben vom DispoKonto wird hier realisiert:
	public void dispo_abheben(int ausgang){
		//dem �blichen Betrag, der abgehoben werden soll, wird noch der kreditrahmen als zweiter Parameter hinzugef�gt:
		abheben(ausgang, kreditrahmen);
	}
	

}
