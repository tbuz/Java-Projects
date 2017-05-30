public class Matrix<T> {
	private T[][] m;

	//parametrisierter Konstruktor
	public Matrix(T[][] m){
		this.m=m;
	}

	//Ausgabe Zeilen
	public int getNumberOfRows(){
		int rows=0;
		for (int i=0; i<m.length;i++){
			rows++;
		}
		return rows;
	}

	//Ausgabe Spalten
	public int getNumberOfCols(){
		int cols=0;

		for (int j=0; j<m[0].length;j++){
		cols++;
		}
		return cols;
	}

	//Rückgabe eines Werts
	public T get(int i, int j){
		return m[i][j];
	}

	//Wert setzen/ändern
	public void set(T val, int i, int j){
		m[i][j]=val;
	}
}