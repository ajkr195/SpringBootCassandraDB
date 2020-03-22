package com.spring.boot.rocks.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.spring.boot.rocks.commands.ProductForm;
import com.spring.boot.rocks.domain.Product;

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
