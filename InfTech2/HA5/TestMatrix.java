
public class TestMatrix {
	
	public static void main(String[] args){
		//Matrizen werden deklariert:
		Integer[][] arr1 = new Integer[10][5];
		Double[][] arr2 = new Double[10][15];
		
		//Und initialisiert:
		//	arr1 wird gefuellt:
		int h=1150;
		for (int i=0; i<arr1.length; i++){
			for (int j=0; j<arr1[i].length; j++){
				arr1[i][j] = h%300;
				h = h*44/38;
			}
		}
		
		//	arr2 wird gefuellt:
		double k = 23543.54;
		for (int i=0; i<arr2.length; i++){
			for (int j=0; j<arr2[i].length; j++){
				arr2[i][j] = (k*200*(j-1))%(i*j+2786);
				k = k*0.876;
			}
		}
		//Matrix-Objekte werden erstellt:
		Matrix<Integer> matr1 = new Matrix<Integer>(arr1);
		Matrix<Double> matr2 = new Matrix<Double>(arr2);
		
		//Zeilen- und Spaltenzahl werden ausgegeben:
		System.out.println("Matrix 1: \n Zeilen: "+matr1.getNumberOfRows()+"\n Spalten: "+matr1.getNumberOfCols());
		System.out.println("Matrix 2: \n Zeilen: "+matr2.getNumberOfRows()+"\n Spalten: "+matr2.getNumberOfCols());
		
		//Jeweils ein Element wird geaendert und ausgegeben:
		matr1.set(2340, 5, 4);
		System.out.println("Geänderte Variable arr1[5][4]: "+matr1.get(5, 4));
		matr2.set(43.32, 9,  14);
		System.out.println("Geänderte Variable arr2[9][14]: "+matr2.get(9, 14));
		
		//Die Elemente der Diagonale werden ausgegeben:
		System.out.println("Diagonalelemente aus Matrix 1: ");
		//Sobald man an der letzten Zeile oder Spalte ankommt, ist die Diagonale zuende:
		for (int i=0; i<matr1.getNumberOfRows() && i<matr1.getNumberOfCols(); i++){
			//Da in der Diagonale i=j ist, reicht eine for-Schleife:
			System.out.println(matr1.get(i, i)+" ");
		}
		//Analog für matr2:
		System.out.println("Diagonalelemente aus Matrix 2: ");
		for (int i=0; i<matr2.getNumberOfRows() && i<matr2.getNumberOfCols(); i++){
			System.out.println(matr2.get(i, i)+" ");
		}
	}
}
