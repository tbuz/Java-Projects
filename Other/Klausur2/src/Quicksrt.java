import java.util.Random;

public class Quicksrt {
	public static int rektiefe=0;
	public static int swapzaehler=0;
	   public static void sortiere(int x[]) {
	      qSort(x, 0, x.length-1);
	   }
	    
	   public static void qSort(int x[], int links, int rechts) {
	      if (links < rechts) {
	         int i = partition(x,links,rechts);
	         qSort(x,links,i-1);
	         rektiefe++;
	         qSort(x,i+1,rechts);
	      }
	   }
	    
	   public static int partition(int x[], int links, int rechts) {
	      int pivot, i, j, help;
	      pivot = x[rechts];               
	      i     = links;
	      j     = rechts-1;
	      while(i<=j) {
	         if (x[i] > pivot) {     
	            // tausche x[i] und x[j]
	            help = x[i]; 
	            x[i] = x[j]; 
	            x[j] = help;                             
	            j--;
	            swapzaehler++;
	         } else i++;            
	      }
	      // tausche x[i] und x[rechts]
	      help      = x[i];
	      x[i]      = x[rechts];
	      x[rechts] = help;
	      swapzaehler++;
	        
	      return i;
	   }
	    
	   public static void main(String[] args) {
		   int elemente=100;
			
			Random rand = new Random();
			int[] liste = new int[elemente];

			for (int i=0; i<liste.length;i++){
				liste[i]=rand.nextInt(1000);
			}
	      sortiere(liste);
	      System.out.println(swapzaehler);
	      System.out.println(rektiefe);
	      for (int i=0; i<liste.length; i++) 
	         System.out.print(liste[i]+" ");         
	   }    
	}

