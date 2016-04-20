public class Test {

    public static void main(String[] args) {

		// Einlesen der Studenten
		String file = "studenten.dat";
		Student[] f = Parser.readStudenten(file);
	
	     // InsertionSort Aufruf:
		Algorithmus.InsertionSort(f);
		
		for (int i=0; i<f.length; i++){
			System.out.println(f[i].toString());
		}
		
    }
}
