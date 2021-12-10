package com.buyou.BuYou.model;

import com.buyou.BuYou.model.*;
import javax.persistence.*;

@Entity
@Table(name = "ORDER_PRODUCT")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
/*    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "ID")
    private User user;*/
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "ID")
    private Product product;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public OrderProduct(/*User user, */Product product, Integer quantity) {
        /*this.user = user;*/
        this.product = product;
        this.quantity = quantity;
    }

    protected OrderProduct() {
    }

/*    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
