package com.example.mongoApi.model;

import java.util.ArrayList;
import java.util.Date;

public class Oder {
    private String id;
    private String type;
    private String codeSale;
    private int totalPrice;
    private int totalCost;
    private int otherCost;
    private User user;
    private ArrayList<Product> productList;
    private Date createdAt;
    private Date updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeSale() {
        return codeSale;
    }

    public void setCodeSale(String codeSale) {
        this.codeSale = codeSale;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(int otherCost) {
        this.otherCost = otherCost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Oder(String id, String type, String codeSale, int totalPrice, int totalCost, int otherCost, User user, ArrayList<Product> productList, Date createdAt, Date updatedAt) {
        this.id = id;
        this.type = type;
        this.codeSale = codeSale;
        this.totalPrice = totalPrice;
        this.totalCost = totalCost;
        this.otherCost = otherCost;
        this.user = user;
        this.productList = productList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
