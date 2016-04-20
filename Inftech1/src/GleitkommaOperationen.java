
public class GleitkommaOperationen {
	
	public static void main(String args[]){
		
		double a = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1; 
		System.out.println("0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1="+a);
		double b = (1+1+1+1+1+1+1+1+1+1)*0.1;
		System.out.println("1+1+1+1+1+1+1+1+1+1)*0.1="+b);
		
		System.out.println("");
		
		double c = 1+Math.pow(10, 20)+(-Math.pow(10, 20));
		System.out.println("1+10^20+(-10^20)="+c);
		double d = 1+(Math.pow(10, 20)+(-Math.pow(10, 20)));
		System.out.println("1+(10^20+(-10^20))="+d);
		
		/** Fragen zum Code:
		 * 
		 * 1. Gelten das Assoziativgesetz der Addition und das 
		 * 	Distributivgesetz im Allgemeinen für Gleitkommazahlen?
		 * 
		 * -> Ja, diese Gesetze gelten auch im Allgemeinen auch
		 * für Gleitkommazahlen. Die vorliegenden Abweichungen
		 * entstehen durch Rundungsfehler, die bei Bereichsüber-
		 * schreitungen auftreten.
		 * 
		 * 2. Warum weichen die durch Ihr Java-Programm berechneten 
		 * 	Ausdrücke in 1a) und 1b) bzw. 2a)
		 *  und 2b) voneinander ab?
		 *  
		 *  -> Die Abweichungen kommen daher, dass in beiden Fällen
		 *  die Untergrenze der Gleitkommazahl unterschritten wird.
		 *  So werden bei zu vielen Bit die LSB ausgelassen,
		 *  also die unwichtigsten Bit. 
		 *  Bei 1a) fällt somit nur eine 1, die 17 Stellen hinter 
		 *  dem Komma ist, weg.
		 *  Bei 2a) verliert die 1 neben der 10^20 ihre Bedeutung,
		 *  was nicht auffallen würde, wenn man die 10^20 nicht wieder
		 *  abzöge.
		 *  
		 *  Man erreicht beim Rechnen mit Gleitkommazahlen schnell 
		 *  die Grenzen der Genauigkeit und sollte somit möglichst
		 *  viel mit Ganzzahlen (siehe 1) und Zahlen ähnlicher Werte-
		 *  bereiche (siehe 2) rechnen.
		 */
		
				
	}

}
