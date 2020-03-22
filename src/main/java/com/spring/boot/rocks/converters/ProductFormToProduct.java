package com.spring.boot.rocks.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.spring.boot.rocks.commands.ProductForm;
import com.spring.boot.rocks.domain.Product;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(productForm.getId());
        }
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}
