
public class TestText {
	
	public static void main(String[]args){
		//t1 und t2 werden deklariert...
		Text t1, t2;
		//...und initialisiert/als Objekte erzeugt
		t1 = new Wort("ertse eingabe : eingaedxlfkjghxfjkclhgflxdjkhgxfdljkg");
		t2 = new Wort("zweite eingabe : jskgfjaksblieivlylukiuduil");
		
		//Befehle werden ausgeführt
		t1.append(t2);
		System.out.println(t1);
	}
}
