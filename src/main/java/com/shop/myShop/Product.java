package com.shop.myShop;

    public class Product {
    private final String name;
    private final String description;
    private final int price;
    private final int discount;


    public Product(String name,int price ,String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.discount = 0;
    }
    public Product(String name, int price, String description, int discount) {
        this.name = name;
        this.description = description;
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Знижка повинна бути від 0 до 100");
        }
        this.discount = discount;
        this.price = price * (100 - discount) / 100;
    }




    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public int getDiscount() {
        return discount;
    }

}

