
public class TestMatrix {
    
    public static Matrix[] beispielMatrixArray() {
        
        // erzeuge Matrix-Array mit 8 Elementen
        Matrix[] matArr = new Matrix[8];
        
        // 1. Matrix
        double[][] werte0 = {{1, 1.5, 2}, {2, -2.5, 3}};
        matArr[0] = new Matrix(werte0);
        
        // 2. Matrix
        double[][] werte1 = {{10, 5}, {5, 20}};
        matArr[1] = new Matrix(werte1);
        
        // 3. Matrix
        double[][] werte2 = {{-3, -5}, {-1, 0}};
        matArr[2] = new Matrix(werte2);
        
        // 4. Matrix
        double[][] werte3 = {{100, 50}, {-30, 200}};
        matArr[3] = new Matrix(werte3);
        
        // 5. Matrix
        double[][] werte4 = {{-30, 0}, {0, 30}};
        matArr[4] = new Matrix(werte4);
        
        // 6. Matrix
        double[][] werte5 = {{1, 1.5, 2}, {2, -2.5, 3}};
        matArr[5] = new Matrix(werte5);
        
        // 7. Matrix
        double[][] werte6 = {{3, 1}};
        matArr[6] = new Matrix(werte6);
        
        // 8. Matrix
        double[][] werte7 = {{10000}};
        matArr[7] = new Matrix(werte7);
        
        // gebe den Array mit 8 Matrizen zurueck
        return matArr;
    }
    
    public static void matrixArrayAusgeben(Matrix[] matArr) {
        for (int i=0; i<matArr.length; i++)
            System.out.println(matArr[i]+"\n");
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("8 Beispielmatrizen.");
        System.out.println("Erst erzeugen...");
        Matrix[] matrixArray = beispielMatrixArray();
        System.out.println("...und dann ausgeben:\n");
        matrixArrayAusgeben(matrixArray);
        
        System.out.println("Vergleiche die ersten zwei Matrix-Objekte "+
            "des Arrays:");
        System.out.print("matrixArray[0].compareTo(matrixArray[1]): ");
        System.out.println(matrixArray[0].compareTo(matrixArray[1]));
        System.out.print("matrixArray[1].compareTo(matrixArray[0]): ");
        System.out.println(matrixArray[1].compareTo(matrixArray[0]));
    }
    
}