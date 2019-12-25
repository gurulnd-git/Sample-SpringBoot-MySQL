package com.flipkart.ecom.controller;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${versionURL}/category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/fetchAll")
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/add")
    public ResponseEntity addCategory(@RequestBody Category category) {
        return new ResponseEntity(categoryService.addCategory(category).getStatusCode());
    }

    @GetMapping("/delete/{categoryId}")
    public ResponseEntity<Category> deleteCategory(@PathVariable Integer categoryId) {
        return categoryService.deleteCategory(categoryId);
    }
}
