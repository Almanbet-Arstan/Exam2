package com.company;

public class Book {
    private int id;
    private String author;
    private String name;
    private String yearOfIssue;
    protected static int numOfAllBooks;

    public Book(int id, String author, String name, String yearOfIssue) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        numOfAllBooks++;
    }
    public Book(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public static int getNumOfAllBooks() {
        return numOfAllBooks;
    }

    public static void setNumOfAllBooks(int numOfAllBooks) {
        Book.numOfAllBooks = numOfAllBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }
}
