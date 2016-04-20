/**
 * Hausaufgabe 9+10
 * @author T24G02
 *
 */
public class TestPotenzStatisch {
	
	public static void main(String[] args){
		System.out.println("Potenzen von natürlichen Zahlen werden statisch berechnet.");
		
		System.out.println("\n"+"2^10:");
		System.out.println("Iterativ: "+PotenzStatisch.berechneIterativ(2,  10));
		System.out.println("Rekursiv: "+PotenzStatisch.berechneRekursiv(2,  10));
		System.out.println("Mit Math.pow: "+Math.pow(2, 10));
		
		System.out.println("\n"+"3^0:");
		System.out.println("Iterativ: "+PotenzStatisch.berechneIterativ(3,  0));
		System.out.println("Rekursiv: "+PotenzStatisch.berechneRekursiv(3,  0));
		System.out.println("Mit Math.pow: "+Math.pow(3, 0));
	}
	

}
