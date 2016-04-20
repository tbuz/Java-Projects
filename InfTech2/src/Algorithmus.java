
public class Algorithmus {
	
	public static void InsertionSort(Comparable[] f){
	
		int aufrufe = 0;
		int vertauschungen = 0;
		int zaehler = 0;
		
		for (int i=1; i<f.length; i++){
			zaehler = i;
			while (zaehler>0){
				aufrufe++;
				if (f[zaehler].compareTo(f[zaehler-1])==1){
					//swap:
					Comparable tmp = f[zaehler];
					f[zaehler] = f[zaehler-1];
					f[zaehler-1] = tmp;
					vertauschungen++;	 //Zaehler fuer Vertauschungen ++
				}
				zaehler--;
			}
		}
		
		System.out.println("Anzahl compareTo-Aufrufe: "+aufrufe);
		System.out.println("Anzahl der Vertauschungen: "+vertauschungen);
		
		
	}

}
