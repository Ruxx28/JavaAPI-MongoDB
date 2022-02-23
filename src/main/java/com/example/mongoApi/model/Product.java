package com.example.mongoApi.model;

import java.util.ArrayList;
import java.util.Date;

public class Product {
    private String id;
    private int type;
    private String name;
    private int cost;
    private int price;
    private int quantity;
    private String description;
    private boolean status;
    private String image;
    private ArrayList<Supplier> supplier;
    private Date createdAt;
    private Date updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Supplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(ArrayList<Supplier> supplier) {
        this.supplier = supplier;
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

    public Product(String id, int type, String name, int cost, int price, int quantity, String description, boolean status, String image, ArrayList<Supplier> supplier, Date createdAt, Date updatedAt) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.status = status;
        this.image = image;
        this.supplier = supplier;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
