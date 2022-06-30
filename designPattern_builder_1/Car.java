package designPattern_builder_1;

public class Car {
    String name;
    int seats;
    String engine;

    public Car(Car_builder builder)  {
        this.engine = builder.getEngine();
        this.seats = builder.getSeats();
    }


    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public void outResult() {
        System.out.println("Car with " + engine + " engine and " + seats + " seats successfully built");
    }

}
