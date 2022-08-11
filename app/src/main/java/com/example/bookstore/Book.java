package com.example.bookstore;

public class Book {
  private   int id;
    private String AuthorName;
    private String BookTitle;
    private String description;
    private int ReleaseYear;
    private String Category;

    public Book(int id, String authorName, String bookTitle, String description, int releaseYear, String category) {
        this.id = id;
        AuthorName = authorName;
        BookTitle = bookTitle;
        this.description = description;
        ReleaseYear = releaseYear;
        Category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }


}
