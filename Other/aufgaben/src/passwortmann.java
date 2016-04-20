
public class passwortmann {

	 
	public static void main(String[] args) {
		Passworti a = new Passworti("abc345def","Tolga");
		Passworti b = new Passworti("gutentag","Horst");
		
		//a.abfrage();
		
		System.out.println(a.getName());
		System.out.println(a.getPasswort());
		System.out.println(b.getName());
		System.out.println(b.getPasswort());
		a.changePasswort();
		
		
	}

}
