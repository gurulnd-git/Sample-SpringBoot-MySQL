package com.flipkart.ecom.service;

import com.flipkart.ecom.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryByName(String categoryName);

    ResponseEntity<Category> addCategory(Category category);

    ResponseEntity<Category> deleteCategory(Integer categoryId);
}
