package _Exercise51_pointLine;

public class LineSub extends Point{
    Point end;

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX,beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

}
