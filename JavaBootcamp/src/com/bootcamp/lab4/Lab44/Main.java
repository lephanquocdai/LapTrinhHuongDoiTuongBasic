package com.bootcamp.lab4.Lab44;

public class Main {
    public static void main(String[] args) {

        User user = new User("Dai", "dai@gmail.com");

        UserRepository repo = new UserRepository();
        EmailService emailService = new EmailService();
        ReportGenerator report = new ReportGenerator();

        repo.save(user);
        emailService.sendEmail(user.getEmail(), "Hello!");
        report.generateReport(user);
    }
}