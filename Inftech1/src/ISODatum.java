
public class ISODatum extends Datum {
	
	public ISODatum (int tag, int monat, int jahr) {
		//Konstruktor der Superklasse wird aufgerufen
		super(tag, monat, jahr);
	}
	
	public String formatiere () {
		//Die beim Konvertieren in einen String werden noch führende Nullen, falls nötig, ergänzt:
		return "ISO Formatierung: "+super.getJahr()+"-"+super.getMM()+"-"+super.getTT()+".";
		}

}
