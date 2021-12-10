package com.buyou.BuYou.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PURCHASE")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
/*    @ManyToOne  //Bisognerà fare una @OneToMany nell'Entity User
    @JoinColumn(name="USER_ID")
    private User user;*/
    @Column(name = "PURCHASE_DATE")
    private Date purchaseDate;
    @Column(name = "PRICE")
    private String price;

    public Purchase(Long id, /*User user,*/ Date purchaseDate, String price) {
        this.id = id;
        /*this.user = user;*/
        this.purchaseDate = purchaseDate;
        this.price = price;
    }

    public Purchase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

/*    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
