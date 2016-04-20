
public class DeutschesDatum extends Datum {

	
	public DeutschesDatum (int tag, int monat, int jahr) {
		//Konstruktor der Superklasse wird aufgerufen
		super(tag, monat, jahr);
	}
	
	public String formatiere () {
		//Die beim Konvertieren in einen String werden noch f�hrende Nullen, falls n�tig, erg�nzt:
		return "Deutsche Formatierung: "+super.getTT()+"."+super.getMM()+"."+super.getJahr(); 
	}

}
