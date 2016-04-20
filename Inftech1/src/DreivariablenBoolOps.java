/**
 * 
 * @author T24G02
 * Hausaufgabe 14 Aufgabe 4
 *
 */
public class DreivariablenBoolOps implements BoolescheOperationen {
	//Klassenattribute werden deklariert
	private boolean a;
	private boolean b;
	private boolean c;
	
	//Der parametrisierte Konstruktor weist den Klassenattributen die Parameter zu
	public DreivariablenBoolOps (boolean x, boolean y, boolean z){
		a = x;
		b = y;
		c = z;
	}
	
	//MehrfachUND benutzt den Operator && (logisches Und):
	//(Das Ergebnis wird zurückgegeben)
	public boolean und() {
		return (a && b && c);
	}
	
	//MehrfachODER benutzt den Operator || (logisches Oder):
	public boolean oder() {
		return (a || b || c);
	}
	//toString fasst alle Attribute und Ergebnisse in einem String zusammen:
	public String toString(){
		return ("a: "+a+"\n"+"b: "+b+"\n"+"c: "+c+"\n"+"MehrfachUND: "+und()+"\n"+"MehrfachODER: "+oder());
	}

}
