package com.bootcamp.lab4.Lab41;

public class OrderApp {

    public static void main(String[] args) {

        OrderRepository repository = new OrderRepository();
        EmailService emailService = new EmailService();

        OrderService orderService = new OrderService(repository, emailService);

        orderService.process("Laptop Dell", 15000000);
    }
}