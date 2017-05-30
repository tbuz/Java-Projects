
public class DoubleLinkedList<T> {
	
	private Node head;
	private Node pos;
	private Node tail;
	
	private class Node {
		T value;
		Node prev;
		Node next;
		
		//unverbundener Konstruktor nicht noetig, da nicht gebraucht
		
		//verbundener Konstruktor
		Node (T data, Node next, Node prev){
			value = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	DoubleLinkedList (){
		head = null;
		pos = null;
		tail = null;
	}
	
	void appendHead(T element){
		//Falls die Liste noch nicht existiert, wird sie neu erstellt:
		// (Mit nur einem Element das head und tail ist)
		if (head == null){
			head = new Node (element, null, null);
			tail = head;
		}
		//Sonst wird der aktuelle head zu head.next und das neue element zum head:
		else {
			Node neu = new Node (element, head, null);
			head.prev = neu;
			head = neu;
		}
	}
	
	T popHead(){
		//Falls es keinen Head gibt, wird null zurueckgegeben:
		if (head == null){
			return null;
		}
		//Falls nur ein Element in der Liste ist,
		// muss alles wieder null gesetzt werden:
		if (head == tail){
			T wert = head.value;
			head = null;
			tail = null;
			return wert;
		}
		//Sonst wird zuerst der Wert von head zwischengespeichert,		
		else {
			T wert = head.value;
			// danach der Nachfolger zum neuen head erklaert,
			head = head.next;
			// der Vorgänger des neuen head auf null gesetzt
			head.prev = null;
			// und schliesslich der Wert zurueckgegeben 
			return wert;
		}
	}
	//analog zu appendHead:
	void appendTail(T element){
		if (tail == null){
			//Falls es noch keine Liste gibt wird das neue element 
			// auch gleichzeitig zum head:
			tail = new Node (element, null, null);
			head = tail;
		}
		else {
			//Hier wird erst der neue Knoten, der tail werden soll, 
			// mit den nötigen Referenzen erstellt
			Node neu = new Node (element, null, tail);
			//diese Referenz wird auch im alten tail uebernommen
			tail.next = neu;
			//und dann wird neu zum neuen tail erklaert 
			tail = neu;
		}
	}
	//analog zu popHead:
	T popTail(){
		//Falls es keinen tail gibt, wird null zurueckgegeben:
		if (tail == null){
			return null;
		}
		//Falls nur ein Element in der Liste ist,
		// muss alles wieder null gesetzt werden:
		if (tail == head){
			T wert = tail.value;
			head = null;
			tail = null;
			return wert;
		}
		//Sonst wird zuerst der Wert von tail zwischengespeichert,		
		else {
			T wert = tail.value;
			// danach der Vorgaenger zum neuen tail erklaert,
			tail = tail.prev;
			// der Nachfolger des neuen tail auf null gesetzt
			tail.next = null;
			// und schliesslich der Wert zurueckgegeben 
			return wert;
		}
	}
	//Die Liste wird von head bis tail durchlaufen:
	void printForward(){
		//Dies geschieht in der while-Schleife so lange,
		// bis die next-Referenz null ist, also man am tail vorbei ist:
		pos = head;
		//Falls die Liste leer ist, gibt es eine besondere Ausgabe:
		if (pos==null){
			System.out.print("Die Liste ist leer!");
		}
		else {
		while (pos!=null){
			System.out.print(pos.value+" ");
			pos = pos.next;
		}
		}
		System.out.print("\n");
	}
	//Hier analog von tail bis head:
	void printBackward(){
		pos = tail;
		//Falls die Liste leer ist, gibt es eine besondere Ausgabe:
		if (pos==null){
			System.out.print("Die Liste ist leer!");
		}
		else{
		while (pos!=null){
			System.out.print(pos.value+" ");
			pos = pos.prev;
		} }
		
		System.out.print("\n");
		
	}
	
}
