
public class Auto {
	int reifen;
	String Farbe;
	int Vmax;
	String Name;
	
	Auto(int reifen1,  String Farbe, int Vmax, String Name){
		this.reifen=reifen1 ;
		this.Farbe=Farbe ;
		this.Vmax=Vmax ;
		this.Name=Name ;
		
		System.out.println("---Konstruktor ausgeführt--- ");
		
	}
	public String setName(String Marke){
		Name = Marke;
		return Name;
	}
	
	public int getReifen(){
		//reifen = 4;
		return reifen;
	}
	public String getFarbe(){
		return Farbe;	
	}
	public int getVmax(){
		return Vmax;		
	}
	public String getName(){
		return Name;
	}

}
