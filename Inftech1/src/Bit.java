
public class Bit {
	//Klassenattribut wird deklariert:
	private boolean gesetzt;
	
	//Der Konstruktor wird ueberladen, je nachdem 
	// ob der Parameter int oder boolean ist:
	public Bit (boolean wert){
		gesetzt = wert;
	}
	//Wird ein int übergeben, so wird dies in boolean "uebersetzt":
	public Bit (int wert){
		if (wert==0) gesetzt = false; 
		else gesetzt = true; 
	}
	
	public boolean istGesetzt(){
		return gesetzt;
	}
	
	public int getValue(){
		if (gesetzt) return 1;
		else return 0;
	}
	
}
