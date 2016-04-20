/** 
 * Modelliert eine Figur mit x- und y-Koordinaten, welche 
 * um dx,dy verschoben werden koennen.
 */
public class Figur {
    /** Attribute */
    private double pos_x; // x-Koordinate
    private double pos_y; // y-Koordinate

    /** Methoden */
    // Konstruktor
    public Figur(double pos_x, double pos_y) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    // Getter
    public double getPosX() {
        return pos_x;
    }
    public double getPosY() {
        return pos_y;
    }
    // andere Methoden
    // verschiebt die Figur um dx in x-Richtung und um dy in y-Richtung
    public void verschieben(double dx, double dy) {
        pos_x += dx;
        pos_y += dy;
    }
    // gibt einen String mit den Koordinaten zurueck
    public String toString() {
        return "Diese Figur hat die Mittelpunkt-Koordinaten ("+
            pos_x+", "+pos_y+"). ";
    }
}