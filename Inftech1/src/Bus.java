
public class Bus {
	//Die Klassenattribute start ziel und die gef.Stationen werden als private-Attribute deklariert, 
	//damit von au�en nicht direkt auf sie zugegriffen werden kann.
	private String start;
	private String ziel;
	private int gefahreneStationen;
	
	public Bus (String start, String ziel){
		this.start = start;
		this.ziel = ziel;
		gefahreneStationen = 0;
	}
	
	//Die folgenden getter-Methoden geben das jeweilige Attribut zur�ck:
	public String getStart() {
		return start;		
	}	
	public String getZiel() {
		return ziel;
	}	
	public int getGefahreneStationen() {
		return gefahreneStationen;
	}
	
	//fahren erh�ht die gefahrenenStationen um einen �bergebenen Parameter n	
	public void fahren(int n) {
		gefahreneStationen += n;
	}
	
	//print gibt alles auf der Konsole aus:
	public void print() {
		System.out.println("Der Bus f�hrt von "+start+" bis "+ziel+" und hat bisher "+gefahreneStationen+" zur�ckgelegt.");
	}

}
