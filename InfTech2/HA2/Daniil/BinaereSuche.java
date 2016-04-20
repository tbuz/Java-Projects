public class BinaereSuche {
	private Artikel[] array;

	public BinaereSuche(Artikel[] array){
		this.array = new Artikel[array.length];
		for (int i=0; i<array.length; i++){
			this.array[i]=array[i];
		}
	}

	public int suche(Artikel suchObjekt){

		int links = 0;
		int rechts = array.length-1;
		int mitte = (array.length-1)/2;
		int mitteAlt; //Zwischenspeicher für den mittleren Index
		while (links<rechts){
			if (suchObjekt.compareTo(array[mitte])==0)
				return mitte;
			if (suchObjekt.compareTo(array[mitte])>0){
				mitteAlt=mitte;
				mitte = (mitte+rechts+1)/2;
				links=mitteAlt;
			}
			if (suchObjekt.compareTo(array[mitte])<0){
				mitteAlt = mitte;
				mitte = mitte/2;
				rechts = mitteAlt;
			}
		}

		return -1;
	}
}