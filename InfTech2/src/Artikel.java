public class Artikel  {
    
    // Attribute
    private String artikelnummer;
    private String hersteller;  
    private String name;
    private String kategorie;
    private double preis;
    
    // Konstruktoren
    public Artikel(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    //(Konstruktor für alle Attribute:)
    public Artikel(String artikelnummer, String hersteller, String name, String kategorie, double preis) {
        this.artikelnummer = artikelnummer;
        this.hersteller = hersteller;
        this.name = name;
        this.kategorie = kategorie;
        this.preis = preis;
    }
    
    
    // Getter
    public String getArtikelnummer() {
        return artikelnummer;
    }
    
    public String getHersteller() {
        return hersteller;
    }
    
    public String getName() {
        return name;
    }
    //toString-Methode gibt alle Attribute im String aus:
    public String toString(){
    	return "Artikelnr.: "+artikelnummer+"\n Hersteller: "+
    			hersteller+"\n Name: "+name+"\n Kategorie :"+
    			kategorie+"\n Preis :"+preis+" EUR";
    }
    //compareTo:
    public int compareTo(Artikel o){
    	//Verwendet compareTo aus String, gemaess dem Hinweis:
    	return artikelnummer.compareTo(o.getArtikelnummer());
    }
    
    
    /**
    //selbstbau-compareTo-Methode:
    //Vergleich jedes einzelne Zeichen der Artikelnummer an der Stelle i:
    public int compareTo(Artikel o){
    	for (int i=0; i<artikelnummer.length(); i++){
    		//Sobald eine Stelle in der Nummer unterscheidet, wird entweder 1 oder -1 zurückgegeben:
    		if (this.artikelnummer.charAt(i) > o.getArtikelnummer().charAt(i)) return 1;
    		else if (this.artikelnummer.charAt(i) < o.getArtikelnummer().charAt(i)) return -1;
    	}
    	//Falls die Artikelnummern gleich sind, kommt 0 zurück:
    	return 0;
    }
	*/
    	
    
}