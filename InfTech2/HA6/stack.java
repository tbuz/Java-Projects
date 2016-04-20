import java.util.LinkedList;

// Modelliert einen Stack
public class stack<T> {
	 
// Interne variable
	private LinkedList<T> list;
// Default Konstruktor
	public stack() {
		list = new LinkedList<T>();		
	}
//Methoden	
	public void push(T data){
		list.add(data);
	}
	
	public T pop(){
		return list.pollLast();
	}
	
	public T top(){		
		return list.peekLast();
	}
}