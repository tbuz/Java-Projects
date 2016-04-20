
public abstract class forkacke {
	
	public static void main(String[] args){
			
		int k = 2;
		System.out.println("k="+k);
		for (int i = 2; i < 7; i+=2){
			System.out.println("k="+k);
			System.out.println("i="+i);
			k *= 2;
			System.out.println("k="+k);
			System.out.println("i="+i);
			System.out.println("----");
		}
		System.out.println("k="+k);
	}
	abstract void blabla();
}
