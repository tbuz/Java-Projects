/**
 * Interface das eine sehr rudimentaere Funktionalitaet fuer 
 * einen Graphen zur Verfuegung stellt. Benutzt fuer 
 * Einfuehrung in die Informatik - Technikorientiert II.
 * 
 * @author Das Tutorenteam
 *
 */
interface GraphInterface {

    /** 
      * Fuegt dem Graphen eine ungerichtete, gewichtete Kante hinzu.
      *
      * @param from Das eine Ende der Kante
      * @param to Das andere ende der Kante
      * @param weight Das Gewicht der Kante
      */
    public void addEdge(int from, int to, int weight);

    /**
      * Loescht die Kante zwischen den beiden uebergebenen Knoten
      * 
      * @param from Der eine Knoten
      * @param to Der andere Knoten
      */
    public void removeEdge(int from, int to);

    /**
      * 	Gibt das Gewicht der Kante zwischen den beiden Knoten zurueck
      *  Sollte im Fehlerfall 0 sein (sowohl fuer nicht vorhandene Knoten
      *  als auch nicht vorhandene Kanten)
      *  
      * @param from Das eine ende der Kante
      * @param to Das andere ende der Kante
      * @return Das Gewicht zwischen den beiden angegebenen Knoten. Soll 0 sein im Fehlerfall
      */
    public int getWeight(int from, int to);

    /**
      * Gibt den Grad des Knoten (Anzahl der Nachbarn) zurueck
      * 
      * @param Der fragliche Knoten
      * @return -1 falls Knoten nicht vorhanden, ansonsten Zahl der adjazenten Kanten
      */
    public int getDegree(int vertex);

    /**
      * Gibt eine Liste mit allen Nachbarn des Knoten zurueck
      * 
      * @param vertex Der fragliche Knoten
      * @return null im Fehlerfall, ansonsten alle adjazenten Knoten
      */
    public int[] getNeighbours(int vertex);

    /**
      * Soll die Zahl der Knoten zurueck geben
      * 
      * @return Die Zahl der Knoten die im Konstruktor uebergeben wurde
      */
    public int getNumberOfVertices();


    /**
      * Erstellt eine textive Repraesentation des Graphen
      * 
      * @return Die Repraesentation
      */
    public String toString();
}
