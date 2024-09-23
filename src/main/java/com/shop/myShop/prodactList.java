package com.shop.myShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class prodactList {

    @GetMapping("/item")
    public List<Product> getProducts() {
        // Пример списка товаров
        return Arrays.asList(
                new Product("Помидор"),
                new Product("Огуречек"),
                new Product("спился человечек")
        );
    }
}