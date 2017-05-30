
public class TestSpeisekarte {
	
	public static void main(String[] args) {
		Speisekarte<Speise> Karte = new Speisekarte<Speise>();
		
		System.out.println();
		System.out.println("Speisen aufnehmen:");
		
		Speise gericht1 = new Speise("Blubberblasen in Sabbersosse",22.13);
		Speise gericht2 = new Speise("Schlummerding",17.61);
		Speise gericht3 = new Speise("Welssuppe",11.25);
		Speise gericht4 = new Speise("Sumpf am Stiel",9.00);
		Speise gericht5 = new Speise("Kinderextrakt Aperitif",5);
		Speise gericht6 = new Speise("Wasser",3.99);
		
		System.out.println(gericht1.toString());
		System.out.println(gericht2.toString());
		System.out.println(gericht3.toString());
		System.out.println(gericht4.toString());
		System.out.println(gericht5.toString());
		System.out.println(gericht6.toString());
		
		Karte.aufnehmen(gericht1);
		Karte.aufnehmen(gericht2);
		Karte.aufnehmen(gericht3);
		Karte.aufnehmen(gericht4);
		Karte.aufnehmen(gericht5);
		Karte.aufnehmen(gericht6);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Zeige Speise an Position: ");
		int position = Integer.parseInt(System.console().readLine());
		System.out.println(Karte.getSpeiseat(position));
		
		System.out.println();
		System.out.println("Liste alle Speisen auf:");
		Karte.listAll();
		
		System.out.println();
		System.out.println();
		
		System.out.print("Entferne Speise an Position: ");
		int remove = Integer.parseInt(System.console().readLine());
		System.out.println(Karte.getSpeiseat(remove).toString()+" wird entfernt");
	       Karte.remove(Karte.getSpeiseat(remove));		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Liste alle Speisen auf:");
		Karte.listAll();
		
	}
}
