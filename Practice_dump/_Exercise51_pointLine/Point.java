package _Exercise51_pointLine;

public class Point {
    // Private variables
    private int x;    // x co-ordinate
    private int y;    // y co-ordinate

    // Constructor
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public methods
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

}
