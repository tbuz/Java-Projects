
public class sort {
	
	public static void main(String[] args){
		
		int[] array = new int[20];
		
		for (int i=0; i<20; i++){
			array[i] = array.length - i;
		}
		
		print(array);
		
		sortier(array);
		System.out.println("Sortieren...");
		
		print(array);
		
	}
	
	public static void sortier(int[] a){
		int n = a.length;
		for (int i=0; i<n; i++){
			for (int j=0; j<n-1; j++){
				if(a[j] > a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
	
	public static void print(int[] a){
		System.out.print("[ ");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}

}
