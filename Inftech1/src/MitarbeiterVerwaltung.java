/**
 * Hausaufgabe 6 Aufgabe 1
 * @author T24G02
 *
 */
public class MitarbeiterVerwaltung {
	
	public static void main (String[] args){
		
		Mitarbeiter sekretaer;
		Mitarbeiter chefin;
		
		sekretaer = new Mitarbeiter();
		chefin = new Mitarbeiter();
		
		/*System.out.println(sekretaer.alter+" - "+sekretaer.name+" - "+sekretaer.istWeiblich);
		*-> diese Zeile gibt die Werte aus, mit denen das Objekt erzeugt wird:
		* 	Die Konsole zeigt: "0 - null - false". 
		* Standardwerte sind somit:
		* 	int = 0, String = null, boolean = false
		*/
		
		//Wertezuweisung gem‰ﬂ vorgegebener Tabelle:
		sekretaer.alter = 52;
		chefin.alter = 28;		
		sekretaer.name = "Schubert";
		chefin.name = "Meyer";		
		sekretaer.istWeiblich = false; //Diese Zeile kann man (wegen dem Standardwert, siehe oben) auch weglassen
		chefin.istWeiblich = true;
		
		//Die Chefin wird 1 Jahr ‰lter
		chefin.alter++;
		
		//Bildschirmausgabe von Name und Alter der Mitarbeiter:
		System.out.println("Der Sekretaer ist "+sekretaer.alter+" Jahre alt und heiﬂt "+sekretaer.name+".");
		System.out.println("Die Chefin ist "+chefin.alter+" Jahre alt und heiﬂt "+chefin.name+".");
	}

}
