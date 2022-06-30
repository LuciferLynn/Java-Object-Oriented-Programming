package Practice1;

public class main_circle {
    public static void main(String[] args) {

        circle c1 = new circle(4);
        System.out.println(c1.getRadius());
        c1.printRadius();
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(circle.getNumberOfCircles());
        System.out.println();

        circle c2 = new circle(5);
        System.out.println(c2.getRadius());
        c2.printRadius();
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getArea());
        System.out.println(circle.getNumberOfCircles());
        System.out.println();

        circle c3 = new circle(6);
        System.out.println(c3.getRadius());
        c3.printRadius();
        System.out.println(c3.getPerimeter());
        System.out.println(c3.getArea());
        System.out.println(circle.getNumberOfCircles());
        System.out.println();

    }
}
