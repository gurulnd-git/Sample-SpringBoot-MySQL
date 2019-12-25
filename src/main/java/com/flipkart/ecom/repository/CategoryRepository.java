package com.flipkart.ecom.repository;

import com.flipkart.ecom.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
