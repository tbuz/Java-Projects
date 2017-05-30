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

    //parametrisierter Konstruktor
    public Artikel(String artikelnummer, String hersteller, String name, String kategorie, double preis) {
        this.artikelnummer = artikelnummer;
        this.hersteller = hersteller;
        this.name = name;
        this.kategorie = kategorie;
        this.preis = preis;
    }
    
    //gibt String mit allen Attributen zurück
    public String toString(){
        return "\n Art.Nr: " + artikelnummer + "\n Hersteller: " + hersteller + "\n Name: " + name + "\n Kategorie: " +kategorie + "\n Preis: " +preis;
    }
    
    //compareTo realisiert mit Java7-API und dem Interface Comparable, das String automatisch implementiert
    public int compareTo(Artikel o){
        int compareValue = this.artikelnummer.compareTo(o.artikelnummer);
        return compareValue;
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
}