import java.util.ArrayList;
import java.util.LinkedList;

//Modelliert eine Speisekarte
public class Speisekarte<T> {
//interne variable
	private ArrayList<T> list;

//default Konstruktor	
	public Speisekarte(){
		list = new ArrayList<T>();
	}

//Methoden	
	public void aufnehmen (T data){
		list.add(data);
	}
	
	public void remove(T data){
		if (list.contains(data)) {
			list.remove(data);
		}else System.out.println("Speise nicht vorhanden");		
	}
	
	public T getSpeiseat(int index){
		return list.get(index);
	}
	
	public void listAll(){
		int listSize = list.size();
		if (listSize > 0) {
			for (int position = 0; position < listSize; position++){
				System.out.println(list.get(position).toString());
			}
		}else System.out.println("Speisekarte ist leer!!!");
	}
}
