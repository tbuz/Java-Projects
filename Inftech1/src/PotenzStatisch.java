/**
 * Hausaufgabe 9+10
 * @author T24G02
 *
 */
public class PotenzStatisch {
	//Hier wird in einer einfachen for-Schleife berechnet:
	public static int berechneIterativ(int a, int n){
		//Ausnahme ist, wenn einer der Parameter negativ ist:
		if (a<0 || n<0){
			return -1;
		}
		//Im Normalfall wird die Zahl n-Mal mit sich selbst multipliziert:
		else {
			//Der Startwert ist 1:
			int ergebnis=1;
			//Nun wird n-Mal mit a Multipliziert:
			//n=1 wäre dann 1*a = a | n=0 wäre 1, da dann die Schleife nicht beginnt.
			for (int i=1; i<=n; i++){
				ergebnis *= a;
			}		
			return ergebnis; }
	}
	
	//Diese Methode ist ebenfalls statisch, auch wenn es nicht in der Aufgabe steht.
	public static int berechneRekursiv(int a, int n){
		if (a<0 || n<0){
			return -1;
		}
		if (n==0) {
			return 1;
		}
		else {
			return a*berechneRekursiv(a,n-1);
		}
	}

}
