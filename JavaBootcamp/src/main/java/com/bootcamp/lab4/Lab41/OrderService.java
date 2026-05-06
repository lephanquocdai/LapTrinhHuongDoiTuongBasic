package com.bootcamp.lab4.Lab41;

public class OrderService {

    private OrderRepository repository;
    private EmailService emailService;

    public OrderService(OrderRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void process(String item, double price) {

        double total = price * 1.1;
        String orderInfo = item + " -> " + total + " VND";

        repository.save(orderInfo);

        emailService.send(
                "customer@example.com",
                "Don hang thanh cong",
                "Cam on ban da dat hang: " + orderInfo
        );

        System.out.println("Don hang da duoc xu ly!");
    }
}