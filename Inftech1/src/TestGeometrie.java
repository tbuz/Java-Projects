
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
		
		//Gibt für jedes Element des Arrays (0-5) die toString-Ausgabe aus:
		System.out.println("Gebe jedes Element des Arrays aus: ");
		for (int i=0; i<figuren.length; i++) {
			System.out.print("Index "+i+": ");
			System.out.println(figuren[i].toString());
		}
		
		System.out.println("Größter Flächeninhalt wird berechnet.");
		//Zunächst wird der Flächeninhalt der ersten Figur als größter Wert gesetzt und gemeinsam der Index gespeichert:
		double maxFlaeche = ((Kreis)figuren[0]).berechneFlaeche();
		int maxIndex = 0;
		
		for (int i=0; i<figuren.length; i++) {
			//Ein Zwischenspeicher für die Flaechenwerte wird angelegt,
			//Hier wird der Flächeninhalt der jeweils nächsten Figur zugewiesen:
			double tempFlaeche;
			//Je nachdem ob die Figur eine Instanz von Kreis oder Rechteck ist,
			// wird der passende Cast-Operator verwendet um tempFlaeche zuzuweisen:
			if (figuren[i] instanceof Kreis) {
				tempFlaeche = ((Kreis)figuren[i]).berechneFlaeche();
			}
			if (figuren[i] instanceof Rechteck) {
				tempFlaeche = ((Rechteck)figuren[i]).berechneFlaeche();				
			}
			//Für den Fall dass die Figur nur eine Figur, also ein Punkt, ist (Fläche=0):
			else {
				tempFlaeche = 0;
			}
			//Hier wird nun verglichen ob die Fläche der nächsten Figur (tempFlaeche) größer ist.
			//Wenn ja, wird tempFlaeche zum neuen größten Wert, sonst bleibt maxFlaeche:
			if (tempFlaeche > maxFlaeche) {
				maxFlaeche = tempFlaeche;
				maxIndex = i;
			}
		}
		
		System.out.println("Die "+(maxIndex+1)+". Figur (Index: "+maxIndex+") hat den größten Flächeninhalt ("+maxFlaeche+").");
		
		//Verwendet die Methode verschieben der Superklasse Figur:
		System.out.println("Jedes Element wird um (10,20) verschoben:");
		for  (int i=0; i<figuren.length; i++) {
			figuren[i].verschieben(10, 20);
		}
		
		//Gibt noch einmal für jedes Element des Arrays (0-5) die toString-Ausgabe aus:
		System.out.println("Gebe erneut jedes Element des Arrays aus: ");
		for  (int i=0; i<figuren.length; i++) {
			System.out.print("Index "+i+": ");
			System.out.println(figuren[i].toString());
		}
		
	}

}
