import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class grafisch {

	/**
	 * @param args
	 */	
	public static double ergebnis=0;
	
	public static JFrame f = new JFrame ("Fensterli");
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		char operator=javax.swing.JOptionPane.showInputDialog("Operator").charAt(0);
		
		double x=Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Zahl1"));

		double y=Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Zahl2"));

		//JFrame f = new JFrame ("Fensterli");
	    //f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
	    //f.setSize( 300, 200 ); 
	    //f.setVisible( true ); 
	    
	    int n = JOptionPane.showConfirmDialog(
	    	f,
	    	"Jetzt kommt das Ergebnis!",
	    	"Fenster",
	    	JOptionPane.YES_NO_OPTION);
	    
	    switch (n){
	    case 1 : //Cancel / NO
	    	break;
	    case 0 : //OK / Yes
	    	rechner(operator,x,y);
	    	break;
	    }
	}
	public static void rechner(char args1, double args2, double args3){
		
		switch (args1){
		case '+':
			ergebnis=args2+args3;
			System.out.println(ergebnis);
		    JOptionPane.showMessageDialog(f,"Das Ergebnis:"+" "+ergebnis);
			break;
		case '-':
			ergebnis=args2-args3;
			System.out.println(ergebnis);
		    int o = JOptionPane.showConfirmDialog(
		    	    f,
		    	    "Das Ergebnis:"+" "+ergebnis,
		    	    "Fenster",
		    	    JOptionPane.OK_CANCEL_OPTION);
			break;
		case '*':
			ergebnis=args2*args3;
			System.out.println(ergebnis);
		    int p = JOptionPane.showConfirmDialog(
		    	    f,
		    	    "Das Ergebnis:"+" "+ergebnis,
		    	    "Fenster",
		    	    JOptionPane.OK_CANCEL_OPTION);
			break;
		case '/':
			ergebnis=args2/args3;
		    int q = JOptionPane.showConfirmDialog(
		    	    f,
		    	    "Das Ergebnis:"+" "+ergebnis,
		    	    "Fenster",
		    	    JOptionPane.OK_CANCEL_OPTION);
			break;
		default:
			System.out.println("Falscher Operator!");
			break;		
		
		//int r = JOptionPane.showConfirmDialog(
		  //	    f,
		   	//    "Das Ergebnis:"+" "+ergebnis,
		   	  //  "Fenster",
		   	    //JOptionPane.OK_CANCEL_OPTION);

		//javax.swing.
		//ergebnis=Double.parseDouble(javax.swing.JOptionPane.showMessageDialog(frame,ergebnis,"Ergebnis",JOptionPane.MESSAGE,icon);
		

		}
	
	}
	public static void gutenMittag(){
		System.out.println("Hallo, ich wünsche einen guten Mittag!");
		
	}
		
	}
