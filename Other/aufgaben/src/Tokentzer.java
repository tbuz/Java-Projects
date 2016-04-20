import java.util.StringTokenizer;

public class Tokentzer {

	/**
	 * @param args
	 */
	public static String a = "Hallo lieber guter\tgroßer\nElefant !";
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer(a);
		System.out.println(a);
		System.out.println("Insgesamt "+st.countTokens()+" Wörter im Satz vorhanden.");
		while (st.hasMoreTokens()){

			System.out.println("-->"+st.nextToken());
			
			if (st.countTokens()>0){
				System.out.println("Noch "+st.countTokens()+" Wörter im Satz vorhanden.");
			}
			if (st.countTokens()==0){
				System.out.println("Kein Wort mehr im Satz übrig.");
			}

		}
		System.out.println("Ende. Es sind "+st.countTokens()+" Wörter übrig.");		
		
		
	}

}
