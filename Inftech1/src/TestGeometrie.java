
public class TestGeometrie {
	
	public static void main(String[] args) {
		//Ein Array mit 5 Elementen wird erstellt:
		Figur[] figuren = new Figur[6];
		//Die 5 Figuren werden erzeugt (alle Figuren sind auch vom Typ Figur,
		// da sie alle Instanzen von Figur sind)
		figuren[0] = new Kreis(5.0, 3.5, 3);
		figuren[1] = new Kreis(7.5, 6.0, 4);
		figuren[2] = new Rechteck(6, 8, 4, 6);
		figuren[3] = new Rechteck(5.5, 6.4, 7.6, 14.4);
		figuren[4] = new Quadrat(7.1, 2.4, 5.6);
		figuren[5] = new Figur(6.5, 1.4);
		
		//Gibt f�r jedes Element des Arrays (0-5) die toString-Ausgabe aus:
		System.out.println("Gebe jedes Element des Arrays aus: ");
		for (int i=0; i<figuren.length; i++) {
			System.out.print("Index "+i+": ");
			System.out.println(figuren[i].toString());
		}
		
		System.out.println("Gr��ter Fl�cheninhalt wird berechnet.");
		//Zun�chst wird der Fl�cheninhalt der ersten Figur als gr��ter Wert gesetzt und gemeinsam der Index gespeichert:
		double maxFlaeche = ((Kreis)figuren[0]).berechneFlaeche();
		int maxIndex = 0;
		
		for (int i=0; i<figuren.length; i++) {
			//Ein Zwischenspeicher f�r die Flaechenwerte wird angelegt,
			//Hier wird der Fl�cheninhalt der jeweils n�chsten Figur zugewiesen:
			double tempFlaeche;
			//Je nachdem ob die Figur eine Instanz von Kreis oder Rechteck ist,
			// wird der passende Cast-Operator verwendet um tempFlaeche zuzuweisen:
			if (figuren[i] instanceof Kreis) {
				tempFlaeche = ((Kreis)figuren[i]).berechneFlaeche();
			}
			if (figuren[i] instanceof Rechteck) {
				tempFlaeche = ((Rechteck)figuren[i]).berechneFlaeche();				
			}
			//F�r den Fall dass die Figur nur eine Figur, also ein Punkt, ist (Fl�che=0):
			else {
				tempFlaeche = 0;
			}
			//Hier wird nun verglichen ob die Fl�che der n�chsten Figur (tempFlaeche) gr��er ist.
			//Wenn ja, wird tempFlaeche zum neuen gr��ten Wert, sonst bleibt maxFlaeche:
			if (tempFlaeche > maxFlaeche) {
				maxFlaeche = tempFlaeche;
				maxIndex = i;
			}
		}
		
		System.out.println("Die "+(maxIndex+1)+". Figur (Index: "+maxIndex+") hat den gr��ten Fl�cheninhalt ("+maxFlaeche+").");
		
		//Verwendet die Methode verschieben der Superklasse Figur:
		System.out.println("Jedes Element wird um (10,20) verschoben:");
		for  (int i=0; i<figuren.length; i++) {
			figuren[i].verschieben(10, 20);
		}
		
		//Gibt noch einmal f�r jedes Element des Arrays (0-5) die toString-Ausgabe aus:
		System.out.println("Gebe erneut jedes Element des Arrays aus: ");
		for  (int i=0; i<figuren.length; i++) {
			System.out.print("Index "+i+": ");
			System.out.println(figuren[i].toString());
		}
		
	}

}
