package com.example.mongoApi.model;

import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

public class User extends DateAudit{
    //@MongoId(value = FieldType.OBJECT_ID)
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Address address;
    private Date birthday;
    private String avatar;

    public User(String id, String firstname, String lastname, String email, String phone, Address address, Date birthday, String avatar) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.avatar = avatar;
    }

    static class Address {
        String street, district, city;

        public Address(String street, String district, String city) {
            this.street = street;
            this.district = district;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public String getDistrict() {
            return district;
        }

        public String getCity() {
            return city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullName() {
        firstname = firstname != null ? firstname : "";
        lastname = lastname != null? lastname : "";
        return (firstname + " " + lastname).trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
