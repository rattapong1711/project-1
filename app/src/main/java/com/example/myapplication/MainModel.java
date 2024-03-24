package com.example.myapplication;

public class MainModel {
    String name,price,durl;

    public MainModel(String name, String price, String durl) {
        this.name = name;
        this.price = price;
        this.durl = durl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDurl() {
        return durl;
    }

    public void setDurl(String durl) {
        this.durl = durl;
    }
}

