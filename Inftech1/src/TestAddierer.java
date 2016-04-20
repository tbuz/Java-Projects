public class TestAddierer {
    
    public static void main(String[] args) {
        System.out.println("Wahrheitstabelle Halbaddierer:");
        printHalbaddierer();
        System.out.println();
        
        System.out.println("Wahrheitstabelle Volladdierer:");
        printVolladdierer();
        System.out.println();
        
        System.out.println("Additionen mit dem 4-Bit-Addierer:");
        Bit[] bits1 = {new Bit(0), new Bit(1), 
                            new Bit(1), new Bit(0)}; //0110
        Bit[] bits2 = {new Bit(0), new Bit(0), 
                            new Bit(1), new Bit(1)}; //0011
        
        printVierBitAddierer(bits1, bits2);
        printVierBitAddierer(bits1, bits1);
        printVierBitAddierer(bits2, bits2);
        //Addieren Sie weitere Zahlen...
        //Weitere Zahlen:
        Bit[] bits3 = {new Bit(1), new Bit(0), 
        					new Bit(1), new Bit(1)}; //1101
        Bit[] bits4 = {new Bit(0), new Bit(1), 
        					new Bit(0), new Bit(1)}; //1010
        
        printVierBitAddierer(bits1, bits3);
        printVierBitAddierer(bits3, bits4);
        printVierBitAddierer(bits2, bits4);
        
    }
    
    
    /**
    * Diese Methode benutzt den von Ihnen implementierten Halbaddierer 
    * und gibt die entsprechende Wahrheitstabelle auf dem Bildschirm aus.
    */
    public static void printHalbaddierer() {
        int wht[][] =  {{0, 0},
                        {0, 1},
                        {1, 0}, 
                        {1, 1}};
        
        Halbaddierer h = new Halbaddierer();
        System.out.println("  a__b__|__s__cout");
        for (int i = 0; i < wht.length; i++) {
            Bit s     = h.add(new Bit(wht[i][0]), new Bit(wht[i][1]));
            Bit carry = h.getUebertrag();
            System.out.println("  " + wht[i][0] + "  " + wht[i][1] + "  |  " 
                    + s.getValue() + "   " + carry.getValue());
        }
    }
    
    
    
    /**
    * Diese Methode benutzt den von Ihnen implementierten Volladdierer 
    * und gibt die entsprechende Wahrheitstabelle auf dem Bildschirm aus.
    */
    public static void printVolladdierer() {
        int wht[][] =  {{0, 0, 0},
                        {0, 0, 1},
                        {0, 1, 0}, 
                        {0, 1, 1},
                        {1, 0, 0},
                        {1, 0, 1},
                        {1, 1, 0}, 
                        {1, 1, 1}};
        
        Volladdierer v = new Volladdierer();
        System.out.println("  a__b_cin_|__s__cout");
        for (int i = 0; i < wht.length; i++) {
            Bit s     = v.add(new Bit(wht[i][0]), new Bit(wht[i][1]), new Bit(wht[i][2]));
            Bit carry = v.getUebertrag();
            System.out.println("  " + wht[i][0] + "  " + wht[i][1] + "  " + wht[i][2] + "  |  " 
                    + s.getValue() + "   " + carry.getValue());
        }
    }
    
    
    
    /**
    * Diese Methode benutzt den von Ihnen implementierten VierBitAddierer 
    * um die uebergebenen Binaerzahlen zahl1 und zahl2 zu addieren und 
    * gibt das Ergebnis auf dem Bildschirm aus.
    */
    public static void printVierBitAddierer(Bit[] zahl1, Bit[] zahl2) {
        VierBitAddierer v4 = new VierBitAddierer();
        System.out.print("  ");
        for (int i = 0; i < zahl1.length; i++) {
            System.out.print(zahl1[i].getValue());
        }
        System.out.print(" + ");
        for (int i = 0; i < zahl2.length; i++) {
            System.out.print(zahl2[i].getValue());
        }
        System.out.print(" = ");
        
        Bit[] res = v4.add(zahl1, zahl2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i].getValue());
        }
        System.out.println();
    }
    
}
