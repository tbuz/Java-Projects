import java.text.DecimalFormat;

//Modelliert eine Speise
public class Speise {
//interne variablen
	private String Name;
	private double Preis;

//default Konstruktor	
	public Speise(String _name, double _preis){
		this.Name = _name;
		this.Preis = _preis;
	}
//Methode toString wird angepasst	
	public String toString(){
		DecimalFormat f = new DecimalFormat("#0.00");		
		return (this.Name+", Preis: "+f.format(this.Preis));
	}
}
