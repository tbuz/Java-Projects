
public class Rumrechnen1 {
	public static void main (String[] args){
		String a = "Hallo";
		String b = "nicht Hallo";
		String c = "nicht ";
		
		texter (a, b);
		texter (c, b);
		
	}
	public static void texter (String n, String m) {
		if (n.equals(m)){
		System.out.println("true"); }
		else {
			System.out.println("false");
			
		}
	}
}
