
public class TestPotenzDynamisch {
	
	public static void main(String[] args){
		System.out.println("Potenzen von natürlichen Zahlen werden dynamisch berechnet.");
		System.out.println("(Objekt wird erzeugt.)");
		PotenzDynamisch objekt = new PotenzDynamisch();
		
		System.out.println("\n"+"2^10:");
		System.out.println("Iterativ: "+objekt.berechneIterativ(2,  10));
		System.out.println("Rekursiv: "+objekt.berechneRekursiv(2,  10));
		
		System.out.println("\n"+"3^0:");
		System.out.println("Iterativ: "+objekt.berechneIterativ(3,  0));
		System.out.println("Rekursiv: "+objekt.berechneRekursiv(3,  0));
	}
	
}
