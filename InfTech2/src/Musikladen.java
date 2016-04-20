public class Musikladen {
    /*public static void main(String[] args){
        
        // Einlesen der Artikel in einen Array  
        String file = "artikelliste.dat";
        Artikel[] artikelliste = Parser.readArtikel(file);
        // Objekt der Klasse BinaereSuche erzeugen
        BinaereSuche binSuche = new BinaereSuche(artikelliste);
        
        System.out.println("*********************");
        System.out.println("*                   *");
        System.out.println("*   MUSIC MANiACS   *");
        System.out.println("*     PRO STORE     *");
        System.out.println("*                   *");
        System.out.println("*       xxxxO       *");
        System.out.println("*      xx  /xO      *");
        System.out.println("*     xx  / /x      *");
        System.out.println("*     x  / /xx      *");
        System.out.println("*      x/ /xx       *");
        System.out.println("*       xxxx        *");
        System.out.println("*                   *");
        System.out.println("*   ooo oo          *");
        System.out.println("*  o   o o     oo   *");
        System.out.println("*  0 x x ======xxo  *");
        System.out.println("*  o   o o     oo   *");
        System.out.println("*   ooo oo          *");
        System.out.println("*                   *");
        System.out.println("*********************");
        System.out.println();
        
        System.out.println("Willkommen zum MUSIC MANiACS Kassensystem!");
        System.out.println();
        System.out.println("Ausgabe des Katalogs:");
        System.out.println();
        System.out.println("Artikelnr. Hersteller Name");
        for(int i=0; i<artikelliste.length;i++){
            System.out.println(artikelliste[i].getArtikelnummer() + " " + artikelliste[i].getHersteller() + " " + artikelliste[i].getName());
        }
        System.out.println();
        
        System.out.println("Artikelscanner nicht gefunden.");
        System.out.println("Bitte um manuelle Eingabe.");
        System.out.println("Mit 'q' wird das Programm beendet.");
        System.out.println();
        
        String gesuchterArtikel = "anfang";
        int gesuchterIndex;
        Artikel gesucht;
        while(gesuchterArtikel.compareTo("q") != 0) {
            gesuchterArtikel = Terminal.askString("Artikelnummer manuell eingeben: ");
            System.out.println();
            gesucht = new Artikel(gesuchterArtikel);
            gesuchterIndex = binSuche.suche(gesucht);
            if(gesuchterIndex != -1){
                // in der folgenden Zeile wird die toString-Methode von 
                // artikelliste[gesuchterIndex] aufgerufen
                System.out.println("Daten des Artikels:\n" + artikelliste[gesuchterIndex]);
            }
            else{
                System.out.println("Artikelnummer ist nicht vorhanden!");
            }
            System.out.println();
        }
        
    }*/
}
