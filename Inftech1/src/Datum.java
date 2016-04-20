/**
 * Hausaufgabe 9+10
 * @author T24G02
 *
 */
public abstract class Datum {
	//Tag Monat und Jahr sind einzelne Attribute
	private int tag;
	private int monat;
	private int jahr;
	//Der Kontruktor nimmt die Werte vom Aufrufer entgegen
	public Datum (int tag, int monat, int jahr){
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
		
		//Hier wird gepr�ft ob die Eingaben g�ltig sind:
		if (tag<1 || tag>31) {
			System.out.println("Ung�ltiger Tag: "+tag);
		}		
		if (monat<1 || monat>12) {
			System.out.println("Ung�ltiger Monat: "+monat);
		}
		if (jahr<0) {
			System.out.println("Ung�ltiges Jahr: "+jahr);
		}
	}
	
	
	//Es folgen die getter-Methoden dieser Klasse:
	//Hier werden ggf. auch die f�hrenden Nullen erg�nzt.
	public String getTT(){
		String tag_str;
		if (tag<10) {
			tag_str = "0"+tag;
		}
		//Falls keine f�hrende Null erg�nzt werden muss, wird ein leerer String erg�nzt:
		else { tag_str = ""+tag; }
		return tag_str;
	}
	public String getMM(){
		String monat_str;
		if (monat<10){
			monat_str = "0"+monat; 	}
		else { monat_str = ""+monat; }
		return monat_str;
	}
	public String getJahr(){
		String jahr_str = ""+jahr;
		return jahr_str;
	}

	//formatiere gibt einen String mit dem Datum zur�ck.
		public abstract String formatiere();
}
