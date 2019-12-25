package com.flipkart.ecom.service;

import com.flipkart.ecom.entity.Supplier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {


    List<Supplier> getAllSuppliers();

    Supplier getSupplierByName(String suppliername);

    ResponseEntity<Supplier> addSupplier(Supplier supplier);

    ResponseEntity<Supplier> deleteSupplier(Integer supplierId);
}
