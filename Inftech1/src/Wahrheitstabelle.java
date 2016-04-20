/**
 * HA3 Aufgabe 1
 * @author T24G02
 * nach der Vorlage von der ISIS-Seite 
 *
 */

public class Wahrheitstabelle {
	// main-Methode gibt die Wahrheitstabelle der drei booleschen 
    // Operatoren aus
    public static void main(String[] args) {
        boolean a;
        boolean b;

        // Titelzeile
        System.out.println("a     b     !a    a||b  a&&b");

        // 1. Inhaltszeile der Tabelle
        a = true; b = true;
        System.out.println(a+"  "+b+"  "+(!a)+" "+(a||b)+"  "+(a&&b));

        // 2. Inhaltszeile der Tabelle
        a = true; b = false;
        System.out.println(a+"  "+b+" "+(!a)+" "+(a||b)+"  "+(a&&b));
        
        // 3. Inhaltszeile der Tabelle
        a = false; b= true;
        System.out.println(a+" "+b+"  "+(!a)+"  "+(a||b)+"  "+(a&&b));
        
        // 4. Inhaltszeile der Tabelle
        a = false; b = false;
        System.out.println(a+" "+b+" "+(!a)+"  "+(a||b)+" "+(a&&b));
        
    }
}

