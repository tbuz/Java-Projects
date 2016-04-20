import java.io.*;

public class Passworti {
	private String password;
	private String name;
	Passworti(String passwort, String Name){
		this.password=passwort;
		this.name=Name;
		
	}
	
	public void abfrage(){
		System.out.println();
		System.out.println("Passwort bitte: ");
		
		String x = " ";
		
		BufferedReader buffer =  new BufferedReader (new InputStreamReader(System.in));
		try {
			x = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falsch! Nochmal...");
		}
		
		if (x.equals(password)){
			
			System.out.println("Richtig!");		
		}
		else {
			
			System.out.println("Falsch! Nochmal...");
			abfrage();
		}

	}
	public String getPasswort(){
		return password;
	}
	
	public String getName(){
		return name;
			
	}
	private String setPasswort(String arg){
		password = arg;
		return password;
	}
	public void changePasswort(){
		System.out.println("Das Passwort soll geändert werden.");
		
		String z = javax.swing.JOptionPane.showInputDialog("aktuelles Passwort eingeben:");
		
		if (z==password) {
			String y = javax.swing.JOptionPane.showInputDialog("neues Passwort eingeben:");
			setPasswort(y);
		}
		else {
			System.out.println("Falsche Eingabe!");
			changePasswort();
		}
		
		
		
	}

}
