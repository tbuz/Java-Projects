public class AVLTreeTest {

    public static void main(String[] args) {

        AbstractAVLTree<String> tree = new AVLTree<String>();
        test(tree);

    }

    private static void test(AbstractAVLTree<String> atree){
        atree.clear();
        
        insertTree(atree, 2);
        insertTree(atree, 4);
        insertTree(atree, 8);
        
        // rotateLeft
        insertTree(atree, 12);
        insertTree(atree, 16);
        
        // doubleRotateLeft 
        insertTree(atree, 10);
        insertTree(atree, 0);
        
        // doubleRotateRight
        insertTree(atree, 1);
        
        deleteTree(atree, 0);
        deleteTree(atree, 1);
        
        // rotateLeft
        deleteTree(atree, 2);
        
        // doubleRotateRight
        deleteTree(atree, 16);
        deleteTree(atree, 12);
        deleteTree(atree, 10);
        deleteTree(atree, 8);
        deleteTree(atree, 4);
        
    }

    private static void insertTree(AbstractAVLTree<String> atree, int key){
        System.out.println("insert ("+key+": Test-"+key+")");
        atree.insert(key, "Test-"+key);
        atree.print();
    }

    private static void  deleteTree(AbstractAVLTree<String> atree, int key) {
        System.out.println("delete ("+key+")");
        atree.delete(key);
        atree.print();
}
}

