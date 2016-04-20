
public class CD {
	//Zun�chst werden die Klassenvariablen deklariert
	private CDTrack[] tracks;
	private String titel; //Albumtitel!
	private String kuenstler;
	
	//Der Konstruktor weist die zwei Parameter, ein Array mit allen CD-Tracks und den Albentitel den Klassenvariablen zu:
	public CD (CDTrack[] tracks, String titel){
		this.tracks = tracks;
		this.titel = titel;
		kuenstler = tracks[0].getKuenstler();
	}
	
	//print sorgt f�r die Bildschirmausgabe der Informationen:
	public void print() {
		
		//Zuerst werden K�nstler und Albentitel ausgegeben:
		System.out.println("K�nstler: "+kuenstler);
		System.out.println("Albumtitel: "+titel);
		//Zur �bersichtlichkeit noch eine freie Zeile vor der Ausgabe der Tracks:
		System.out.println();
		//F�r das Array aus CD-Tracks braucht man eine for-Schleife, in der die Daten zu jedem Track einzeln ausgegeben werden:
		for (int i=0; i<tracks.length; i++){
			//Tracknummer, -titel, K�nstler und L�nge in Sekunden werden ausgegeben:
			System.out.println("Track "+(i+1)+": "+tracks[i].getTitel());
			System.out.println("K�nstler: "+tracks[i].getKuenstler());
			System.out.println("L�nge: "+tracks[i].getLaenge()+" Sekunden");
			//Die folgende Zeile ist optional und geh�rt nicht in den Aufgabenumfang:
			System.out.println("	("+sekundenumrechner(tracks[i].getLaenge())+" Minuten)");
			System.out.println();
		}
	}
	
	/**Der folgende Teil wurde freiwillig erstellt und geh�rt nicht zu den Aufgaben,
	 * sondern dient nur der Optik: Die L�nge der Tracks wird im Format (MM:SS) angezeigt.
	 * Dieser Teil ersetzt keinen Pflichtcode aus der Aufgabe, er erg�nzt ihn nur: 
	 */
	
	//Man kann die Ausgabe nat�rlich auch noch sch�ner gestalten (optionaler Teil):
	public String sekundenumrechner(int sekunden){
		//Minuten: wie oft steckt die 60 in der Sekundenzahl?
		String min = Integer.toString(sekunden/60);
		//Sekunden: Ganze 60er sind nun in den Minuten und werden von den Sekunden nun abgezogen,
		// um die restlichen Sekunden zu ermitteln:
		String sek = Integer.toString(sekunden-(sekunden/60)*60);
		
		//Fehlende Nullen werden hier erg�nzt:
		if (min.length()==1){
			min = "0"+min;
		}
		if (sek.length()==1){
			sek = "0"+sek;
		}
		//R�ckgabe des Zusammengestellten Strings
		return (min+":"+sek);
	}

}
