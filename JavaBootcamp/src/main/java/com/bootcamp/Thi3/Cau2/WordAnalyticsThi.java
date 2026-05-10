package com.bootcamp.Thi3.Cau2;

import java.util.*;

public class WordAnalyticsThi {
    public static void main(String[] args) {
        String text = "Java, java! STREAM stream stream API api Collections";
        
        String normallized = text.toLowerCase().replace(","," ").replace("!"," ");
        // Tach thanh mang tu
        String[] words = normallized.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        System.out.println("\n=== KET QUA ===");
        wordCount.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));

        System.out.println("\nSO TU KHAC NHAU: " + wordCount.size());

        String topWord = "";
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                topWord = entry.getKey();
            }
        }

        System.out.println("TOP WORD: " + topWord + " - " + maxCount);
    }
}
