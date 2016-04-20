/**
 * Stellt eine statische Methode zur Konvertierung einer 
 * Ganzzahl (int) in eine Dualzahl zur Verfuegung, wobei 
 * die Koeffizienten der Dualzahl in einem Array zurueckgegeben 
 * werden.
 */
public class DezimalZuDual {
    
    /** statische Methoden */
    
    // konvertiert eine Zahl in Dezimaldarstellung in Binaerdarstellung
    // mit einer vorgegebenen Anzahl an Stellen (Bits), die als 
    // hinreichend gross angenommen wird
    public static int[] konvertiere(int dezimalZahl, int bits){
        int basis = 2; // festkodierte Basis 2
        int[] dualZahl = new int[bits];
        // initalisiere Array mit Nullen
        for (int i = 0; i < bits; i++)
            dualZahl[i] = 0;
        
        
        // IHR CODE
        
    }

    // gibt die als Array uebergebene Dualzahl unter Vernachlaessigung 
    // der fuehrenden Nullen auf die Konsole aus
    public static void print(int[] dualZahl){
        // vernachlaessige fuehrende Nullen, ermittle ersten 
        // nicht-Null-Koffizient im Array
        int ersteEins = dualZahl.length-1;
        while ((ersteEins > 0) && (dualZahl[ersteEins] == 0))
            ersteEins--;
        System.out.print("Die Binaerdarstellung lautet ");
        // gebe beginnend beim Index ersteEins alle Zahlen des 
        // Arrays dualZahl nebeneinander aus
        for (int i = ersteEins; i >= 0; i--)
            System.out.print(dualZahl[i]);
        System.out.println();
    }

    // liesst Zahl vom Benutzer ein und gibt anschliessend diese
    // Zahl in Dualdarstellung aus
    public static void main(String[] argv){
        int n = Terminal.askInt("Bitte Dezimalzahl eingeben: ");
        int anzahlBits = 16;
        print(konvertiere(n, anzahlBits));
    }
}