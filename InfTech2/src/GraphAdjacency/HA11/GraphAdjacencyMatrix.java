public class GraphAdjacencyMatrix implements GraphInterface{
	private int[][] edges;

	//Konstruktor
	public GraphAdjacencyMatrix(int nVertices){
		edges = new int[nVertices][nVertices];
	}

	public void addEdge (int from, int to, int weight){
		if(from<edges.length && to<edges.length && from>=0 && to>=0){
			edges[from][to]=weight;
			edges[to][from]=weight;
		}
	}

	public void removeEdge(int from, int to){
		if(from<edges.length && to<edges.length && from>=0 && to>=0) 
			edges[from][to]=0;
	}
	
	public int getWeight(int from, int to){
		if(from<edges.length && to<edges.length && from>=0 && to>=0)
			return edges[from][to];
		else 
			return 0;
	}
	public int getDegree(int vertex){
		int grad=0;
		
		if (vertex<edges.length && vertex>=0){
			for(int i=0; i<edges.length; i++){
				if (edges[vertex][i]!=0){
					grad++;
				}
			}
		}
		else{
			grad=-1;
		}
		return grad;
	}
	public int[] getNeighbours(int vertex){
		
		if (vertex<edges.length && vertex>=0){
			int[] nachbarn = new int[getDegree(vertex)];
			int cnt=0;
			
			for(int i=0; i<edges.length; i++){
				if (edges[vertex][i]!=0){
					nachbarn[cnt]=i;
					cnt++;
				}
			}
			return nachbarn;
		}
		else{
			return null;
		}
		

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