
public class primzahlen {
	
	public static void main (String[] args) {
		
		double a=1;
		double b=100;
		
		double x;
		String liste="";
		int elemente=0;
		
		
		for (x=a;x<=b;x++){
			int zähler=0;
			//System.out.println(x);
			double y;
			for (y=x-1;y>=1;y--){
				double z = x/y;
				double m;
				
				for (m=x-1;m>=2.0;m--){
					
					if (Double.toString(z).equals(Double.toString(m))){
						//System.out.println("Teiler von "+x+" ist "+y+". Ergebnis: "+z);
						zähler=zähler+1;
					}
				}
			}
			
			//System.out.println("Teiler: "+zähler);
			if (zähler==0){
				//System.out.println("Primzahl gefunden! ->"+x);
				liste=liste+Double.toString(x)+" ";
				elemente=elemente+1;
			}
		}
		
		System.out.println("Primzahlen von "+a+" bis "+b+": "+liste);	
		System.out.println(elemente+" Elemente in der Liste vorhanden.");
		
	}

}
