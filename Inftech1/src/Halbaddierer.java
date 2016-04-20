
public class Halbaddierer {
	
	//Klassenattribut:
	private Bit uebertrag;
	
	public Bit add(Bit x, Bit y){
		//Es gibt einen �bertrag, wenn beide Bits 1 sind:
		if (x.istGesetzt() && y.istGesetzt()) uebertrag=new Bit(1);
		else uebertrag = new Bit(0);
		//Die Summe der Addition l�sst sich mit XOR berechnen:
		return Gatter.XOR(x, y);
	}
	//gibt den Uebertrag zur�ck:
	public Bit getUebertrag(){
		return uebertrag;		
	}

}
