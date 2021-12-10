package com.buyou.BuYou.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PRICE")
    private String price;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "QUANTITY")
    private int quantity;
    @Column(name = "BESTSELLER")
    private Boolean bestseller;
    @Column(name = "NOVITA")
    private Boolean novita;
    @Column(name = "RECENSIONI")
    private String recensioni;

    public Product(Integer id, String title, String author, String price, String category, Integer quantity, Boolean bestseller, Boolean novita, String recensioni) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.bestseller = bestseller;
        this.novita = novita;
        this.recensioni = recensioni;
    }

    public Product(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    public void setBestseller(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    public boolean isNovita() {
        return novita;
    }

    public void setNovita(Boolean novita) {
        this.novita = novita;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }
}
