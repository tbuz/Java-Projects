import java.io.*;

public class FReader {
	public static void main (String[] args){
		try {
			FileReader fr = new FileReader("Abschied.txt");
			BufferedReader br = new BufferedReader(fr);
			String zeile;
			int i = 0;
			int j = 1;
			while ((zeile=br.readLine())!=null){
				System.out.println(zeile);
				i=i+1;
				if (i==5 && j < 3){
					System.out.println("---------\n");
					i=0;
					j++;
				}
				if (i==4 && j >= 3){
					System.out.println("---------\n");
					i=0;
					j++;
				}
			}
		}
		catch (IOException e){
			System.out.println("Fehler");
		}

	}
}