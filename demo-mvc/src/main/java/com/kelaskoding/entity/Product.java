package com.kelaskoding.entity;

public class Product {

    //Membuat field atau objeck
     private Long id;
     private String code;
     private String name;
     private double price;

    //empty constraktor
     public Product(){

     }

    //Constraktor with field
    public Product(Long id, String code, String name, double price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  

}
