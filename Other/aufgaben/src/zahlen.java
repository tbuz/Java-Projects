/**
 * 
 */

/**
 * @author Sch�ler
 *
 */
public class zahlen {

	/**
	 * @param args
	 */
	public static final double a= Math.PI;
	
	public static final double b=Math.E;
	
	public static final double c = Math.random()*100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = (int) c;
		System.out.println(a);
		System.out.println("Zahl zwischen 0 und 100: "+d);
		kreis(10);
		
	}
		
	public static void kreis(int a){
		double r=a/2;
		double U = 2*Math.PI*r; //Umfang
		double A = Math.PI*r*r; //Fl�cheninhalt
		double h = 10;
		double V = A*h;
		
		System.out.println("Radius = " + r);
		System.out.println("Umfang = " + U);
		System.out.println("Fl�che = " + A);
		System.out.println("Volumen = " + V +" bei einer H�he von " + h);
		
		
	}

}
