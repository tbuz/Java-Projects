
public class VierBitAddierer {
	//Klassenattribute
	private Volladdierer va1;
	private Volladdierer va2;
	private Volladdierer va3;
	private Volladdierer va4;
	
	//Im Konstruktor werden die Attribute als Objekte erzeugt:
	public VierBitAddierer(){
		va1 = new Volladdierer();
		va2 = new Volladdierer();
		va3 = new Volladdierer();
		va4 = new Volladdierer();
	}
	
	public Bit[] add(Bit[] bits1, Bit[] bits2){
		//Der erste Uebertrag und das Ergebnis werden im voraus erzeugt:
		//(Das Array ergebnis hat dabei 5 Stellen, da bei der Addition
		// von zwei 4Bit-Zahlen auch eine 5Bit-Zahl herauskommen kann!)
		Bit[] ergebnis = new Bit[5];
		Bit c_in = new Bit(0);
		
		//ergebnis wird mit den Einzelergebnissen der Volladdierer beschrieben:
		ergebnis[0] = va1.add(bits1[0], bits2[0], c_in);
		ergebnis[1] = va2.add(bits1[1], bits2[1], va1.getUebertrag());
		ergebnis[2] = va3.add(bits1[2],  bits2[2], va2.getUebertrag());
		ergebnis[3] = va4.add(bits2[3],  bits2[3], va3.getUebertrag());
		ergebnis[4] = va4.getUebertrag();
		
		//ergebnis wird zurückgegeben:
		return ergebnis;
	}
}
