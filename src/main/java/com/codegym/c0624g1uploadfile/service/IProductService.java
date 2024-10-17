package com.codegym.c0624g1uploadfile.service;

import com.codegym.c0624g1uploadfile.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
