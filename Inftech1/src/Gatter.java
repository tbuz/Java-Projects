
public class Gatter {
	//Es werden zwei Klassenattribute als Hilfsmittel gesetzt:
	private static Bit wahr = new Bit(true);
	private static Bit falsch = new Bit(false);
	
	//Die Gatter AND/OR/XOR arbeiten mit den logischen Operatoren:
	static Bit AND(Bit x, Bit y){
		if (x.istGesetzt() && y.istGesetzt()) return wahr;
		else return falsch;
	}
	static Bit OR(Bit x, Bit y){
		if (x.istGesetzt()||y.istGesetzt()) return wahr;
		else return falsch;
	}
	static Bit XOR(Bit x, Bit y){
		if (x.istGesetzt()&&y.istGesetzt() || !x.istGesetzt()&&!y.istGesetzt()) return falsch;
		else return wahr;
	}

}
