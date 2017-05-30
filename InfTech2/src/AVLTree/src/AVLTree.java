public class AVLTree<T> extends AbstractAVLTree<T>{

    /**
        * Fuegt das Element mit gegebenem key und Daten ein
        * @param key
        */
    public void insert(int key, T data){
    	//Wir haben ein Leaf:
        if (root==null){
			root = new Node<T>(key, data);
		}
		else {
			root = insert(root, key, data);
		}
		//Höhe wird um 1 erhöht
        repairHeight(root);
		//AVL Bedingung wird korrigiert
        checkAVL(root);
    }
	//Erweiterte insert-Methode für rekursives insert:
	public Node<T> insert(Node<T> knoten, int key, T data){
		if (knoten.data!=null){
        	Node<T> Leaf = new Node<T>(key, data);
        	//Leaf wird zum Fork erweitert:
        	if (key<knoten.key){
        		knoten = new Node<T>(key, Leaf, knoten);
        	}
        	if (key>knoten.key){
        		knoten = new Node<T>(key, knoten, Leaf);
        	}
        	//Oder Leaf wird ueberschrieben: (bei gleichem Key)
        	if (key==knoten.key){
        		knoten.data = data;
        	}
        }
		else {
        	if (key <= knoten.key){
    			knoten.left = insert(knoten.left, key, data);
    		}
    		else { 
    			knoten.right = insert(knoten.right, key, data);
    		}
        }
		//Höhe wird korrigiert
        repairHeight(knoten);
		//AVL Bedingung wird korrigiert
        checkAVL(knoten);
		return knoten;
	}

    /**
        * LÃ¶sche das Element mit dem gegebenen key
        * @param key
        */
    public void delete(int key) {
	//zum Loeschen muss entweder ein Leaf oder ein Fork vorhanden sein
        if (root!=null){
			root = delete(root, key);		
		}
    }
	
	//erweiterte delete-Methode fuer rekursives Loeschen:
	public Node<T> delete(Node<T> knoten, int key){
		//es liegt ein Leaf vor:
		if (knoten.data != null){
		//key ist gleich, dann loeschen
			if (key == knoten.key){
				return null;
			}
			//sonst nichts aendern:
			else {
				return knoten;
			}
		}
		//Oder ein Fork
		else {
		//Abzweigung nach links
			if (key <= knoten.key){
				knoten.left = delete(knoten.left, key);
			}
			//oder nach rechts
			else {
				knoten.right = delete(knoten.right, key);
			}
	}

    /**
        * repariere die HÃ¶he eines Knotens
        * @param node Der Knoten dessen HÃ¶he erpariert werden soll
        */
    private void repairHeight(Node<T> node) {
        if( node != null &&  !node.isLeaf() )
            node.height = Math.max(node.left.height, node.right.height)+1;
    }
    //hinzugefügte Methode
    private boolean AVLcondition(Node<T> node){
    	if (node.data!=null) return true;
    	else return(Math.abs(node.left.height-node.right.height)<=1);
    }

    /**
        * ÃœberprÃ¼fe die AVL-Bedingung in einem Teilbaum
        * @param Node current Wurzel des Teilbaumes
        * @return Knoten der nach eine mÃ¶glichen Rotation die neue Wurzel des Teilbaums ist
        */
    private Node<T> checkAVL(Node<T> current){
        //wie check&repairAVL aus dem Tutorium:
    	//ist eine Rotation nötig?
    	if (!AVLcondition(current)){
    		//einfache Linksrotation nötig:
    		if (current.right.height>current.left.height && current.right.right.height >= current.right.left.height){
    			current = rotateLeft(current);
    		}
    		//doppelte Linksrotation nötig:
    		if (current.right.height>current.left.height && current.right.right.height < current.right.left.height){
    			current = doubleRotateLeft(current);
    		}
    		//einfache Rechtsrotation nötig:
    		if (current.right.height<current.left.height && current.left.right.height <= current.left.left.height){
    			current = rotateRight(current);
    		}
    		//Doppelrotation Rechts:
    		if (current.right.height<current.left.height && current.left.right.height > current.left.left.height){
    			current = doubleRotateRight(current);
    		}
    	}
    	repairHeight(current);
    	return current;
    }

    /**
        * Rotiere den Baum am gegebenen Knoten nach links
        * @param node Knoten der Rotiert werden soll
        * @return Der neue Knoten an dem Platz des gegebenen Knotens
        */
    private Node<T> rotateLeft(Node<T> node){
    	//analog zum Tutorium
    	Node<T> b = node.right;
    	node.right = b.left;
    	b.left = node;
    	return b;
    }

    /**
        * Rotiere den Baum am gegebenen Knoten nach rechts
        * @param node Knoten der rotiert werden soll
        * @return Der neue Knoten an dem Platz des gegebenen Knotens
        */
    private Node<T> rotateRight(Node<T> node){
    	//analog zu rotateLeft
    	Node<T> b = node.left;
    	node.left = b.right;
    	b.right = node;
    	return b;        
    }	


    /**
        * Rotiere das rechte Kind des gegebenen Knotens nach rechts und den gegebenen Knoten nach links
        * @param node Knoten der rotiert werden soll
        * @return Der neue Knoten an dem Platz des gegebenen Knotens
        */
    public Node<T> doubleRotateLeft(Node<T> node){
    	node.right = rotateRight(node.right);
    	return rotateLeft(node);
    }

    /**
        * Rotiere das linke Kind des gegebenen Knotens nach links und den gegebenen Knoten nach rechts
        * @param node Knoten der rotiert werden soll
        * @return Der neue Knoten an dem Platz des gegebenen Knotens
        */
    public Node<T> doubleRotateRight(Node<T> node){
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }

}
