
public class Matrix<T> {
	//Attribut wird deklariert:
	private T[][] m;
	//Konstruktor initialisiert m:
	public Matrix(T[][] m){
		this.m = m;
	}
	
	public int getNumberOfRows(){
		//Die Zeilen werden in einer for-Schleife gezaehlt:
		int rows = 0;
		//Dabei hat m[i][j] genau i Zeilen,
		//also reicht es alle i kleiner m.length zu berechnen:
		for (int i=0; i<m.length; i++){
			rows++;
		}
		return rows;	
	}
	public int getNumberOfCols() {
		//Die Spalten sind in jeder Zeile gleich lang,
		// deshalb werden hier analog zu der oberen Methode
		// alle Spalten i der Zeile m[0][i] gezaehlt:
		int cols = 0;
		for (int i=0; i<m[0].length; i++){
			cols++;
		}
		return cols;
	}
	
	//Gibt Element m[i][j] zurueck:
	public T get(int i, int j){
		return m[i][j];
	}
	//Ueberschreibt Element m[i][j]
	public void set(T val, int i, int j){
		m[i][j] = val;
	}

}
