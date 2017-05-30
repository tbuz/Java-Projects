
public class TestDoppel {
	
	public static void main(String[] args){
		
		DoubleLinkedList<String> testliste = new DoubleLinkedList<String>(); 
		System.out.println("Erstes Element eingefügt: ");
		testliste.appendHead("Wie geht es dir?");
		testliste.printForward();
		System.out.println("\n Zwei Elemente: ");
		testliste.appendHead("Hallo!");
		testliste.printForward();
		System.out.println("\n Drei Elemente: ");
		testliste.appendTail("Mir geht es gut!");
		testliste.printForward();
		System.out.println("\n Vier Elemente: ");
		testliste.appendTail("Ende!");
		testliste.printForward();
		
		System.out.println("\n Tail wurde entfernt: "+testliste.popTail());
		testliste.printForward();
		System.out.println("\n Head wurde entfernt: "+testliste.popHead());
		testliste.printForward();
		
		System.out.println("\n Liste wird geleert...");
		System.out.println("Heads fallen heraus: "+testliste.popHead()+" und "+testliste.popHead());
		testliste.printForward();
		testliste.printBackward();
		
		System.out.println("\n Liste wird neu gefüllt: ");
		//(absichtlich verkehrt herum)
		testliste.appendHead("Der");
		testliste.appendHead("Test");
		testliste.appendHead("ist");
		testliste.appendHead("erfolgreich");
		testliste.appendHead("durchgeführt");
		testliste.appendHead("worden");
		testliste.appendHead("!");
		testliste.printForward();
		testliste.printBackward();


		
		
		
	}
	
	

}
