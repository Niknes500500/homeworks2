package com.nikita.StringFinal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task {

    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning";
        String stepCleanText = clean(text);
        String[] stepHighlightWords = highlightWords(stepCleanText);
        TreeMap treeMap = countWords(stepHighlightWords);
        printTheResult(treeMap);

    }


    public static String clean(String text) {
        return text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
    }

    public static String[] highlightWords(String stepClean) {
        return stepClean.split(" ");
    }

    public static TreeMap<String, Integer> countWords(String[] stepHighlightWords) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < stepHighlightWords.length; i++) {
            String word = stepHighlightWords[i];
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }

        return new TreeMap<>(hashMap);
    }

    public static void printTheResult(TreeMap<String, Integer> treeMap) {
        char currentLetter = ' ';
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            char firstLetter = Character.toUpperCase(entry.getKey().charAt(0));
            if (firstLetter != currentLetter) {
                System.out.print(firstLetter + " : ");
                currentLetter = firstLetter;
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
