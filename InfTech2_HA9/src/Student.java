public class Student {

    String name;
    String vorname;
    int matnr;

    public Student(String name, String vorname, int matnr) {
        this.name = name;
        this.vorname = vorname; 
        this.matnr = matnr;
    }

    public String toString() {
        return matnr + ", " + name + ", " + vorname;
    }
}
