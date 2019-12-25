package com.flipkart.ecom.service;

import com.flipkart.ecom.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();

    ResponseEntity addProduct(Product product);

    ResponseEntity deleteProduct(Integer productId);
}
