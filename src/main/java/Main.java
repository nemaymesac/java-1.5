import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        String text = "The world is our playground and we break new ground every day on our quest to create a unique and flawless online gaming experience.";

        String[] words = text.split(" ");
        System.out.println(words.length);
        System.out.println(words[4]);

        for (int i = 0; i < words.length; i++) {
            System.out.println("The word with id " + i + " is " + words[i]);
        }

//        for (int i = 0; i < words.length; i = i + 2){
//            System.out.println(words[i]);
//        }

        for (String word : words) {
            System.out.println(word);
        }

        List<String> names = new ArrayList<>();
        names.add("E");
        names.add("B");
        names.add("Kengarags");

        System.out.println(names.get(2));
        names.forEach(System.out::println);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());

// hashmap - table with two columns. C1 = key(example - word), C2 = value(example - amount).

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("dog", 1);
        bookUniqueWords.put("the", 2);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()){
            System.out.println(entry.getKey() + " : " +  entry.getValue());
        }
    }
//      HOMEWORK - hashmap stuff
}
