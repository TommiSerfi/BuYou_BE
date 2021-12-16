package com.buyou.BuYou.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "IMAGE")
    private String image;
    @Column(name = "PLOT")
    private String plot;
    @Column(name = "BESTSELLER")
    private Boolean bestseller;
    @Column(name = "NOVITA")
    private Boolean novita;
    @Column(name = "RECENSIONI")
    private String recensioni;

    public Product(Long id, String title, String author, Double price, String category,
                   Integer quantity, String image, String plot, Boolean bestseller, Boolean novita, String recensioni) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.image = image;
        this.plot = plot;
        this.bestseller = bestseller;
        this.novita = novita;
        this.recensioni = recensioni;
    }

    public Product(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Boolean isBestseller() {
        return bestseller;
    }

    public void setBestseller(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    public Boolean isNovita() {
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
