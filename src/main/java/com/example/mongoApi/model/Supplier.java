package com.example.mongoApi.model;

public class Supplier {
    private String id;
    private String name;
    private String phone;
    private String url;
    private String info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Supplier(String id, String name, String phone, String url, String info) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.url = url;
        this.info = info;
    }
}
