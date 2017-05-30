
public class Matrix implements Comparable {
	//Attribute werden deklariert...
	double[][] matrix;
	
	public Matrix (double[][] matrix){
		//...und initialisiert (im parametrisierten Konstruktor)
		this.matrix = matrix;
	}
	//Die Berechnung der Summe wurde in eine zusätzliche Methode ausgelagert:
	public double SummeBerechnen(){
		double summe = 0; 
		//zaehlt alle Elemente zusammen:
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				summe += matrix[i][j];
			}
		}
		//und gibt die Summe zurück:
		return summe;
	}

	public String toString(){
		String rueckgabe = "";
		//Man benötigt 2 for-Schleifen, da 2 Dimensionen
		for (int i=0; i<matrix.length; i++){
			//Seien i die Zeilen...
			rueckgabe += " ";
			//..dann wird das Array zeilenweise durchgegangen..
			for (int j=0; j<matrix[i].length; j++){
				//..und jedes Element j der Zeile zum rueckgabe-String addiert.
				rueckgabe += matrix[i][j]+" ";
				//Nebenbei werden die Elemente auch addiert:
			}
			//Absatz nach jeder Zeile:
			rueckgabe += "\n";
		}
		//Schließlich noch die Summe der Elemente:
		rueckgabe += "Summe der Elemente: "+SummeBerechnen()+"\n";
		return rueckgabe;
	}
	
	public int compareTo(Matrix andereMatrix){
		return (int) (this.SummeBerechnen()-andereMatrix.SummeBerechnen());
	}
}
