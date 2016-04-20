
public class CD {
	//Zunächst werden die Klassenvariablen deklariert
	private CDTrack[] tracks;
	private String titel; //Albumtitel!
	private String kuenstler;
	
	//Der Konstruktor weist die zwei Parameter, ein Array mit allen CD-Tracks und den Albentitel den Klassenvariablen zu:
	public CD (CDTrack[] tracks, String titel){
		this.tracks = tracks;
		this.titel = titel;
		kuenstler = tracks[0].getKuenstler();
	}
	
	//print sorgt für die Bildschirmausgabe der Informationen:
	public void print() {
		
		//Zuerst werden Künstler und Albentitel ausgegeben:
		System.out.println("Künstler: "+kuenstler);
		System.out.println("Albumtitel: "+titel);
		//Zur Übersichtlichkeit noch eine freie Zeile vor der Ausgabe der Tracks:
		System.out.println();
		//Für das Array aus CD-Tracks braucht man eine for-Schleife, in der die Daten zu jedem Track einzeln ausgegeben werden:
		for (int i=0; i<tracks.length; i++){
			//Tracknummer, -titel, Künstler und Länge in Sekunden werden ausgegeben:
			System.out.println("Track "+(i+1)+": "+tracks[i].getTitel());
			System.out.println("Künstler: "+tracks[i].getKuenstler());
			System.out.println("Länge: "+tracks[i].getLaenge()+" Sekunden");
			//Die folgende Zeile ist optional und gehört nicht in den Aufgabenumfang:
			System.out.println("	("+sekundenumrechner(tracks[i].getLaenge())+" Minuten)");
			System.out.println();
		}
	}
	
	/**Der folgende Teil wurde freiwillig erstellt und gehört nicht zu den Aufgaben,
	 * sondern dient nur der Optik: Die Länge der Tracks wird im Format (MM:SS) angezeigt.
	 * Dieser Teil ersetzt keinen Pflichtcode aus der Aufgabe, er ergänzt ihn nur: 
	 */
	
	//Man kann die Ausgabe natürlich auch noch schöner gestalten (optionaler Teil):
	public String sekundenumrechner(int sekunden){
		//Minuten: wie oft steckt die 60 in der Sekundenzahl?
		String min = Integer.toString(sekunden/60);
		//Sekunden: Ganze 60er sind nun in den Minuten und werden von den Sekunden nun abgezogen,
		// um die restlichen Sekunden zu ermitteln:
		String sek = Integer.toString(sekunden-(sekunden/60)*60);
		
		//Fehlende Nullen werden hier ergänzt:
		if (min.length()==1){
			min = "0"+min;
		}
		if (sek.length()==1){
			sek = "0"+sek;
		}
		//Rückgabe des Zusammengestellten Strings
		return (min+":"+sek);
	}

}
