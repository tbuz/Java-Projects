
public class Kreis extends Figur {
	//Klassenattribut wird erzeugt:
	private double radius;
	//Der parametrisierte Konstruktor braucht x und y für die Superklasse Figur
	// und radius für das eigene Klassenattribut
	public Kreis (double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	//Die Fläche wird berechnet indem Pi*r^2 berechnet wird:
	public double berechneFlaeche() {
		double flaeche = Math.PI * Math.pow(radius, 2);
		return flaeche;
	}
	//toString wird überschrieben und ergänzt um die Klassenattribute von Kreis:
	public String toString() {
		return "Der Kreis hat die Mittelpunktkoordinaten ("+
				super.getPosX()+", "+super.getPosY()+
				") und einen Radius von "+radius+
				" und die Fläche "+berechneFlaeche()+".";
	}
}
