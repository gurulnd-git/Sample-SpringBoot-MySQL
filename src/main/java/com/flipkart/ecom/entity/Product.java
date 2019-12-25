package com.flipkart.ecom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Product implements Serializable {

    Product() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String color;
    private String size;
    private BigDecimal price;
    private Integer sku;
    private Integer availQty;

    @ManyToOne
    @JoinColumn(name = "supplierId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Supplier supplier;


    public String getSupplierName() {
        return supplier.getName();
    }


    public String getCategoryName() {
        return category.getName();
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getAvailQty() {
        return availQty;
    }

    public void setAvailQty(Integer availQty) {
        this.availQty = availQty;
    }

}
