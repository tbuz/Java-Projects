import java.util.StringTokenizer;

public class Tokentzer {

	/**
	 * @param args
	 */
	public static String a = "Hallo lieber guter\tgro�er\nElefant !";
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer(a);
		System.out.println(a);
		System.out.println("Insgesamt "+st.countTokens()+" W�rter im Satz vorhanden.");
		while (st.hasMoreTokens()){

			System.out.println("-->"+st.nextToken());
			
			if (st.countTokens()>0){
				System.out.println("Noch "+st.countTokens()+" W�rter im Satz vorhanden.");
			}
			if (st.countTokens()==0){
				System.out.println("Kein Wort mehr im Satz �brig.");
			}

		}
		System.out.println("Ende. Es sind "+st.countTokens()+" W�rter �brig.");		
		
		
	}

}
