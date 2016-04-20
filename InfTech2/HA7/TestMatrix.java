
public class TestMatrix {
	
	public static void main(String[] args){
		//Matrix erzeugen:
		String[][] matrix = new String[4][3];
		//Matrix fuellen:
		for (int i = 0; i<4; i++){
			for (int j = 0; j<3; j++){
				matrix[i][j]=Integer.toString(j+1+(i*3));
			}
		}
		//Objekt der Klasse Matrix<T> wird erzeugt:
		Matrix<String> testMatrix = new Matrix<String>(matrix);
		System.out.println("Print Matrix: ");
		System.out.println(testMatrix.toString());
		
		System.out.println("Print forward row-wise: ");
		for (String s: testMatrix){
			System.out.print(s+", ");
		}
		System.out.println("\n");
		
		testMatrix.setDirection("br");
		System.out.println("Print backward row-wise: ");
		for (String s: testMatrix){
			System.out.print(s+", ");
		}
		System.out.println("\n");
		
		testMatrix.setDirection("fc");
		System.out.println("Print forward column-wise: ");
		for (String s: testMatrix){
			System.out.print(s+", ");
		}
		System.out.println("\n");
		
		testMatrix.setDirection("bc");
		System.out.println("Print backward column-wise: ");
		for (String s: testMatrix){
			System.out.print(s+", ");
		}
		System.out.println("");
	}

}
