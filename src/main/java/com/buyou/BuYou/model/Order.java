package com.buyou.BuYou.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
/*    @ManyToOne  //Bisognerà fare una @OneToMany nell'Entity User
    @JoinColumn(name="USER_ID")
    private User user;*/
    @Column(name = "ORDER_DATE")
    private Date order_date;
    @Column(name = "PRICE")
    private String price;

    public Order(int id, /*User user,*/ Date order_date, String price) {
        this.id = id;
        /*this.user = user;*/
        this.order_date = order_date;
        this.price = price;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

/*    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
