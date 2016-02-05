import java.util.Random;

public class Graph {
	
	int[][] adjList;
	int anzahlKanten;
	
	public Graph(int dimension, int anzahlKanten){
		adjList = new int[dimension][dimension]; // Felder die Verlinkung haben K�NNTEN = -1
		for(int i = 0; i<adjList.length; i++){ // Felder die keine haben D�RFEN = 0
			for (int j = 0; j<adjList[i].length; j++){
				if(i != j){
					adjList[i][j] = -1;
				}
			}
		}
		this.anzahlKanten = anzahlKanten;
	}
	
	private void addEdge(int knotenAnfang, int knotenEnde, int weight){
		adjList[knotenAnfang][knotenEnde] = weight;
		adjList[knotenEnde][knotenAnfang] = weight;
	}
	
	public void printGraph(){
		for(int i = 0; i<adjList.length; i++){
			System.out.println("Knoten " + i + " ist mit folgenden Knoten verbunden:");
			for (int j = 0; j<adjList[i].length; j++){
				if(adjList[i][j] > 0){
					System.out.print("Knoten " + j + " mit der Gewichtung " + adjList[i][j]);
					System.out.println();
				}
			}
		}
	}
	public void printAsMatrix(){
		for(int i = 0; i<adjList.length; i++){
			for (int j = 0; j<adjList[i].length; j++){
				System.out.print(adjList[i][j]);
				System.out.print("  ");

			}
			System.out.println();
		}
	}

	public void createGraph(){
		Random rnd = new Random();
		for(int i = 0; i < anzahlKanten; i++){
			int knoten1 = rnd.nextInt(adjList.length);
			int knoten2 = rnd.nextInt(adjList.length);
			int gewicht = rnd.nextInt(20)+1;
			while(adjList[knoten1][knoten2] >= 0){
				knoten2 = rnd.nextInt(anzahlKanten);
				knoten1 = rnd.nextInt(anzahlKanten);
			}
			addEdge(knoten1, knoten2, gewicht);
		}
	}
	
	
}
