import java.util.LinkedList;

//Modelliet Queue 
public class Queue<T> {
// interne variable	
	private LinkedList<T> list;
//default konstruktor
	public Queue(){
		list = new LinkedList<T>();
	}
//methoden	
	public void enqueue(T data){
		list.add(data);
	}
	
	public T dequeue(){
		return list.pollFirst();
	}
	
	public T peek(){
		return list.peekFirst();
	}
}
