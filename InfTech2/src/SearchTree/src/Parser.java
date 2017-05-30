import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Parser {

    private static Student readNext(StreamTokenizer st) throws IOException {
		
	String msg = "Fehler: Datei hat falsches Format.";
		
	Student s = null;
	while(st.nextToken() != StreamTokenizer.TT_EOF) {

	    // matrikelnummer einlesen
	    if(st.ttype != StreamTokenizer.TT_NUMBER) {
		throw new IOException(msg);
	    }
	    int matnr = (int)st.nval;

	    // nachname einlesen
	    st.nextToken();
	    if(st.ttype != StreamTokenizer.TT_WORD) {
		throw new IOException();
	    }
	    String name = st.sval;

	    // vorname einlesen
	    st.nextToken();
	    if(st.ttype != StreamTokenizer.TT_WORD) {
		throw new IOException(msg);
	    }
	    String vorname = st.sval;

	    // eol oder eof einlesen
	    st.nextToken();
	    if(st.ttype != StreamTokenizer.TT_EOL) {
		throw new IOException(msg);
	    }
	
	    // student erzeugen
	    s = new Student(name, vorname, matnr);
	    break;
	}
	return s;
    }
	
    public static Student[] readStudenten(String f) {
	System.out.print("Reading data ... ");
	FileReader fr = null;
	try {
	    fr = new FileReader(f);
	    StreamTokenizer st = new StreamTokenizer(fr);
	    st.eolIsSignificant(true);
	    ArrayList<Student> student = new ArrayList<Student>();
	    Student s;
	    do {
		s = readNext(st);
		student.add(s);
	    } while(s != null);
			
	    int n = student.size() - 1;
	    Student[] arr = new Student[n];
	    for(int i = 0; i < n; i++) {
		arr[i] = student.get(i);
	    }
	    System.out.println("done.");
	    System.out.println();
	    return arr;
	} catch (IOException e) {
	    System.err.println(e.getMessage());
	} finally {
	    try {
		fr.close();
	    } catch (Exception e) {
	    }
	}
	return null;
    }	
}
