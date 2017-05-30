
public class SearchTree<T>{

    private Node root; 

    // inner abstract class node
    private abstract class Node{

        private int key; 

        public Node(int key){
            this.key = key;
        }
        
        public int getKey(){
            return this.key;
        }
        
        public abstract Node insert(int key, T element);

        public abstract Node delete(int key);

        public abstract String toString(String tree, String ast);
        //abstrakte Methode hinzugefügt, um Rotation zu ermöglichen:
		public abstract Node singleRotateLeft();
                            
    }

    // inner class fork
    //analog zum Tutorium und zur Vorlesung:
    private class Fork extends Node{
    	
    	Node left;
    	Node right;
        
    	public Fork(int key){
    		super(key);
    	}
    	//erweiterter Konstruktor für die insert Funktion, 
    	// damit man direkt ein Fork mit beiden Verzweigungen erzeugen kann:
    	public Fork(Node left, int key, Node right){
    		super(key);
    		this.left = left;
    		this.right = right;
    	}
    	//insert laeuft analog zum add aus der Vorlesung,
    	// hier (in Fork) wird das Element je nach key 
    	// an die richtige Verzweigung weitergegeben:
    	public Node insert(int key, T element){
    		if (key <= this.getKey()){
    			this.left = this.left.insert(key, element); }
    		else { 
    			this.right = this.right.insert(key, element);
    		}
    		return this;
    	}
    	//delete laeuft ebenfalls analog zur Vorlesung,
    	// der gesuchte Key wird je nach Groesse nach links oder rechts
    	// weitergegeben, dabei wird geprüft, ob das folgende Element schon
    	// das gesuchte ist (wenn ja -> loeschen bzw. Referenz entfernen):
    	public Node delete(int key){
    		if (key <= this.getKey()){
    			this.left = this.left.delete(key);
    			if (this.left == null){
    				return this.right;
    			}
    			else return this;
    		}
    		else {
    			this.right = this.right.delete(key);
    			if (this.right == null) {
    				return this.left;
    			}
    			else return this;
    		}
    	}
    	// toString-Methode wurde so implementiert, wie im Forum vorgeschlagen wurde:
		public String toString(String tree, String ast) {
			tree += "|";
			return right.toString(tree, ast)+"\n"+tree+this.getKey()+" \n"+left.toString(tree, ast);
		}
		public Node singleRotateLeft(){
			Fork b = (Fork)this.right;
	        this.right = b.left;
	        b.left = this;
	        return b;
		}
    }

    // inner class leaf
    //analog zum Tutorium:
    private class Leaf extends Node{
    	
    	T value;
    	Leaf(int key, T value){
    		super(key);
    		this.value = value;
    	}
    	public Node insert(int key, T element){
    		Leaf newLeaf = new Leaf(key, element);
    		if (key < this.getKey()){
    			return new Fork(newLeaf, key, this);
    		}
    		else if (key == this.getKey()){
    			return newLeaf;
    		}
    		else {
    			return new Fork(this, this.getKey(), newLeaf);
    		}
    	}
    	public Node delete(int key){
    		if (key == this.getKey()){
    			return null;
    		}
    		else {
    			System.out.println("Key nicht vorhanden!");
    			return this;
    		}
    	}
    	public Node singleRotateLeft(){
    		return this;
    	}
		@Override
		public String toString(String tree, String ast) {
			return (String) tree+"|"+ast+this.value;
		}
    }

    // constructor
    //leere Suchbaum wird erzeugt:
    public SearchTree(){
	root = null;
    }

    // parameterized constructor
    //Suchbaum wird beim erzeugen gleich mit einem Element gefuellt:
    public SearchTree(int key, T data){
    	root = root.insert(key, data);
    }

    // inserts a new element with given key in the tree
    // 2 Moegliche Faelle hier im insert:
    // 	1. es existiert noch kein Element (root == null)
    // 	2. es existiert schon ein Baum, dieser wird erweitert:
    public void insert(int key, T element){
    	if (root != null) root = root.insert(key, element);
    	else root = new Leaf(key, element);
    }

    // deletes an element with a given key from the tree
    //In dieser Hauptklasse SearchTree werden nur die Methoden
    // der Subklassen aufgerufen, je nachdem ob ein Fork oder Leaf vorliegt.
    // (Durch diese Art der Implementierung spart man sich viele
    // instanceof-Pruefungen)
    public void delete(int key){
    	if (root != null){
    		root = root.delete(key);
    	}
    }

    // single left rotation on the root
    public void singleRotateLeft(){
        root = root.singleRotateLeft();
    }

    // returns a string representation of the tree
    public String toString(){
    	return root.toString("", "-");
    }

 }
