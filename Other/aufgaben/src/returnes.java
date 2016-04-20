/**
 * 
 */

/**
 * @author Schüler
 *
 */
public class returnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parameteres.main(args);
		String a="guten morgen liebe sonne.";
		String b=a.substring(4,7);
		String c=a.concat(" guten morgen sonnenschein.");
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.charAt(a.length()-6));
		System.out.println(a.length());
		double d=23424.43;
		System.out.println(a.valueOf(d));
		System.out.println(a.compareTo(c));
		System.out.println("blub".compareTo("blab"));
		System.out.println(a.equals(c));
		System.out.println("".compareTo(" "));
		System.out.println(a.contains("gen "));
		System.out.println(a.contentEquals(""));
		
		
		
	}

}
