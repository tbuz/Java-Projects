public class GraphAdjacencyMatrix implements GraphInterface{
	private int[][] edges;

	//Konstruktor
	public GraphAdjacencyMatrix(int nVertices){
		edges = new int[nVertices][nVertices];
	}

	public void addEdge (int from, int to, int weight){
		if(from<edges.length && to<edges.length) 
			edges[from][to]=weight;
		else
			System.out.println("Fehler: Einer der Knoten existiert nicht");
	}

	public void removeEdge(int from, int to){
		if(from<edges.length && to<edges.length) 
			edges[from][to]=0;
		else
			System.out.println("Fehler: Einer der Knoten existiert nicht");

	}
	public int getWeight(int from, int to){
		return edges[from][to];
	}
	public int getDegreee(int vertex){
		int grad=0;
		
		if (vertex<edges.length){
			for(int i=0; i<edges.length; i++){
				if (edges[vertex][i]!=0){
					grad++;
				}
			}
		}
		else{
			System.out.println("Fehler: Ungültiger Knoten");
			grad=-1;
		}
		return grad;
	}
	public int[] getNeighbours(int vertex){
		int[] nachbarn = new int[vertex.getDegree()];
		int cnt;
		
		if (vertex<edges.length){
			for(int i=0; i<edges.length; i++){
				if (edges[vertex][i]!=0){
					nachbarn[cnt]=i;
					cnt++;
				}
			}
		}
		else{
			System.out.println("Fehler: Ungültiger Knoten");
		}
		return nachbarn;

	}
	public int getNumberOfVertices(){
		return edges.length;

	}
	public String toString(){
		String strngOut="  ";
		for (int i=0; i<edges.length; i++){
			//Erste Zeile der Ausgabetabelle
			strngOut+=" | "+i; 
		}
		strngOut+="\n";
		//Tabelle 
		for(int i=0; i<edges.length; i++){
			strngOut+=i + " | ";
			for (int j=0;j<edges.length; j++) {
				strngOut+=edges[i][j]+" ";
				
			}
			strngOut+="\n";
		}

		return strngOut;

	}
}