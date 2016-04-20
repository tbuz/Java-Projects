public class BinaereSuche {
	//Attribut
	private Artikel[] array;

	//Konstruktor, der 1. Array-Länge und 2. jedes Array Element übergibt
	public BinaereSuche(Artikel[] array){
		this.array = new Artikel[array.length];
		for (int i=0; i<array.length; i++){
			this.array[i]=array[i];
		}
	}

	//Suche mit linker und rechter Grenze des Arrays. Mitte ist der aktuelle Index 
	//und gleichzeitig die Mitte des zu untersuchenden Teil-Arrays
	public int suche(Artikel suchObjekt){

		int links = 0;
		int rechts = array.length-1;
		int mitte = (array.length-1)/2;
		int mitteAlt; //Zwischenspeicher für den mittleren Index

		while (links<rechts){

			//Wenn Objekte Gleich sind, gib 0 zurück
			if (suchObjekt.compareTo(array[mitte])==0)
				return mitte;

			//wenn das suchObjekt größer als Mitte, untersuche rechte Hälfte des Arrays
			//passe linke Grenze an.
			if (suchObjekt.compareTo(array[mitte])>0){
				mitteAlt=mitte;
				mitte = (mitte+rechts+1)/2;
				links=mitteAlt;
			}

			//wenn das suchObjekt kleiner als Mitte, untersuche linke Hälfte des Arrays
			//passe rechte Grenze an.
			if (suchObjekt.compareTo(array[mitte])<0){
				mitteAlt = mitte;
				mitte = mitte/2;
				rechts = mitteAlt;
			}
		}

		//Falls suchObjekt mit keinem Objekt im Array übereinstimmt: Fehler
		return -1;
	}
}