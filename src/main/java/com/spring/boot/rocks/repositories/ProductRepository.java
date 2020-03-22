package com.spring.boot.rocks.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.rocks.domain.Product;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
