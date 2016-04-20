
public class Quadrat extends Rechteck {
	double seitenlaenge;
	//Der parametrisierte Konstruktor braucht x und y für die Superklasse Figur
	// Die Superklasse Rechteck erhält für laenge und breite jeweils denselben Wert:
	public Quadrat (double x, double y, double seitenlaenge) {
		super(x, y, seitenlaenge, seitenlaenge);
		this.seitenlaenge = seitenlaenge;
	}
	//toString wird überschrieben und um folgende Aussage ergänzt:
	public String toString() {
		return "Das Quadrat hat die Mittelpunktkoordinaten ("+
				super.getPosX()+", "+super.getPosY()+
				"), eine Seitenlänge von "+seitenlaenge+
				" und die Fläche "+super.berechneFlaeche()+".";	
	}

}
