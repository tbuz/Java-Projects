
public class Doubles {
	//Klassenattribute werden initialisiert
	private double[] werte;
	private double kleinstes;
	
	//Parametrisierter Konstruktor weist Parameter-Elemente dem Attribut zu
	public Doubles(double[] werte_param){		
		werte = new  double[werte_param.length];
		for (int i=0; i< werte.length; i++){
			werte[i] = werte_param[i];
		}
	}
	//Methode kleinere gibt kleineren Betrag zurück:
	public double kleinere(double x, double y){
		//Beträge werden verglichen. 
		//Falls beide denselben Betrag haben, wird x zurückgegeben.
		if (Math.abs(x)<=Math.abs(y)){
			return x;
		}
		else {
			return y;
		}
	}
	//setKleinstes sucht im Array mit einer for-Schleife nach dem kleinsten Element
	// und vergleicht dabei das aktuelle kleinste mit dem nächsten Wert:
	public void setKleinstes(){
		kleinstes = werte[0];
		for (int i=1; i<=werte.length-1; i++){
			kleinstes = kleinere(kleinstes, werte[i]);
		}
	}
	
	//Die Ausgabe erfolgt solange rekursiv, bis die Endbedingung (index=0) erreich ist:
	public void ausgabeRekursiv (int index){
		if (index>0){
			System.out.println(werte[index]);
			ausgabeRekursiv(index-1);
		}
		if (index==0){
			System.out.println((werte[0]));
		}
	}

}
