public class TelefonVerwaltung {
	
    public static void main(String[] args) {
    	//Die vorgegebenen Startwerte werden initialisiert:
        int anzahlTelefoneGesamt = 100;
        int anzahlTelefoneAusgabe = 6;
        int raumnummerStart = 5000;
        //telefone ist ein Array, das aus anzahlTelefoneGesamt-Elementen bzw 100-Elementen vom Typ Telefon besteht
        Telefon[] telefone = new Telefon[anzahlTelefoneGesamt];
        
        //Die erste for-Schleife füllt jeder der 100 Stellen des Arrays (vom Index [0] bis [99]) mit zwei Elementen
        for (int i=0; i<anzahlTelefoneGesamt; i++){
        	//Da laut vorgegebener Tabelle im Index [0] gleich Raum 5001 steht, muss das Inkrement zuerst geschehen
        	raumnummerStart++; 
        	String telnummer = "+49(0)30 444-"+raumnummerStart;
        	//jede Stelle des Arrays beinhaltet wiederum eine Telefon-Variable mit zwei Werten, der Raumnummer und der Telefonnummer
        	telefone[i]= new Telefon(raumnummerStart, telnummer);
        }
        
        //Die zweite for-Schleife zählt von 95 (=100+1-6) bis 100 und gibt dabei jedes jedes i-te Telefon mit Raum- und Tel-Nummer aus
        //Dabei ist zu beachten, dass das Telefon 95 unter telefone[94] gespeichert ist, deshalb ist das telefone[i-1].* nötig
        for (int i=anzahlTelefoneGesamt+1-anzahlTelefoneAusgabe; i<=anzahlTelefoneGesamt; i++) {
        	System.out.println("Telefon "+i+" ist in Raum "+telefone[i-1].raumnummer+" und hat die Tel.-Nummer "+telefone[i-1].rufnummer+".");
        }
        
    }
}