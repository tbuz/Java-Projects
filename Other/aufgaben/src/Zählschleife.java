
public class Zählschleife {
	
	static int y=0;
	
	public static void zähler(){
		int x;
		
		for ( x = 1 ; y == 10; y++){
			
			System.out.println(x);
			
			x=x+1;
			
			switch (x){
			case 3:
				System.out.println("3 gefunden!");
				break;
			case 7:
				System.out.println("7 ist drin!");
				break;
			case 10:
				System.out.println("10 ist drin!");
				break;
			default:
				System.out.println("weiterzählen");
				
				
			}
			
		}
		
		System.out.println("Fertig. x="+x);
	}

}
