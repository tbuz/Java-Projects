
public class Quadrat extends Rechteck {
	double seitenlaenge;
	//Der parametrisierte Konstruktor braucht x und y f�r die Superklasse Figur
	// Die Superklasse Rechteck erh�lt f�r laenge und breite jeweils denselben Wert:
	public Quadrat (double x, double y, double seitenlaenge) {
		super(x, y, seitenlaenge, seitenlaenge);
		this.seitenlaenge = seitenlaenge;
	}
	//toString wird �berschrieben und um folgende Aussage erg�nzt:
	public String toString() {
		return "Das Quadrat hat die Mittelpunktkoordinaten ("+
				super.getPosX()+", "+super.getPosY()+
				"), eine Seitenl�nge von "+seitenlaenge+
				" und die Fl�che "+super.berechneFlaeche()+".";	
	}

}
