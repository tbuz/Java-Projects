 // Veranstaltungsplanung haengt ab von den Klassen Raum und Kurs
  public class Veranstaltungsplanung {
     public static void main(String[] args) {
         
         Raum h0104 = new Raum(); //Hier wird ein Objekt der Klasse Raum erzeugt
         // weise Attributen Werte zu
         h0104.name = "H0104";
         h0104.verfuegbar = true;
         h0104.sitzplaetze = 750;
         
         int anfangsTeilnehmer = 1100;
         
         Kurs inftech1;
         inftech1 = new Kurs(); //Hier wird ein Objekt der Klasse Kurs erzeugt
         // weise Attributen Werte zu
         inftech1.name = "Einfuehrung in die Informatik I"+
            " (Technikorientierung)";
         inftech1.raum = h0104;
         inftech1.teilnehmer = anfangsTeilnehmer;
         
         // aendere den Raum vom Kurs Inftech1 auf nicht mehr verfuegbar
         inftech1.raum.verfuegbar = false;
         
         // reduziere die Anzahl der Teilnhmer um 50
         inftech1.teilnehmer -= 50;
         
         // Ausgaben
         System.out.println("H0104 ist verfuegbar: "+h0104.verfuegbar);
         System.out.println("Die Anzahl der anfaenglichen Teilnehmer "+
            "war: "+anfangsTeilnehmer);
         System.out.println("Der Kurs Inftech hat "+
            inftech1.teilnehmer+" Teilnehmer und sein Raum "+
            inftech1.raum.name+" ist verfuegbar: "+inftech1.raum.verfuegbar);
     }
 }
  
 /* Zu den gestellten Fragen:
  * 
  * 1. Objekte werden in den Zeilen 5 (Klasse Raum) und 14 (Klasse Kurs) erzeugt 
  * 	und den Variablen h0104 (Z.5) und inftech1 (Z.14) zugewiesen.
  * 
  * 2. Das Objekt inftech1 wird mit Standardwerten erzeugt. Sowohl name als auch 
  * 	raum erhalten den Wert null.
  * 
  * 3. Das liegt daran, dass in Zeile 19 (inftech1.raum = h0104;) das Objekt h0104 
  * 	der	Klasse Raum dem Objekt inftech1 als Attribut zugewiesen wird.
  * 	Dann wird in Zeile 23 (inftech1.raum.verfuegbar = false;) das Attribut verfuegbar
  * 	des Objektes h0104, welches wiederum das Attribut raum des Objektes inftech1 ist
  * 	verändert.
  * 	Somit wird also über einen Umweg das Attribut h0104.verfuegbar verändert.
  * 	(-> Also inftech1.raum.verfuegbar entspricht h0104.verfuegbar, da
  * 	  inftech1.raum = h0104 (Z.19) und somit auch inftech1.raum.* = h0104.*)
  * 
  * 4. Wie bei er letzten Hausaufgabe, stößt man auch hier wieder auf den Unterschied zwischen
  * 	primitiven und Referenzdatentypen. Während im Falle eines Arrays eine Zuweisung einer
  * 	neuen Variablen nur einen Verweis zum Array darstellt, wird beim primitiven Integer
  * 	schlicht der Wert der Variablen kopiert. Somit wird zwar in Zeile 20 der Wert der Variablen
  * 	anfangsTeilnehmer übernommen (inftech1.teilnehmer = anfangsTeilnehmer), doch nach dieser
  * 	Zeile werden die Änderungen an inftech1.teilnehmer unabhängig vom ursprünglichen
  * 	Integer getätigt und betreffen somit nur inftech1.teilnehmer.
  * 
  */
  