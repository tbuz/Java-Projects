import java.util.LinkedList;

class BreadthFirstSearch {
    private GraphInterface graph;

    public BreadthFirstSearch(GraphInterface graph) {
        this.graph = graph;
    }

    // fuehrt eine Breitensuche auf dem Graphen durch und gibt ein Array mit den Indizes aller besuchten Knoten zurueck
    public int[] run(int start) {
    	if (start < graph.getNumberOfVertices() && start >= 0){
    		LinkedList<Integer> queue = new LinkedList<Integer>();
    		LinkedList<Integer> result = new LinkedList<Integer>();
    		
    		//anfangs, wenn die Queue leer ist, wird das erste Element (Bewohner) gleich hinzugefuegt:
            queue.addFirst(start);

            while (queue.size()!= 0){
            	boolean enthalten = false;
            	int bewohner =queue.getFirst();
            	int[] nachbarliste = graph.getNeighbours(bewohner);
            	
            	//checke alle nachbarn
            	for(int i=0; i<nachbarliste.length; i++){
            		if (!result.contains(nachbarliste[i]) && !queue.contains(nachbarliste[i]) && !enthalten){
            			queue.addLast(nachbarliste[i]);
            			enthalten = true;
            		}
            	}
            	//ein noch nicht besuchter nachbar gefunden
            	if (!enthalten){
            		result.addLast(bewohner);
            		queue.removeFirst();
            	} 
            }
            
            //result2Array
            int[] res2array = new int[result.size()];
            int pos =0;
            while (result.size()>0){
            	res2array[pos] = result.pollFirst();
            	pos++;
            }
            return res2array;
    	}else
    		return null;
		
    }

  

}
