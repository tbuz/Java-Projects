
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
		 * 	Distributivgesetz im Allgemeinen f�r Gleitkommazahlen?
		 * 
		 * -> Ja, diese Gesetze gelten auch im Allgemeinen auch
		 * f�r Gleitkommazahlen. Die vorliegenden Abweichungen
		 * entstehen durch Rundungsfehler, die bei Bereichs�ber-
		 * schreitungen auftreten.
		 * 
		 * 2. Warum weichen die durch Ihr Java-Programm berechneten 
		 * 	Ausdr�cke in 1a) und 1b) bzw. 2a)
		 *  und 2b) voneinander ab?
		 *  
		 *  -> Die Abweichungen kommen daher, dass in beiden F�llen
		 *  die Untergrenze der Gleitkommazahl unterschritten wird.
		 *  So werden bei zu vielen Bit die LSB ausgelassen,
		 *  also die unwichtigsten Bit. 
		 *  Bei 1a) f�llt somit nur eine 1, die 17 Stellen hinter 
		 *  dem Komma ist, weg.
		 *  Bei 2a) verliert die 1 neben der 10^20 ihre Bedeutung,
		 *  was nicht auffallen w�rde, wenn man die 10^20 nicht wieder
		 *  abz�ge.
		 *  
		 *  Man erreicht beim Rechnen mit Gleitkommazahlen schnell 
		 *  die Grenzen der Genauigkeit und sollte somit m�glichst
		 *  viel mit Ganzzahlen (siehe 1) und Zahlen �hnlicher Werte-
		 *  bereiche (siehe 2) rechnen.
		 */
		
				
	}

}
