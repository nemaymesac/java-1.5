public class Main {

/*    private static SomeFunctions getSomeFunctions(){
        return new SomeFunctions();
    }
*/

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        //System.out.println(getSomeFunctions().getWelcomeText("Simona"));
        SomeFunctions functions = new SomeFunctions();

        //System.out.println(functions.getWelcomeText("Maroosya"));

        String welcome = functions.getWelcomeText("Adolf");
        System.out.println(welcome);

    }


}
