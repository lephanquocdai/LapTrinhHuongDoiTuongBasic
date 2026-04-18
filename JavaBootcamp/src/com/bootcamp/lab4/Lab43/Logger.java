package com.bootcamp.lab4.Lab43;

public class Logger {
    // Eager Initialization: Tạo instance ngay khi class được load
    private static final Logger instance = new Logger();

    // Private constructor - Không cho tạo từ bên ngoài
    private Logger() {
        System.out.println("Logger da duoc khoi tao");
    }

    // Public method để lấy instance
    public static Logger getInstance() {
        return instance;
    }

    // Business methods
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }   
}
