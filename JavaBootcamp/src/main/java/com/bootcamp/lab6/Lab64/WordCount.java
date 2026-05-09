package com.bootcamp.lab6.Lab64;

import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String text = "Java is cool and Java is fun";

        // Tach thanh mang tu
        String[] words = text.split(" ");

        // Dung Map de dem
        Map<String, Integer> wordCount = new HashMap<>();

        // Cach 1: Dung vong lap (Imperative)
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                // Tu da co -> Tang count
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Tu moi -> Them vao voi count = 1
                wordCount.put(word, 1);
            }
        }

        // Cach 2: Dung Stream API (Declarative) - Ngan gon hon!
        Map<String, Long> wordCount2 = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> word, // Nhom theo tu
                        Collectors.counting() // Dem so lan
                ));

        // Hien thi ket qua (su dung wordCount tu Cach 1)
        System.out.println("=== KET QUA (Imperative) ===");
        wordCount.forEach((word, count) ->
                System.out.println(word + " = " + count)
        );

        System.out.println("\n=== KET QUA (Stream API) ===");
        wordCount2.forEach((word, count) ->
                System.out.println(word + " = " + count)
        );
    }
}
