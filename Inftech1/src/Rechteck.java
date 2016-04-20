
public class Rechteck extends Figur {
	//Klassenattribute werden erzeugt:
	private double laenge;
	private double breite;
	//Der parametrisierte Konstruktor braucht x und y f�r die Superklasse Figur
	// und laenge und breite f�r die eigenen Klassenattribute
	public Rechteck (double x, double y, double laenge, double breite){
		//Als erstes wird der Konstruktor der Superklasse aufgerufen:
		super (x, y);
		//laenge und breite werden zugewiesen:
		this.laenge=laenge;
		this.breite=breite;
	}
	//einfache Getter-Methode:
	public double getLaenge() {
		return laenge;
	}
	//Die Fl�che wird berechnet und zur�ckgegeben:
	public double berechneFlaeche() {
		double flaeche = laenge * breite;
		return flaeche;
	}
	//toString wird �berschrieben und erg�nzt um die Klassenattribute von Rechteck:
	public String toString() {
		return "Das Rechteck hat die Mittelpunktkoordinaten ("+
				super.getPosX()+", "+super.getPosY()+
				") und ist "+laenge+" lang und "+breite+" breit."+
				" und die Fl�che "+berechneFlaeche()+".";	
	}
}
