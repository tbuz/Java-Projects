public class Student implements Comparable {

    String name;    // Nachname des Studenten
    String vorname; // Vorname des Studenten
    int matnr;      // Matrikelnummer des Studenten

     /**
     * @param1: Nachname des Studenten
     * @param2: Vorname des Studenten
     * @param3: Matrikelnummer des Studenten
     */
    public Student(String name, String vorname, int matnr) {
	this.name = name;
	this.vorname = vorname; 
	this.matnr = matnr;
    }
	
    /**
     * return: Gibt die Attribute des Studenten als String zurueck
     */
    public String toString() {
	return matnr + ", " + name + ", " + vorname;
    }
	
    public int compareTo(Comparable other) {
    	if (other instanceof Student){
	    	if (this.matnr == ((Student)other).matnr){
	    		return 0;
	    	}
	    	else if (this.matnr > ((Student)other).matnr){
	    		return 1;
	    	}
	    	else if (this.matnr < ((Student)other).matnr){
	    		return -1;
	    	}
    	}
    	System.out.println("Fehler, es können nur Studenten verglichen werden!");
    	return 0;
    }
}
