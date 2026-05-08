package com.bootcamp.lab6.Lab63;

import java.util.*;

/**
 * Dictionary class - Lab 6.3
 * Su dung HashMap de tra cuu nhanh.
 */
public class Dictionary {
    private Map<String, String> dict;

    public Dictionary() {
        dict = new HashMap<>();
        initializeDictionary();
    }

    private void initializeDictionary() {
        dict.put("hello", "Xin chao");
        dict.put("world", "The gioi");
        dict.put("java", "Ngon ngu lap trinh Java");
        dict.put("computer", "May tinh");
        dict.put("programming", "Lap trinh");
        dict.put("code", "Ma code");
        dict.put("algorithm", "Thuat toan");
        dict.put("data", "Du lieu");
    }

    public String translate(String englishWord) {
        // getOrDefault: Tra ve gia tri hoac gia tri mac dinh
        return dict.getOrDefault(englishWord.toLowerCase(), 
                "Khong tim thay tu: " + englishWord);
    }

    public void addWord(String english, String vietnamese) {
        dict.put(english.toLowerCase(), vietnamese);
        System.out.println("Da them tu: " + english + " -> " + vietnamese);
    }

    public void displayAll() {
        System.out.println("\n=== TU DIEN ===");
        dict.forEach((key, value) -> 
            System.out.println(key + " -> " + value)
        );
    }
}
