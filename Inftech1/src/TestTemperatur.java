
public class TestTemperatur {
	//Vorgaben:
	public static void main(String[] args){
		double celsius1 = 40.1;
		double celsius2 = 17.;
		double celsius3 = -5.4;
	
		//Methoden der Klasse Temperatur werden verwendet:
		//Erst wird der fahrenheit-Wert berechnet:
		double fahrenheit1 = Temperatur.celsiusZuFahrenheit(celsius1);
		double fahrenheit2 = Temperatur.celsiusZuFahrenheit(celsius2);
		double fahrenheit3 = Temperatur.celsiusZuFahrenheit(celsius3);
		
		//Dann wird auf dem Bildschirm ausgegeben:
		Temperatur.ausgabe(celsius1, fahrenheit1);
		Temperatur.ausgabe(celsius2, fahrenheit2);
		Temperatur.ausgabe(celsius3, fahrenheit3);
		
		
	}

}
