
public class Dijkstra {

	Graph graph;
	int[] distance;
	boolean[] visited;
	int[] parents;
	
	public Dijkstra(Graph graph){
		this.graph = graph;
		distance = new int[graph.getadjList().length];
		visited = new boolean[graph.getadjList().length];
		parents = new int[graph.getadjList().length];
	}
	
}
