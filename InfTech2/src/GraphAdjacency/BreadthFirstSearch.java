import java.util.LinkedList;
import java.util.Queue;


class BreadthFirstSearch {

    private GraphInterface graph;

    private Queue<Integer> queue = new LinkedList<Integer>();

    public BreadthFirstSearch(GraphInterface graph) {
        this.graph = graph;
    }

    // fuehrt eine Breitensuche auf dem Graphen durch und gibt ein Array mit den Indizes aller besuchten Knoten zurueck
    public int[] run(int start) {
		//anfangs, wenn die Queue leer ist, wird das erste Element gleich hinzugefuegt:
        queue.add(start);

        int[] schwarzeListe = new int[graph.getNumberOfVertices()];
        int i=0;

        while (queue.peek()!=0){
        	schwarzeListe[i]=run2(queue.peek());
        	i++;
        } 	
    }

    private int run2(int start) {


    	//pruefen ob Knoten ungueltig:
    	if(start>graph.getNumberOfVertices()){
    		System.out.println("Fehler: Knoten "+start+" nicht vorhanden!");
    		return 0;
    	}
		
        int[] nachbarliste = graph.getNeighbours(start);

        //check Queue(aktuell) ob alle Nachbarn im Queue
        for(int i=0; i<=nachbarliste.length; i++){

        	int[] queueliste = queue.toArray();
        	boolean enthalten = false;
        	//schauen, ob Nachbar schon enthalten:
        	for (int j = 0; j<queueliste.length; j++){
        		//wenn ja, dann enthalten=true und abbruch der Suche:
        		if ( nachbarliste[i] == queueliste[j] ) {
        			enthalten = true;
        			break; 
        		}

        	}
        	//wenn nicht enthalten -> in Queue einfuegen
        	if(!enthalten) queue.add(nachbarliste[i]);
        }
        //wenn alle Nachbarn behandelt: entferne aktuelles Element aus Queue
        return queue.remove();
    	//zurüch zu run
    }

}
