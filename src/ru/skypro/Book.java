package ru.skypro;

public class Book {
    private Author author;
    private String titleBook;
    private int publicationYear;

    public Book(Author author, String titleBook, int publicationYear) {
        this.author = author;
        this.titleBook = titleBook;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorsName() {
        return author.getAuthorsName() + author.getSurName();
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitleBook() {
        return titleBook;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}
