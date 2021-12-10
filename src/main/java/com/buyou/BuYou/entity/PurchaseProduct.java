package com.buyou.BuYou.entity;

import javax.persistence.*;

@Entity
@Table(name = "PURCHASE_PRODUCT")
public class PurchaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
/*    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "ID")
    private User user;*/
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "ID")
    private Product product;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public PurchaseProduct(Long id,/*User user, */Product product, Integer quantity) {
        this.id = id;
        /*this.user = user;*/
        this.product = product;
        this.quantity = quantity;
    }

    protected PurchaseProduct() {
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
