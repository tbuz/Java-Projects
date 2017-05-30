
public class HeapSort<T extends Comparable<T>> {
	
	private T[] knoten;
	
	public HeapSort(T[] knoten){
		this.knoten = knoten;
	}
	
	public void buildHeap() {	
		int index;
		//startindex wird festgelegt ( n/2 -> nach unten abgerundet):
		if (knoten.length%2==0)	index = knoten.length/2;
		//ungerade Arraylaenge wird gesondert behandelt um abzurunden
		else index = (knoten.length-1)/2;
		for (int i= index; i>=0; i--){ 
            heapify(i,knoten.length-1);
        } 
		heapify(index,knoten.length-1);
	}
	
	private	void heapify(int currIdx, int endIndex){
		int LeftChild = 2*currIdx +1;
		int RightChild = 2*currIdx +2;
		int biggest;
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		if (RightChild>endIndex && LeftChild <=endIndex){ //es gibt nur linkes Kind
            if(knoten[currIdx].compareTo(knoten[LeftChild])<0){ //Defekt gefunden
                swap(currIdx, LeftChild);
			}
		} else if(RightChild<=endIndex){// beide Kinder vorhanden
				if(knoten[LeftChild].compareTo(knoten[RightChild])>0){ //groesseres Kind wird gesucht...
					biggest=LeftChild; 
				}else{ 
					biggest=RightChild;
				}
            if(knoten[currIdx].compareTo(knoten[biggest])<0){//Defekt gefunden
                swap(biggest,currIdx);
            }  
		}
		if (currIdx>0) heapify(currIdx-1,endIndex);  //...usw. bis zum wurzel
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
	}

	
	private void swap(int knoten_a, int knoten_b){
		T tmp = knoten[knoten_a]; 
		knoten[knoten_a] = knoten[knoten_b];
		knoten[knoten_b] = tmp;
	}
	
	public void heapSort(){
		buildHeap();
		int laengeSortiert=knoten.length-1;
		while (laengeSortiert>0){
			swap(0,laengeSortiert);
			laengeSortiert--;
			for (int i= laengeSortiert; i>=0; i--){ 
				heapify(i,laengeSortiert);
			} 
		}
	} 
}
