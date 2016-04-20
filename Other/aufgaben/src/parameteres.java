/**
 * 
 */

/**
 * @author Schüler
 *
 */
public class parameteres {

	/**
	 * @param args
	 */
	public static boolean a = false;
	
	public static char b = 'b';
	
	public static int c = 234;
	
	public static double d = 345.3456;
	
	public static String e = "Hallöchen";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b = 'a';
		int c = 3453;
		int cc= 45457;
		boolean a = c==cc;
		double d = 765.9845;
		String e = "Gesundheit";
		
		einsa(a);
		einsb();
		zwei(b);
		drei(c);
		vier(d);
		fünf(e);
		System.out.println("_______");
		/**eins(true);
		zwei('a');
		drei(3453);
		vier(435.5345);
		fünf("Gesundheit");
		System.out.println("_______");		
		*/
		
		einsa(a);
		einsb();
		zwei(b);
		drei(c);
		vier(d);
		fünf(e);
	}
	
	public static boolean einsa(boolean args){
		System.out.println(args);
		return args;
		//System.out.println("return hat nich beendet!"); <- unreachable code
	}
	public static boolean einsb(){
		boolean ab=false;
		System.out.println(ab=2==2);
		return ab;
	}
	
	
	public static char zwei(char args){
		System.out.println(args);
		return args;
	}
	public static int drei(int args){
		System.out.println(args);
		return args;
		
	}
	public static double vier(double args){
		System.out.println(args);
		return args;
	}
	public static String fünf(String args){
		System.out.println(args);
		return args;
	}
	
}