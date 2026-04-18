package com.bootcamp.lab4.Lab43;

public class LoggerTest {
    public static void main(String[] args) {
        // Lấy instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Kiểm tra cùng một instance
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        // true

        // Sử dụng
        logger1.log("Message 1");
        logger2.log("Message 2");
        logger1.info("Thong tin quan trong");
        logger2.error("Co loi xay ra!");
    }
}
