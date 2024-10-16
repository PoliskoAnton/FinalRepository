package com.shop.myShop;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.shop.myShop.ProductService;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ProductListControl {
    private ProductService service;



    @Operation(summary = "get all products")
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @Operation(summary = "add new product")
    @PostMapping
    public Product addProduct(@RequestBody @Valid Product product) {
        service.addProduct(product);
        return service.lastProduct();
    }

}










