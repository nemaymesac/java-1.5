import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FoodCounter {

    public static void main(String[] args) {
        SomeFunctions functions = new SomeFunctions();

        System.out.println("Starting cat food counter...");
        functions.catFoodCounter();

        List<SomeFunctions.receipt> list = new ArrayList<>();
        list.add(new SomeFunctions.receipt(3.99));
        list.add(new SomeFunctions.receipt(3.06));
        list.add(new SomeFunctions.receipt(7.49));

        DecimalFormat df = new DecimalFormat("##.##");

        double sum = list.stream()
                .map(SomeFunctions.receipt::getPrice)
                .reduce(Double::sum)
                .orElse((double) 0);
        System.out.println("Purchase summary is " + df.format(sum) + " eur.");

    }
}
