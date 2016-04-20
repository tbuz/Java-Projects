
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
	}
	
	private	void heapify(int currIdx, int endIndex){
		int leftChild = 2*currIdx +1;
		int rightChild = 2*currIdx +2;
		int biggest;
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		if (rightChild>endIndex && leftChild <=endIndex){ //es gibt nur linkes Kind
            if(knoten[currIdx].compareTo(knoten[leftChild])<0){ //Defekt gefunden
                swap(currIdx, leftChild);
			}
		} else if(rightChild<=endIndex){// beide Kinder vorhanden
				if(knoten[leftChild].compareTo(knoten[rightChild])>0){ //groesseres Kind wird gesucht...
					biggest=leftChild; 
				}else{ 
					biggest=rightChild;
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
		//T[] sortiert = new T[];
		//sortiert.length = knoten.length;

		int laengeSortiert=knoten.length-1;
		System.out.println("Länge Sortiert: "+laengeSortiert+"Länge Knoten: "+knoten.length);
		int i=0;
		while (i<=laengeSortiert){
			swap(i,laengeSortiert);
			laengeSortiert--;
			System.out.println("Länge sortiert: " +laengeSortiert+" i:"+i+" Knoten[i]:" +knoten[i]);


			heapify(i,laengeSortiert);
		}



/*
		for (int i = knoten.length-1; i >0; i--) {
			swap(0, i);
			heapify(0,i-1); 
		}*/
	}
}
