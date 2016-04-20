
public class Temperatur {
	//Diese Klasse braucht nicht unbedingt eine Main, 
	// da sie vollständig von der main der Klasse
	// TestTemperatur gesteuert wird.
	
	public static double celsiusZuFahrenheit(double celsius){
		//Fahrenheit wird genau wie in der Vorgabe berechnet:
		double fahrenheit = celsius*9.0/5.0 + 32;
		return fahrenheit;
	}
	
	public static void ausgabe(double celsius, double fahrenheit){
		//celsius und fahrenheit werden genau wie in der Vorgabe auf der Konsole ausgegeben:
		System.out.println("Die Temperatur "+celsius+" Grad Celsius entspricht "+fahrenheit+" Grad Fahrenheit.");
			
	}

}
