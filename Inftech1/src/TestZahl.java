public class TestZahl {
    public static void main(String[] argumente) {
        // Erzeuge Objekte der Klasse Zahl
        // gebe die jeweiligen 2er Komplement-Darstellungen aus
        // Verwende einige  Male beispielhaft die addiere-Methode
        Zahl z1 = new Zahl(-256);
        Zahl z2 = new Zahl(512);
        System.out.println("z1: " + z1); // verwendet z1.toString()
        System.out.println("z2: " + z2);
        System.out.println("Addiere z1 zu z2");
        z2.addiere(z1);
        System.out.println("z2: " + z2);
        System.out.println();
        
        Zahl z3 = new Zahl((int) (-Math.pow(2,31)));
        System.out.println("z3: " + z3);
        System.out.println("Addiere -1 zu z3");
        z3.addiere(new Zahl(-1));
        System.out.println("z3: " + z3);
        System.out.println();
        
    
        Zahl z4 = new Zahl((int) (Math.pow(2,31)-1));
        System.out.println("z4: " + z4);
        System.out.println("Addiere 1 zu z4");
        z4.addiere(new Zahl(1));
        System.out.println("z4: " + z4);
    }
} 
