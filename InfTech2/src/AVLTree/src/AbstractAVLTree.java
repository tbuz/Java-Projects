public abstract class AbstractAVLTree<T>{

    // das Attribut ist protected damit es von der erbenden Klasse benutzt werden kann
    protected Node<T> root;

    /**
        * Konstruktor
        */
    public AbstractAVLTree() {
        root = null;
    }

    /**
        * füge ein Element (Data) in den Baum ein (sortiert nach key)
        * @param key
        * @param data Element
        */
    public abstract void insert(int key, T data);

    /**
        * suche das Datenelement welches zum key gehört
        * @param key
        * @return das Datenelement oder null
        */
    public T search(int key){
        return search(key, root);
    }

    /**
        * suche das Datenelement welches zum key gehört. Startpunkt der Suche ist currentNode
        * @param key, currentNode
        * @return das Datenelement oder null
        */
    private T search(int key, Node<T> currentNode){
        if( currentNode == null )
            return null;
        
        if( currentNode.isLeaf() && key == currentNode.key )
            return currentNode.data;		
        
        if( key <= currentNode.key )
            return search(key, currentNode.left);
        else
            return search(key, currentNode.right);
    }

    /**
        * lösche das Element mit dem gegebenem key
        * @param key
        */
    public abstract void delete(int key);

    /**
        * Methode zum Ausgeben des Baumen im Terminal (mit Baumdesign
        */
    public void print(){
        print(root, "");
        System.out.println();
    }

    /**
        * rekursive Methode um den Baum zu traversieren und die Blätter und Forks auszugeben
        * @param node
        * @param Höhe
        */
    private void print(Node<T> node, String height){
        if( node != null ){
            print(node.right, height+"|  ");
            
            System.out.println(height+"|--"+node);
            
            print(node.left, height+"|  ");
        }
    }

    /**
        * Lösche den ganzen Baum
        */
    public void clear(){
        root = null;
    }	

    /**
        * Überprüfe die AVL-Bedingung des gesamten Baumes
        * @return true: der baum ist ein AVL-Baum; false: sonst
        */
    public boolean treeFulfillsAVLCondition(){
        return treeFulfillsAVLCondition(root) != -1;
    }

    /**
    * Überprüfe die AVL-Bedingung des gesamten Baumes
    * @param Node node der Knoten an dem die Überprüfung beginnt
    * @return true: der baum ist ein AVL-Baum; false: sonst
    */
    public boolean checkAVLCondition(Node node){
        return treeFulfillsAVLCondition(node) != -1;
    }

    /**
    * berechnet die maximale Höhe des linken und rechen Teilbaumes (start bei node)
    * @param Node node Der Knoten an dem gestartet wird
    * @return Die Höhe des Teilbaumes aufgespannt bei node
    */
    private int treeFulfillsAVLCondition(Node node){
        if( node == null || node.isLeaf() )
            return 0;
        
        int leftHeight = treeFulfillsAVLCondition(node.left);
        int rightHeight = treeFulfillsAVLCondition(node.right);
        
        if( leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight)+1;
}
}
