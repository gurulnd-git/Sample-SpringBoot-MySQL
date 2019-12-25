package com.flipkart.ecom.service.impl;

import com.flipkart.ecom.entity.Supplier;
import com.flipkart.ecom.repository.SupplierRepository;
import com.flipkart.ecom.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> getAllSuppliers() {
        return null;
    }

    @Override
    public Supplier getSupplierByName(String suppliername) {
        Supplier supplier = new Supplier();
        supplier.setName(suppliername);
        Example<Supplier> example = Example.of(supplier);
        Iterable<Supplier> suppliers = supplierRepository.findAll(example);
        if( suppliers != null )
        {
            supplier = ((List<Supplier>) suppliers).get(0);
        } else {
            supplier = null;
        }
        return supplier;
    }

    @Override
    public ResponseEntity<Supplier> addSupplier(Supplier supplier) {
        if(supplier != null && supplier.getName() != null)
            supplierRepository.save(supplier);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Supplier> deleteSupplier(Integer supplierId) {
        if (supplierId != null)
            supplierRepository.deleteById(supplierId);

        return new ResponseEntity(HttpStatus.OK);
    }
}
