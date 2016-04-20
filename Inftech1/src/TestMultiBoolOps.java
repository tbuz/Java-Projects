public class TestMultiBoolOps {
    public static void main(String[] args) {
        System.out.println("Erstes DreivariablenBoolOps-Beispiel:");
        BoolescheOperationen dbo1 = new DreivariablenBoolOps(true, true, false); 
        System.out.println(dbo1); // ruft automatisch dbo.toString() auf
        
        System.out.println("Zweites DreivariablenBoolOps-Beispiel:");
        System.out.println(new DreivariablenBoolOps(true, true, true));
        
        System.out.println("Erstes ArrayBoolOps-Beispiel:");
        boolean[] array1 = {true, true, true, false, true};
        BoolescheOperationen abo1 = new ArrayBoolOps(array1);
        System.out.println(abo1); 
        
        System.out.println("Zweites ArrayBoolOps-Beispiel:");
        boolean[] array2 = new boolean[4];
        array2[0] = true;
        array2[1] = true;
        array2[2] = true;
        array2[3] = true;
        BoolescheOperationen abo2 = new ArrayBoolOps(array2);
        System.out.println(abo2);
    }
}