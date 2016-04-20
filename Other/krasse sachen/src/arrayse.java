
import java.util.Arrays;

public class arrayse {
	
	public static void main (String args []){
		
		int[] a={3,4,5,6,7,11,23,43,67,97,234};
		
		String[] gut;
		gut = new String[10];
		gut[0]="Hey";
		gut[1]="Computer";
		gut[2]="alles";
		gut[3]="klar?";
		
		System.out.println(a.length);
		
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
		System.out.println("---");
		
		double z = 0;
		for (int i : a){
			z=z+i;
			System.out.println(z);
		
		}
		double mittelwert = z/a.length;
		System.out.println("Mittelwert: "+mittelwert);
		
		
		for (String grt : gut){
			System.out.println(grt);
		}
		
		klassisch(a);
		
		zweidimenso();
	}
	public static void zweidimenso(){
		
		int[][] a = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}}; 
		System.out.println(a);

	}		
	public static void klassisch(int[] a){
		
		int[] c;
		c=new int[5];
		c[0]=3;
		c[1]=2;
		c[2]=1;	
		
		//int t=1;
		
		for (int t=1 ; t<5 ; t++){
			Arrays.fill(c, 3, 10, t);
			for (int g : c){
				System.out.println(g);
		}	
		}
		
		for (int g : c){
			System.out.println(g);
		}
		 int[] cc = c.clone();
		
		System.out.println(Arrays.equals(c, cc)); //ausdruck: boolean
		
		System.out.println(Arrays.binarySearch(a, 6)); //Ausdruck: stellenangabe
		
		//System.out.println(Arrays)
		
		
	}
		
}

