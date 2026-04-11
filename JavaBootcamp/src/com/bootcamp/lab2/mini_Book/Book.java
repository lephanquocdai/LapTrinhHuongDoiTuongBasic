package com.bootcamp.lab2.mini_Book;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    
    public void borrow(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }
    
    public void display(){
        System.out.println("Title: " + title +
                " | Author: " + author +
                " | Status: " + (isBorrowed ? "Da muon" : "Con sach"));
    }
}
