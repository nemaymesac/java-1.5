package homework;

import java.util.*;

public class HashMapHw {
    public static void main(String[] args) throws Exception {
        String text = "I'm Slim Shady, yes I'm the real Shady," +
                "All you other Slim Shadys are just imitating!" +
                "So won't the real Slim Shady please stand up," +
                "Please stand up, please stand up" +
                "Cause I'm Slim Shady, yes I'm the real Shady" +
                "All you other Slim Shadys are just imitating," +
                "So won't the real Slim Shady please stand up?" +
                "Please stand up, please stand up!";

        String result = text.replaceAll("[,?.!]", "");

        List<String> list = Arrays.asList(result.split(" "));


        System.out.println("Number of words in Eminem's lyrics is: " + list.size());

        Set<String> uniqueLyrics = new HashSet<>(list);
        for (String word : uniqueLyrics){
            System.out.println(word.toLowerCase() + ": " + Collections.frequency(list, word));

        }
    }
}
