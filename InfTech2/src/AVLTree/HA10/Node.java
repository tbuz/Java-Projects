public class Node<T>{
    public int key;
    public T data;

    public Node<T> left;
    public Node<T> right;

    public int height;

    /**
        * Konstruktor fuer einen Blattknoten
        * @param key
        * @param data
        * @param parent
        */
    public Node(int key, T data){
        this.key = key;
        this.left = null;
        this.right = null;
        this.data = data;
        this.height = 0;
    }

    /**
        * Konstruktor fuer einen Forkknoten
        * @param key
        * @param left
        * @param right
        * @param parent
        */
    public Node(int key, Node<T> left, Node<T> right){
        this.key = key;
        this.left = left;
        this.right = right;
        this.data = null;
        this.height = -1;
    }
    /**
        * Konstruktor fuer einen Forkknoten mit Hoehe
        * @param key
        * @param left
        * @param right
        * @param parent
        */
    public Node(int key, Node<T> left, Node<T> right, int height){
        this.key = key;
        this.left = left;
        this.right = right;
        this.data = null;
        this.height = height;
    }


    public String toString() {
        String result = key+"["+height+"]";
        
        if( isLeaf() )
            result += data.toString();
        
        return result;
    }

    /**
        * wenn das Daten-Element nicht leer ist(null), dann ist der Knoten ein Blatt
        * @return true - Knoten ist ein Blatt; false - Knoten ist ein Fork
        */
    public boolean isLeaf(){
        return this.data != null;
}
}
