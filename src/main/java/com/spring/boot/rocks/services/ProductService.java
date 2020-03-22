package com.spring.boot.rocks.services;

import java.util.List;
import java.util.UUID;

import com.spring.boot.rocks.commands.ProductForm;
import com.spring.boot.rocks.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
