
public class BinaereSuche {
	//Klassenattribut
	private Artikel[] array;

	//param. Konstruktor initialisiert array, 
	// indem es Laenge und Inhalt des Parameters arr uebernimmt:
	public BinaereSuche (Artikel[] arr){
		array = new Artikel[arr.length];
		for (int i=0; i<arr.length; i++){
			array[i] = arr[i];
		}
	}
	
	//Such-Methode gibt index des gesuchten Objekts zur�ck:
	public int suche(Artikel suchObjekt){
		int zaehler = (int) Math.log(array.length)+1;
		int index = (array.length-1)/2;
		//Wenn das suchObjekt nicht im Array ist,
		// wirkt zaehler als Indikator daf�r, dass das 
		// gesamte Array nun durchsucht wurde.
		//(zaehler ist die maximale Anzahl an Schritten,
		//	die die bin�re Suche braucht: O(log n)+1 .
		// Plus 1, da die Zahl durch das ganzzahlige Teilen sonst
		// etwas zu klein ist, um den letzten Schritt zu erm�glichen.)
		while (zaehler>=0){
			if (suchObjekt.compareTo(array[index])==0){
				return index;
			}
			if (suchObjekt.compareTo(array[index])<0){
				index = index/2;
			}
			if (suchObjekt.compareTo(array[index])>0){
				index = (index+array.length)/2;
			}
			zaehler--;
		}		
		return -1;
	}

}
