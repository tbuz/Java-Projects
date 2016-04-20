// Die readArtikel-Methode dieser Klasse liesst aus der uebergebenen Datei
// Daten ein und erzeugt daraus Artikel-Objekte, die sie in einem Array 
// zusammenfasst und diesen dann zurueckgibt.
// 
// Sie muessen diese Klasse nicht im Detail verstehen, um die Aufgabe 
// bearbeiten zu koennen.

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Parser {

    private static Artikel readNext(StreamTokenizer st) throws IOException {
        
        String msg = "Fehler: Datei hat falsches Format.";
        
        Artikel m = null;
        while(st.nextToken() != StreamTokenizer.TT_EOF) {
            if(st.ttype != StreamTokenizer.TT_WORD) {
            throw new IOException();
            }
            String artikelnummer = st.sval;
            
            st.nextToken();
            st.nextToken();
            if(st.ttype != StreamTokenizer.TT_WORD) {
            throw new IOException(msg);
            }
            
            String hersteller = st.sval;
            
            st.nextToken();
            st.nextToken();
            if(st.ttype != StreamTokenizer.TT_WORD) {
            throw new IOException(msg);
            }
            
            String name = st.sval;
                
            st.nextToken();
            st.nextToken();
            if(st.ttype != StreamTokenizer.TT_WORD) {
            throw new IOException(msg);
            }
            String kategorie = st.sval;
            
            st.nextToken();
            st.nextToken();
            if(st.ttype != StreamTokenizer.TT_NUMBER) {
            throw new IOException(msg);
            }
            double preis = (double)st.nval;
            
            m = new Artikel(artikelnummer, hersteller, name, kategorie, preis);

            st.nextToken();
            if(st.ttype != StreamTokenizer.TT_EOL) {
            throw new IOException(msg);
            }
            break;
        }
        return m;
    }
    
    public static Artikel[] readArtikel(String f) {
    System.out.print("Lese Artikeldaten aus Datei " + f + " ein... ");
    FileReader fr = null;
    try {
        fr = new FileReader(f);
        StreamTokenizer st = new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        ArrayList<Artikel> artikel = new ArrayList<Artikel>();
        Artikel m;
        do {
        m = readNext(st);
        artikel.add(m);
        } while(m != null);
            
        int n = artikel.size() - 1;
        Artikel[] arr = new Artikel[n];
        for(int i = 0; i < n; i++) {
        arr[i] = artikel.get(i);
        }
        System.out.println("erledigt.");
        System.out.println();
        return arr;
    } catch (IOException e) {
        System.err.println(e.getMessage());
    } finally {
        try {
        fr.close();
        } catch (Exception e) {
        }
    }
    return null;
    }	
}
