
public class Baum {
	
	private char[] knoten;
	
	public Baum(char[] param){
		knoten = param;
	}
	//i ist die Wurzel, ab der man die Knoten ausgeben soll
	public void printInorder(int i){	 
		//Der Index darf das Array nicht ueberschreiten
		if (i<knoten.length){
			//Die Reihenfolge der Aufrufe analog zur Vorlesung:
			printInorder(getLeftChild(i));
			System.out.print(knoten[i]+" ");
			printInorder(getRightChild(i));
		}
	}
	//Preorder und Postorder analog:
	public void printPreorder(int i){
		if (i<knoten.length){
			System.out.print(knoten[i]+" ");
			printPreorder(getLeftChild(i));
			printPreorder(getRightChild(i));
		}
	}
	public void printPostorder(int i){
		if (i<knoten.length){
			printPreorder(getLeftChild(i));
			printPreorder(getRightChild(i));
			System.out.print(knoten[i]+" ");
		}
	}
	//interne getter fuer die order-Methoden
	private int getLeftChild(int i){
		return 2*i+1;
	}
	private int getRightChild(int i){
		return 2*i+2;
	}
	
	

}
