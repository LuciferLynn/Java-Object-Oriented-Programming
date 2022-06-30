package designPattern_factory_2;

public class Client {

    public static void main(String[] args) {

        Vehicle bmw1 = VehicleFactory.getVehicle("BMW", "1234", "Engine X", 6); // reject
        System.out.println(bmw1);

        System.out.println();

        Vehicle bmw2 = VehicleFactory.getVehicle("BMW", "2222", "Engine A", 8); // success
        System.out.println(bmw2);

        System.out.println();

        Vehicle sz1 = VehicleFactory.getVehicle("Suzuki", "3333", "Engine B", 4); // reject
        System.out.println(sz1);

        System.out.println();

        Vehicle sz2 = VehicleFactory.getVehicle("Suzuki", "4444", "Engine C", 8); // success
        System.out.println(sz2);


    }

}
