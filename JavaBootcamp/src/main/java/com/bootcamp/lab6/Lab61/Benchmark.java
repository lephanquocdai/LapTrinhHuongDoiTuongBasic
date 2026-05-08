package com.bootcamp.lab6.Lab61;

import java.util.*;

/**
 * LAB 6.1: Cuoc Dua Toc Do (List vs Set vs Map)
 * Chung minh suc manh tim kiem cua HashMap.
 */
public class Benchmark {
    public static void main(String[] args) {
        final int LIMIT = 100000; // 100 nghin phan tu

        // Tao List, Set va Map
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Dang nap " + LIMIT + " phan tu...");
        for (int i = 0; i < LIMIT; i++) {
            list.add(i);
            set.add(i);
            map.put(i, i * 2); // Key = i, Value = i*2
        }

        int searchValue = LIMIT - 1; // Tim phan tu cuoi cung (te nhat)

        // Test 1: Tim trong List (O(n))
        System.out.println("\nBat dau do LIST...");
        long start = System.nanoTime();
        boolean foundInList = list.contains(searchValue);
        long end = System.nanoTime();
        System.out.println("List Time: " + (end - start) + " ns");
        System.out.println(" Ket qua: " + foundInList);

        // Test 2: Tim trong Set (O(1))
        System.out.println("\nBat dau do SET...");
        start = System.nanoTime();
        boolean foundInSet = set.contains(searchValue);
        end = System.nanoTime();
        System.out.println("Set Time : " + (end - start) + " ns");
        System.out.println(" Ket qua: " + foundInSet);

        // Test 3: Tim trong Map (O(1))
        System.out.println("\nBat dau do MAP...");
        start = System.nanoTime();
        boolean foundInMap = map.containsKey(searchValue);
        end = System.nanoTime();
        System.out.println("Map Time : " + (end - start) + " ns");
        System.out.println(" Ket qua: " + foundInMap);

        // Ket luan: Set va Map nhanh hon List rat nhieu!
    }
}
