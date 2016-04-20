/**
 * 
 * @author T24G02
 * Hausaufgabe 14 Aufgabe 4
 *
 */
public class ArrayBoolOps implements BoolescheOperationen {
	
	private boolean[] bArray;
	
	public ArrayBoolOps (boolean[] array){
		bArray = array;
	}
	
	//Beim MehrfachUND für ein Array braucht man einen Zwischenspeicher,
	//der mit jedem nächsten Wert (aus der for-Schleife) des Arrays 
	//"verUNDet" wird:
	public boolean und() {
		boolean speicher = bArray[0];
		for (int i=1; i<bArray.length; i++){
			speicher = (speicher && bArray[i]);
		}
		return speicher;
	}
	//Das MehrfachODER funktioniert hier analog zum
	//MehrfachUND:
	public boolean oder() {
		boolean speicher = bArray[0];
		for (int i=1; i<bArray.length; i++){
			speicher = (speicher || bArray[i]);
		}
		return speicher;
	}
	//toString fasst alle Attribute und Ergebnisse in einem String zusammen:
		public String toString(){
			String ausdruck = ""+bArray[0];
			for (int i=1; i<bArray.length; i++){
				ausdruck += ", "+bArray[i];
			}
			return ("Array: "+ausdruck+"\n"+"MehrfachUND: "+und()+"\n"+"MehrfachODER: "+oder());
		}
	
}
