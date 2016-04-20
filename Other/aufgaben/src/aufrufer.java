
public class aufrufer {

	public static void main(String args[]){
		
		Auto a = new Auto(5,"Anthrazit",180, "VW");
		Auto b = new Auto(4,"Blau", 220, "Audi");
		Auto c = new Auto(7,"Schwarz matt", 320, "Porsche");	
		System.out.println("---");
		
		System.out.println("Auto1 Reifenzahl: "+ a.getReifen());
		System.out.println("Auto1 Farbe: "+ a.getFarbe());
		System.out.println("Auto1 Höchstgeschwindigkeit: "+ a.getVmax());
		System.out.println("Auto1 Marke: "+ a.getName());
		a.setName("Toyota");
		System.out.println("Name geändert!");
		System.out.println("Auto1 Marke: "+ a.getName());
		System.out.println("---");
		
		System.out.println("Auto2 Reifenzahl: "+ b.getReifen());
		System.out.println("Auto2 Farbe: "+ b.getFarbe());
		System.out.println("Auto2 Höchstgeschwindigkeit: "+ b.getVmax());
		System.out.println("Auto2 Marke: "+ b.getName());
		b.setName("Honda");
		System.out.println("Name geändert!");
		System.out.println("Auto2 Marke: "+ b.getName());
		System.out.println("---");
		
		System.out.println("Auto3 Reifenzahl: "+ c.getReifen());
		System.out.println("Auto3 Farbe: "+ c.getFarbe());
		System.out.println("Auto3 Höchstgeschwindigkeit: "+ c.getVmax());
		System.out.println("Auto3 Marke: "+ c.getName());
		c.setName("Suzuki");
		System.out.println("Name geändert!");
		System.out.println("Auto3 Marke: "+ c.getName());



		
		
	}
	
}
