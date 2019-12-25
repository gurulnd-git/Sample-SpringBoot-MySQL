package com.flipkart.ecom.service.impl;

import com.flipkart.ecom.entity.Category;
import com.flipkart.ecom.entity.Product;
import com.flipkart.ecom.entity.Supplier;
import com.flipkart.ecom.repository.ProductRepository;
import com.flipkart.ecom.service.CategoryService;
import com.flipkart.ecom.service.ProductService;
import com.flipkart.ecom.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SupplierService supplierService;

    @Override
    public List<Product> getAllProducts() {

        return Collections.unmodifiableList(productRepository.findAll());
    }

    @Override
    public ResponseEntity addProduct(Product product) {

        if(!StringUtils.isEmpty(product.getCategoryName()) )
        {
            Category category = categoryService.getCategoryByName(product.getCategoryName());
            product.setCategory(category);

            Supplier supplier = supplierService.getSupplierByName(product.getSupplierName());
            product.setSupplier(supplier);

            if(category !=null && supplier != null)
            {
                productRepository.save(product);
            }

        }

        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity deleteProduct(Integer productId) {

        if (productId != null)
            productRepository.deleteById(productId);

        return new ResponseEntity(HttpStatus.OK);
    }

}
