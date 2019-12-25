package com.flipkart.ecom.service.impl;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.repository.CategoryRepository;
import com.flipkart.ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {

        return Collections.unmodifiableList(categoryRepository.findAll());
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        Category category = new Category();
        category.setName(categoryName);
        Example<Category> example = Example.of(category);
        Iterable<Category> categories = categoryRepository.findAll(example);
        if( categories != null )
        {
            category = ((List<Category>) categories).get(0);
        } else {
            category = null;
        }
        return category;
    }

    @Override
    public ResponseEntity<Category> addCategory(Category category) {

        if(category != null && category.getName() != null)
            categoryRepository.save(category);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Category> deleteCategory(Integer categoryId) {
        if (categoryId != null)
            categoryRepository.deleteById(categoryId);

        return new ResponseEntity(HttpStatus.OK);
    }
}
