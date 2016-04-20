import java.util.Random;

public class TestSorter{		

    HeapSort heap;

    public static void main(String[]args){
        
        // zum Testen der einzelnen Methoden koennen die anderen Tests einfach auskommentiert werden
        
        Test test = new Test();
        
        // testet nur die Methode buildHeap auf verschiedenen Arrays
        test.testeBuildHeap();
        
        // testet nur die Methode heapSort auf verschiedenen Heaps
        test.testeHeapSort();
        
        // testet erst buildHeap und anschliessend heapSort
        test.testeAlles();
        
    }
}
