package com.flipkart.ecom.service.impl;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.entity.Product;
import com.flipkart.ecom.repository.CategoryRepository;
import com.flipkart.ecom.repository.ProductRepository;
import com.flipkart.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Product> getAllProducts() {

        productRepository.findAll().forEach(product->{

        });

        return Collections.unmodifiableList(productRepository.findAll());
    }


    @Override
    public List<Category> getAllCategories() {

        return Collections.unmodifiableList(categoryRepository.findAll());
    }
}
