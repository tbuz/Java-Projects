
public class TestDoubles {
	
	public static void main(String[] args){
	//Neues Doubles-Array TestArray wird initialisiert:
		Doubles[] TestArray = new Doubles[20];
		//TestArray wird in einer for-Schleife mit double-Arrays gefuellt:
		for(int i = 0; i < 20; i++){
			//Dabei wird jedem Element i ein 4-elementiges double-Array zugewiesen:
			//(Das laeuft ueber einen temporaeren Speicher)
			double[] temp = {(0.4 + i * 0.3),( -0.2 - i * 0.2),( 14.1 - i),(-11. + i * 1.1)};
			TestArray[i] = new Doubles(temp);
			TestArray[i].ausgabeRekursiv(4);
		}
	}
}
