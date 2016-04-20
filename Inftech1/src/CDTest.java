
public class CDTest {
	
	public static void main(String[] args){
		
		//Für die Übersichtlichkeit werden zunächst die Tracks einzeln deklariert und initialisiert:
		CDTrack track1 = new CDTrack(359, "My Funny Valentine", "The Miles Davis Quintet");
		CDTrack track2 = new CDTrack(599, "Blues By Five", "The Miles Davis Quintet");
		CDTrack track3 = new CDTrack(264, "Airegin", "The Miles Davis Quintet");
		CDTrack track4 = new CDTrack(788, "Tune Up / When Lights Are Low", "The Miles Davis Quintet");
		CDTrack track5 = new CDTrack(266, "Bonus Track", "The Miles Davis Quintet");
		//und dann in einem Array tracks zusammengefasst:
		CDTrack[] tracks = {track1, track2, track3, track4, track5};
		
		CD jazzcd = new CD(tracks, "Cookin' with The Miles Davis Quintet");
		
		jazzcd.print();
		
	}

}
