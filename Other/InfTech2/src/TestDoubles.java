
public class TestDoubles {
	
	public static void main(String[] args){
		//Neues Doubles-Array wird initialisiert:
		Doubles[] werte = new Doubles[20];
		//werte wird in einer for-Schleife mit double-Arrays gefüllt:
		for (int i=0; i<=19; i++){
			double[] tmp = {(0.4+i*0.3), (-0.2-i*0.2), (14.1-i), (-11.+i*1.1)};
			werte[i]= new Doubles(tmp);
			//Jedes double-Array wird auf der Konsole ausgegeben:
			werte[i].ausgabeRekursiv(3);
		}
	}

}
