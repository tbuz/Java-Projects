public class Zahl {
    
    /* Attribute */
	//boolean[] zweierKomplement = new boolean[32];
    
    private boolean[] zweierKomplement;
    
    
    /* oeffentliche Methoden */
    
    // Konstruktor
    public Zahl(int wert) {   
        //Das Array zweierKomplement wird mit 32 Bit initialisiert:
    	zweierKomplement = new boolean[32];
    	//Ist wert negativ, so wird das 2er-Komplement anders berechnet, als wenn er positiv ist:
     	if (wert<0) {
     		//Das erste Bit (bzw. hier das letzte) wird nach dem Vorzeichen festgelegt:
     		//(1 bzw. true für negative Zahl)
     		zweierKomplement[31]=true;
     		//Gegenwert wird als kleinstmögliche ("größte negative") Zahl initialisiert 
     		// und läuft dem Attribut wert entgegen:
     		double gegenwert = -Math.pow(2, 31);
     		/**Der folgende Algorithmus bedient sich dem Trick, dass im 2er-Komplement alle Stellen
         	 * wie bei einer Dual-Zahl aufsummiert werden können, nur dass der größte Wert (MSB) negativ ist.
         	 * [ z.B.: 1101(2K)=(-8)+4+0+1=(-3) ] 
         	 */ 
         	for (int i=30;i>=0;i--){
         		//Die Schleife beginnt an der größten Stelle nach dem "Vorzeichen-Bit"
         		// und arbeitet sich in Richtung LSB.
         		
         		if (gegenwert+Math.pow(2, (i))>wert) {
         			zweierKomplement[i]=false;
         		}
         		if (gegenwert+Math.pow(2, (i))<=wert){
         			zweierKomplement[i]=true;
         			gegenwert += Math.pow(2, (i));
         		}
         	}
     	}
     	//Ist wert positiv, so wird (wie vorgegeben) die Methode dualZahl verwendet:
     	else { zweierKomplement=dualZahl(wert); }
    }
    
    // Getter
    public boolean[] getZweierKomplement() {
        return zweierKomplement;
    }
    
    // gibt zweierKomplement mit Einsen und Nullen als String zurueck
    public String toString() {
        String str = "";
        for (int i=31; i>=0; i--)
            if (zweierKomplement[i])
                str += "1 ";
            else
                str += "0 ";
        return str;
    }
    
    // addiert die Zahl andere zum Attribut zweierKomplement des Objekts, 
    // die resultierende Zahl wird in zweierKomplement gespeichert
    public void addiere(Zahl andere) {
    	//Um das Folgende zu vereinfachen werden die zwei zu addierenden Zahlen als neue Variablen gespeichert:
    	boolean zahl1[] = this.zweierKomplement;
    	boolean zahl2[] = andere.getZweierKomplement();
        /*Zunächst müssen die beiden Checkbits und der Übertrag initialisiert werden
    	(Die Checkbits sind dabei gleich dem Vorzeichen des 2er-Komplements,
    	 also Index 31):
    	 */
    	boolean checkbit1 = zahl1[31];
    	boolean checkbit2 = zahl2[31];
    	boolean übertrag = false;
    	//Für das Ergebnis wird ein leeres 32-Bit Array angelegt:
    	boolean ergebnis[] = new boolean[32];
    	
    	for (int i=0; i<=31; i++) {
    		//Hier werden nun alle mögichen Fälle die in der Addition vorkommen können behandelt:
    		//1. Es gibt keinen Übertrag:
    		if (!übertrag) {
    			//a: 1+1=0 (+1)
    			if (zahl1[i] && zahl2[i]){
    				ergebnis[i]=false;
    				übertrag=true;
    			}
    			//b&c: 0+1=1+0=1 (+0)
    			if (zahl1[i] && !zahl2[i] || !zahl1[i] && zahl2[i]){
    				ergebnis[i]=true;
    				übertrag=false;
    			}
    			//d: 0+0=0 (+0)
    			if (!zahl1[i] && !zahl2[i]){
    				ergebnis[i]=false;
    				übertrag=false;
    			}   			
    		}
    		//2. Es gibt einen Übertrag:
    		else if (übertrag){
    			//a: 1+1 (+1)= 1 (+1)
    			if (zahl1[i] && zahl2[i]){
    				ergebnis[i]=true;
    				übertrag=true;
    			}
    			//b&c: 1+0 (+1)= 0+1 (+1)=0 (+1)
    			if (zahl1[i] && !zahl2[i] || !zahl1[i] && zahl2[i]){
    				ergebnis[i]=false;
    				übertrag=true;
    			}
    			//d: 0+0 (+1)= 1 (+0)
    			if (!zahl1[i] && !zahl2[i]){
    				ergebnis[i]=true;
    				übertrag=false;
    			}
    		}
    	}
    	//Das Ergebnis wird in das eigene zweierKomplement (this) geschrieben:
    	zweierKomplement = ergebnis;    	
    	//Nun wird geprüft ob Über- oder Unterlauf stattgefunden hat:
    	//(Die Summe aus dem letzten Übertrag und den Checkbits muss
    	// muss gleich dem MSB des Arrays zweierKomplement sein, 
    	// damit keiner vorhanden ist. Alle anderen Fälle werden hier abgefragt.)
    	boolean kontrolle = zweierKomplement[31];
    	//Es gibt 8 mögliche Fälle von Über-/Unterlauf:
    	//1. Es gab einen Übertrag am MSB:
    	if (übertrag){
    		//Hier werden je zwei Fälle in einer Bedingung zusammengefasst:
    		if (checkbit1 && !checkbit2 && kontrolle || !checkbit1 && checkbit2 && kontrolle){
    			System.out.println("Warnung: Überlauf!");    			
    		}
    		if (checkbit1 && checkbit2 && !kontrolle || !checkbit1 && !checkbit2 && !kontrolle){
    			System.out.println("Warnung: Unterlauf!");
    		}
    	}
    	//2. Es gab keinen Übertrag am MSB:
    	else if (!übertrag){
    		if (checkbit1 && checkbit2 && kontrolle || !checkbit1 && !checkbit2 && kontrolle) {
    			System.out.println("Warnung: Überlauf!");
    		}
    		if (checkbit1 && !checkbit2 && !kontrolle || !checkbit1 && checkbit2 && !kontrolle) {
    			System.out.println("Warnung: Unterlauf!");
    		}
    	}
        
    }
    
    // berechnet fuer eine positive Zahl die entsprechende Dualzahl in 32 Bit
    // der Parameter ist vom Typ long, damit auch 2^31 uebergeben werden kann, 
    // was keine int-Zahl ist
    // Annahme: Parameter positiveZahl ist nichtnegativ.
    private boolean[] dualZahl(long positiveZahl) {
        // Array dual wird erzeugt und damit seine Elemente mit false 
        // initialisiert (Default-Wert von Boolean); 
        // (generell sollte man aber explizit initialisieren!)
        boolean[] dual = new boolean[32]; // Typ int hat 32 Bit
        
        int index = 0; // gibt die Stelle im Array an, die berechnet wird
        // laufe durch alle Stellen gemaess der bekannten Umrechnung von 
        // Dezimalzahl in Basis 2
        while (positiveZahl > 0){
            // aktuelle Stelle im Dualsystem durch Modulo 2
            if (positiveZahl % 2 == 1) {
                dual[index] = true;
            }
            else {
                dual[index] = false;
            }
            // neuen Wert durch Division mit 2
            positiveZahl /= 2;
            index++;
        }
        return dual;
    }
    
}