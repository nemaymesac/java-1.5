package homework;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public void ourReceipt(){
        List<receipt> list = new ArrayList<>();
        list.add(new receipt(3.99));
        list.add(new receipt(3.06));
        list.add(new receipt(7.49));

        DecimalFormat df = new DecimalFormat("##.##");

        double sum = list.stream()
                .map(receipt::getPrice)
                .reduce(Double::sum)
                .orElse((double) 0);
        System.out.println("Purchase summary is " + df.format(sum) + " eur.");
    }

}

