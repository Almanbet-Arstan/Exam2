package com.company;

public class Department {
    protected String nameOfDepartment;
    protected static int numOfBooksInThisDepartment;
    public void addingBooks(Book[] books, int size){
        for (int i = 0; i < size; i++) {
            books[i] = new Book(123, "Chyngyz Aitmatov", "Ak keme", "1978");
            numOfBooksInThisDepartment++;
        }
    }
    public void outputAllBooks(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
    public void outputAllInformation(){
        System.out.println(toString());
        System.out.println(Department.numOfBooksInThisDepartment);
    }

    public void findBookInDepartment(Book[] books, String nameOfAuthor){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == nameOfAuthor){
                System.out.println(books[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Department " +
                "nameOfDepartment = " + nameOfDepartment;
    }
}
