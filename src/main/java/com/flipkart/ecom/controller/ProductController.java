package com.flipkart.ecom.controller;

import com.flipkart.ecom.entity.Product;
import com.flipkart.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("${versionURL}/product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/fetchAll")
    public ResponseEntity list() {
        return new ResponseEntity(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody Product product) {
        return new ResponseEntity(productService.addProduct(product).getStatusCode());
    }

    @GetMapping("/delete/{productId}")
    public ResponseEntity deleteProduct(@PathVariable Integer productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/groupByBrand")
    public ResponseEntity groupByBrand() {
        return new ResponseEntity(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/groupByPrice")
    public ResponseEntity groupByPrice() {

        List<Product> allProducts = productService.getAllProducts();

        Map<BigDecimal, List<Product>> groupByPriceMap =
                allProducts.stream().collect(Collectors.groupingBy(Product::getPrice));

        return new ResponseEntity(groupByPriceMap, HttpStatus.OK);
    }

    @GetMapping("/groupBySize")
    public ResponseEntity groupBySize() {
        List<Product> allProducts = productService.getAllProducts();

        Map<String, List<Product>> groupByPriceMap =
                allProducts.stream().collect(Collectors.groupingBy(Product::getSize));

        return new ResponseEntity(groupByPriceMap, HttpStatus.OK);
    }

    @GetMapping("/groupByColor")
    public ResponseEntity groupByColor() {
        List<Product> allProducts = productService.getAllProducts();

        Map<String, List<Product>> groupByPriceMap =
                allProducts.stream().collect(Collectors.groupingBy(Product::getColor));

        return new ResponseEntity(groupByPriceMap, HttpStatus.OK);
    }

    @GetMapping("/getBySku/{sku}")
    public ResponseEntity getBySku(@PathVariable Integer sku) {
        return new ResponseEntity(productService.getAllProducts().stream().filter(p -> p.getSku().equals(sku)), HttpStatus.OK);
    }

    @GetMapping("/getByAvailQty/{availQty}")
    public ResponseEntity getByAvailQty(@PathVariable Integer availQty) {
        return new ResponseEntity(productService.getAllProducts().stream().filter(p -> p.getAvailQty().equals(availQty)), HttpStatus.OK);
    }

}
