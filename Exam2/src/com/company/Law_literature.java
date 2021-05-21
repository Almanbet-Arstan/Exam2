package com.company;

public class Law_literature extends Department{
    @Override
    public void addingBooks(Book[] books, int size) {
        super.addingBooks(books, size);
    }

    @Override
    public void outputAllBooks(Book[] books) {
        super.outputAllBooks(books);
    }

    @Override
    public void outputAllInformation() {
        super.outputAllInformation();
    }

    @Override
    public void findBookInDepartment(Book[] books, String nameOfAuthor) {
        super.findBookInDepartment(books, nameOfAuthor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
