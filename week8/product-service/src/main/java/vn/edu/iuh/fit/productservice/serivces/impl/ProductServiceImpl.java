/**
 * @ (#) ProductServiceImpl.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.productservice.serivces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.entities.Product;
import vn.edu.iuh.fit.productservice.repositories.ProductRepository;
import vn.edu.iuh.fit.productservice.serivces.ProductService;

import java.util.List;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 4/12/2025
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private  ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found "+ id));
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
