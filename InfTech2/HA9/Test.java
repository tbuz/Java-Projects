import java.lang.String;

public class Test {

    public static void main(String[] args) {

        // read the students
        String file = "studenten.dat";
        Student[] student = Parser.readStudenten(file);
        
        //Erzeuge Suchbaum-Objekt:
        SearchTree<String> suchbaum = new SearchTree<String>(); 
        //Fuelle den Baum mit 10 Studenten:
        for (int i = 0; i<10; i++){
        	//matnr ist der Suchschluessel:
        	suchbaum.insert(student[i].matnr, student[i].toString());
        }
        //Ausgabe
        System.out.println(suchbaum.toString());
        System.out.println(" ");
        
        //Im folgenden werden die geforderten Methoden aufgerufen:
        
        //Loesche zwei Studenten:
        System.out.println("Loesche zwei Studenten:");
        suchbaum.delete(student[4].matnr);
        suchbaum.delete(student[6].matnr);
        //Ausgabe
        System.out.println(suchbaum.toString());
        System.out.println(" ");
        
        //einfache Linksrotation
        System.out.println("Fuehre Linksrotation durch:");
        suchbaum.singleRotateLeft();
        //Ausgabe
        System.out.println(suchbaum.toString());
        System.out.println(" ");
        
        //Loesche einen weiteren Studenten:
        System.out.println("Loesche einen weiteren Studenten:");
        suchbaum.delete(student[5].matnr);
        //Ausgabe
        System.out.println(suchbaum.toString());
        System.out.println(" ");
        
        //delete mit nicht vorhandenem Key:
        System.out.println("Fuehre delete mit falschem Key aus:");
        suchbaum.delete(333666);
     	//Ausgabe
        System.out.println(suchbaum.toString()); 
    }
}
