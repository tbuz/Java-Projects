
public class AmerikanischesDatum extends Datum {
	
	public AmerikanischesDatum (int tag, int monat, int jahr) {
		//Konstruktor der Superklasse wird aufgerufen
		super(tag, monat, jahr);
	}
	
	public String formatiere () {
		//Beim Konvertieren in einen String werden die ggf. mit Nullen ergänzten Strings verwendet:
		return "Amerikanisches Format: "+super.getMM()+"/"+super.getTT()+"/"+super.getJahr();
	}

}
