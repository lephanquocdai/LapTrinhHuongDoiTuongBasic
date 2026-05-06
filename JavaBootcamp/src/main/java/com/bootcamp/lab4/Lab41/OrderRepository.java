package com.bootcamp.lab4.Lab41;

public class OrderRepository {

    public void save(String order) {
        System.out.println("[Database] Dang luu: " + order);
    }

    public String findById(String id) {
        System.out.println("[Database] Dang tim: " + id);
        return "Order data";
    }
}