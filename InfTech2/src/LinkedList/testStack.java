
public class testStack {
	
	public static void main(String[] args) {
		stack<String> Stackobj = new stack<String>();
		
		System.out.println("Füge 5 String-Objekte den Stack hinzu:");
		System.out.println("1: erste string");
		Stackobj.push("erse string");
		System.out.println("2: zweite string");
		Stackobj.push("zweite string");
		System.out.println("3: dritte string");
		Stackobj.push("dritte string");
		System.out.println("4: vierte string");
		Stackobj.push("vierte string");
		System.out.println("5: fŸnfte string");
		Stackobj.push("fŸnfte string");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Entferne... ");
		System.out.println("1. element: "+Stackobj.pop());
		System.out.println("2. element: "+Stackobj.pop());
		System.out.println("3. element: "+Stackobj.pop());
		System.out.println("4. element: "+Stackobj.pop());
		System.out.println("5. element: "+Stackobj.pop());
		System.out.println("6. element: "+Stackobj.pop());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Erzeuge leeren Stack");
		stack<String> So = new stack<String>();
		System.out.println("\"top\" an leeren Stack anwenden: " + So.top());
		
	}

}
