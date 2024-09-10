package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = quote.toCharArray();
        //System.out.println(charArray);

        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c:charArray) {
            //System.out.println(c);
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);

            }

        }
        System.out.println(counts);
        for (Map.Entry<Character,Integer> count: counts.entrySet()){
            System.out.println(count.getKey() + ": "+count.getValue());
        }
    }
}

