import java.util.Iterator;

public class Matrix<T> implements Iterable<T>{
	
	private T[][] matrix;	
	private String direction;
	
	public Matrix(T[][] matrix){
		this.matrix = matrix;
		direction = "fr";
	}
	
	public void setDirection(String direction){
		this.direction = direction;  
	}
	
	private class fcIterator implements Iterator<T>{
		private int i;
		private int j;
		public fcIterator(){
			i=0; j=0;
		}
		@Override
		public boolean hasNext() {	// prueft, ob noch Elemente vorhanden sind
			//das Ende ist erreicht wenn jeweils i und j die maximale Laenge erreicht haben
			if (i==matrix.length && j+1==matrix[i-1].length)	return false;
			//sonst nicht
			else return true;
		}
		@Override
		public T next() {	//gibt das naechste Element zurueck
			if (i==matrix.length) {
				i=0; j++;
			}
			return matrix[i++][j];
		}
		@Override
		public void remove() {	}	// tut nichts...
	}

	private class bcIterator implements Iterator<T>{
		private int i;
		private int j;
		public bcIterator(){
			i = matrix.length; j = matrix[i-1].length-1;
		}
		@Override
		public boolean hasNext() {	// prueft, ob noch Elemente vorhanden sind
			//hier ist das Ende erreicht, wenn man beim ersten Element angelangt ist
			if (i==0 && j==0) return false;
			else return true;
		}
		@Override
		public T next() {	//gibt das naechste Element zurueck
			if (i==0){
				j--;
				i=matrix.length;
			}
			return matrix[--i][j];
		}
		@Override
		public void remove() {		// tut nichts...
		}
	}

	private class frIterator implements Iterator<T>{
		private int i;
		private int j;
		public frIterator(){
			i = 0; j = 0;
		}
		@Override
		public boolean hasNext() {	// prueft, ob noch Elemente vorhanden sind
			//analog zum frIterator:
			if (i+1==matrix.length && j==matrix[i].length)	return false;
			else return true;
		}
		@Override
		public T next() {	//gibt das naechste Element zurueck
			//hier wird nun nicht jede Zeile durchgegangen, sondern jede Spalte
			if (j==matrix[i].length) {
				i++; j=0;
			}
			return matrix[i][j++];
		}
		@Override
		public void remove() {		// tut nichts...
		}
	}

	private class brIterator implements Iterator<T>{
		private int i;
		private int j;
		public brIterator(){
			i = matrix.length-1; j = matrix[i].length;
		}
		@Override
		public boolean hasNext() {	// prueft, ob noch Elemente vorhanden sind
			//hier ist das Ende erreicht, wenn man beim ersten Element angelangt ist
			if (i==0 && j==0) return false;
			else return true;
		}
		@Override
		public T next() {	//gibt das naechste Element zurueck
			if (j==0) {
				i--; j=matrix[i].length;
			}
			return matrix[i][--j];
		}
		@Override
		public void remove() {		// tut nichts...
		}
	}

	@Override
	public Iterator<T> iterator() {
		if (direction == "fr"){
			return new frIterator();
		}
		if (direction == "br"){
			return new brIterator();
		}
		if (direction == "fc"){
			return new fcIterator();
		}
		if (direction == "bc"){
			return new bcIterator();
		}
		else {
			System.out.println("Direction nicht korrekt angegeben!");
			return null;
		}
	}
	
	public String toString(){
		//gibt die Matrix in Matrixform zurueck
		String ergebnis = "";
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[i].length; j++){
				ergebnis += matrix[i][j]+", ";
			}
			ergebnis += "\n";
		}
		return ergebnis;
	}

}
