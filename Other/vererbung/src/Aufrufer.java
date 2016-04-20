
public class Aufrufer {

	public static void main(String[] args) {
		
		Motorrad Kawa1 = new Motorrad();
		
		Kawa1.Reifen=2;
		Kawa1.Farbe="Giftgrün";
		Kawa1.Name="Kawasaki Ninja";
		
		System.out.println(Kawa1.Reifen+" "+Kawa1.Farbe+" "+Kawa1.Name);
		Kawa1.beschreibung("Die "+Kawa1.Name);
		Kawa1.aktion("Die "+Kawa1.Name);
		
		Auto Porsche1 = new Auto();
		
		Porsche1.Reifen=4;
		Porsche1.Farbe="Matt Schwarz";
		Porsche1.Abgasnorm="Euro 4";
		Porsche1.Name="Porsche";
		
		System.out.println(Porsche1.Reifen+" "+Porsche1.Farbe+" "+Porsche1.Abgasnorm);
		Porsche1.beschreibung("Der "+Porsche1.Name);
		Porsche1.aktion("Der "+Porsche1.Name);
		
	}

}