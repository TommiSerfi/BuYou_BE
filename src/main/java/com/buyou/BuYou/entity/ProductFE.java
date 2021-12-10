package com.buyou.BuYou.entity;

public class ProductFE {
    private String title;
    private String author;

    public ProductFE(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public ProductFE(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
