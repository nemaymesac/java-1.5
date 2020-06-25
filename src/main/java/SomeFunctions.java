import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SomeFunctions {

    public String getWelcomeText(String userName) {
        return "Hello, " + userName + "!";
    }

    public void catFoodCounter() {

        int catFood = 1000;
        int weight = 5;
        int gPerKg = 12;
        int gPerDay = weight * gPerKg;
        int period = catFood / gPerDay;
        int result = Math.round(period);
        System.out.println("1 kg of cat food is enough for " + result + " days.");

        String nextDate = "";
        try {
            LocalDate date = LocalDate.now();
            date = date.plusDays(result);
            nextDate = date.toString();
        } finally {
            System.out.println("Your next purchase of cat food will be on " + nextDate + "!");
        }
    }

    public static class receipt {
        double price;

        public receipt(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}

