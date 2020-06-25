import java.util.ArrayList;
import java.util.List;

public class AdditionalFunctions {

    private static final int SECOND = 1000;
    private static final int MINUTE = 60 * SECOND;
    private static final int HOUR = 60 * MINUTE;

    public void millToHours() {

        long ms = 725872872;
        StringBuilder text = new StringBuilder();
        if (ms > HOUR) {
            text.append(ms / HOUR).append(" hours ");
            ms %= HOUR;
        }
        text.append(ms + " ms");
        System.out.println(text.toString());
    }

    public void myList() {
        String one = "To lose weight";
        String two = "To quit smoking";

        List<String> list = new ArrayList<>();
        list.add(one);
        list.add(two);

        list.forEach(System.out::println);
        System.out.println("But most important is to " + list.get(0));
    }
}
