
public class Mergesort {
	//das_array wird das zu sortierende Array uebernehmen:
	private static Matrix[] das_array;
	
	//k wird als Zwischenspeicher-Array angelegt:
    private static Matrix[] kopie;
    
    // von aussen zugreifbare Sortier-Methode
    public static void sort(Matrix[] matArr) {
    	das_array = matArr;
    	kopie = new Matrix[matArr.length];
        teile(0, matArr.length-1);
    }
    
    //part teilt das Array so lange in zwei Teile, 
    // bis nur noch einzelne Elemente vorhanden sind
    // und "merged" diese dann.
    //Dies passiert rekursiv:
    public static void teile(int start, int ende){
    	//Wenn start=ende, dann hat man ein-elementige Arrays,
    	// die man nicht mehr teilen kann. Dann ist die Rekursionstiefe erreicht.
    	if (start<ende){
    		//bestimme die Mitte des Arrays:
    		int mitte = start+(ende-start)/2;
    		//lasse die zwei Teilarrays nochmal teilen:
    		teile(start, mitte);
    		teile(mitte+1, ende);
    		//Dann wird zusammengebastelt,
    		// da die Rekursionstiefe nun abgearbeitet wird.
    		// Jedes Teilarray, das hier ankommt, ist bereits in sich sortiert:
    		merge(start, mitte, ende);
    	}
    }
    
    
    public static void merge (int start, int mitte, int ende) {
    	//Die zu bearbeitenden Teilarrays werden in kopie kopiert,
    	// aus der wir die Werte sortiert in das_array speichern:
      	for (int i=start; i<=ende; i++){
      		kopie[i]=das_array[i];
      	}
      	
      	int i=start;
      	int h=start;
      	int j=mitte+1;
      	
      	while (i<=mitte && j<=ende){
      		//Wird der kleinere der aktuellen Arraywerte aus kopie zu das_array hinzugef�gt:
      		if (kopie[i].compareTo(kopie[j])<=0){
				das_array[h] = kopie[i];
				h++;
				i++;
				//(Nach dem Hinzuf�gen folgt logischerweise ein Post-Inkrement)
	      	}
      		else {
      			das_array[h] = kopie[j];
      			h++;
      			j++;
      		}
      	}
      	//Wenn das erste Array schon fertig ist, 
      	// wird nur noch das zweite Teil-Array in das_array gespeichert...
      	if (i==mitte && j<ende){
      		das_array[h] = kopie[j++];
      		h++;
      	//..oder im anderen Fall das erste Teil-Array:
      	}
      	if (j==ende && i<mitte){
      		das_array[h] = kopie[i++];
      		h++;
      		}
  	
      
    }
     
}