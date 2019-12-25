package com.flipkart.ecom.controller;

import com.flipkart.ecom.entity.Product;
import com.flipkart.ecom.entity.Supplier;
import com.flipkart.ecom.service.ProductService;
import com.flipkart.ecom.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${versionURL}/supplier/")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/fetchAll")
    public List<Supplier> list() {
        return supplierService.getAllSuppliers();
    }

    @PostMapping("/add")
    public ResponseEntity addSupplier(@RequestBody  Supplier supplier) {
        return new ResponseEntity(supplierService.addSupplier(supplier).getStatusCode());
    }

    @PostMapping("/delete/{supplierId}")
    public ResponseEntity deleteSupplier(@PathVariable Integer supplierId) {
        return supplierService.deleteSupplier(supplierId);
    }
}
