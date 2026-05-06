package com.bootcamp.lab4.Lab44;

public class UserRepository {
    public void save(User user) {
        System.out.println("Dang luu user vao database: " +
        user.getName());
    }

    public User findById(String id) {
        System.out.println("Dang tim user: " + id);
        return new User("Found", "found@example.com");
    }
}
