
public class HelloWorld {

	public static void main(String[] args) {
		
		int x=0;
		
		double a=Math.PI;
		System.out.println("PI="+a);
		
		//int y;
		
		while (x<10){
			
			System.out.println("Es wird gezählt....");
			System.out.println(x);
			
			System.out.println(checken(x));
			
			x=x+1;
			
		}
			
		
		
		System.out.println("Ende. x="+x);
		
		
	}


	public static String checken(int x){
		String y="";
		
		switch (x){		
		
		case 3:
			y="3 gefunden!";
			
		case 8:
			y="8 ist drin!";
			
		default:
			return (y);
			
			
		
	}

}
	
}
