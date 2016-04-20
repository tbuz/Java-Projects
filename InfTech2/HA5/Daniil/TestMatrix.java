public class TestMatrix {
	public static void main (String[] args){
		Integer[][] integerArray = new Integer[10][10];
		Double[][] doubleArray = new Double[10][15];

		//Arrays füllen
		//Integer Array
		for (int i=0; i<integerArray.length; i++){
			int wert = 29;
			for (int j=0; j<integerArray[i].length; j++){
				integerArray[i][j] = wert;
				wert += wert +33;
			}
		}

		//Double Array
		for (int i=0; i<doubleArray.length; i++){
			double wert = 15.5;
			for (int j=0; j<doubleArray[i].length; j++){
				doubleArray[i][j] = wert;
				wert += wert +33.72;
			}
		}

		//Matrix Objekte erstellen
		Matrix<Integer> mInt = new Matrix<Integer>(integerArray);
		Matrix<Double> mDoub = new Matrix<Double>(doubleArray);

		//Zeilen + Spalten ausgeben
		System.out.println("Integer Matrix \n Anzahl Zeilen: " +mInt.getNumberOfRows() + " Anzahl Spalten: " + mInt.getNumberOfCols());
		System.out.println("Double Matrix \n Anzahl Zeilen: " +mDoub.getNumberOfRows() + " Anzahl Spalten: " + mDoub.getNumberOfCols());
		
		//Ändern eines Werts in den Matrizen:
		mInt.set(666, 3, 4);
		System.out.println("Geänderte Variable mInt[3][4]: " + mInt.get(3,4));

		mDoub.set(666.666, 2, 10);
		System.out.println("Geänderte Variable mDoub[2][10]" + mDoub.get(2,10));


		//Diagonalelemente ausgeben
		//für mInt
		String str = "  ";
		for (int i=0; i<mInt.getNumberOfCols() && i<mInt.getNumberOfRows(); i++){
			str += mInt.get(i,i) + "   ";
		}
		System.out.println("Diagonalelemente mInt: " + str);

		//für mDoub
		str= "  "; //str bereinigen
		for (int i=0; i<mDoub.getNumberOfCols() && i<mDoub.getNumberOfRows(); i++){
			str += mDoub.get(i,i) + "   ";
		}
		System.out.println("Diagonalelemente mDoub: " + str);

	}
}