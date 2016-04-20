
public class Wort implements Text{
//Klassenattribut wird initialisiert:
	private String w;
	
	//Der Konstruktor weist den Parameter dem Attribut zu:
	public Wort (String w){
		this.w = new String(w);
	}
	//Getter-Methode fuer w:
	public String getText(){
		return this.w;
	}
	//Fuegt w einen weiteren Text hinzu:
	public void append(Text txt){
		this.w += txt;
	}
	//toString-Methode wird überschrieben:
	public String toString(){
		return this.w;
	}
}
