
public class TestMergesort { 
    
    public static void main(String[] args) {
        // erzeugte 8-elementigen Array von Matrix-Objekten
        Matrix[] matrixArray = TestMatrix.beispielMatrixArray();
        
        System.out.println("Vor der Sortierung:");
        TestMatrix.matrixArrayAusgeben(matrixArray);
        
        // Aufruf der Sortier-Methode
        Mergesort.sort(matrixArray);
        
        System.out.println("Nach der Sortierung:");
        TestMatrix.matrixArrayAusgeben(matrixArray);
    }
    
}