//Klasse
public class Doubles {
	//Klassenattribute werden initialisiert
	private double[] werte;
	private double kleinstes;
	
	//Parametrisierter Konstruktor weist Parameter-Elemente dem Attribut zu
	public Doubles (double[] p_werte){
		werte = new double[p_werte.length];
		for(int i = 0; i < werte.length; i++){
			werte[i] = p_werte[i];
		}
	}
	//Methode kleinere gibt kleineren Betrag zurueck:
	public double kleinere (double x, double y){
		//Betraege werden verglichen. 
		//Falls beide denselben Betrag haben, wird x zurueckgegeben.
		if (Math.abs(x) > Math.abs(y)) return y;
		else return x;
	}
	
	//setKleinstes sucht im Array mit einer for-Schleife nach dem kleinsten Element
	// und vergleicht dabei das aktuelle kleinste mit dem naechsten Wert:
	//(Als Startwert fuer kleinstes wird werte[0] gesetzt)
	public void setKleinstes(){
		kleinstes = werte[0];
		for (int i = 1; i < werte.length; i++){
			kleinstes = kleinere(kleinstes, werte[i]);
		}
	}
	//Die Ausgabe ruft sich so lange selbst auf,
	// bis die Abbruchbedingung (index=1) erreicht ist:
	public void ausgabeRekursiv(int Index){
		if (Index > 1){
			System.out.print(werte[Index - 1] + " ");
			Index--;
			ausgabeRekursiv(Index);
		}
		else
			System.out.println(werte[Index - 1]);
	}

}
