package com.flipkart.ecom.service;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
    List<Category> getAllCategories();

}
