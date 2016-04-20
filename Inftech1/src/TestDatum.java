
public class TestDatum {
	
	public static void main (String[] args){
		
		System.out.println("Erzeuge Objekte und gebe korrektes Datum in den drei Formaten aus: ");
		//Die ersten Objekte werden erzeugt und direkt mit formatiere ausgegeben
		Datum datumdeu1 = new DeutschesDatum(1, 4, 2013);
		System.out.println(datumdeu1.formatiere());
		Datum datumam1 = new AmerikanischesDatum(1, 4, 2013);	
		System.out.println(datumam1.formatiere());
		Datum datumiso1 = new ISODatum(1, 4, 2013);
		System.out.println(datumiso1.formatiere());		
		
		System.out.println("");
		System.out.println("Erzeuge Objekte und gebe falsches Datum in den drei Formaten aus: ");
		
		Datum datumdeu2 = new DeutschesDatum(32, 13, 1994);
		System.out.println(datumdeu2.formatiere());
		Datum datumam2 = new AmerikanischesDatum(32, 13, 1994);
		System.out.println(datumam2.formatiere());
		Datum datumiso2 = new ISODatum(32, 13, 1994);
		System.out.println(datumiso2.formatiere());		
		
	}

}
