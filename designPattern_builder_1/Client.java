package designPattern_builder_1;

public class Client {

    public static void main(String[] args) {

        Car car1 =  new Car_builder("King's Engine", 4).build();
        car1.outResult();

        Car_builder plan1 = new Car_builder("Queens Engine",2);
        plan1.setEngine("Bishops Formula");
        plan1.setSeats(6);
        Car car2 = plan1.build();
        car2.outResult();

    }

}
