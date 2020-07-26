import objects.Auto;
import objects.Car;
import objects.Client;

import java.util.ArrayList;
import java.util.List;

public class RentMyCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarBrand("Audi");
        car1.setCarNumber("LD1488");
        car1.setModel("Jeep");
        car1.setYearOfReleace(2017);
        car1.setPricePerMonth(400);

        Car car2 = new Car();
        car2.setCarBrand("Volvo");
        car2.setCarNumber("Hehe");
        car2.setModel("Peep");
        car2.setYearOfReleace(2018);
        car2.setPricePerMonth(650);

        Client client = new Client("Donald", "Trump", "realpresident@inbox.lv", "371 33355566", 450);
        System.out.println("Our client: " + client.getFullInfo() + " has two car rent options: ");

        int price = client.getCashLimit();

        System.out.println("First car with this data: " + car1.getFullCarInfo());
        if (price > car1.getPricePerMonth()) {
            System.out.println("Client is able to buy this car!");
        }else {
            System.out.println("The price is out of our range.");
        }

        System.out.println("Second car: " + car2.getFullCarInfo());
        if (price > car2.getPricePerMonth()) {
            System.out.println("Client is able to buy this car!");
        }else {
            System.out.println("The price is out of our range.");
        }

        System.out.println("-----------------");

        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("LM558", "VW", "Polo", 1986, 13.00));
        autos.add(new Auto("PS666", "BMW", "X0", 2050, 228.00));

        Client Vladimir = new Client("Vladimir", "Putin", "vadik@inbox.lv", "5154545", 250);
        Client Lana = new Client("Lana", "Br", "lalalal@inbox.lv", "555555", 999);
    }

    private Auto getAutoById(String id, List<Auto> autos){
        for (Auto auto: autos) {
            if (auto.getNumber().equals(id)){
                return auto;
            }
        }

        return null;
    }

}
