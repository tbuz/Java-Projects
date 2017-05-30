
public class TestBaum {
	
	public static void main(String[] args){
		//Array wird erzeugt:
		char[] arr = {'H','D','L','B','F','J','N','A','C','E','G','I','K','M','O'};
		//Baum-Objekt wird erzeugt, mit arr als Parameter:
		Baum testbaum = new Baum(arr);
		//Traversierungen und Bildschirmausgaben:
		System.out.println("Inorder:");
		testbaum.printInorder(0);
		System.out.println("\n");
		System.out.println("Preorder:");
		testbaum.printPreorder(0);
		System.out.println("\n");
		System.out.println("Postorder:");
		testbaum.printPostorder(0);
	}
}
