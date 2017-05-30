
public class HeapSort<T extends Comparable<T>> {
	
	T[] knoten;
	
	HeapSort(T[] knoten){
		this.knoten = knoten;
	}
	
	public void buildHeap() {
		int index;
		//startindex wird festgelegt ( n/2 -> nach unten abgerundet):
		if (knoten.length%2==0)	index = knoten.length/2;
		//ungerade Arraylaenge wird gesondert behandelt um abzurunden
		else index = (knoten.length-1)/2; 
		
		heapify(index, 0);
	}
	
	private	void heapify(int currIdx, int endIndex){
		//In dieser Aufgabe brauchen wir nur das Sift-Down aus Heapify
		for (int i = currIdx; i>endIndex; i--){
			//fuer jedes Element von index 0 bis n
			siftdown(i, knoten.length);
		}
	}
	private void siftdown(int idx, int end){
		//Wenn beide Nachfolger existieren:
		if (idx*2+2<knoten.length){
			//Der linke Nachfolger ist groesser als der rechte und auch als die Wurzel:
			if (knoten[idx*2+1].compareTo(knoten[idx*2+2])>=0 && knoten[idx].compareTo(knoten[idx*2+1])<0){
				//dann swap:
				swapknoten(idx, idx*2+1);				
				//und rekursiver Aufruf:
				siftdown(idx*2+1, end);
			}
			//Oder der rechte Nachfolger hat den groessten Wert (analog):
			if (knoten[idx*2+2].compareTo(knoten[idx*2+1])>=0 && knoten[idx].compareTo(knoten[idx*2+2])<0){
				swapknoten(idx, idx*2+2);				
				siftdown(idx*2+2, end);
			}
		}
		//Wenn nur ein Nachfolger existiert (muss der linke sein)
		if (idx*2+2==knoten.length){
			if (knoten[idx].compareTo(knoten[idx*2+1])<0){
				swapknoten(idx, idx*2+1);				
				siftdown(idx*2+1, end);
			}
		}
	}
	//Methode zum tauschen von i und j
	private void swapknoten(int i, int j){
		T tmp = knoten[i];
		knoten[i] = knoten[j];
		knoten[j] = tmp;
	}
	
	public void heapSort(){
		
	}
}
