
public class BusTest {
	
	public static void main (String[] args) {
		
		//3 Buslinien werden ins Leben gerufen:
		Bus bus1 = new Bus("Ernst-Reuter-Platz", "Potsdamer Platz");
		Bus bus2 = new Bus("Potsdamer Platz", "Alexanderplatz");
		Bus bus3 = new Bus("Zoologischer Garten", "Rathaus Steglitz");
		
		//Die Busse müssen alle ein paar Stationen fahren:
		bus1.fahren(4);
		bus2.fahren(2);
		bus3.fahren(6);
		
		//Nun werden mit der print-Methode alle Daten ausgegeben.
		//Dafür wurde zur Übersichtlichkeit hinzugefügt, um welchen Bus es sich handelt. 
		System.out.println("Buslinie 1:");
		bus1.print();
		System.out.println("\n"+"Buslinie 2:");
		bus2.print();
		System.out.println("\n"+"Buslinie 3:");
		bus3.print();		
	}
	

}
