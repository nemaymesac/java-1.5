public class AdditionalFunctions {

    private static final int SECOND = 1000;
    private static final int MINUTE = 60 * SECOND;
    private static final int HOUR = 60 * MINUTE;

    public void millToHours(){

        long ms = 725872872;
        StringBuilder text = new StringBuilder();
        if (ms > HOUR) {
            text.append(ms / HOUR).append(" hours ");
            ms %= HOUR;
        }
        text.append(ms + " ms");
        System.out.println(text.toString());
    }

}
