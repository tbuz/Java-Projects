
public class Kreis extends Figur {
	//Klassenattribut wird erzeugt:
	private double radius;
	//Der parametrisierte Konstruktor braucht x und y f�r die Superklasse Figur
	// und radius f�r das eigene Klassenattribut
	public Kreis (double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	//Die Fl�che wird berechnet indem Pi*r^2 berechnet wird:
	public double berechneFlaeche() {
		double flaeche = Math.PI * Math.pow(radius, 2);
		return flaeche;
	}
	//toString wird �berschrieben und erg�nzt um die Klassenattribute von Kreis:
	public String toString() {
		return "Der Kreis hat die Mittelpunktkoordinaten ("+
				super.getPosX()+", "+super.getPosY()+
				") und einen Radius von "+radius+
				" und die Fl�che "+berechneFlaeche()+".";
	}
}
