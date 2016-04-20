
public class Volladdierer {
	//Klassenattribute:
	private Halbaddierer ha1;
	private Halbaddierer ha2;
	private Bit uebertrag;
	
	//Im Konstruktor werden die Attribute als Objekte erzeugt:
	public Volladdierer(){
		ha1 = new Halbaddierer();
		ha2 = new Halbaddierer();
	}
	
	public Bit add(Bit x, Bit y, Bit c_in){
		//Das Ergebnis s wird in ha2 ausgerechnet, wenn man folgende Parameter uebergibt:
		Bit s = ha2.add(ha1.add(x, y), c_in);
		//Für den Uebertrag werden die Uebertrage aus ha1 und ha2 verodert: 
		uebertrag = new Bit(Gatter.OR(ha1.getUebertrag(), ha2.getUebertrag()).istGesetzt());
		//Das Ergebnis s wird zurückgegeben:
		return s;	
	}
	//gibt den Uebertrag zurück
	public Bit getUebertrag(){
		return uebertrag;
	}
	

}
