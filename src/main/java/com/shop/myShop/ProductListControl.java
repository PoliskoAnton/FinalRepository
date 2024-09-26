package com.shop.myShop;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/item")
public class ProductListControl {

    private final List<Product> productList = new ArrayList<>();


    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }


    @GetMapping("/add/{name}/{price}/{description}/{discount}")
    public Product addProduct(@PathVariable String name, @PathVariable int price, @PathVariable String description, @PathVariable int discount) {
        Product product = new Product(name, price, description, discount);
        productList.add(product);
        return product;
    }
}
