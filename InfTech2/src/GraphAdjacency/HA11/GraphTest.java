/**
 * Klasse zum Testen der Funktionalitaet und Performance einer Implementation von
 * 'GraphInterface'
 * Benutzt fuer Einfuehrung in die Informatik - Technikorientiert II,
 * 
 * @author Das Tutorenteam
 * 
 */


import java.util.LinkedList;


public class GraphTest {

    static int[][] edges = { { 0, 9, 3 }, { 0, 5, 5 }, { 0, 8, 4 },
            { 5, 4, 2 }, { 8, 7, 8 }, { 7, 4, 6 }, { 7, 6, 3 }, { 2, 1, 2 },
            { 2, 4, 4 }, { 4, 3, 10 }, { 1, 3, 5 }, { 6, 3, 7 } };
    static int[] searches = { 0, 8, 6, 2, 5, 13 };
    static int[][] breadthResults = { { 0, 5, 8, 9, 4, 7, 2, 3, 6, 1 },
            { 8, 0, 7, 5, 9, 4, 6, 2, 3, 1 }, { 6, 3, 7, 1, 4, 8, 2, 5, 0, 9 },
            { 2, 1, 4, 3, 5, 7, 6, 0, 8, 9 }, { 5, 0, 4, 8, 9, 2, 3, 7, 1, 6 } };
    static int[][] depthResults = { { 0, 9, 8, 7, 6, 3, 1, 2, 4, 5 },
            { 8, 7, 6, 3, 1, 2, 4, 5, 0, 9 }, { 6, 7, 8, 0, 9, 5, 4, 2, 1, 3 },
            { 2, 4, 7, 8, 0, 9, 6, 5, 3, 1 }, { 5, 4, 7, 8, 6, 3, 1, 2, 0, 9 } };

    /**
      * Testet die Funktionalitaet eines uebergebenen Graphen. Das Objekt muss mit
      * 10 Knoten initialisiert und ohne Kanten sein. Aufruf z.b. mit
      * GraphTest.graphPerformance(new GraphAdjacencyMatrix(10));
      * 
      * @param subject
      *            Der zu testende Graph. Muss 10 Knoten und keine Kanten
      *            besitzen
      * @return Der "Befund"
      */
    public static String graphTest(GraphInterface subject) {
        // Let the Test begin!
        System.out.println("Test beginnt...");
        if (subject.getNumberOfVertices() != 10)
            return "FEHLER: Liste nicht mit 10 Knoten initialisiert!";
        // Lets now check the fail-safes
        subject.addEdge(11, 1, 1);
        subject.addEdge(-1, 2, 1);
        subject.removeEdge(13, 3);
        subject.removeEdge(-3, 3);
        subject.removeEdge(6, 0);// Does not exist (But the vertices do)!

        if (subject.getWeight(7, 0) != 0)
            return "FEHLER: getWeight(7, 0): Kante 7<->0 existiert nicht!";

        if (subject.getWeight(-7, 0) != 0)
            return "FEHLER: getWeight(-7, 0):Kante -7<->0 existiert nicht!";

        if (subject.getWeight(17, 0) != 0)
            return "FEHLER: getWeight(17, 0): Kante 17<->0 existiert nicht!";

        if (subject.getDegree(-10) != -1)
            return "FEHLER: getDegree(-10): Knoten -10 existiert nicht!";

        if (subject.getDegree(140) != -1)
            return "FEHLER: getDegree(140): Knoten 140 existiert nicht!";

        if (subject.getDegree(0) == -1)
            return "FEHLER: getDegree(0): Knoten 0 existiert (Und hat Kanten)!";

        if (subject.getNeighbours(-3) != null)
            return "FEHLER: getNeighbours(-3): Knoten -3 existiert nicht!";

        if (subject.getNeighbours(13) != null)
            return "FEHLER: getNeighbours(13): Knoten 13 existiert nicht!";

        // lets check if there are NO edges
        for (int i = 0; i < 10; i++)
            if (subject.getDegree(i) != 0)
                return "FEHLER: getDegree(" + i + ")!=0";
        for (int i = 0; i < 10; i++)
            if (subject.getNeighbours(i).length != 0)
                return "FEHLER: getNeighbours(" + i + ").length!=0";
        // create a network and check it
        for (int edge = 0; edge < edges.length; edge++) {
            if (subject.getWeight(edges[edge][0], edges[edge][1]) != 0)
                return "FEHLER: getWeight(" + edges[edge][0] + ", "
                        + edges[edge][1] + ")!=0";
            subject.addEdge(edges[edge][0], edges[edge][1], edges[edge][2]);
            if (subject.getWeight(edges[edge][0], edges[edge][1]) != edges[edge][2])
                return "FEHLER: getWeight(" + edges[edge][0] + ", "
                        + edges[edge][1] + ")!=" + edges[edge][2];
            int[] tempNeighbours = subject.getNeighbours(edges[edge][0]);
            boolean foundFlag = false;
            for (int j = 0; j < tempNeighbours.length; j++)
                if (edges[edge][1] == tempNeighbours[j]) {
                    foundFlag = true;
                    break;
                }
            if (!foundFlag)
                return "Fehler: getNeighbours(" + edges[edge][0]
                        + ") enth�lt nicht die vorhandene Kante '"
                        + edges[edge][1] + "'!";
        }

        // and finally: delete some edges
        for (int edge = 0; edge < edges.length; edge++) {
            subject.addEdge(edges[edge][0], edges[edge][1], 14);
            if (subject.getWeight(edges[edge][0], edges[edge][1]) != 14)
                return "FEHLER: getWeight(" + edges[edge][0] + ", "
                        + edges[edge][1] + ")!=14";
            subject.removeEdge(edges[edge][0], edges[edge][1]);
            if (subject.getWeight(edges[edge][0], edges[edge][1]) != 0)
                return "FEHLER: getWeight(" + edges[edge][0] + ", "
                        + edges[edge][1] + ")!=0";
        }

        return "Keine Fehler gefunden!\n";
    }

    public static String testBFS(GraphInterface subject) {

        System.out.println("Test beginnt...");
        if (subject.getNumberOfVertices() != 10)
            return "FEHLER: Liste nicht mit 10 Knoten initialisiert!";

        for (int i = 0; i < edges.length; i++) {

            subject.addEdge(edges[i][0], edges[i][1], edges[i][2]);

        }
        
        
        BreadthFirstSearch bfs = new BreadthFirstSearch(subject);
        
        boolean testok = true;

        for (int i = 0; i < (searches.length - 1); i++) {
            int[] temp = bfs.run(searches[i]);
            if (temp == null)
                return "Fehler: breadthFirstSearch(" + searches[i] + ")==null!";
            else if (!java.util.Arrays.equals(temp, breadthResults[i])) {
                System.out.print("Fehler: breadthFirstSearch(" + searches[i]
                        + ") ergibt {" + temp[0]);
                for (int k = 1; k < temp.length; k++)
                    System.out.print(", " + temp[k]);
                System.out.print("}, erwartet war {" + breadthResults[i][0]);
                for (int k = 1; k < breadthResults[i].length; k++)
                    System.out.print(", " + breadthResults[i][k]);
                System.out.println("}!");
                
                testok = false;
            }

        }


        
        
        if (testok) return "Keine Fehler gefunden!\n";
        else {return "Fehler gefunden!\n";}

    }

    public static void main(String[] args) {

        System.out.println(GraphTest.graphTest(new GraphAdjacencyMatrix(10)));
        System.out.println(GraphTest.testBFS(new GraphAdjacencyMatrix(10)));

    }

}
