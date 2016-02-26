package com.arthurneuman;

import java.util.*;


public class ExamAnswer {
    static Map<String, Integer> entryCount(List<String> strings) {
        Map<String, Integer> theCount = new HashMap<>();
        for (String entry: strings){
            int count = Collections.frequency(strings, entry);
            theCount.put(entry, count);
        }
        return theCount;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("is");
        words.add("great");
        words.add("java");
        words.add("is");
        words.add("fun");

        Map<String, Integer> count = entryCount(words);

        for (String key: count.keySet()) {
            System.out.println("Key: " + key + ", Value: " + count.get(key));
        }

    }
}
