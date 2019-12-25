package com.flipkart.ecom.controller;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.entity.Product;
import com.flipkart.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> list() {
        return productService.getAllProducts();
    }

    @GetMapping("/allCategories")
    public List<Category> getCategories() {
        return productService.getAllCategories();
    }
}
