
public class testQueue {

	public static void main(String[] args) {

		Queue<String> QO = new Queue<String>();
		
		System.out.println("Fuege 5 String-Objekte in die Queue hinzu:");
		System.out.println("1: erste string");
		QO.enqueue("erste string");
		System.out.println("2: zweiter string");
		QO.enqueue("zweiter string");
		System.out.println("3: dritter string");
		QO.enqueue("dritter string");
		System.out.println("4: vierter string");
		QO.enqueue("vierter string");
		System.out.println("5: fünfter string");
		QO.enqueue("fünfter string");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Enferne... ");
		System.out.println("1. element: "+QO.dequeue());
		System.out.println("2. element: "+QO.dequeue());
		System.out.println("3. element: "+QO.dequeue());
		System.out.println("4. element: "+QO.dequeue());
		System.out.println("5. element: "+QO.dequeue());
		System.out.println("6. element: "+QO.dequeue());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Erzeuge leeren Stack");
		Queue<String> qo2 = new Queue<String>();
		System.out.println("\"top\" an leeren Stack anwenden: " + qo2.dequeue());
	}
}
