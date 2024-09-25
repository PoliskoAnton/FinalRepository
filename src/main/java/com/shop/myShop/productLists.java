package com.shop.myShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;





@RestController
public class productLists {
    private final List<Product> list = new ArrayList<>();

    private void addProduct(String name, int price, String description, int discount) {
        list.add(new Product(name, price, description, discount));
    }
    addProduct("Toy", 34, "dkfjdkf", 0);
    @GetMapping("/item")
    private List<Product> getProducts() {
        // product list
        return list;
    }
}