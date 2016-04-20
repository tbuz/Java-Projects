
public class CDTrack {
	//Klassenvariablen werden deklariert:
	private int laengeInSekunden;
	private String kuenstler;
	private String titel;
	
	//Zwei Konstruktoren, je nachdem ob der K�nstler angegeben wird oder nicht:
	public CDTrack (int laengeInSekunden, String titel){
		this.laengeInSekunden = laengeInSekunden;
		this.titel = titel;
		kuenstler = "Various Artists";
	}
	public CDTrack (int laengeInSekunden, String titel, String kuenstler){
		this.laengeInSekunden = laengeInSekunden;
		this.titel = titel;
		this.kuenstler = kuenstler;
	}
	
	//Get-Methoden f�r alle drei Attribute:
	public int getLaenge(){
		return laengeInSekunden;
	}
	public String getKuenstler(){
		return kuenstler;
	}
	public String getTitel(){
		return titel;
	}

}
