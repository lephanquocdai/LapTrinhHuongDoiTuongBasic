package com.bootcamp.lab4.Lab41;

public class EmailService {

    public void send(String to, String subject, String message) {
        System.out.println("[Email] Gui den: " + to);
        System.out.println(" Tieu de: " + subject);
        System.out.println(" Noi dung: " + message);
    }
}