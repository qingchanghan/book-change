package com.example.qingchanghan.tab;

/**
 * Created by Qingchang Han on 2016/12/31.
 */

public class Book {

    private String name;
    private String author;
    private String isbn;
    private int imageId;

    public Book(String name, String author, String isbn, int imageId) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getImageId() {
        return imageId;
    }
}
