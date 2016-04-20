/**
 * 
 */

/**
 * @author Schüler
 *
 */
public class die_wahrheit {

	/**
	 * @param args
	 */
	public static int c=5;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z1=2;
		int z2=5;
		int z3=6;
		int z4=9;
		int z5=12;
		
		System.out.println(z1<z2);
		System.out.println(z1>z2);
		
		System.out.println((z1+z4)<(z2+z3));
		System.out.println((z1+z4)>(z2+z3));
		
		System.out.println((z1+z3)>z5&&(z2+z4)>z5);
		
		System.out.println((z1+z3)>z5||(z2+z4)>z5);
		
		System.out.println("Eine weitere Methode wird aufgerufen......");
		gutenTag();
		
		System.out.println("Und noch eine.....");
		gutenAbend();
		
		System.out.println("Jetzt wird importiert...");
		grafisch.gutenMittag();
		
		System.out.println(c);
		}
	public static void gutenTag(){
		String a="Das ist die Methode gutenTag()";
		System.out.println(a);
	}
	public static void gutenAbend(){
		String a="Das ist die Methode gutenAbend()";
		System.out.println(a);
		
		
	}
	}
