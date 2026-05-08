package com.bootcamp.lab5.Lab55;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * Class Validate Age - Lab 5.5
 * Nhap nam sinh, tinh tuoi va nem exception neu khong hop le.
 */
public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap nam sinh: ");
        if (!sc.hasNextInt()) {
            System.out.println("Loi: Vui long nhap mot so nguyen.");
            sc.close();
            return;
        }
        
        int birthYear = sc.nextInt();

        try {
            int age = calculateAge(birthYear);
            System.out.println("Tuoi cua ban: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        sc.close();
    }

    public static int calculateAge(int birthYear) throws InvalidAgeException {
        int currentYear = LocalDate.now().getYear(); 
        int age = currentYear - birthYear;

        if (age < 0) {
             throw new InvalidAgeException(age, "Nam sinh khong the lon hon nam hien tai!");
        }

        if (age < 18) {
            throw new InvalidAgeException(age, "Ban chua du tuoi, di ve di!");
        }

        if (age > 100) {
            throw new InvalidAgeException(age, "Cu gia qua roi, nghi ngoi di");
        }

        return age;
    }
}
