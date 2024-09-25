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


    @PostMapping("/add/{name}/{price}")
    public Product addProduct(@PathVariable String name, @PathVariable int price) {
        Product product = new Product(name, price);
        productList.add(product);
        return product;
    }
}
