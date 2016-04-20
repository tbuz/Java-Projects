
public class Meth {
	public static void main (String[] args){
		a(15 + 6);
		Meth.a(21);
		Meth.b(Meth.b(0, "zwei"), "acht");
	}
	public static void a(int x){
		System.out.println(x);
	}
	public static int b(int x, String y){
		return (x);
	}

}
