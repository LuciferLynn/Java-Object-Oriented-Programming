package geometric_objects_practice;

public class main_test {

    public static void main(String[] args) {

        Circle circle1 = new Circle(50);
        System.out.println(circle1.toString());
        double circle1_area = circle1.getArea();
        double circle1_diameter = circle1.getDiameter();
        double circle1_perimeter = circle1.getPerimeter();
        System.out.println("Default color = " + circle1.getColor());
        circle1.setColor("blue");
        circle1.setFilled(true);
        System.out.println("Updated color = " + circle1.getColor());
        System.out.println("Area = " + circle1_area);
        System.out.println("Diameter = " + circle1_diameter);
        System.out.println("Perimeter = " + circle1_perimeter);

    }

}
