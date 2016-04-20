
public class Student {
	
	private int matrikelnr;
	private Datum geburtstag;
	private Datum studienbeginn;
	
	/* Mit den setter-Methoden kann man auch ohne Konstruktor die Attribute zuweisen.
	 * (Um die Verwendung von this zu vermeiden sind die Parameter abgekürzt)
	 */
	public void setMatrikelnr(int matnr){
		matrikelnr = matnr;
	}
	/**
	public void setGeburtstag(int tag, int monat, int jahr){
		geburtstag = new Datum(tag, monat, jahr);
	}
	public void setStudienbeginn(int tag, int monat, int jahr){
		studienbeginn = new Datum(tag, monat, jahr);
	}
	
	//Hier folgen die getter-Methoden der Attribute
	public int getMatrikelnr(){
		return matrikelnr;
	}
	public Datum getGeburtstag(){
		return geburtstag;
	}
	public Datum getStudienbeginn(){
		return studienbeginn;
	}
	*/

}
