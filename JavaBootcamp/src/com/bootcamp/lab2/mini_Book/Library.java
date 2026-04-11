package com.bootcamp.lab2.mini_Book;

public class Library {
    private Book[] books;

    public Library(){
        books = new Book[5];

        books[0] = new Book("Java Basics", "John");
        books[1] = new Book("OOP Master", "David");
        books[2] = new Book("Data Structure", "Anna");
        books[3] = new Book("Spring Boot", "Tom");
        books[4] = new Book("Database", "Linda");
    }
    // Tìm sách
    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Mượn sách
    public void borrowBook(String title) {
        Book b = findBook(title);

        if (b == null) {
            System.out.println("Khong co sach nay");
        } else if (b.isBorrowed()) {
            System.out.println("Het hang");
        } else {
            b.borrow();
            System.out.println("Muon sach thanh cong!");
        }
    }

    // Trả sách
    public void returnBook(String title) {
        Book b = findBook(title);

        if (b == null) {
            System.out.println("Khong co sach nay");
        } else if (!b.isBorrowed()) {
            System.out.println("Sach chua duoc muon");
        } else {
            b.returnBook();
            System.out.println("Tra sach thanh cong!");
        }
    }

    // Hiển thị tất cả sách
    public void displayAll() {
        for (Book b : books) {
            b.display();
        }
    }
}
